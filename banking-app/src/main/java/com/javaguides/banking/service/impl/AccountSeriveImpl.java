package com.javaguides.banking.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.config.RuntimeBeanNameReference;
import org.springframework.stereotype.*;

import com.javaguides.banking.dto.AccountDto;
import com.javaguides.banking.entity.Account;
import com.javaguides.banking.mapper.AccountMapper;
import com.javaguides.banking.repository.AccountRespositry;
import com.javaguides.banking.service.AccountSerive;

@Service
public class AccountSeriveImpl implements AccountSerive {

	private AccountRespositry accRepo;

	public AccountSeriveImpl(AccountRespositry accRepo) {
		super();
		this.accRepo = accRepo;
	}

	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.maptoAccount(accountDto);
		Account saveAccount = accRepo.save(account);
		return AccountMapper.maptoAccountDto(saveAccount);
	}

	public AccountDto getAccountById(Long id) {
		Account account = accRepo.findById(id).orElseThrow(() -> new RuntimeException("Account does not Exites"));
		return AccountMapper.maptoAccountDto(account);
	}

	public AccountDto deposite(Long id, double amount) {
		Account account = accRepo.findById(id).orElseThrow(() -> new RuntimeException("Account does not Exites"));
		double total = account.getBalance() + amount;
		account.setBalance(total);
		Account saveAcount = accRepo.save(account);
		return AccountMapper.maptoAccountDto(saveAcount);
	}

	@Override
	public AccountDto withdraw(Long id, double amount) {
		Account account = accRepo.findById(id).orElseThrow(() -> new RuntimeException("Account does not Exites"));
		if (account.getBalance() < amount) {
			throw new RuntimeException("Insufficient amount..");
		}
		double total = account.getBalance() - amount;
		account.setBalance(total);
		Account saveAcount = accRepo.save(account);
		return AccountMapper.maptoAccountDto(saveAcount);
	}

	public List<AccountDto> getAllAccounts() {
		List<Account> accounts = accRepo.findAll();
		return accounts.stream().map((account) -> AccountMapper.maptoAccountDto(account)).collect(Collectors.toList());

	}

	@Override
	public void deleteAccount(Long id) {
		Account account = accRepo.findById(id).orElseThrow(() -> new RuntimeException("Account does not Exites"));
		accRepo.deleteById(id);
		
	}

}
