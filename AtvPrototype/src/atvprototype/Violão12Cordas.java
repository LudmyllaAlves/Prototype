/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvprototype;

/**
 *
 * @author tatia
 */
public class Violão12Cordas extends Loja {

    public Violão12Cordas(Violão12Cordas Violão12Cordas){
        this.valor =Violão12Cordas.getValor();
    }
    public Violão12Cordas(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return " 12 cordas \n Valor: "+getValor();
    }

    @Override
    public Loja clonar() {
        return new Violão12Cordas(this);
    }
}

    
    
    
    

