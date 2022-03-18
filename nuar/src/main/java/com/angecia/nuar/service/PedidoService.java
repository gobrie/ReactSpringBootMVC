package com.angecia.nuar.service;

import com.angecia.nuar.model.Pedido;
import com.angecia.nuar.repository.PedidoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PedidoService implements IPedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido create(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public List<Pedido> findByTitle(String title) {
        log.info("######## FIND BY TITLE {} ", title);
        List<Pedido> pedidoList = pedidoRepository. findByTitle(title);
        log.info("######## FIND BY pedidoList {}", pedidoList);
        return pedidoRepository.findByTitle(title);
    }

    @Override
    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    @Override
    public void delete(String id) {
        pedidoRepository.deleteById(id);
    }

    @Override
    public Pedido update(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido findById(String id) {
        return pedidoRepository.findById(id).get();
    }
}
