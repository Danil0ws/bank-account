package buff.dev.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import buff.dev.bank.repository.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
