public class Aluno {
    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int estrategia;
    private int criatividade;
    private int lealdade;
    private String casa;






    Aluno(String nome, int idade, int coragem, int inteligencia, int ambicao, int criatividade, int estrategia, int lealdade){
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
        this.lealdade = lealdade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getAmbicao() {
        return ambicao;
    }


    public void setAmbicao(int ambicao) {
        this.ambicao = ambicao;
    }


    public int getCoragem() {
        return coragem;
    }


    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }


    public int getInteligencia() {
        return inteligencia;
    }


    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }


    public int getCriatividade() {
        return criatividade;
    }


    public void setCriatividade(int criatividade) {
        this.criatividade = criatividade;
    }


    public int getEstrategia() {
        return estrategia;
    }


    public void setEstrategia(int estrategia) {
        this.estrategia = estrategia;
    }


    public int getLealdade() {
        return lealdade;
    }


    public void setLealdade(int lealdade) {
        this.lealdade = lealdade;
    }


    public String getCasa() {
        return casa;
    }


    public void setCasa(String casa) {
        this.casa = casa;
    }


    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome()
                        + "\n Idade: " + getIdade()
                        + "\n Coragem: " + getCoragem()
                        + "\n Inteligencia: " + getInteligencia()
                        + "\n Ambicao: " + getAmbicao()
                        + "\n Estratégia: " + getEstrategia()
                        + "\n Criatividade: " + getAmbicao()
                        + "\n Lealdade: " + getLealdade()
                        + "\n Casa: " + getCasa());
    }


    public void calcularCasa(){
        int grifinoria = (2 * getCoragem()) + getLealdade();
        int sonserina = (2 * getAmbicao()) + getEstrategia();
        int corvinal = (2 * getInteligencia()) + getCriatividade();
        float lufaLufa = ((2 * getLealdade()) + (getCoragem()))/3;


        if (grifinoria > sonserina && grifinoria > corvinal && grifinoria > lufaLufa) {
            setCasa("Grifinória");
        } else if (sonserina > grifinoria && sonserina > corvinal && sonserina > lufaLufa) {
            setCasa("Sonserina");
        } else if (corvinal > grifinoria && corvinal > sonserina && corvinal > lufaLufa) {
            setCasa("Corvinal");
        } else {
            setCasa("Lufu-Lufa");
        }
    }
}
