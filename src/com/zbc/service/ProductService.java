package com.zbc.service;

import com.zbc.pojo.Product;
import java.util.List;
import java.util.Map;

/**
* Service Interface Product
*
* 2017-12-13
*/
public interface ProductService {

    /**
     * 通过主键Id查询Product
     */
    public Product getProductById(Integer id)throws Exception;

    /**
     * 通过条件Map集合查询Product
     */
    public List<Product> getProductListByMap(Map<String,Object> param)throws Exception;

	/**
	 * 通过条件Map集合查询Product记录总数
	 */
	public Integer getProductRecCountByMap(Map<String,Object> param)throws Exception;

    /**
     * 添加Product新记录
     */
    public Integer insertProduct(Product product)throws Exception;

    /**
      * 更新Product记录
      */
    public Integer updateProduct(Product product)throws Exception;

    /**
      * 通过主键Id删除Product
      */
    public Integer deleteProductById(Integer id)throws Exception;

}