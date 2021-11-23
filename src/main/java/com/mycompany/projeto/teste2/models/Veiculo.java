/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.teste2.models;

/**
 *
 * @author jean
 */
public abstract class Veiculo {

    private String chassi;
    private String placa;
    private String renavan;
    private String cor;
    private String combustivel;
    private String marca;
    private String valorLocacao;
    private String statusServico;

    
    public String getChassi() {
        return chassi;
    }
    public String getStatusServico() {
        return statusServico;
    }
    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }
    public String getValorLocacao() {
        return valorLocacao;
    }
    public void setValorLocacao(String valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getRenavan() {
        return renavan;
    }
    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
