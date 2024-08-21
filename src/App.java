public class App {
    public static void main(String[] args) throws Exception {

        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(suv);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        suv.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(suv);
        System.out.println("\nViajando com o carro basico");
        suv.viaja(250);
        suv.viaja(150);
        System.out.println(suv);
    }
}
