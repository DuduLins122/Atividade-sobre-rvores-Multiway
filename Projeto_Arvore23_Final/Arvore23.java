public class Arvore23 {
    public NoArvore23 raiz;

    public Arvore23() {
        raiz = null;
    }

    public void inserir(String chave) {
        if (raiz == null) {
            raiz = new NoArvore23(chave);
        } else {
            inserirRecursivo(raiz, chave);
        }
    }

    private void inserirRecursivo(NoArvore23 no, String chave) {
        if (no.filhoEsquerdo == null) {
            if (!no.estaCheio()) {
                no.inserirChave(chave);
            }
        } else {
            if (chave.compareTo(no.chave1) < 0) {
                inserirRecursivo(no.filhoEsquerdo, chave);
            } else if (no.chave2.equals("") || chave.compareTo(no.chave2) < 0) {
                inserirRecursivo(no.filhoCentro, chave);
            } else {
                inserirRecursivo(no.filhoDireito, chave);
            }
        }
    }

    public boolean buscar(String chave) {
        return buscarRecursivo(raiz, chave);
    }

    private boolean buscarRecursivo(NoArvore23 no, String chave) {
        if (no == null) {
            return false;
        }

        if (chave.equals(no.chave1) || chave.equals(no.chave2)) {
            return true;
        }

        if (chave.compareTo(no.chave1) < 0) {
            return buscarRecursivo(no.filhoEsquerdo, chave);
        } else if (no.chave2.equals("") || chave.compareTo(no.chave2) < 0) {
            return buscarRecursivo(no.filhoCentro, chave);
        } else {
            return buscarRecursivo(no.filhoDireito, chave);
        }
    

    public void remover(String chave) {
        raiz = removerRecursivo(raiz, chave);
    }

    private NoArvore23 removerRecursivo(NoArvore23 no, String chave) {
        if (no == null) return null;

        if (chave.equals(no.chave1)) {
            no.chave1 = "";
        } else if (chave.equals(no.chave2)) {
            no.chave2 = "";
        } else if (chave.compareTo(no.chave1) < 0) {
            no.filhoEsquerdo = removerRecursivo(no.filhoEsquerdo, chave);
        } else if (no.chave2.equals("") || chave.compareTo(no.chave2) < 0) {
            no.filhoCentro = removerRecursivo(no.filhoCentro, chave);
        } else {
            no.filhoDireito = removerRecursivo(no.filhoDireito, chave);
        }

        return no;
    }

}
