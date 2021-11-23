/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.teste2;

import com.mycompany.projeto.teste2.models.Cliente;
import com.mycompany.projeto.teste2.models.Leitura;
import com.mycompany.projeto.teste2.models.Pessoa;

/**
 *
 * @author jean
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = new Cliente();
        Leitura leitura = new Leitura();

        pessoa.setCpf(leitura.entDados("\nInforme o cpf: "));
        pessoa.setNome(leitura.entDados("\nInforme o nome: "));
        pessoa.setEmail(leitura.entDados("\nInforme o email: "));
        pessoa.setFone(leitura.entDados("\nInforme o fone: "));

        System.out.println("\n\nDados do cliente: ");

        System.out.println("\nNome: " + pessoa.getNome());
        System.out.println("\nCPF: " + pessoa.getCpf());
        System.out.println("\nEmail: " + pessoa.getEmail());
        System.out.println("\nFone: " + pessoa.getFone());
        
    }
    
}
