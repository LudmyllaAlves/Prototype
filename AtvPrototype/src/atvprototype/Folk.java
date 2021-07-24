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
public class Folk extends Loja {
    
    public Folk(Folk folk){
        this.valor = folk.getValor();
    }
    public Folk(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return "  Folk \n Valor: "+getValor();
    }

    @Override
    public Loja clonar() {
        return new Folk(this);
    }
}
    

