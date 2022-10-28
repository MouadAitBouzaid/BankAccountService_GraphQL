package com.example.bankaccountservice.DTO;

import com.example.bankaccountservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountResponseDTO {

    private String id;
    private Date createdAt;
    private Double balance;
    private String currency;
    private AccountType type;

}
