package com.autostock.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Peca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private String classificacao;
    private int quantidade;
    private BigDecimal precoUnitario;
    private String fabricante;
    private String modeloCarro;
    private Integer anoModelo;
    private String oem;
    private String codigoUniversal;
    private String localizacao;
}
