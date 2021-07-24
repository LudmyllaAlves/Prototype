/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvprototype;

import java.util.Scanner;

/**
 *
 * @author tatia
 */
public class AtvPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Violao7Cordas violao7Cordas = new Violao7Cordas();
        Loja violao7CordasAmador  = violao7Cordas.clonar();
        violao7CordasAmador .setValor(1500);
        Loja violao7CordasProfissional = violao7Cordas.clonar();
        violao7CordasProfissional.setValor(5000);
        
        
        Classico violaoClassico = new Classico();
        Loja violaoClassicoAmador  = violaoClassico.clonar();
        violaoClassicoAmador .setValor(200);
        Loja violaoClassicoProfissional = violaoClassico.clonar();
        violaoClassicoProfissional.setValor(350);
       
        
        Flet violaoFlet = new Flet(); //na vdd é flat
        Loja violaoFletAmador  = violaoFlet.clonar();
        violaoFletAmador.setValor(600);
        Loja violaoFletProfissional = violaoFlet.clonar();
        violaoFletProfissional.setValor(1400);
        
        Folk violaoFolk = new Folk();
        Loja violaoFolkAmador  = violaoFolk.clonar();
        violaoFolkAmador .setValor(800);
        Loja violaoFolkProfissional = violaoFolk.clonar();
        violaoFolkProfissional.setValor(1200);
        
        
        Jumb violaoJumbo = new Jumb();
        Loja violaoJumboAmador  = violaoJumbo.clonar();
        violaoJumboAmador .setValor(800);
        Loja violaoJumboProfissional = violaoJumbo.clonar();
        violaoJumboProfissional.setValor(1200);
        
        
        Zero violaoViolaoZero = new Zero();
        Loja ViolaoZeroAmador = violaoViolaoZero.clonar();
        ViolaoZeroAmador .setValor(350);
        Loja ViolaoZeroProfissional = violaoViolaoZero.clonar();
        ViolaoZeroProfissional.setValor(1800);
       
        
        Violão12Cordas Violao12Cordas = new Violão12Cordas();
        Loja Violao12CordasAmador  = Violao12Cordas.clonar();
        Violao12CordasAmador .setValor(800);
        Loja Violao12CordasProfissional = Violao12Cordas.clonar();
        Violao12CordasProfissional.setValor(1500);
        
        
        System.out.println("Violao Amador "+violao7CordasAmador .exibirInformacao());
        System.out.println("Violao Profissional"+violao7CordasProfissional.exibirInformacao());
        System.out.println("Violao Amador "+Violao12CordasAmador .exibirInformacao());
        System.out.println("Violao Profissional"+Violao12CordasProfissional.exibirInformacao());
        System.out.println("Violao Amador "+violaoClassicoAmador .exibirInformacao());
        System.out.println("Violao Profissional"+violaoClassicoProfissional.exibirInformacao());
        System.out.println("Violao Amador "+violaoFletAmador .exibirInformacao());
        System.out.println("Violao Profissional"+violaoFletProfissional.exibirInformacao());
        System.out.println("Violao Amador "+violaoFolkAmador .exibirInformacao());
        System.out.println("Violao Profissional"+violaoFolkProfissional.exibirInformacao());
        System.out.println("Violao Amador "+violaoJumboAmador .exibirInformacao());
        System.out.println("Violao Profissional"+violaoJumboProfissional.exibirInformacao());
        System.out.println("Violao Amador "+ViolaoZeroAmador .exibirInformacao());
        System.out.println("Violao Profissional"+ViolaoZeroProfissional.exibirInformacao());
        
        
    }
    
    
    
}
      
    
