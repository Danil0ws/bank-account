package buff.dev.bank.repository.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;
    @NotNull
    private String street;
    private String number;
    @NotNull
    private String neighborhood;
    private String complement;
    @NotNull
    private String state;
    @NotNull
    private String country;
    @Column(name = "zip_code", nullable = false)
    private String zipCode;
}
