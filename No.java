package atividadepatrica2;

public class No {

    char chave;
    String valor;
    No proximo;

    public No() {
        
    }

    public char getChave() {
        return chave;
    }

    public void setChave(char chave) {
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
