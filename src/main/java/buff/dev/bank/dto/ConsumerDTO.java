package buff.dev.bank.dto;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

import buff.dev.bank.repository.models.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ConsumerDTO {
    @NotNull
    private BigInteger documentNumber;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String birthDate;
    private Address address;
}
