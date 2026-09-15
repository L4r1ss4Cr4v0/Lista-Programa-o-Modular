import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void exibirMenuBasico(){
        System.out.println("--- Opções ---");

        System.out.println("1 ---- Comprar");
        System.out.println("2 - Ver Fatura");
        System.out.println("3 Excluir item");
        System.out.println("4 Alterar item");
        System.out.println("5 -- Finalizar");
    }

    public static void exibirMenuProdutos(ArrayList<Produto> produtos){

        for (int i = 0; i < produtos.size(); i++) {
            System.out.format("%d - R$ %.2f - %s\n", i+1, produtos.get(i).getPreco(), produtos.get(i).getNome());
        }

        System.out.println("0 -- Voltar");
    }

    public static void exibirMenuItem(ArrayList<Item> items){

        for (int i = 0; i < items.size(); i++) {
            System.out.format("%d - R$ %s - %d\n", i+1, items.get(i).getProduto().getNome(), items.get(i).getQuantidade());
        }

        System.out.println("0 -- Voltar");
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Fatura fatura = new Fatura();

        Produto p1 = new Produto("Notebook", 1001, 3500.50f);
        Produto p2 = new Produto("Smartphone", 1002, 1899.90f);
        Produto p3 = new Produto("Mouse Sem Fio", 1003, 89.90f);

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        int op = 0;
        
        do {
            exibirMenuBasico();
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("--- Compra ---");
                    exibirMenuProdutos(produtos);
                    op = input.nextInt();

                    if (op == 0) {
                        break;
                    }

                    System.out.println("Digite a quantidade do produto deseja");
                    int qnt = input.nextInt();
                    
                    Item pedido = new Item(produtos.get(op - 1), qnt); 
                    
                    fatura.adicionarItem(pedido);

                    break;
                case 2:
                    fatura.imprimir();
                    break;
                case 3:
                    System.out.println("--- Excluir item ---");
                    exibirMenuItem(fatura.getItens());
                    op = input.nextInt();

                    if (op == 0) {
                        break;
                    }

                    fatura.removerItem(fatura.getItens().get(op - 1));
                    break;
                case 4:
                    System.out.println("--- Alterar Item ---");
                    exibirMenuItem(fatura.getItens());
                    op = input.nextInt();

                    if (op == 0) {
                        break;
                    }
                    
                    System.out.println("Digite a nova quantidade: ");
                    qnt = input.nextInt();
                    
                    fatura.alteraQuantidadeItem(fatura.getItens().get(op-1), qnt);
                    break;

                case 5:
                    System.out.printf("Valor final da fatura: R$ %.2f\n", fatura.getValor());
                
                case 0:
                    break;                    
                    
                default:
                    System.out.println("Opção inexistente! Tente novamente");
                    break;
            }
        } while (op != 5);
    }
}
