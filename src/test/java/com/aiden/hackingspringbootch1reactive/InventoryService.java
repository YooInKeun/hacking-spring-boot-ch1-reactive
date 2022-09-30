package com.aiden.hackingspringbootch1reactive;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
class InventoryService {

    Flux<Item> getItems() {
        // imagine calling a remote service!
        return Flux.empty();
    }
}
