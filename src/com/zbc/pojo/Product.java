package com.zbc.pojo;


/**
 * Entity Class Product
 *
 * 2017-12-13
 */
public class Product {

    
    private Integer id;
    
    private String productName;
    
    private Integer quantity;

    public Product(){
    }

    public Product(Integer id, String productName, Integer quantity){
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
    }


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity(){
        return quantity;
    }
}
