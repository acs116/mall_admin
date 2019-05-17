package cafe.jjdev.mall.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cafe.jjdev.mall.admin.service.ProductService;
import cafe.jjdev.mall.admin.vo.ProductCommon;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@GetMapping(value="/product/addProductCommon")
	public String addProductCommon() {
		return "/product/addProductCommon";
	}
	
	@PostMapping(value="/product/addProductCommon")
	public String addProductCommon(ProductCommon productCommon) {
		System.out.println(productCommon+"productCommon");
		productService.addProductCommon(productCommon);
		return "/product/addProductCommon";
	}
}
