package com.angecia.nuar.controller;

import com.angecia.nuar.model.Servico;
import com.angecia.nuar.service.IServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
@Controller("/Serviço")
@RequestMapping ("/Serviço")
public class ServicoController {
    @Autowired
    private IServicoService servicoService;

    @GetMapping("/all")
    public List<Servico> getAllServicos() {
        return servicoService.findAll();
    }

    @GetMapping("/title/{title}")
    public List<Servico> getServicoByTitle(@PathVariable String servico) {
        return servicoService.findByTitle(servico);
    }

    @GetMapping("/id/{id}")
    public Servico getServicoById(@PathVariable String id) {
        return servicoService.findById(id);
    }

    @PostMapping("/create")
    public Servico create(@RequestBody Servico servico) {
        servico.setId(UUID.randomUUID().toString());
        return servicoService.create(servico);
    }

    @PutMapping(value = "/update")
    public Servico update(@RequestBody Servico servico) {
        return servicoService.update(servico);
    }

    @PostMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById (@PathVariable String id){
        servicoService.delete(id);
    }

}
