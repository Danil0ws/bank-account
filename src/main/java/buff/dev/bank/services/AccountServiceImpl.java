package buff.dev.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import buff.dev.bank.dto.AccountDTO;
import buff.dev.bank.repository.AccountRepository;
import buff.dev.bank.repository.models.Account;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    @Autowired
    final AccountRepository repository;

    @Override
    public Account saveNewAccount(AccountDTO accountDTO) {

        Account account = Account.builder().accountNumber(accountDTO.getAccountNumber()).branch(accountDTO.getBranch())
                .build();
        return repository.save(account);
    }

}
