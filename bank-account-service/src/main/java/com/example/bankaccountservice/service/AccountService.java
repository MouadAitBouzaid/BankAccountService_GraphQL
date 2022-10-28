package com.example.bankaccountservice.service;

import com.example.bankaccountservice.DTO.BankAccountRequestDTO;
import com.example.bankaccountservice.DTO.BankAccountResponseDTO;
import com.example.bankaccountservice.entities.BankAccount;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO );


    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
