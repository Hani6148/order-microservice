package com.orderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.orderService.dto.OrderRequest;
import com.orderService.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public String creareOrder(@RequestBody OrderRequest orderRequst) {
		orderService.createOrder(orderRequst);
		return "order successully placed";
	}
}
