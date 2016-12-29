package com.emusicstore.service;

import com.emusicstore.model.Cart;

/**
 * Created by Mustapha 12/25/2016.
 */
public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
