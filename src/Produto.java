public class Produto {
    private String nome;
    private int codigo;
    private float preco;

    Produto(String n, int c, float p){
        this.nome = n;
        this.codigo = c;
        this.preco = p; 
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
