package br.com.itau.domain.ports.api;

import br.com.itau.domain.data.UserDto;

import java.util.List;

/**
 * Domain
 * Função na Arq. Hex: Inbound Port
 * Utilizada como "Intermediador" da comunicação entre o Adapter e o Domain.
 * É o Intermediador de entrada da informação para o Domínio e vice-versa. Ex. REST Api calls, console applications,etc...
 */
public interface UserServicePort {

  UserDto addUser(UserDto bookDto);

  void deleteUserById(Long id);

  UserDto updateUser(UserDto bookDto);

  List<UserDto> getUsers();

  UserDto getUserById(Long bookId);
}
