package com.gowid.transfer.client.web;

import com.gowid.tranfser.core.domain.account.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
