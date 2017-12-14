package com.zbc.service;

import com.zbc.pojo.Sale;
import com.zbc.dao.SaleMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Service Class Sale
*
* 2017-12-13
*/

@Service
@Transactional
public class SaleServiceImpl implements SaleService {

    @Resource
    private SaleMapper saleMapper;

    @Transactional(readOnly = true)
    public Sale getSaleById(Integer id)throws Exception{
        return saleMapper.getSaleById(id);
    }

    @Transactional(readOnly = true)
    public List<Sale> getSaleListByMap(Map<String,Object> param)throws Exception {
        return saleMapper.getSaleListByMap(param);
    }
    
    @Transactional(readOnly = true)
    public Integer getSaleRecCountByMap(Map<String,Object> param)throws Exception {
    	return saleMapper.getSaleRecordCount(param);
    }
    

    public Integer insertSale(Sale sale)throws Exception {
        return saleMapper.insertSale(sale);
    }

    public Integer updateSale(Sale sale)throws Exception {
        return saleMapper.updateSale(sale);
    }

    public Integer deleteSaleById(Integer id)throws Exception {
        return saleMapper.deleteSaleById(id);
    }

}