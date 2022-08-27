/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.model;

/**
 *
 * @author lucfg
 */
public enum ModeloAutomovel {
    GOL,
    PALIO,
    CELTA,
    CIVIC,
    C180;
    
    public static String[] enumsToStringArray() {
        String[] results = new String[ModeloAutomovel.values().length];
        int i = 0;
        for (ModeloAutomovel m : ModeloAutomovel.values()) {
            results[i] = m.toString();
            i++;
        }
        return results;
    }
     
}
