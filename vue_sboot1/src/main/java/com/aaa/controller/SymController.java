package com.aaa.controller;

import com.aaa.entity.Dlxx;
import com.aaa.entity.Ncplx;
import com.aaa.entity.Sym;
import com.aaa.service.INcplxService;
import com.aaa.service.ISymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@CrossOrigin
public class SymController {
    @Autowired
    ISymService symService;
    @RequestMapping("/addSym")
    public int addSym(Sym sym){
        Sym sym1 = new Sym();
        sym1.setDlxxbh(sym.getDlxxbh());
        sym1.setNcplxbh(sym.getNcplxbh());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String nyr = sdf.format(date);
        Random random = new Random();
        int randomNumber = 1000 + random.nextInt(9999+1-1000);
        String symc = sym.getDlxxbh()+sym.getNcplxbh()+nyr+randomNumber+"0";
        sym1.setSym(symc);

        symService.addSym(sym1);
        return 1;
    }
    @GetMapping("/findAllSym")
    public List<Sym> findAllSym(){
        return symService.findAllSym();
    }

}
