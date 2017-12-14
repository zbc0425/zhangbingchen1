package com.zbc.dao;

import com.zbc.pojo.Sale;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
* Mapper Interface Sale
*
* 2017-12-13
*/
public interface SaleMapper {

    public Sale getSaleById(@Param(value = "id") Integer id)throws Exception;

    public List<Sale> getSaleListByMap(Map<String,Object> param)throws Exception;

	public Integer getSaleRecordCount(Map<String,Object> param)throws Exception;

    public Integer insertSale(Sale sale)throws Exception;

    public Integer updateSale(Sale sale)throws Exception;

    public Integer deleteSaleById(@Param(value = "id") Integer id)throws Exception;

}