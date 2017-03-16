package mx.edu.uacm.repository;

import org.springframework.data.repository.CrudRepository;

import mx.edu.uacm.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
