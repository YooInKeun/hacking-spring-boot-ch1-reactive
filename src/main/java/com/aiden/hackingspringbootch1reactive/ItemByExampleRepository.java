package com.aiden.hackingspringbootch1reactive;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

/**
 * @author Greg Turnquist
 */
// tag::code[]
public interface ItemByExampleRepository extends ReactiveQueryByExampleExecutor<Item> {

}
// end::code[]
