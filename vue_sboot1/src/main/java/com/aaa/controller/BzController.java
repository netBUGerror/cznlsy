package com.aaa.controller;

import com.aaa.entity.Bz;
import com.aaa.entity.Goods;
import com.aaa.entity.GoodsVO;
import com.aaa.service.IBzService;
import com.aaa.util.CommonResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/bz")
@RestController
public class BzController {
    @Autowired
    private IBzService BzService;
    @GetMapping("/list")  //等价于RequestMapping设置了请求方法为GET
    public PageInfo<Bz> list(Integer pageNum, Integer pageSize){
        PageInfo<Bz> pi = BzService.list(pageNum,pageSize);
        return pi;
    }
    @PostMapping("/add")
    public CommonResult add(@RequestBody Bz bz){
        BzService.Bzinsert(bz);
        return CommonResult.RESULT_SUCCESS;
    }
    @PostMapping("/update")
    public CommonResult update(@RequestBody Bz bz){
        BzService.Bzupdate(bz);
        return CommonResult.RESULT_SUCCESS;
    }

    @DeleteMapping("/delete/{sym}")
    public CommonResult delete(@PathVariable("sym") String sym){
        BzService.Bzdelete(sym);
        return CommonResult.RESULT_SUCCESS;
    }
}
