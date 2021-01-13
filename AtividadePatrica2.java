/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepatrica2;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Larissa Brasil
 */
public class AtividadePatrica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
         
        Hash<Character> hash= new Hash();
        ArrayList<String> palavras = new ArrayList<>();
        ArrayList<String> palavrasSeparadas = new ArrayList<>();
        
        ManipuladorDeArquivo arquivo = new ManipuladorDeArquivo();
        String palavra = "";

        palavras = arquivo.ler("C:\\Users\\Larissa Brasil\\Documents\\UFPI\\ED\\AtividadePatrica2"
                + "\\src\\atividadepatrica2\\tale.txt");
        
        hash.M=100;
                
        for (int i = 0; i < palavras.size(); i++) {            
            for (int j = 0; j < palavras.get(i).length(); j++) {
                if (palavras.get(i).charAt(j) != ' ') {
                    palavra += String.valueOf(palavras.get(i).charAt(j));
                } else{                    
                    //lista.add(palavra.charAt(0), palavra);   
                    palavra=palavra.replaceAll("[:punct:]", "");                
                    System.out.println("\n"+palavra);
                    hash.put(palavra.charAt(0), palavra);                    
                    palavra = "";                    
                }
            }
        }
        
        System.out.println("\n"+hash.get('a'));
    }
}
