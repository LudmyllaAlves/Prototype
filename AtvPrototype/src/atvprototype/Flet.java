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
public class Flet extends Loja {
    public Flet(Flet flet){
        this.valor = flet.getValor();
    }
    public Flet(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return "Flet\n Valor: "+getValor();
    }

    @Override
    public Loja clonar() {
        return new Flet(this);
    }
}
    

