package cafe.axolotlcafe.business.abstracts;

import java.util.List;

import cafe.axolotlcafe.core.utilities.results.DataResult;
import cafe.axolotlcafe.core.utilities.results.Result;
import cafe.axolotlcafe.entities.concretes.Product;

public interface ProductService {

    DataResult<List<Product>> getAll();
    
	Result add(Product product);

	DataResult<Product> getByProductName(String productName);
}
