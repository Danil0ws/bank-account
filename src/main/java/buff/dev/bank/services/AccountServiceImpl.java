package buff.dev.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import buff.dev.bank.dto.AccountCreateDTO;
import buff.dev.bank.dto.AccountDTO;
import buff.dev.bank.repository.AccountRepository;
import buff.dev.bank.repository.models.Account;
import buff.dev.bank.repository.models.Address;
import buff.dev.bank.repository.models.Consumer;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    @Autowired
    final AccountRepository repository;

    @Override
    public Account saveNewAccount(AccountCreateDTO createDTO) {

        Address address = Address.builder()
                .street(createDTO.getAddress().getState())
                .number(createDTO.getAddress().getNumber())
                .complement(createDTO.getAddress().getComplement())
                .neighborhood(createDTO.getAddress().getNeighborhood())
                .state(createDTO.getAddress().getState())
                .country(createDTO.getAddress().getCountry())
                .zipCode(createDTO.getAddress().getZipCode())
                .build();

        Consumer consumer = Consumer.builder()
                .birthDate(createDTO.getConsumer().getBirthDate())
                .documentNumber(createDTO.getConsumer().getDocumentNumber())
                .email(createDTO.getConsumer().getEmail())
                .firstName(createDTO.getConsumer().getFirstName())
                .lastName(createDTO.getConsumer().getLastName())
                .address(address)
                .build();

        Account account = Account.builder()
                .accountNumber(createDTO.getAccount().getAccountNumber())
                .branch(createDTO.getAccount().getBranch())
                .consumer(consumer)
                .build();

        return repository.save(account);
    }

}
