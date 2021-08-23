package br.com.itau.domain.service;

import br.com.itau.domain.data.UserDto;
import br.com.itau.domain.ports.api.UserServicePort;
import br.com.itau.domain.ports.spi.UserPersistencePort;

import java.util.List;


/**
 * Domain
 * Função na Arq. Hex: Port
 * Detalha a business logic da Port sendo implementada.
 */
public class UserServiceImpl implements UserServicePort {

  private UserPersistencePort userPersistencePort;

  public UserServiceImpl(UserPersistencePort userPersistencePort) {
    this.userPersistencePort = userPersistencePort;
  }

  @Override
  public UserDto addUser(UserDto userDto) {
    return userPersistencePort.addUser(userDto);
  }

  @Override
  public void deleteUserById(Long id) {
    userPersistencePort.deleteUserById(id);
  }

  @Override
  public UserDto updateUser(UserDto userDto) {
    return userPersistencePort.updateUser(userDto);
  }

  @Override
  public List<UserDto> getUsers() {
    return userPersistencePort.getUsers();
  }

  @Override
  public UserDto getUserById(Long userId) {
    return userPersistencePort.getUserById(userId);
  }
}