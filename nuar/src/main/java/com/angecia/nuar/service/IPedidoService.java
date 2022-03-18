package com.angecia.nuar.service;

import com.angecia.nuar.model.Pedido;

import java.util.List;

public interface IPedidoService {

    Pedido create(Pedido pedido);

    List <Pedido> findByTitle(String Title);

    List<Pedido> findAll();

    void delete (String Title);

    Pedido update(Pedido pedido);

    Pedido findById(String id);
}
