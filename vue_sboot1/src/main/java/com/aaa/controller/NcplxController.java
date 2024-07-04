package com.aaa.controller;

import com.aaa.entity.Ncplx;
import com.aaa.service.INcplxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class NcplxController {
    @Autowired
    INcplxService ncplxService;
    @RequestMapping("/findAllNcplx")
    public List<Ncplx> findAllNcplx(){
        return ncplxService.findAllNcplx();
    }
}
