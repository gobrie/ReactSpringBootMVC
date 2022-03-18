package com.angecia.nuar.service;

import com.angecia.nuar.model.Usuario;
import com.angecia.nuar.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> findByTitle(String title) {
        log.info("######## FIND BY TITLE {} ", title);
        List<Usuario> usuarioList = usuarioRepository. findByTitle(title);
        log.info("######## FIND BY usuarioList {}", usuarioList);
        return usuarioRepository.findByTitle(title);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public void delete(String id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findById(String id) {
        return usuarioRepository.findById(id).get();
    }
}
