import java.util.ArrayList;
import java.util.Scanner;

public class Fatura {
    private ArrayList<Item> itens;
    private float valor;

    Fatura(){
        this.itens = new ArrayList<Item>();
        this.valor = calcularTotal();
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void adicionarItem(Item i){
        this.itens.add(i);
        this.valor = calcularTotal();
    }

    public void removerItem(Item i){
        this.itens.remove(i);
        this.valor = calcularTotal();
    }

    public void alteraQuantidadeItem(Item i, int qnt){
        i.setQuantidade(qnt);
        this.valor = calcularTotal();
    }

    private float calcularTotal(){
        float total = 0;

        for (Item i : this.itens) {
            total += i.getPreco() * i.getQuantidade();
        }

        return total;
    }

    public void imprimir(){
        System.out.println("Opção -- Produto -- Quantidade");

        for (int i = 0; i < this.itens.size(); i++) {
            System.out.printf("%d -- %s -- %d\n", i + 1 , this.itens.get(i).getProduto().getNome(), this.itens.get(i).getQuantidade());
        }

        System.out.printf("Total da fatura: R$ %.2f\n", this.valor);
    }
}
