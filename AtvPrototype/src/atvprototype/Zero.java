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
public class Zero extends Loja {
     public Zero(Zero zero){
        this.valor = zero.getValor();
    }
    public Zero(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return "  Zero  \n Valor: "+getValor();
    }

    @Override
    public Loja clonar() {
        return new Zero(this);
    }
}
    

