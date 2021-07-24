package atvprototype;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatia
 */
public abstract class Loja {
    
    public double valor;
    public abstract String exibirInformacao();
    public abstract Loja clonar();
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    
}
