package com.angecia.nuar.service;

import com.angecia.nuar.model.Servico;

import java.util.List;

public interface IServicoService {

    Servico create(Servico servico);

    List<Servico> findByTitle(String Title);

    List<Servico> findAll();

    void delete (String id);

    Servico update(Servico servico);

    Servico findById(String id);
}
