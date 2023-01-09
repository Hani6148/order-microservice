package com.orderService.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderService.dto.OrderItemsDto;
import com.orderService.dto.OrderRequest;
import com.orderService.model.Order;
import com.orderService.model.OrderItem;
import com.orderService.repository.OrderRepository;
import com.orderService.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {


	@Autowired
	OrderRepository orderRepo;
	public void createOrder(OrderRequest orderRequest) {
		
		
		List<OrderItem> orderItemList  = orderRequest.getOrderItemListDto().stream().map(this::mapItems).toList();
		Order order = Order.builder()
				.orderItemList(orderItemList)
				.orderNumber(UUID.randomUUID().toString())
				.build();
		orderRepo.save(order);
		
	}
	
	
	public OrderItem mapItems(OrderItemsDto orderItemDto) {
		
		return OrderItem.builder()
				
				.itemPrice(orderItemDto.getItemPrice())
				.itemQty(orderItemDto.getItemQty())
				.skuCode(orderItemDto.getSkuCode())
				.build();
	}
	

}
