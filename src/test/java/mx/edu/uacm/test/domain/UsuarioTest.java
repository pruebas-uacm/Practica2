package mx.edu.uacm.test.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mx.edu.uacm.Application;
import mx.edu.uacm.domain.Usuario;
import mx.edu.uacm.repository.UsuarioRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
public class UsuarioTest {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Test
	public void guardarUsuarioTest() {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Profe");
		
		usuarioRepository.save(usuario);
		
		
		Usuario recuperado = (Usuario)usuarioRepository.findOne(usuario.getId());
		
		Assert.assertTrue(usuario.getNombre().equals(recuperado.getNombre()));
		
		
		
	}

}
