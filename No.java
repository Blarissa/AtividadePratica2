package atividadepatrica2;

public class No<Chave>{

    Chave chave;
    String valor;
    No proximo;

    public No() {
        
    }

    public Chave getChave() {
        return chave;
    }

    public void setChave(Chave chave) {
        this.chave = chave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }
    
    public void setProximo(No proximo) {
        this.proximo=proximo;
    }
}
