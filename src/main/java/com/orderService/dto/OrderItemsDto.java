package com.orderService.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderItemsDto {

	
	private String skuCode;
	private int itemQty;
	private int itemPrice;
}
