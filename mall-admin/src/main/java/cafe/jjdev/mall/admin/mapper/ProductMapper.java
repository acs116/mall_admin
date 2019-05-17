package cafe.jjdev.mall.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import cafe.jjdev.mall.admin.vo.ProductCommon;

@Mapper
public interface ProductMapper {
	public int insertProductCommon(ProductCommon productCommon);
}
