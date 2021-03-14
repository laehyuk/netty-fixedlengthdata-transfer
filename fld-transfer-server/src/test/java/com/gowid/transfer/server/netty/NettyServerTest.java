package com.gowid.transfer.server.netty;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class NettyServerTest {

    @Autowired
    private NettyServer nettyServer;

    @Test
    void run() throws InterruptedException {
        nettyServer.run();
        //TODO : not implemented
    }

}