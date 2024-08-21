public class App {
    public static void main(String[] args) throws Exception {
        Motor motor_econo  = new Motor(20, 0, true);
        Carro econo = new Carro("Economico", motor_econo, 65);

        System.out.println("Tipos de veiculos:");
        System.out.println(econo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 65);
        System.out.println(econo);
        System.out.println("\nViajando com o carro basico");
        econo.viaja(12000);
        System.out.println(econo);
    }
}
