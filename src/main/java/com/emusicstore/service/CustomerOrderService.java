package com.emusicstore.service;

import com.emusicstore.model.CustomerOrder;

/**
 * Created by Mustapha 12/25/2016.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
