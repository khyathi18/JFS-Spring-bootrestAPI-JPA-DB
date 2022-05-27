package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Product;

//@Repository --for other repositories like crud
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
