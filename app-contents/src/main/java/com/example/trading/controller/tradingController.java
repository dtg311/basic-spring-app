package com.example.trading.controller;

import com.example.trading.model.tradingModel;
import com.example.trading.service.tradingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class tradingController {

    @Autowired
    private tradingService TradingService;

    @GetMapping("/stocks")
    List<tradingModel> findAll() {return TradingService.findAll();}

    @PostMapping("/stocks")
    void save(@RequestBody tradingModel TradingModel){
        TradingService.save(TradingModel);
    }

}