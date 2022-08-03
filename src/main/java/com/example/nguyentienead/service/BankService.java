package com.example.nguyentienead.service;

import com.example.nguyentienead.entity.BankEntity;

import java.util.List;

public interface BankService {
    List<BankEntity> getAll();

    List<Double> getStockPrice(String symbol);

    List<BankEntity> getStockName(String symbol);
}
