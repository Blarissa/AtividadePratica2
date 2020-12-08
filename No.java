/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho2;

/**
 *
 * @author Larissa Brasil
 */
public class No {
    private No anterior;
    private No proximo;
    private String nome;
    
    public No() {
        anterior=null;
        proximo=null;
        nome=null;
    }

    public No(No anterior, No proximo, String nome) {
        this.anterior = anterior;
        this.proximo = proximo;
        this.nome = nome;
    }

    /**
     * @return the anterior
     */
    public No getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the proximo
     */
    public No getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    /**
     * @return the elemento
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setNome(String nome) {
        this.nome=nome;
    }
    
}
