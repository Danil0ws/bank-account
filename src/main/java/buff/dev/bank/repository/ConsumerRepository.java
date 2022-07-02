package buff.dev.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import buff.dev.bank.repository.models.Consumer;

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
    
}
