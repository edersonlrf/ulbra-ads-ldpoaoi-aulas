/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocolecoes;

import java.util.HashMap;

/**
 *
 * @author ederson.fernandes
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, String> notasReal = new HashMap<>();
        notasReal.put("1", "Beija-Flor");
        notasReal.put("2", "Tartaruga ");
        notasReal.put("5", "Garca");
        notasReal.put("10", "Arara");
        notasReal.put("20", "Mico-leão-dourado");
        notasReal.put("50", "Onça Pintada");
        notasReal.put("100", "Garoupa");
        System.out.println("Impressao da HashMap:");
        for (String chave : notasReal.keySet()) {
            String valor = notasReal.get(chave);
            System.out.println("Chave: " + chave + " Valor: " + valor);
        }
    }

}
