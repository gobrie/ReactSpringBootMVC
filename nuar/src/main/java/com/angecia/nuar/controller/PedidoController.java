package com.angecia.nuar.controller;

import com.angecia.nuar.model.Pedido;
import com.angecia.nuar.service.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@CrossOrigin
@Controller("/Pedido")
@RequestMapping ("/Pedido")
public class PedidoController {
    @Autowired
    private IPedidoService pedidoService;

    @GetMapping("/all")
    public List<Pedido> getAllPedidos() {
        return pedidoService.findAll();
    }

    @GetMapping("/title/{title}")
    public List<Pedido> getPedidoByTitle(@PathVariable String pedido) {
        return pedidoService.findByTitle(pedido);
    }

    @GetMapping("/id/{id}")
    public Pedido getPedidoById(@PathVariable String id) {
        return pedidoService.findById(id);
    }

    @PostMapping("/create")
    public Pedido create(@RequestBody Pedido pedido) {
        pedido.setId(UUID.randomUUID().toString());
        return pedidoService.create(pedido);
    }

    @PutMapping("/update")
    public Pedido update(@RequestBody Pedido pedido) {
        return pedidoService.update(pedido);
    }

    @PostMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById (@PathVariable String id){
        pedidoService.delete(id);
    }

}
