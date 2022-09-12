/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucfg
 */
public class Cliente {
    
    private String nome;
    private String sobrenome;
    private String RG;
    private String CPF;
    private String endereco;

    public Cliente(String nome, String sobrenome, String rg, String cpf, String endereco) {
        this.nome = nome.toUpperCase();
        this.sobrenome = sobrenome.toUpperCase();
        this.RG = rg;
        this.CPF = cpf;
        this.endereco = endereco.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }
        
}
