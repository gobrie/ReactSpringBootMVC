package com.angecia.nuar.service;

import com.angecia.nuar.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario create(Usuario usuario);

    List<Usuario> findByTitle(String Title);

    List<Usuario> findAll();

    void delete(String id);

    Usuario update(Usuario usuario);

    Usuario findById(String id);
}
