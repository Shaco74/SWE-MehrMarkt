package com.mehrmarkt.mehrmarktsystem.Service.produkt;

import com.mehrmarkt.mehrmarktsystem.Repository.ProductRepository;
import com.mehrmarkt.mehrmarktsystem.model.produkt.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }



    @Override

    public Product getByEAN(String ean) {
        return productRepository.getByEAN(ean);
    }


}