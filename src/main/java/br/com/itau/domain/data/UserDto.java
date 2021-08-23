package br.com.itau.domain.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dto para conversão da informação do proxy para utilização nas demais camadas.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

  private Long id;

  private String username;

  private String password;
}
