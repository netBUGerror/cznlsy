package com.aaa.controller;

import com.aaa.entity.Bz;
import com.aaa.service.IBzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("/bz")
@RestController
public class BzController {
    @Autowired
    private IBzService BzService;
    @GetMapping("/list")
    public List<Bz> list(){return BzService.list();}
}
