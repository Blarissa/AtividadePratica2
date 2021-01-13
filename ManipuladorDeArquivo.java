/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepatrica2;

import java.io.BufferedReader;
import java.util.regex.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author Larissa Brasil
 */
public class ManipuladorDeArquivo {

    

    //METODO PARA LER O ARQUIVO E TRANSFERIR PARA UMA VARIAVEL
    public static ArrayList ler(String path)
    		throws IOException {    	   	
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        ArrayList<String> palavras = new ArrayList<>();
        
        while (true) {
            if (linha != null) {                
                palavras.add(linha);
            } else {
                break;
            }            
            linha=buffRead.readLine();            
        }

        buffRead.close();		       
        return palavras;
    }
}
