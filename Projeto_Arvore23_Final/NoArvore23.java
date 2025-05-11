public class NoArvore23 {
    public String chave1;
    public String chave2;
    public NoArvore23 filhoEsquerdo;
    public NoArvore23 filhoCentro;
    public NoArvore23 filhoDireito;

    public NoArvore23(String chave) {
        this.chave1 = chave;
        this.chave2 = "";
        this.filhoEsquerdo = null;
        this.filhoCentro = null;
        this.filhoDireito = null;
    }

    public boolean estaCheio() {
        return !chave2.equals("");
    }

    public void inserirChave(String novaChave) {
        if (chave1.compareTo(novaChave) > 0) {
            chave2 = chave1;
            chave1 = novaChave;
        } else {
            chave2 = novaChave;
        }
    }
}