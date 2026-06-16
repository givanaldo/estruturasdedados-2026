public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
       
        arvore.inserir(3);
        arvore.inserir(5);
        arvore.inserir(2);
        arvore.inserir(8);
        arvore.inserir(1);

        arvore.exibir(arvore.getRaiz());
        System.out.println("");
        
        arvore.exibir();
        System.out.println("");

    }
}
