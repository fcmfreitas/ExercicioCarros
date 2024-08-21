public class App {
    public static void main(String[] args) throws Exception {
        Motor motor_flex  = new Motor(8, 6);
        Carro suv_flex = new Carro("SUV Flex", motor_flex, 65);

        System.out.println("Tipos de veiculos:");
        System.out.println(suv_flex);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        suv_flex.abastece(TipoCombustivel.GASOLINA, 50);
        System.out.println(suv_flex);
        System.out.println("\nAbastencendo carro basico com alcool");
        suv_flex.abastece(TipoCombustivel.ALCOOL, 10);
        System.out.println(suv_flex);
        System.out.println("\nViajando com o carro basico");
        suv_flex.viaja(250);
        suv_flex.viaja(150);
        System.out.println(suv_flex);
    }
}
