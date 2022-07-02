package buff.dev.bank.services;

import buff.dev.bank.dto.AccountDTO;
import buff.dev.bank.repository.models.Account;

public interface AccountService {

    Account saveNewAccount(AccountDTO accountDTO);

}
