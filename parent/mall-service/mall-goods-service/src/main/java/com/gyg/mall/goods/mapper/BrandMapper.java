package com.gyg.mall.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gyg.mall.goods.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper extends BaseMapper<Brand> {

    @Select("SELECT brand_id FROM category_brand WHERE category_id=#{id}")
    List<Integer> queryBrandIds(Integer id);


}
