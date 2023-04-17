package com.Portfolio.JCastro.Security.Service;

import com.Portfolio.JCastro.Security.Entity.Usuario;
import com.Portfolio.JCastro.Security.Repository.iUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
     @Autowired
    iUsuarioRepository iusuarioRepositorio;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepositorio.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepositorio.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email){
        return iusuarioRepositorio.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        iusuarioRepositorio.save(usuario);
    }
}
