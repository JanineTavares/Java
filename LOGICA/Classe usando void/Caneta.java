public class Caneta {
    float valor;
    int estoque;
    String cor;
    
    
    
    public float calcularEstoque() {
        return estoque * valor;
    }
    
    public void adicionarEstoque(int quantidadeAdicionada) {
        estoque = estoque + quantidadeAdicionada;
    }

}
