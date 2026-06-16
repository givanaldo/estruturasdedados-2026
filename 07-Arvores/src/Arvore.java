public class Arvore {
    private No raiz;

    public Arvore(No raiz) {
        this.raiz = raiz;
    }
    
    public boolean isEmpty() {
        return this.raiz == null;
    }
    
    public void inserir(No pai, No filho) {
        if (this.isEmpty())
            this.raiz = filho;
        else {
            if (filho.getValor() < pai.getValor()) {
                if (pai.getEsq() == null)
                    pai.setEsq(filho);
                else
                    inserir(pai.getEsq(), filho);
            }
            else{
                if (pai.getDir() == null)
                    pai.setDir(filho);
                else
                    inserir(pai.getDir(), filho);
            }
        }
    }
    
    public void exibir(No no) {
        
    }
}
