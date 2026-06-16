
public class Arvore {

    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public Arvore(No raiz) {
        this.raiz = raiz;
    }

    public No getRaiz() {
        return raiz;
    }

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void inserir(int valor) {
        inserir(this.raiz, new No(valor));
    }

    private void inserir(No pai, No filho) {
        if (this.isEmpty()) {
            this.raiz = filho;
        } else {
            if (filho.getValor() < pai.getValor()) {
                if (pai.getEsq() == null) {
                    pai.setEsq(filho);
                } else {
                    inserir(pai.getEsq(), filho);
                }
            } else {
                if (pai.getDir() == null) {
                    pai.setDir(filho);
                } else {
                    inserir(pai.getDir(), filho);
                }
            }
        }
    }

    public void exibir(No no) {
        if (no != null) {
            System.out.print("(" + no.getValor());
            exibir(no.getEsq());
            exibir(no.getDir());
            System.out.print(")");
        }
    }

    // modo hierárquico
    public void exibir() {
        if (this.isEmpty()) {
            System.out.println("Árvore vazia.");
        } else {
            exibirHierarquico(this.raiz, 0);
        }
    }

    private void exibirHierarquico(No no, int nivel) {
        String indentacao = "    ".repeat(nivel);

        // Se o nó for nulo, exibe o hífen e para a recursão por aqui
        if (no == null) {
            System.out.println(indentacao + "-");
            return;
        }

        // Se o nó existe, exibe o valor dele e continua a método
        System.out.println(indentacao + no.getValor());

        // Só chama os filhos se pelo menos um deles existir (evita hifens infinitos)
        if (no.getEsq() != null || no.getDir() != null) {
            exibirHierarquico(no.getEsq(), nivel + 1);
            exibirHierarquico(no.getDir(), nivel + 1);
        }
    }
}
