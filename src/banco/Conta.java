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
public class Conta {
    public int numero;
    public double saldo;
    public double limite;
    
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
    
    public double obterSaldo() {
        return this.saldo;
    }
    
    public double obterSaldoDisponivel() {
        return this.saldo + this.limite;
    }
    
    public void sacar(double valor) {
        if (obterSaldoDisponivel() >= valor) {
            this.saldo = this.saldo - valor;
        }
    }
    
    public void aumentarLimite(double valor) {
        this.limite += valor;
    }
}
