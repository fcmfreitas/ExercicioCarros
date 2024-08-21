public class Motor {

    private boolean flex;
    private boolean economico;
    private int consumoGasolina;
    private int consumoAlcool;
    private TipoCombustivel tipoCombustivelAtual;
    private int quilometragem;

    public Motor(int consumoGasolina, int consumoAlcool, boolean economico) {
        this.consumoGasolina = consumoGasolina;
        this.consumoAlcool = consumoAlcool;
        this.flex = (consumoGasolina != 0 && consumoAlcool != 0);
        this.economico = economico;
        this.quilometragem = 0;
    }

    public void setTipoCombustivelAtual(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivelAtual = tipoCombustivel;
    }

    public int getConsumoAtual() {
        if (economico && tipoCombustivelAtual == TipoCombustivel.GASOLINA) {
            // Reduz o consumo a cada 5000 km, até o mínimo de 10 km/l
            int consumoReduzido = consumoGasolina - (quilometragem / 5000);
            return Math.max(consumoReduzido, 10);
        } else if (tipoCombustivelAtual == TipoCombustivel.GASOLINA) {
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
        return "Motor [flex=" + flex + ", economico=" + economico + ", consumoAtual=" + getConsumoAtual() 
               + ", quilometragem=" + quilometragem + ", tipoCombustivelAtual=" + tipoCombustivelAtual + "]";
    }
}