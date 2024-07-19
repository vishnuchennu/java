package com.javaguides.banking.mapper;

import com.javaguides.banking.dto.AccountDto;
import com.javaguides.banking.entity.Account;

public class AccountMapper {
	public static Account maptoAccount(AccountDto accountDto) {
		Account account = new Account(accountDto.getId(), accountDto.getAccountHolderName(), accountDto.getBalance());
		return account;
	}

	public static AccountDto maptoAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(account.getId(), account.getAccountHolderName(), account.getBalance());
		return accountDto;

	}

}
