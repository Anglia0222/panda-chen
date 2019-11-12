package com.anglia.mall.mapper;

import com.anglia.mall.model.PmsBrand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PmsBrandMapper {

    public PmsBrand selectByPrimaryKey(Long id);
}
