package com.gowid.transfer.client.web;

import com.gowid.transfer.client.web.dto.AccountDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{id}")
    private Mono<AccountDto> getAccountById(@PathVariable String id) {

        //TODO
        return null;
    }

}
