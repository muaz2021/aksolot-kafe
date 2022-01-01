package cafe.axolotlcafe.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	@GeneratedValue
	
	@Column(name="order_id")
	private int id;
	
	@Column(name="table_no")
	private int tableNo;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private int unitPrice;
	
	
	
	
}
