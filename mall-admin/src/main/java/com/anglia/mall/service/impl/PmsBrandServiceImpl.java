package com.anglia.mall.service.impl;

import com.anglia.mall.mapper.PmsBrandMapper;
import com.anglia.mall.model.PmsBrand;
import com.anglia.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    public PmsBrand brand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }

    public int delete(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    public int update(Long id, PmsBrand brand) {
        return pmsBrandMapper.updateByPrimaryKeySelective(id,brand);
    }

}
