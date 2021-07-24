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
public class Classico extends Loja {
    public Classico(Classico classico){
        this.valor = classico.getValor();
    }
    public Classico(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return " classico\n Valor: "+getValor();
    }

    @Override
    public Loja clonar() {
        return new Classico(this);
    }
    
}
    

