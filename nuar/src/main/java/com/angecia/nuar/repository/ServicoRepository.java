package com.angecia.nuar.repository;


import com.angecia.nuar.model.Servico;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicoRepository extends MongoRepository<Servico, String> {
    @Query("{title}:?0")
    public List<Servico> findByTitle(String title);
}
