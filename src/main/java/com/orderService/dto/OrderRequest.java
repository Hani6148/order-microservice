package com.orderService.dto;

import java.util.List;

import com.orderService.model.Order;
import com.orderService.model.OrderItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
	private List<OrderItemsDto> orderItemListDto;
	 
}
