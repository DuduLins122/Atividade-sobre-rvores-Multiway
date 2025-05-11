public class Principal {
    public static void main(String[] args) {
        Arvore23 arvore = new Arvore23();

        arvore.inserir("Gato");
        arvore.inserir("Cachorro");
        arvore.inserir("Elefante");

        System.out.println("Buscar 'Cachorro': " + arvore.buscar("Cachorro"));
        System.out.println("Buscar 'Zebra': " + arvore.buscar("Zebra"));
    }
}