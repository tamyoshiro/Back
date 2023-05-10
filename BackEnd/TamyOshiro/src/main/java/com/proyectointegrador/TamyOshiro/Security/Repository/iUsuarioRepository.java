package com.proyectointegrador.TamyOshiro.Security.Repository;

import com.proyectointegrador.TamyOshiro.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
        Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
        boolean existaByNombreUsuario(String nombreUsuario);
        boolean existaByEmail(String email);

    public boolean existsByNombreUsuario(String nombreUsuario);

    public boolean existsByEmail(String email);
}
