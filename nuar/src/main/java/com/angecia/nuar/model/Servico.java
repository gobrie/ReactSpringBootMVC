package com.angecia.nuar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection= "Serviço")
public class Servico {
    @Id
    private String id;
    private String pais;
    private String cidade;
    private String data_ida;
    private String data_volta;
    private String qtd_passageiros;
    private String preco;

}
