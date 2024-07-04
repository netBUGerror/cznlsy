package com.aaa.controller;

import com.aaa.entity.Dlxx;
import com.aaa.mapper.DlxxMapper;
import com.aaa.service.IDlxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class DlxxController {
    @Autowired
    IDlxxService dlxxService;
    @RequestMapping("/findAllDlxx")
    public List<Dlxx> findAllDlxx(){
        return dlxxService.findAllDlxx();
    }
}
