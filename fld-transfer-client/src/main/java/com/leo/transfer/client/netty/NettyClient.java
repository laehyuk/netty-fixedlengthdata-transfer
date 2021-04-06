package com.leo.transfer.client.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NettyClient {

    private EventLoopGroup group;
    private Channel channel;
    private Bootstrap bootstrap;

    private final String SERVER_HOST = "127.0.0.1";
    private final int SERVER_PORT = 8888;

    public void connect() throws InterruptedException {
        if (bootstrap == null) {
            createBootstrap();
            log.info("Create Complete");
        }
        if (isDisconnected()) {
            connectBootStrap();
            log.info("Connected Complete");
        }
    }

    private synchronized void createBootstrap() {
        group = new NioEventLoopGroup();
        bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .handler(new NettyClientInitializer());
    }

    private synchronized void connectBootStrap() throws InterruptedException {
        ChannelFuture channelFuture = bootstrap.connect(SERVER_HOST, SERVER_PORT).sync();
        channel = channelFuture.channel();
    }

    private boolean isConnected() {
        return channel != null && channel.isWritable();
    }

    private synchronized boolean isDisconnected() {
        return !isConnected();
    }

}