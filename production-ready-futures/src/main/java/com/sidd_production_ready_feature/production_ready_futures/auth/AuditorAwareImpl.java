package com.sidd_production_ready_feature.production_ready_futures.auth;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
       //get security context
        //get authinication
        //get principal
        return Optional.of("siddharath umesh");
    }
}
