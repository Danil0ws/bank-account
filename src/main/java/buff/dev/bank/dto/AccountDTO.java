package buff.dev.bank.dto;

import javax.validation.constraints.NotNull;

import buff.dev.bank.repository.models.Consumer;
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
public class AccountDTO {
    @NotNull
    private Integer branch;
    @NotNull
    private Long accountNumber;
    private Consumer consumerId;
}
