package cafe.axolotlcafe.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import cafe.axolotlcafe.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

	Product getByProductName(String productName);
	
}
