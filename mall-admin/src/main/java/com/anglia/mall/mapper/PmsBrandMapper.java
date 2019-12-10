package com.anglia.mall.mapper;

import com.anglia.mall.model.PmsBrand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PmsBrandMapper {

    PmsBrand selectByPrimaryKey(Long id);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Long id,PmsBrand brand);
}
