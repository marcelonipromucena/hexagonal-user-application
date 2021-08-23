package br.com.itau.infrastructure.adapters;

import br.com.itau.domain.data.UserDto;
import br.com.itau.domain.ports.spi.UserPersistencePort;
import br.com.itau.infrastructure.entity.User;
import br.com.itau.infrastructure.mappers.UserMapper;
import br.com.itau.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Infra
 * Função na Arq. Hex: Secondary Adapter
 * Utilizada como "Intermediador" da comunicação entre o Adapter e o Domain.
 * É o Intermediador de saída da informação para fontes externas, ex: MySQL, Kafka, RabbitMQ, etc...
 */
@Service
public class UserJpaAdapter implements UserPersistencePort {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDto addUser(UserDto userDto) {

    User user = UserMapper.INSTANCE.userDtoToUser(userDto);

    User userSaved = userRepository.save(user);

    return UserMapper.INSTANCE.userToUserDto(userSaved);
  }

  @Override
  public void deleteUserById(Long id) {
    userRepository.deleteById(id);
  }

  @Override
  public UserDto updateUser(UserDto userDto)   {
    return addUser(userDto);
  }

  @Override
  public List<UserDto> getUsers() {

    List<User> userList = userRepository.findAll();

    return UserMapper.INSTANCE.userListToUserDtoList(userList);
  }

  @Override
  public UserDto getUserById(Long userId) {

    Optional<User> user = userRepository.findById(userId);

    if (user.isPresent()) {
      return UserMapper.INSTANCE.userToUserDto(user.get());
    }

    return null;
  }
}