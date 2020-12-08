/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho2;

/**
 *Segundo trabalho de ED, Trabalho em Grupo: 
 * Implementar um Tipo Abstrato de Dados (ADT) 
 * do tipo Fila com Prioridades, usando lista encadeada 
 * para controlar o atendimento de pessoas em uma empresa 
 * ou instituição pública. 
 * Na aplicação cliente, criar um menu com opções para: 
 * i) chegada de pessoa para atendimento normal; 
 * ii) chegada de pessoa para atendimento prioritário; 
 * iii) atendimento de uma pessoa (todas as pessoas com prioridade 
 * devem ser atendidas antes de pessoas normais ou pode ser implementada 
 * outra política por exemplo: cinco normais e um prioridade); 
 * e iv) listar todas as pessoas da fila.
 *Observações: 
 * i) considerar o período como sendo uma execução completa da aplicação; 
 * ii) garantir que a opção sair só pode ser executada quando a fila 
 * estiver vazia; 
 * iii) imprimir a quantidade de pessoas atendidas antes de finalizar a 
 * aplicação.
 * 
 * @author Larissa Brasil
 */
public class MainCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op=0;
        
        switch(op){
            case 1:
                //i) chegada de pessoa para atendimento normal; 
                break;
            case 2:
                //ii) chegada de pessoa para atendimento prioritário; 
                break;
            case 3:
                /*iii) atendimento de uma pessoa (todas as pessoas com prioridade 
                  devem ser atendidas antes de pessoas normais ou pode ser implementada 
                  outra política por exemplo: cinco normais e um prioridade); 
                */
                break;
            case 4:
                //iv) listar todas as pessoas da fila.
                break;
        }
    }
    
}
