package com.aiden.hackingspringbootch1reactive;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author Greg Turnquist
 */
// tag::code[]
public interface CartRepository extends ReactiveCrudRepository<Cart, String> {

}
// end::code[]
