package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.api.exceltodb.entity.Product;
import com.api.helper.Helper;
import com.api.service.ProductService;

@RestController
@CrossOrigin("*")
public class ProductController 
{
   @Autowired
   private ProductService ProductService;

   @PostMapping("/product/upload")
   public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file)
   {
     if(Helper.checkExcelFormat(file))
     {
        this.ProductService.save(file);
        return ResponseEntity.ok("file is uploaded and Data is saves to DB");
     }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel only");    

   }
   @GetMapping("/product")
   public List<Product> getAllProduct()
   {
    return this.ProductService.getAllProduct();
   }
}
