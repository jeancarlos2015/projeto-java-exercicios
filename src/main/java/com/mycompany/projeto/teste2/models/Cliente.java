/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.teste2.models;

import java.util.List;

/**
 *
 * @author jean
 */
public class Cliente extends Pessoa {
    private List<Locacao> listLocacao;


    public List<Locacao> getListLocacao() {
        return listLocacao;
    }

    public void setListLocacao(List<Locacao> listLocacao) {
        this.listLocacao = listLocacao;
    }

    

    
}
