package com.example.trading.service;

import com.example.trading.model.tradingModel;
import com.example.trading.reposity.tradingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tradingService {

    @Autowired
    private tradingRepository TradingRepository;

    public List<tradingModel> findAll() {
        return TradingRepository.findAll();
    }

    public void save(tradingModel Stock) {
        TradingRepository.save(Stock);
    }
}
