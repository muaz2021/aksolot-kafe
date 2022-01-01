package cafe.axolotlcafe.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import cafe.axolotlcafe.entities.concretes.Order;

public interface OrderDao extends JpaRepository<Order,Integer> {

	
	
}
