package com.example.backend.service;

import com.example.backend.model.Product;
import com.example.backend.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    
    @Override
    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }
    
    @Override
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    
    @Override
    public Product updateProduct(Product product){
        return productRepository.save(product);
    }
    
    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

}
