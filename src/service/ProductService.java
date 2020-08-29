package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();
    Product findById(int id);
    void save(Product product);
    void delete(int id);
    void update(int id, Product product);
}
