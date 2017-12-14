package com.zbc.dao;

import com.zbc.pojo.Product;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
* Mapper Interface Product
*
* 2017-12-13
*/
public interface ProductMapper {

    public Product getProductById(@Param(value = "id") Integer id)throws Exception;

    public List<Product> getProductListByMap(Map<String,Object> param)throws Exception;

	public Integer getProductRecordCount(Map<String,Object> param)throws Exception;

    public Integer insertProduct(Product product)throws Exception;

    public Integer updateProduct(Product product)throws Exception;

    public Integer deleteProductById(@Param(value = "id") Integer id)throws Exception;

}