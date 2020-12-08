/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho2;

/**
 *A Lei nº 10.048/00 conferiu atendimento prioritário a determinado grupo de pessoas, o
que foi regulamentado pelo Decreto nº 5.296/04, sendo também estabelecidas prioridades
pela Lei nº 12.008/09, e, no que se refere especificamente às pessoas idosas, pela Lei nº
10.741/03 (Estatuto do Idoso).
O artigo 1º da Lei nº 10.048/00 passou a ter nova redação após o advento do Estatuto do
Idoso, como se vê adiante: “As pessoas portadoras de deficiência, os idosos com idade
igual ou superior a 60 (sessenta) anos, as gestantes, as lactantes e as pessoas
acompanhadas por crianças de colo terão atendimento prioritário, nos termos desta lei”.
Estão obrigadas a dispensar atendimento prioritário as repartições públicas e empresas
concessionárias de serviços públicos, além das instituições financeiras, o que se dará por
meio de serviços individualizados que assegurem tratamento diferenciado e atendimento
imediato, conforme o disposto no art. 2º, caput e parágrafo único, da Lei nº 10.048/00.
* 
* i) chegada de pessoa para atendimento normal; 
 * ii) chegada de pessoa para atendimento prioritário; 
 * iii) atendimento de uma pessoa (todas as pessoas com prioridade 
 * devem ser atendidas antes de pessoas normais ou pode ser implementada 
 * outra política por exemplo: cinco normais e um prioridade); 
 * e iv) listar todas as pessoas da fila.
 * @author Larissa Brasil
 */
public class Cliente {
    No inicio,anterior,proximo,fim;

    public Cliente(No inicio, No anterior, No proximo, No fim) {
        this.inicio = null;
        this.anterior = null;
        this.proximo = null;
        this.fim = null;
    }
    
    public No clienteNormal(String nome){
        No novoNormal = new No(anterior, null, nome);
        
        if(fim==null){
            inicio=fim=novoNormal;
        }else{
            anterior=fim;
            fim.setProximo(novoNormal);
        }
        return novoNormal;
    }
    
    public No clientePrioritario(String nome){
        No novoNormal = new No(anterior, null, nome);
        
        if(fim==null){
            inicio=fim=novoNormal;
        }else{
            anterior=fim;
            fim.setProximo(novoNormal);
        }
        return novoNormal;
    }
    
    public void atendimentoCliente(No cliente){        
    }
    
    public void listar(){
        //percorrendo a lista        
	for(No n = inicio; n != null; n = n.getProximo()){
            System.out.println("\n"+n.getNome());
	}
    }
    
    public No pesquisa(String nome){
        No aux=inicio;
            
        while(aux.getProximo() != null){                
            aux=aux.getProximo();
            if(aux.getNome().equals(nome)){
                return aux;
            }            
        }  
        return null;
    }
}
