package com.aiden.hackingspringbootch1reactive;

public class Sample1 {

    void demo1() {

        Cart cart = new Cart("My Cart");

        boolean found = false;

        for (CartItem cartItem : cart.getCartItems()) {
            if (cartItem.getItem().getId().equals("5")) {
                found = true;
            }
        }

        if (found) {
            // increment
        } else {
            // add new CartItem
        }
    }

    void demo2() {

        Cart cart = new Cart("My Cart");

        if (cart.getCartItems().stream() //
                .anyMatch(cartItem -> cartItem.getItem().getId().equals("5"))) {
            // increment
        } else {
            // add new CartItem
        }
    }
}
