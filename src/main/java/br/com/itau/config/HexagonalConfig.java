package br.com.itau.config;

import br.com.itau.domain.ports.api.UserServicePort;
import br.com.itau.domain.ports.spi.UserPersistencePort;
import br.com.itau.domain.service.UserServiceImpl;
import br.com.itau.infrastructure.adapters.UserJpaAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Nada a ver com o Hexagonal. Apenas configurações simples de beans do Spring.
 */
@Configuration
public class HexagonalConfig {

  @Bean
  public UserPersistencePort bookPersistence() {
    return new UserJpaAdapter();
  }

  @Bean
  public UserServicePort bookService() {
    return new UserServiceImpl(bookPersistence());
  }
}
