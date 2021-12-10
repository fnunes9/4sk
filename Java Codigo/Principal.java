
package com.mycompany.askquizz;

import java.util.Scanner;




public class Principal {

    
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    Scanner scan = new Scanner(System.in);
  
        System.out.println("|----------|");
        System.out.println("|4ask quiz |");
        System.out.println("|----------|");
        System.out.println("--------------------------------------------");
        System.out.println("|1-Jogar|2-Regras|3-Desenvolvedores|4-Sair|" );
        System.out.println("--------------------------------------------" );
        System.out.println("Escolha uma opção:");
        int opcao = scan.nextInt();
        
        switch(opcao){
            case 1:{
                
            
                Jogo j= new Jogo();
        
        j.escolherPersonagem();
        int per =scan.nextInt();
            System.out.println("1- Iniciar jogo");
                switch(per){
                  case 1:{
           Alternativa a = new Alternativa();
           a.start();
                break;  
               }
                         
                      
                 }
              
            }
            case 2:{
                System.out.println("jogo de perguntas sobre programação");
            break;
            }
               
        
            case 3:{
                System.out.println("Desenvolvido por 4 ask:");
                System.out.println("-Pablo Almeia");
                System.out.println("-Edson Eduardo");
                System.out.println("-Erick Gonçalves");
                System.out.println("-Fernanda Nunes");
                System.out.println("-Lívia");
                
                break;
            }
        
            case 4:{
                System.exit(0);
                break;
            }
        }
        
        
       
        
        
   
    
}

    private static Alternativa Alternativa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   