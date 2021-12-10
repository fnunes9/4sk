/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.askquizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ph_al
 */
public class  Pergunta {
private String pergunta;
private ArrayList<String> escolhas;
private String resposta;
public Pergunta(String pergunta,String[]escolhas,String reposta){
    this.pergunta = pergunta;
    this.escolhas = new ArrayList<String>();
    for (int i =0; i <escolhas.length;i++){
        this.escolhas.add(escolhas[i]);
        
    }
    Collections.shuffle(this.escolhas);
    this.resposta = resposta;
    
   }
public String getPergunta(){
    return pergunta;
    }
public ArrayList<String> getEscolhas(){
    return escolhas;
}
public String getResposta(){
return resposta;


}

}
    



