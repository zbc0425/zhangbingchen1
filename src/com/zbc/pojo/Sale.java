package com.zbc.pojo;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Entity Class Sale
 *
 * 2017-12-13
 */
public class Sale {

    
    private Integer id;
    
    private Float price;
    
    private Integer quantity;
    
    private Float totalPrice;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date saleDate;
    
    private Integer userId;
    
    private Integer productId;
    private String userName;
    private String productName;
    
    public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Sale(){
    }

    public Sale(Integer id, Float price, Integer quantity, Float totalPrice,
    		Date saleDate, Integer userId, Integer productId,String userName,String productName){
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.saleDate = saleDate;
        this.userId = userId;
        this.productId = productId;
        this.userName=userName;
        this.productName=productName;
    }


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setPrice(Float price){
        this.price = price;
    }

    public Float getPrice(){
        return price;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setTotalPrice(Float totalPrice){
        this.totalPrice = totalPrice;
    }

    public Float getTotalPrice(){
        return totalPrice;
    }

    public void setSaleDate(Date saleDate){
        this.saleDate = saleDate;
    }

    public Date getSaleDate(){
        return saleDate;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return userId;
    }

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return productId;
    }
}
