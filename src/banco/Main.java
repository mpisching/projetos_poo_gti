/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author mpisching
 */
public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.numero = 1000;
        
        conta1.depositar(500.0);
        conta1.limite = 200;
        
        System.out.println("Conta1 - saldo: " + conta1.obterSaldo());
        System.out.println("Conta1 - saldo disponivel: " + conta1.obterSaldoDisponivel());
        
        conta1.sacar(300);
        System.out.println("Conta1 - saldo disponivel: " + conta1.obterSaldoDisponivel());
        
    }
}
