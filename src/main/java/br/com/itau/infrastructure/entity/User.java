package br.com.itau.infrastructure.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Infra
 * Função na Arq. Hex: Secondary Adapter
 * Classe utilizada para realizar o mapeamento da informação para JPA.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String username;

  private String password;

}
