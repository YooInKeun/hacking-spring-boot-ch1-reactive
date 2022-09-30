package com.aiden.hackingspringbootch1reactive;

import org.springframework.data.repository.CrudRepository;

interface BlockingItemRepository extends CrudRepository<Item, String> {

}
