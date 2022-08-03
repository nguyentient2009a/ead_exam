package com.example.nguyentienead.repo;

import com.example.nguyentienead.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BankRepo extends JpaRepository<BankEntity, Integer> {
    BankEntity getBankEntityBySymbol(String symbol);

    @Query("select u from BankEntity u where u.symbol = :symbol")
    List<BankEntity> findByStockName(String symbol);

    @Query("select 'stock_price' from BankEntity where symbol like %:symbol%")
    List<Double> findByStockPrice(String symbol);

}