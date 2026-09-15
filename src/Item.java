public class Item {
    private Produto produto;
    private int quantidade;
    private float preco;

    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = calcularPreco(); 
    }

    public Produto getProduto() {
        return produto;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.preco = calcularPreco();
    }

    private float calcularPreco(){
        float preco = produto.getPreco() * this.quantidade;
        return preco;
    }
}
