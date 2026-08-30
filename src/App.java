import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String nome;


        nome = input.nextLine();
        while (!nome.isBlank()) {
            int idade = input.nextInt();
            int coragem = input.nextInt();
            int inteligencia = input.nextInt();
            int ambicao = input.nextInt();
            int criatividade = input.nextInt();
            int estrategia = input.nextInt();
            int lealdade = input.nextInt();
           
            Aluno aluno = new Aluno(nome, idade, coragem, inteligencia, ambicao, criatividade, estrategia, lealdade);
           
            aluno.calcularCasa();
           
            aluno.exibirInformacoes();
           
            System.out.println("_________________________________");
            System.out.println("Nome: ");
           
            input.nextLine();


            nome = input.nextLine();            
        }
    }
}




