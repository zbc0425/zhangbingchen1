package com.zbc.service;

import com.zbc.pojo.Product;
import com.zbc.dao.ProductMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Service Class Product
*
* 2017-12-13
*/

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Transactional(readOnly = true)
    public Product getProductById(Integer id)throws Exception{
        return productMapper.getProductById(id);
    }

    @Transactional(readOnly = true)
    public List<Product> getProductListByMap(Map<String,Object> param)throws Exception {
        return productMapper.getProductListByMap(param);
    }
    
    @Transactional(readOnly = true)
    public Integer getProductRecCountByMap(Map<String,Object> param)throws Exception {
    	return productMapper.getProductRecordCount(param);
    }
    

    public Integer insertProduct(Product product)throws Exception {
        return productMapper.insertProduct(product);
    }

    public Integer updateProduct(Product product)throws Exception {
        return productMapper.updateProduct(product);
    }

    public Integer deleteProductById(Integer id)throws Exception {
        return productMapper.deleteProductById(id);
    }

}