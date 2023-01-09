package com.orderService.service;

import com.orderService.dto.OrderRequest;

public interface OrderService {

	public void createOrder(OrderRequest orderRequest);
}
