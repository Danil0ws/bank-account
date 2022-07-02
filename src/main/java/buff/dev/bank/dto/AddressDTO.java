package buff.dev.bank.dto;

import javax.validation.constraints.NotNull;

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
public class AddressDTO {
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
    @NotNull
    private String zipCode;
}
