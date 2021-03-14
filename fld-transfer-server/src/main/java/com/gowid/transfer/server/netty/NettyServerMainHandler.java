package com.gowid.transfer.server.netty;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ChannelHandler.Sharable
@RequiredArgsConstructor
public class NettyServerMainHandler extends ChannelInboundHandlerAdapter {

    //TODO

    @Override
    public void channelRegistered( ChannelHandlerContext ctx ) throws Exception {
        super.channelRegistered(ctx);
    }

    @Override
    public void channelUnregistered( ChannelHandlerContext ctx ) throws Exception {
        super.channelUnregistered(ctx);
    }

    @Override
    public void channelActive( ChannelHandlerContext ctx ) throws Exception {
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive( ChannelHandlerContext ctx ) throws Exception {
        super.channelInactive(ctx);
    }

    @Override
    public void channelRead( ChannelHandlerContext ctx, Object msg ) throws Exception {
        super.channelRead(ctx, msg);
    }

    @Override
    public void channelReadComplete( ChannelHandlerContext ctx ) throws Exception {
        super.channelReadComplete(ctx);
    }
}
