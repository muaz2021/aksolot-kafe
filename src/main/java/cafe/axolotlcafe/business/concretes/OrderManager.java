package cafe.axolotlcafe.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cafe.axolotlcafe.business.abstracts.OrderService;
import cafe.axolotlcafe.core.utilities.results.DataResult;
import cafe.axolotlcafe.core.utilities.results.Result;
import cafe.axolotlcafe.core.utilities.results.SuccesDataResult;
import cafe.axolotlcafe.core.utilities.results.SuccessResult;
import cafe.axolotlcafe.dataAccess.abstracts.OrderDao;
import cafe.axolotlcafe.entities.concretes.Order;
import cafe.axolotlcafe.entities.concretes.Product;
    
@Service
public class OrderManager implements OrderService {
    
	private OrderDao productOrderDao;
	
	@Autowired //productOrderDao'ya uygun bir instance uretir(hibernate vb. gibi)
	public OrderManager(OrderDao productOrderDao) {
		super();
		this.productOrderDao = productOrderDao;
	}
    
	@Override
	public DataResult<List<Order>> getAll() { 
		return new SuccesDataResult<List<Order>>(this.productOrderDao.findAll(), "Siparisler Listelendi.");
	}


	@Override
	public Result add(Order order) {
		this.productOrderDao.save(order);
		return new SuccessResult("+Siparis eklendi");
	} 
    
	
}
