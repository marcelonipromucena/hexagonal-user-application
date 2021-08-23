package br.com.itau.infrastructure.mappers;

import br.com.itau.domain.data.UserDto;
import br.com.itau.infrastructure.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * MapStruct is a code generator that greatly simplifies the implementation of mappings between Java bean types based on a convention over configuration approach.
 *
 * Mapstruct auxilia na conversão dos objetos de DTO -> Entity, Entity -> DTO.
 *
 * Essa interface define o mapeamento de métodos para a conversão da informação.
 */
@Mapper
public interface UserMapper {

  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  UserDto userToUserDto(User user);

  User userDtoToUser(UserDto userDto);

  List<UserDto> userListToUserDtoList(List<User> userList);

  List<User> UserDtoListToUserList(List<UserDto> UserDtoList);
}
