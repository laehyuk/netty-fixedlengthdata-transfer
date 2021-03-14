package com.gowid.transfer.server.netty;

import com.gowid.transfer.server.config.NettyConfig;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NettyServer {

    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private ServerBootstrap serverBootstrap;
    private Channel channel;

    private final NettyConfig nettyConfig;

    public void run() throws InterruptedException {
        if (serverBootstrap == null) {
            createBootstrap();
        }
        if (isDisconnected()) {
            bind();
        }
    }

    private synchronized void createBootstrap() {
        bossGroup = new NioEventLoopGroup(nettyConfig.getBossThreadCount());
        workerGroup = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new NettyServerInitializer());
    }

    private synchronized void bind() throws InterruptedException {
        ChannelFuture channelFuture = serverBootstrap.bind(nettyConfig.getServerBindPort()).sync();
        channel = channelFuture.channel();
        log.info("started {}", this);
    }

    private boolean isConnected() {
        return channel != null && channel.isWritable();
    }

    private synchronized boolean isDisconnected() {
        return !isConnected();
    }

}
