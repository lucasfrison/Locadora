/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.model;

/**
 *
 * @author lucfg
 */
public enum ModeloMotocicleta {
    BIS,
    CG125,
    CBR500;

    public static String[] enumsToStringArray() {
        String[] results = new String[ModeloMotocicleta.values().length];
        int i = 0;
        for (ModeloMotocicleta m : ModeloMotocicleta.values()) {
            results[i] = m.toString();
            i++;
        }
        return results;
    }
}
