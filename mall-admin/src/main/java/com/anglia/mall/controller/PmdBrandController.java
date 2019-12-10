package com.anglia.mall.controller;

import com.anglia.mall.CommonResult;
import com.anglia.mall.model.PmsBrand;
import com.anglia.mall.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 商品查询controller
 */
@Controller
@RequestMapping("/brand")
@Api(tags = "PmdBrandController",description = "商品管理")
public class PmdBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获得指定id的商品信息")
    public CommonResult<PmsBrand> brand(@PathVariable("id") long id){
        return CommonResult.success(pmsBrandService.brand(id));
    }


    @RequestMapping(value="/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="删除指定id的商品")
    public CommonResult delete(@PathVariable("id") Long id){
        int count = pmsBrandService.delete(id);
        if(count == 1){
            return CommonResult.success(null);
        }else{
            return CommonResult.failed();
        }
    }


    @RequestMapping(value="/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "更新指定id的品牌信息")
    public CommonResult update(@PathVariable("id")Long id,@RequestBody PmsBrand brand){
        int count = pmsBrandService.update(id,brand);
        if(count == 1){
            return CommonResult.success(null);
        }else{
            return CommonResult.failed();
        }
    }

    @RequestMapping(value="/choice/{index}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "策略模式根据indexd调用不同的方法")
    public CommonResult choice(@PathVariable("index") String index){



        return CommonResult.failed();
    }

}
