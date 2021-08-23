package br.com.itau.infrastructure.repository;

import br.com.itau.infrastructure.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Infra
 * Função na Arq. Hex: Secondary Adapter
 * Utilizado para utilização dos métodos genéricos de um repository, ex: Create,Read,Update,Delete...
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
