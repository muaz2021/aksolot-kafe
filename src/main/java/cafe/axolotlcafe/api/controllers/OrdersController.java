package cafe.axolotlcafe.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cafe.axolotlcafe.business.abstracts.OrderService;
import cafe.axolotlcafe.core.utilities.results.DataResult;
import cafe.axolotlcafe.core.utilities.results.Result;
import cafe.axolotlcafe.entities.concretes.Order;
import cafe.axolotlcafe.entities.concretes.Product;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {

	private OrderService orderService;
	
	@Autowired
	public OrdersController(OrderService customerOrderService) {
		super();
		this.orderService = customerOrderService;
	}

	//*yonetici icindir
	@GetMapping("/getall")
	public DataResult<List<Order>> getAll(){
		return this.orderService.getAll();
	} 
 
	
	@PostMapping("/add")
	public Result add(@RequestBody Order order) {
		return this.orderService.add(order);
	}
	
}
