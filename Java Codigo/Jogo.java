/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.askquizz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ph_al
 */
public class Jogo {
    Scanner input = new Scanner(System.in);
    ArrayList<Pergunta> perguntas;
    Pergunta q;
     
    public Jogo() {
        this.perguntas = new ArrayList<>();
       
       
    }
    
    public void mostrarPergunta() {
        
        System.out.println("Pergunta: ");
        for(Pergunta p: perguntas){
           System.out.println(p.toString());
                   
               
           
        }
    }
        public void setPersonagemStatus (Personagem personagem) {
            /** Métodos a se utilizar;
             * 
               metodo - mostrarMenuInicial (inicializarJogo, desenvolvedores,
               sair
             * método - inicializar jogo;
                *Menu
             * 
             * método - mostrar menuPersonagem
             * escolher personagem
             * definir quem jogar primeiro com método random
             * escolher pergunta (random para escolher)
             * mostrar pergunta e alternativa
             * verificar acerto
             * se errar chamar o metodo reduzir vida
             * 
             * perde o menor ponto de vida
             * 
             */
            personagem.setStatus(true);
        }
        
        public void escolherPersonagem() {
           
            ArrayList<Personagem> personagem = new ArrayList<>();
            ArrayList<String> hab = new ArrayList<>();
            
           
            
            personagem.add(new Personagem ("Silvio Santos",hab));
            personagem.add(new Personagem ("Faustão",hab));
            personagem.add(new Personagem ("Ayrton senna",hab));
            personagem.add(new Personagem("Post Malone", hab));
            personagem.add(new Personagem("Michael Jackson", hab));
            
            
            System.out.println("Personagens");
            int cont = 1;
            for (Personagem pe: personagem) {
                
                if(!pe.isStatus()) {
                    System.out.println("["+cont+"]" + pe.getNome() + "\n"); //usasr toString
            }
            cont++;
            }
               
              System.out.println("Escolha o primeiro personagem 1: ");
               int opcao = input.nextInt();
               
               personagem.get(opcao-1).setStatus(true);
               
                  
              System.out.println("Escolha o segundo personagem: 2: ");
               int opcao1 = input.nextInt();
               
               personagem.get(opcao1-1).setStatus(true);
               
              
               }
              
        }
            
