package com.Portfolio.JCastro.Security.Repository;

import com.Portfolio.JCastro.Security.Entity.Rol;
import com.Portfolio.JCastro.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
