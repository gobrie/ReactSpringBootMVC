package com.angecia.nuar.controller;

import com.angecia.nuar.model.Usuario;
import com.angecia.nuar.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
@Controller("/Usuario")
@RequestMapping
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> getAllUsuarios() {
        return usuarioService.findAll();
    }

    @GetMapping("/title/{title}")
    public List<Usuario> getUsuarioByTitle(@PathVariable String usuario) {
        return usuarioService.findByTitle(usuario);
    }

    @GetMapping("/id/{id}")
    public Usuario getUsuarioById(@PathVariable String id) {
        return usuarioService.findById(id);
    }

    @PostMapping("/create")
    public Usuario create(@RequestBody Usuario usuario) {
        usuario.setId(UUID.randomUUID().toString());
        return usuarioService.create(usuario);
    }

    @PutMapping(value = "/update")
    public Usuario update(@RequestBody Usuario usuario) {
        return usuarioService.update(usuario);
    }

    @PostMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById (@PathVariable String id){
         usuarioService.delete(id);
    }



}
