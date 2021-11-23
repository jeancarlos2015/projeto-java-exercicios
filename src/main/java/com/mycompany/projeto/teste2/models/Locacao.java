/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.teste2.models;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author jean
 */
public class Locacao {
    private LocalDate dtLocacao;
    private LocalTime horaLocacao;
    private LocalDate dtDevolucao;
    private Boolean statusDevolucao;
    private Float valorLocacao;
    private Float valorMulta;
    private LocalDate dtPagamento;


    public LocalDate getDtLocacao() {
        return dtLocacao;
    }

    public void setDtLocacao(LocalDate dtLocacao) {
        this.dtLocacao = dtLocacao;
    }

    public LocalTime getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(LocalTime horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public LocalDate getDtDevolucao() {
        return dtDevolucao;
    }

    public void setDtDevolucao(LocalDate dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public Boolean getStatusDevolucao() {
        return statusDevolucao;
    }

    public void setStatusDevolucao(Boolean statusDevolucao) {
        this.statusDevolucao = statusDevolucao;
    }

    public Float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Float getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Float valorMulta) {
        this.valorMulta = valorMulta;
    }

    public LocalDate getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(LocalDate dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    
}
