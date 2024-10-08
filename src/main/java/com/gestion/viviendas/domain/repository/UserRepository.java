package com.gestion.viviendas.domain.repository;

import com.gestion.viviendas.domain.User;
import com.gestion.viviendas.persistence.type.RolUser;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    List<User> getAll();
    boolean existsByTelefonoAndContraseña(String phone, String password);
    Optional<User> getById(int userId);
    Optional<List<User>> findByNombreOrApellido(String name, String lastName);
    Optional<User> getByDni(String dni);
    Optional<List<User>> getByRol(RolUser rol);
    User save(User user);
    void delete(int userId);

}
