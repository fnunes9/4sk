/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.askquizz;

import java.util.ArrayList;

/**
 *
 * @author ph_al
 */
public class Personagem {
    private String nome;
    private ArrayList<String> habilidades;
    private boolean status;
    private int tempoVida;

    public Personagem(String nome, ArrayList<String> habilidades ) {
        this.nome = nome;
        this.habilidades = habilidades;
        this.status = false;
        this.tempoVida = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTempoVida() {
        return tempoVida;
    }

    public void setTempoVida(int tempoVida) {
        this.tempoVida = tempoVida;
    }
}
//Personagem false = não escolhido
//true = escolhido
    