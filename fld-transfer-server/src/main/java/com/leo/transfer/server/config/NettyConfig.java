package com.leo.transfer.server.config;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class NettyConfig {

    //TODO

    private int bossThreadCount;

    private int serverBindPort;

}
