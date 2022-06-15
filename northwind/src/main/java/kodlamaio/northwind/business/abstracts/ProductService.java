package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concrates.Product;

public interface ProductService {

	List<Product> getAll();
}
