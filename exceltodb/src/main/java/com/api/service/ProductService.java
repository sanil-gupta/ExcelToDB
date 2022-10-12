package com.api.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.api.exceltodb.entity.Product;
import com.api.helper.Helper;
import com.api.repo.ProductRepo;

@Service
public class ProductService 
{
    @Autowired
    private  ProductRepo productRepo;

    public void save(MultipartFile file)
    {
        try 
        {
           List<Product> products = Helper.convertExceToListProduct(file.getInputStream());
           this.productRepo.saveAll(products);
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    public List<Product> getAllProduct()
    {
        return this.productRepo.findAll();
    }
}
