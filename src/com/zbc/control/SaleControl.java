package com.zbc.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zbc.pojo.Product;
import com.zbc.pojo.Sale;
import com.zbc.pojo.Users;
import com.zbc.service.ProductService;
import com.zbc.service.SaleService;
import com.zbc.service.UsersService;

@Controller
@RequestMapping("/sale")
public class SaleControl {
	@Autowired
	private SaleService saleService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private ProductService productService;
	@RequestMapping(method=RequestMethod.GET)
   public ModelAndView findAllSale(Integer userId) throws Exception{
	   ModelAndView mv =new ModelAndView();
	   Map<String, Object> param =new HashMap<String,Object>();
	   if(userId!=null&&userId!=0){
		   param.put("userId", userId);
	   }
	   List<Sale> list =saleService.getSaleListByMap(param);
	   mv.addObject("userId", userId);
	   mv.addObject("sale", list);
	   List<Users> usersList =usersService.getUsersListByMap(null);
	   mv.addObject("usersList", usersList);
	   mv.setViewName("salelist");
	   return mv;
   }
	//添加获取下拉框并跳转
	@RequestMapping(value="/saleadd.html")
	public ModelAndView validSale() throws Exception{
		List<Product> productList = productService.getProductListByMap(null);
		return new ModelAndView("saleadd","productList",productList);
	}
	//添加
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView addsale(@Valid Sale sale,BindingResult result) throws Exception{
		ModelAndView mv =new ModelAndView();
		int count =saleService.insertSale(sale);
		if(count>0){
			mv.setViewName("redirect:/sale");
		}else{
			mv.setViewName("saleadd");
		}
		return mv;
	}
}
