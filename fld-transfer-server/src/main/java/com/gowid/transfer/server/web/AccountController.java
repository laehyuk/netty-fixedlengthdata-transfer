package com.gowid.transfer.server.web;

import com.gowid.tranfser.core.domain.account.Account;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{id}")
    private Mono<Account> getAccountById(@PathVariable String id) {

        //TODO
        return null;
    }

}
