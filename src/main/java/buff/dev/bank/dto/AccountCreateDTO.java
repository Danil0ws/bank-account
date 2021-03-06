package buff.dev.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Builder
@Getter
@Setter
public class AccountCreateDTO {
    final AccountDTO account;
    final AddressDTO address;
    final ConsumerDTO consumer;
}
