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
public class Hash<Chave> {
    int M;
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
    final public int hash(Chave chave){          
        return (chave.hashCode() & 0x7fffffff) % M; 
    }
    
    final void put(Chave chave,String valor){
        vetor[hash(chave)].add(chave, valor);
    }    
    
    public String get(Chave chave){
        return vetor[hash(chave)].imprime(chave);
    }    
}
