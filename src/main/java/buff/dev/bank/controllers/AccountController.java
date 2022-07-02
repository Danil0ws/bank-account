package buff.dev.bank.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import buff.dev.bank.repository.AccountRepository;
import buff.dev.bank.repository.models.Account;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AccountController {

    private AccountRepository repository;
    
    @RequestMapping(method = RequestMethod.GET, value = "/account")
    public List<Account> getAllAccounts(){
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/account/{id}")
    public Optional<Account> getAccountById(@PathVariable Long id) {
        return repository.findById(id);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/account")
    public Account saveAccount(@RequestBody Account Account){
        return repository.save(Account);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/account/{id}")
    public void deleteAccount(@PathVariable Long id){
        repository.deleteById(id);
    }
}
