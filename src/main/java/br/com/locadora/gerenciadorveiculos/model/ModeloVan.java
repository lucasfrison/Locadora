/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.model;

/**
 *
 * @author lucfg
 */
public enum ModeloVan {
    KOMBI,
    SPRINTER,
    DUCATO;
    
    public static String[] enumsToStringArray() {
        String[] results = new String[ModeloVan.values().length];
        int i = 0;
        for (ModeloVan m : ModeloVan.values()) {
            results[i] = m.toString();
            i++;
        }
        return results;
    }
}
