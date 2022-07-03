package buff.dev.bank.repository.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private Integer branch;
    @NotNull
    @Column(name = "account_number", nullable = false)
    private Long accountNumber;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "consumer")
    private Consumer consumer;

    @Builder.Default
    @Column(name = "created_date", nullable = false)
    private LocalDate CreatedDate = LocalDate.now();
}
