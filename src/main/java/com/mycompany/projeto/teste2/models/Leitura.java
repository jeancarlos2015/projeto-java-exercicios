/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.teste2.models;

import java.util.Scanner;

/**
 *
 * @author jean
 */
public class Leitura {
    private Scanner scanner;

    public Leitura() {
        scanner = new Scanner(System.in);
    }

    public String entDados(String string) {
        System.out.println(string);
        return scanner.nextLine();

    }

}
