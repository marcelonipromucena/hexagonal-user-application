package br.com.itau.application;


import br.com.itau.domain.data.UserDto;
import br.com.itau.domain.ports.api.UserServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Application Layer
 * Função na Arq. Hex.: Primary Adapter
 * Classe utilizada como Adaptador entre a informação de entrada e a camada de domínio.
 */
@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserServicePort userServicePort;

  @PostMapping("/add")
  public UserDto addUser(@RequestBody UserDto userDto) {
    return userServicePort.addUser(userDto);
  }

  @PutMapping("/update")
  public UserDto updateUser(@RequestBody UserDto userDto) {
    return userServicePort.updateUser(userDto);
  }

  @GetMapping("/get/{id}")
  public UserDto getUserByID(@PathVariable long id) {
    return userServicePort.getUserById(id);
  }

  @GetMapping("/get")
  public List<UserDto> getAllUsers() {
    return userServicePort.getUsers();
  }

  @DeleteMapping("/delete/{id}")
  public void deleteUserByID(@PathVariable long id) {
    userServicePort.deleteUserById(id);
  }
}
