package com.zbc.service;

import com.zbc.pojo.Sale;
import java.util.List;
import java.util.Map;

/**
* Service Interface Sale
*
* 2017-12-13
*/
public interface SaleService {

    /**
     * 通过主键Id查询Sale
     */
    public Sale getSaleById(Integer id)throws Exception;

    /**
     * 通过条件Map集合查询Sale
     */
    public List<Sale> getSaleListByMap(Map<String,Object> param)throws Exception;

	/**
	 * 通过条件Map集合查询Sale记录总数
	 */
	public Integer getSaleRecCountByMap(Map<String,Object> param)throws Exception;

    /**
     * 添加Sale新记录
     */
    public Integer insertSale(Sale sale)throws Exception;

    /**
      * 更新Sale记录
      */
    public Integer updateSale(Sale sale)throws Exception;

    /**
      * 通过主键Id删除Sale
      */
    public Integer deleteSaleById(Integer id)throws Exception;

}