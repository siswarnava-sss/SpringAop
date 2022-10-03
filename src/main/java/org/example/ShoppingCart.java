package org.example;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(){
        System.out.println("Checkout Method from shopping card");
    }
}
