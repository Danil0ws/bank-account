package buff.dev.bank.services;

import buff.dev.bank.dto.AccountCreateDTO;
import buff.dev.bank.repository.models.Account;

public interface AccountService {

    Account saveNewAccount(AccountCreateDTO createDT);

}
