/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       Compra compra = new Compra();
       Scanner scanner = new Scanner(System.in);

       System.out.print("Digite o valor da compra: ");
       compra.setTotal(scanner.nextDouble());
       
       System.out.print("Digite a quantidade de parcelas: ");
       compra.setParcelas(scanner.nextInt());
       
       Pagamento pag = new Pagamento();
       double valor;
       int parcelas;
       double valorParcelas;
       
       valor = pag.calcularTotal(compra);
       parcelas = compra.getParcelas();
       
       valorParcelas = pag.calcularParcelas(valor, parcelas);
       System.out.printf("sua compra vai custar %.2f cada parcela vai custar %.2f%n", valor  ,  valorParcelas );
    }
    
}
