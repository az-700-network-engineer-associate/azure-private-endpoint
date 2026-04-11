package com.cloud.product.controller;

import com.cloud.product.dto.Product;
import com.cloud.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // GET all products
    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    // GET product by ID
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return service.getProductById(id);
    }

    // CREATE product
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.createProduct(product);
    }

    // UPDATE product
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,
                                 @RequestBody Product product) {
        return service.updateProduct(id, product);
    }

    // DELETE product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
    }
}

