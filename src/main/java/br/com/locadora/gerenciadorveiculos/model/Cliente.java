/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.model;

/**
 *
 * @author lucfg
 */
public class Cliente {
    
    final private String nome;
    final private String sobrenome;
    final private String RG;
    final private String CPF;
    final private String endereco;

    public Cliente(String nome, String sobrenome, String rg, String cpf, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = rg;
        this.CPF = cpf;
        this.endereco = endereco;
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
