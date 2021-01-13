/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepatrica2;

/**
 *
 * @author Larissa Brasil
 */
public class Hash {
    Lista vetor[];

    public Hash() {
        vetor=new Lista[26];
        inicializa();
    }
    
    final void inicializa(){
        for (int i = 0; i < 26; i++) {
            vetor[i]=new Lista();
        }
    }
    //calcula valor hash
    final public int hash(char chave){
        return Character.hashCode(chave);
    }
    
    final void put(char chave,String valor){
        vetor[hash(chave)].add(chave, valor);
    }    
    
    public String get(char chave){
        return vetor[hash(chave)].imprime(chave);
    }    
}
