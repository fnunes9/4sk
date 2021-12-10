/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.askquizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ph_al
 */
public class Alternativa {
private ArrayList<Pergunta> perguntaSet;
public Alternativa(){
    perguntaSet = new ArrayList<Pergunta>();
    String q = " O que significa POO?";
    String[]a={"Orientação a objeto","Programação Orientada á Objeto","Programação de dados","Extenção do Java"};
    perguntaSet.add(new Pergunta(q,a,"Programação Orientada á Objeto "));
    q ="Interage com o Sistema:";
    a = new String[]{"Ator","Usuário","Qualquer pessoa que instala-lo","Desenvolvedores"};
    perguntaSet.add(new Pergunta(q,a,"Ator"));
    q ="Os objetos podem ser:";
    a = new String[]{"publico e privado","void","Int","public,privated,protected"};
    perguntaSet.add(new Pergunta(q,a,"public,privated,protected"));
     q ="Os métodos podem:";
    a = new String[]{"Retornar ou não retornar valores ","Ser publicos ou provados ","Dinâmicos","Estáticos"};
    perguntaSet.add(new Pergunta(q,a,"- Retornar ou não retornar valores "));
     q ="O que é um SGB";
    a = new String[]{"Relacionado a banco de dados","Abreviação da do comando System.out.print","Sistema de Gerenciamento de Banco de dados","Tabela"};
    perguntaSet.add(new Pergunta(q,a,"Sistema de Gerenciamento de Banco de dados"));
     q ="Método principal de todo programa";
    a = new String[]{"String","Main ","Scanner","Public"};
    perguntaSet.add(new Pergunta(q,a,"Main"));
     q ="No código de programação o que é um espaço em branco";
    a = new String[]{"Linhas em branco ","Espaço entre palavras","qualquer espaço sem código","Recuo antes de uma linha de código"};
    perguntaSet.add(new Pergunta(q,a,"qualquer espaço sem código"));
     q ="Quantos pontos de interrupção podem haver em um código?";
    a = new String[]{"No máximo 10","Quantos quiser ","5","nenhum"};
    perguntaSet.add(new Pergunta(q,a,"Quantos quiser "));
     q ="O que o comando System.out.print() faz?";
    a = new String[]{"Cria Variavel","salva um valor","Mostra uma mensagem ao usuário ","é um método de entrada de dados"};
    perguntaSet.add(new Pergunta(q,a,"Mostra uma mensagem ao usuário "));
    q ="O que significa UML?";
    a = new String[]{"Modelagem de Softweare","Modelos de caso de uso","Sigla que referencia os diagramas ","Linguagem de modelagem unificada "};
    perguntaSet.add(new Pergunta(q,a,"Linguagem de modelagem unificada "));
    Collections.shuffle(perguntaSet, new Random());
    
}
public void start(){
    Scanner scan = new Scanner(System.in);
    int numCorrect = 0;
    for(int pergunta = 0; pergunta < perguntaSet.size();pergunta++){
        System.out.println(perguntaSet.get(pergunta).getPergunta());
        int numEscolhas = perguntaSet.get(pergunta).getEscolhas().size();
        for(int escolha = 0;escolha< numEscolhas;escolha++){
            System.out.println((escolha + 1)+ ":"+
                           perguntaSet.get(pergunta).getEscolhas().get(escolha));
            
        }
        int playerResposta =scan.nextInt();
        ArrayList<String> escolhaSet =
                  perguntaSet.get(pergunta).getEscolhas();
        String correctResposta = perguntaSet.get(pergunta).getResposta();
        int correctRespostaIndex = escolhaSet.indexOf(correctResposta);
        if (playerResposta == correctRespostaIndex + 1){
        numCorrect++;
        
        
    }
    
}
scan.close();
    System.out.println("O numero de respostas certas foi de:"+ numCorrect);
}
}