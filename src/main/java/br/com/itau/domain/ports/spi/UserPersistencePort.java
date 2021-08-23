package br.com.itau.domain.ports.spi;

import br.com.itau.domain.data.UserDto;

import java.util.List;

/**
 * Domain
 * Função na Arq. Hex: Outbound Port
 * Utilizada como "Intermediador" da comunicação entre o Adapter e o Domain.
 * É o Intermediador de saída da informação para fontes externas, ex: MySQL, Kafka, RabbitMQ, etc...
 */
public interface UserPersistencePort {

  UserDto addUser(UserDto bookDto);

  void deleteUserById(Long id);

  UserDto updateUser(UserDto bookDto);

  List<UserDto> getUsers();

  UserDto getUserById(Long bookId);
}
