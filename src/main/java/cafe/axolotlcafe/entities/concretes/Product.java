package cafe.axolotlcafe.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="products")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String productName;
	
	public Product() {
		super();
	}

	public Product(int id, String productName, double unitPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name="unit_price")
	private double unitPrice;



	
}
