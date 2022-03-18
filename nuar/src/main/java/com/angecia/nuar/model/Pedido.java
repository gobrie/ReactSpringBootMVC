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
@Document(collection = "Pedido")
public class Pedido {
    @Id
    private String id;
    private String tipo_pagamento;
    private String cupom_desconto;
    private String promocao;
}
