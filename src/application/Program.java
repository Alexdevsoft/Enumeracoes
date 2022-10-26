package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus status = OrderStatus.DELIVERED;

		OrderStatus status2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(status);
		System.out.println(status2);
		

	}

}
