package com.aaa.controller;

import com.aaa.entity.Sc;
import com.aaa.service.IScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("/sc")
@RestController
public class ScController {
    @Autowired
    private IScService scService;
    @GetMapping("/list")
    public List<Sc> list(){
        return scService.list();
    }
}
