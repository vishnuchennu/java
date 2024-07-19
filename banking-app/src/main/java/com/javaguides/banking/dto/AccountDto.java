package com.javaguides.banking.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
	private long id;
	private String accountHolderName;
	private double balance;
}
