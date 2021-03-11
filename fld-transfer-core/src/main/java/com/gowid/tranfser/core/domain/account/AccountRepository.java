package com.gowid.tranfser.core.domain.account;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
    Mono<Account> findFirstByOwner(Mono<String> owner);
    Flux<Account> findAllByValue(Double value);
}
