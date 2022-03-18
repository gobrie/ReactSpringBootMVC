package com.angecia.nuar.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "Usuario")
public class Usuario {

    @Id
    private String id;
    private String cpf;
    private String nome;
    private String email;
    private String endereco;
}
