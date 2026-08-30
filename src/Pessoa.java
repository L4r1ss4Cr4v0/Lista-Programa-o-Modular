public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private float peso;
    private double IMC;


    public Pessoa(String nome, String sobrenome, int idade, double altura, float peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.IMC = CalculaIMC(peso, altura);
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getIMC() {
        return IMC;
    }


    public void setIMC(double iMC) {
        IMC = iMC;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getPeso() {
        return peso;
    }


    public void setPeso(float peso) {
        this.peso = peso;
    }


    public String getSobrenome() {
        return sobrenome;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    private double CalculaIMC(float peso, double altura){
        return peso / (Math.pow(altura, 2));
    }


    public void InformaObesidade(){


        double imc = this.getIMC();


        String status;


        if (imc < 18.5) {
            status = "Não está em nível de obesidade (Abaixo do peso)";
        } else if (imc < 25) {
            status = "Não está em nível de obesidade (Peso normal)";
        } else if (imc < 30) {
            status = "Não está em nível de obesidade (Sobrepeso)";
        } else if (imc < 35){
            status = "Grau 1";
        } else if (imc < 40){
             status = "Grau 2";
        } else {
            status = "Grau 3";
        }
       
        System.out.print("Nível de Obesidade: " + status);
    }
}
