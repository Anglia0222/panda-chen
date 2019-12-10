package com.anglia.mall.service;

import com.anglia.mall.CommonResult;
import com.anglia.mall.model.PmsBrand;
import org.springframework.stereotype.Service;

public interface PmsBrandService {

    PmsBrand brand(Long id);

    int delete(Long id);

    int update(Long id,PmsBrand brand);
}
