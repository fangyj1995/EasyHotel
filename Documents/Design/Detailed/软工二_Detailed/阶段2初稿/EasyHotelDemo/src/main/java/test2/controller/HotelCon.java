package test2.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test2.service.HotelService;
import test2.vo.SearchForm;
import tools.IntegerEditor;
@Controller
@RequestMapping(value="/EasyHotel/hotel")//所有匹配.../EasyHotel/hotel的url都会执行这个类中的方法
public class HotelCon {
@Autowired
private HotelService hotelService;
@InitBinder  //表单绑定配置初始化
protected void initBinder(WebDataBinder binder) {  
    binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));     
}
//处理"展示酒店搜索界面"的请求，当url为.../EasyHotel/hotel/searchPage时执行这个方法
@RequestMapping(value="/searchPage",method = RequestMethod.GET)
public String showSearchPage(SearchForm searchForm){	
	return "hotelSearch";
}
//处理展示"酒店详细信息页面"的请求，当url为.../EasyHotel/hotel/detail/xx时执行这个方法
@RequestMapping(value="/detail/{hotelId}",method = RequestMethod.GET)
public String showHotelDeatil(@PathVariable String hotelId,Model model){
	System.out.println(hotelId);
	model.addAttribute("hotel", hotelService.getHotel(hotelId));
	return "hotelDetail";
}
//处理"酒店搜索"请求,当url为.../EasyHotel/hotel/searchList时执行这个方法
@RequestMapping(value="/searchList",method = RequestMethod.POST)
public String processSearch(@Valid SearchForm searchForm,BindingResult bindingResult, Model model){
	if(bindingResult.hasErrors()){
		return "hotelSearch";
	}	
	model.addAttribute("hotelList",hotelService.searchHotel(searchForm));
	return "hotelSearch";
}
}
