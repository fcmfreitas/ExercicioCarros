public class Carro {

    private String modelo;
    private Motor motor;
    private TanqueCombustivel tanque;

    public Carro(String modelo, Motor motor, int capacidadeTanque) {
        this.modelo = modelo;
        this.motor = motor;
        this.tanque = new TanqueCombustivel(capacidadeTanque);
    }

    public String getModelo() {
        return modelo;
    }

    public int getCombustivelDisponivel() {
        return tanque.getCombustivelDisponivel();
    }

    public int abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        int capacidadeLivre = tanque.getCapacidade() - tanque.getCombustivelDisponivel();
        int quantidadeAbastecida = Math.min(capacidadeLivre, quantidade);
        tanque.abastece(tipoCombustivel, quantidadeAbastecida);
        motor.setTipoCombustivelAtual(tipoCombustivel);
        return quantidadeAbastecida;
    }

    public int verificaSePodeViajar(int distancia) {
        int combustivelNecessario = motor.combustivelNecessario(distancia);
        if (tanque.getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return tanque.getCombustivelDisponivel() * motor.getConsumoAtual();
        }
    }

    public boolean viaja(int distancia) {
        int distanciaPossivel = verificaSePodeViajar(distancia);
        if (distanciaPossivel >= distancia) {
            motor.percorre(distancia);
            tanque.gasta(motor.combustivelNecessario(distancia));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carro:\n  Modelo=" + modelo + "\n  Motor=" + motor + "\n  Tanque=" + tanque;
    }
}