public class Motor {

    private boolean flex;
    private int consumoGasolina;
    private int consumoAlcool;
    private TipoCombustivel tipoCombustivelAtual;
    private int quilometragem;

    public Motor(int consumoGasolina, int consumoAlcool) {
        this.consumoGasolina = consumoGasolina;
        this.consumoAlcool = consumoAlcool;
        this.flex = (consumoGasolina != 0 && consumoAlcool != 0);
    }

    public void setTipoCombustivelAtual(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivelAtual = tipoCombustivel;
    }

    public int getConsumoAtual() {
        if (tipoCombustivelAtual == TipoCombustivel.GASOLINA) {
            return consumoGasolina;
        } else if (tipoCombustivelAtual == TipoCombustivel.ALCOOL) {
            return consumoAlcool;
        } else {
            return 0;
        }
    }

    public int combustivelNecessario(int distancia) {
        return distancia / getConsumoAtual();
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public String toString() {
        return "Motor [flex=" + flex + ", consumoAtual=" + getConsumoAtual() + ", quilometragem=" + quilometragem
                + ", tipoCombustivelAtual=" + tipoCombustivelAtual + "]";
    }
}

