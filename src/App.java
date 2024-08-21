public class App {
    public static void main(String[] args) throws Exception {

        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);

        System.out.println("Tipos de veiculos:");
        System.out.println(utilitario);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        utilitario.abastece(TipoCombustivel.DIESEL, 70);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro basico");
        utilitario.viaja(250);
        utilitario.viaja(150);
        System.out.println(utilitario);
    }
}
