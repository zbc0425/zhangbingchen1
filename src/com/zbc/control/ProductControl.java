package com.zbc.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zbc.pojo.Product;
import com.zbc.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductControl {
	@Autowired
	private ProductService productService;
	@RequestMapping(method=RequestMethod.GET)
    public ModelAndView findProvider(String productName) throws Exception{
    	ModelAndView mv =new ModelAndView();
    	Map<String, Object> param =new HashMap<String,Object>();
    	param.put("productName", productName);
    	List<Product> productList =productService.getProductListByMap(param);
    	mv.addObject("productList", productList);
    	mv.setViewName("productlist");
    	return mv;
    }
}
