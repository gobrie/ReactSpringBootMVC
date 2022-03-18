package com.angecia.nuar.repository;


import com.angecia.nuar.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    @Query("{'title':?0}")
    public List<Usuario> findByTitle(String title);
}

