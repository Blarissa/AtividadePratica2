package atividadepatrica2;

public class Lista <Chave>{
    private No inicio;
    private No fim;
    private int tam=0;
            

    //insere lista vazia
    public Lista() {
        inicio=null;
        fim=inicio;
    }

    //metodo adiciona
    public void add(Chave chave, String valor) {
        //Criando novo elemento no inicio
        No novo = new No();

        //se inicio  for igual a nulo, inicio e fim vao receber novo
        if (getInicio() == null) {
            novo.chave=chave;
            novo.valor=valor;
            
            setInicio(fim=novo);
            
            setTam(getTam() + 1);
        } else {
            //senao seta o proximo dele que vai ser novo e o inicio recebe novo                        
            novo.chave=chave;
            novo.valor=valor;
            novo.proximo=null;
                        
            getFim().setProximo(novo);            
            setFim(novo);
            
            setTam(getTam() + 1);
        }
    }
    
    public String imprime(Chave chave){
        No aux = pesquisa(chave);
        
        if(aux.chave==chave){
            return aux.getValor();
        }else{
            return null;
        }
    }
    
    public No pesquisa(Chave chave){
        No n=inicio.getProximo();
            
        while(n != null){                            
            if(n.getChave() == chave){
                return n;                
            }            
            n=n.getProximo();
        }  
        return null;
    }
    
    @Override
    public String toString(){
        String str="";
        
        No n=getInicio().getProximo();
        
        while(n!=null){            
            str+="\nChave: "+n.getChave()+
                 "\nValor: "+n.getValor();
            n=n.getProximo();
        }
                
        return str;
    }
        

    /**
     * @return the inicio
     */
    public No getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fim
     */
    public No getFim() {
        return fim;
    }

    /**
     * @param fim the fim to set
     */
    public void setFim(No fim) {
        this.fim = fim;
    }

    /**
     * @return the tam
     */
    public int getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(int tam) {
        this.tam = tam;
    }
}
