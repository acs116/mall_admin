package cafe.jjdev.mall.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cafe.jjdev.mall.admin.service.CategoryService;
import cafe.jjdev.mall.admin.vo.Category;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	//카데고리 추가 폼
	@GetMapping(value="/category/addCategory")
	public String addCategory() {
		return "/category/addCategory";
		
	}
	//카데고리 추가 액션
	@PostMapping(value="/category/addCategory")
	public String addCategory(Category category) {
		categoryService.addCategory(category);
		System.out.println("!!!!!!!!!!!!!!action : /category/getCategoryList ");
		return "redirect:/category/getCategoryList";
	}
	//카데고리 리스트
	@GetMapping(value="/category/getCategoryList")
	public String getCategoryList(Model model) {
		List<Category> categoryList = categoryService.getCategoryList();
		model.addAttribute("categoryList", categoryList);
		return "/category/getCategoryList";
	}
	
	
}
