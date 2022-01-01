package cafe.axolotlcafe.business.abstracts;

import java.util.List;

import cafe.axolotlcafe.core.utilities.results.DataResult;
import cafe.axolotlcafe.core.utilities.results.Result;
import cafe.axolotlcafe.entities.concretes.Order;
import cafe.axolotlcafe.entities.concretes.Product;

public interface OrderService {
    
	DataResult<List<Order>> getAll();
	
    Result add(Order order);
	
}
