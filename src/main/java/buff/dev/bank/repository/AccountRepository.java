package buff.dev.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import buff.dev.bank.repository.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}