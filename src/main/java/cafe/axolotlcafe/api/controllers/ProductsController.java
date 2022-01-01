package cafe.axolotlcafe.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cafe.axolotlcafe.business.abstracts.ProductService;
import cafe.axolotlcafe.core.utilities.results.DataResult;
import cafe.axolotlcafe.core.utilities.results.Result;
import cafe.axolotlcafe.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
@CrossOrigin //tarayici(frontend) ile backend(api/controller) arasinda "handshake" i saglar(birbirleri arasinda anlasma-iletisim kurma)
public class ProductsController { 
    
	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Product>>  getAll(){
		return this.productService.getAll();		
	}

	@PostMapping("/add") 
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName) {
		return this.productService.getByProductName(productName);
	}
	
	
}
