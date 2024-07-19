package com.javaguides.banking.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.javaguides.banking.dto.AccountDto;
import com.javaguides.banking.service.AccountSerive;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	private AccountSerive accSer;

	public AccountController(AccountSerive accSer) {
		super();
		this.accSer = accSer;
	}

	// Add account Rest API
	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
		return new ResponseEntity<>(accSer.createAccount(accountDto), HttpStatus.CREATED);
	}

	// get account Rest API
	@GetMapping("/{id}")
	public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id) {
		AccountDto accountDto = accSer.getAccountById(id);
		return ResponseEntity.ok(accountDto);
	}

	// Deposite Rest API
	@PutMapping("/{id}/deposit")
	public ResponseEntity<AccountDto> deposite(@PathVariable Long id, @RequestBody AccountDto accountDto) {
		return ResponseEntity.ok(accSer.deposite(id, accountDto.getBalance()));
	}

	// withdraw Rest API
	@PutMapping("/{id}/withdraw")
	public ResponseEntity<AccountDto> withdraw(@PathVariable Long id, @RequestBody AccountDto accountDto) {
		Double amount = accountDto.getBalance();
		AccountDto accountDto1 = accSer.withdraw(id, amount);
		return ResponseEntity.ok(accountDto1);
	}

	// getAllAccounts Rest API
	@GetMapping
	public ResponseEntity<List<AccountDto>> getAllAccount() {
		List<AccountDto> list = accSer.getAllAccounts();
		return ResponseEntity.ok(list);
	}

	// delete Account Rest API
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAccout(@PathVariable long id) {
		accSer.deleteAccount(id);
		//return ResponseEntity.ok("Account is delete successfully!");
		 return ResponseEntity.ok().build();
	}

}
