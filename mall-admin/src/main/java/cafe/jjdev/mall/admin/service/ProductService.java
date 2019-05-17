package cafe.jjdev.mall.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cafe.jjdev.mall.admin.mapper.ProductMapper;
import cafe.jjdev.mall.admin.vo.ProductCommon;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductMapper productMapper;
	
	public int addProductCommon(ProductCommon productCommon) {
		return productMapper.insertProductCommon(productCommon);
	}
}
