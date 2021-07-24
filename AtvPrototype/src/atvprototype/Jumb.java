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
public class Jumb extends Loja{
     public Jumb(Jumb jumb){
        this.valor = jumb.getValor();
    }
    public Jumb(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return " Jumb \n Valor: "+getValor();
    }

    @Override
    public Loja clonar() {
        return new Jumb(this);
    }
}
    

