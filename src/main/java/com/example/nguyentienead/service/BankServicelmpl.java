package com.example.nguyentienead.service;

import com.example.nguyentienead.entity.BankEntity;
import com.example.nguyentienead.repo.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServicelmpl implements BankService{
    @Autowired
    BankRepo bankRepo;

    @Override
    public List<BankEntity> getAll() {
        return bankRepo.findAll();
    }

    @Override
    public List<Double> getStockPrice(String symbol) {

        return bankRepo.findByStockPrice(symbol);
    }

    @Override
    public List<BankEntity> getStockName(String symbol) {
        return bankRepo.findByStockName(symbol);
    }

}
