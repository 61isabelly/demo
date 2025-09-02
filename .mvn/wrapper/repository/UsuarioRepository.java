import org.springframework.data.jpa.repository.JpaRepository;

import demo.mvn.wrapper.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}