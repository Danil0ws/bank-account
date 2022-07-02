package buff.dev.bank.repository.models;


import java.time.LocalDate;

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
    private Long accountNumber;    

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "consumer_id")
    private Consumer consumerId;
    
    private LocalDate CreatedDate;
}
