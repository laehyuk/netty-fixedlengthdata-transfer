package com.leo.tranfser.core.config;

import com.leo.tranfser.core.domain.account.AccountRepository;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(
        basePackageClasses = AccountRepository.class)
public class MongoConfig extends AbstractReactiveMongoConfiguration {

    @Bean
    public MongoClient mongoClient(){
        return MongoClients.create();
    }

    @Override
    protected String getDatabaseName() {
        return "fld";
    }

}
