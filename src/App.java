public class App {
    public static void main(String[] args) throws Exception {


        Pessoa p1 = new Pessoa("Larissa", "Cravo", 18, 1.6, 55);




        System.out.println("Resultado: ");
        System.out.format("IMC: %.1f% \n", p1.getIMC());
        p1.InformaObesidade();
    }
}
