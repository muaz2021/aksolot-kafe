package cafe.axolotlcafe.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cafe.axolotlcafe.business.abstracts.ProductService;
import cafe.axolotlcafe.core.utilities.results.DataResult;
import cafe.axolotlcafe.core.utilities.results.Result;
import cafe.axolotlcafe.core.utilities.results.SuccesDataResult;
import cafe.axolotlcafe.core.utilities.results.SuccessResult;
import cafe.axolotlcafe.dataAccess.abstracts.ProductDao;
import cafe.axolotlcafe.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;	
	
	@Autowired 
	public ProductManager(ProductDao productDao) {
		super(); 
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccesDataResult<List<Product>>(this.productDao.findAll(), "Ürünler Listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("+Ürün eklendi");
	}
	
	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccesDataResult<Product>
		                (this.productDao.getByProductName(productName),"Data Listelendi: Name'e gore ");
	}

}
