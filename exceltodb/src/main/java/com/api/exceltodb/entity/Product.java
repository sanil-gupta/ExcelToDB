package com.api.exceltodb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product 
{
    @Id
    private int productId;
    private String productDesc;
    private Double productPrice;
    private String productName;

    public void setProductId(int productId) 
    {
        this.productId = productId;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }
    public void setProductDesc(String productDesc)
     {
        this.productDesc = productDesc;
    }
    public void setProductPrice(Double productPrice) 
    {
        this.productPrice = productPrice;
    }
    public int getProductId() 
    {
        return productId;
    }
    public String getProductName() 
    {
        return productName;
    }
    public String getProductDesc() 
    {
        return productDesc;
    }
    public Double getProductPrice() 
    {
        return productPrice;
    }

    public Product(int productId, String productName, String productDesc, Double productPrice) 
    {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
    }
    public Product()
    {
        
    }
    
}
