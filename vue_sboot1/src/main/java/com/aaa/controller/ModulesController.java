package com.aaa.controller;

import com.aaa.entity.Modules;
import com.aaa.service.IModulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//菜单列表
@CrossOrigin
@RequestMapping("/modules")
@RestController
public class ModulesController {
    @Autowired
    private IModulesService modulesService;
    @RequestMapping("/list")
    public List<Modules> list(){
        return modulesService.list();
    }
}
