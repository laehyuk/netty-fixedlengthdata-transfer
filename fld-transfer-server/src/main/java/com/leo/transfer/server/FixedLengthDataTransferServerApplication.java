package com.leo.transfer.server;

import com.leo.transfer.server.netty.NettyServer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class FixedLengthDataTransferServerApplication {

	private final NettyServer nettyServer;

	public static void main(String[] args) {
		SpringApplication.run(FixedLengthDataTransferServerApplication.class, args);
	}

	@EventListener(ApplicationContextEvent.class)
	public void runNettyServer() {
		try {
			log.info("Start Netty Server : {}", this);
			nettyServer.connect();
		} catch (InterruptedException e) {
			log.error("An error occurred while running the netty server : {}", e);
		} finally {
			nettyServer.shutdown();
		}
	}
}
