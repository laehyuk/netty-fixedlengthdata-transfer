package com.leo.transfer.client.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NettyClientMainHandler extends ChannelInboundHandlerAdapter {

	@Override
	public void channelInactive(ChannelHandlerContext ctx) {
		log.info("====[Client]channelInactive====");
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) {
		log.info("====[Client]channelActive====");
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		log.info("====[Client]channelRead====");
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) {
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		log.error("====[Client]exceptionCaught : {}", cause);
		cause.printStackTrace();
		ctx.close();
	}

}
