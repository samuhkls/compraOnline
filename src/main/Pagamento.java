/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


public class Pagamento {
    private double buscartaxa(Compra parcelas){
        double taxa;
        
        if (parcelas.getParcelas() == 0){
            taxa = 0;
        }
        else if (parcelas.getParcelas() > 1 && parcelas.getParcelas()< 3) {
            taxa = 0.03;
        }
        else if (parcelas.getParcelas() > 3 && parcelas.getParcelas() < 12){
            taxa = 0.05;
        }
        else {
            taxa = 0.10;
        }
        
        return taxa;
    }
    public double calcularTotal(Compra compra){
        double totalFinal;
        double taxa;
        
        taxa = 1 + buscartaxa(compra);
        totalFinal = compra.getTotal() * Math.pow(taxa, compra.getParcelas());
        
        return totalFinal;
    }
    public double calcularParcelas(double totalFinal, int parcelas){
        double valorParcelas;

        valorParcelas = totalFinal / parcelas;
        
        return valorParcelas;
    }
}
