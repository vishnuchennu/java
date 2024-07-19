package com.javaguides.banking.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import com.javaguides.banking.entity.Account;

@Repository
public interface AccountRespositry extends JpaRepository<Account,Long> {

}
