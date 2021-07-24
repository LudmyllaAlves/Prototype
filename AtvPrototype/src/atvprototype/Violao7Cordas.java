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
public class Violao7Cordas extends Loja {
    
    public Violao7Cordas(Violao7Cordas violao7Cordas){
        this.valor = violao7Cordas.getValor();
    }
    public Violao7Cordas(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return " 7 cordas\n Valor: "+getValor();
    }

    @Override
    public Loja clonar() {
        return new Violao7Cordas(this);
    }
}
    
    
    
    

