package com.cloud.product.service;

import com.cloud.product.dto.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService{
    @Override
    public List<Product> getAllProducts() {
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Product 1");
        product1.setDescription("Description for Product 1");
        product1.setPrice(10.0);
        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Product 2");
        product2.setDescription("Description for Product 2");
        product2.setPrice(20.0);
        return List.of(product1, product2);
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
