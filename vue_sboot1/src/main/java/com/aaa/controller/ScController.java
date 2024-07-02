package com.aaa.controller;

import com.aaa.entity.Bz;
import com.aaa.entity.Sc;
import com.aaa.service.IScService;
import com.aaa.util.CommonResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/sc")
@RestController
public class ScController {
    @Autowired
    private IScService scService;
    @GetMapping("/list")  //等价于RequestMapping设置了请求方法为GET
    public PageInfo<Sc> list(Integer pageNum, Integer pageSize){
        PageInfo<Sc> pi = scService.list(pageNum,pageSize);
        return pi;
    }
    @PostMapping("/add")
    public CommonResult add(@RequestBody Sc sc){
        scService.Scinsert(sc);
        return CommonResult.RESULT_SUCCESS;
    }
    @PostMapping("/update")
    public CommonResult update(@RequestBody Sc sc){
        scService.Scupdate(sc);
        return CommonResult.RESULT_SUCCESS;
    }

    @DeleteMapping("/delete/{sym}")
    public CommonResult delete(@PathVariable("sym") String sym){
        scService.Scdelete(sym);
        return CommonResult.RESULT_SUCCESS;
    }
}
