package com.example.trading.reposity;

import com.example.trading.model.tradingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface tradingRepository extends JpaRepository<tradingModel, Long> {
   // List<tradingModel> findByTitleContainingOrContentContaining(String text, String textAgain);
}
