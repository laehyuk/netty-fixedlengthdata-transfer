package com.gowid.transfer.server.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.Charset;
ter
@Slf4j
@ChannelHandler.Sharable
public class NettyServerMainHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive( ChannelHandlerContext ctx ) throws Exception {
        log.info("channel activated");
        super.channelActive(ctx);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        String message = ((ByteBuf) msg).toString(Charset.defaultCharset());
        log.info("channel read : {}", message);
        ctx.write(msg);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught( ChannelHandlerContext ctx, Throwable cause ) {
        log.error("An exception has occurred in netty server.");
        cause.printStackTrace();
        ctx.close();
    }
}
