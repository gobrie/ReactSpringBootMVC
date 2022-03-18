package com.angecia.nuar.service;

import com.angecia.nuar.model.Servico;
import com.angecia.nuar.repository.ServicoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ServicoService implements IServicoService {


    @Autowired
    private ServicoRepository servicoRepository;

    @Override
    public Servico create(Servico servico) {
        return servicoRepository.save(servico);
    }

    @Override
    public List<Servico> findByTitle(String title) {
        log.info("######## FIND BY TITLE {} ", title);
        List<Servico> servicoList = servicoRepository. findByTitle(title);
        log.info("######## FIND BY servicoList {}", servicoList);
        return servicoRepository.findByTitle(title);
    }

    @Override
    public List<Servico> findAll() {
        return servicoRepository.findAll();
    }

    @Override
    public void delete (String id) {
        servicoRepository.deleteById(id);
    }

    @Override
    public Servico update (Servico servico) {
        return servicoRepository.save(servico);
    }

    @Override
    public Servico findById (String id) {
        return servicoRepository.findById(id).get();
    }
}
