package com.aiden.hackingspringbootch1reactive;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import org.springframework.data.mongodb.repository.Query;
import reactor.core.publisher.Flux;

// tag::code[]
public interface ItemRepository extends ReactiveCrudRepository<Item, String> {

    Flux<Item> findByNameContaining(String partialName);
    // end::code[]

    // tag::code-2[]
    Flux<Item> findItemsForCustomerMonthlyReport();

    Flux<Item> findSortedStuffForWeeklyReport();
    // end::code-2[]

    // tag::code-3[]
    // search by name
    Flux<Item> findByNameContainingIgnoreCase(String partialName);

    // search by description
    Flux<Item> findByDescriptionContainingIgnoreCase(String partialName);

    // search by name AND description
    Flux<Item> findByNameContainingAndDescriptionContainingAllIgnoreCase(String partialName, String partialDesc);

    // search by name OR description
    Flux<Item> findByNameContainingOrDescriptionContainingAllIgnoreCase(String partialName, String partialDesc);
    // end::code-3[]
}