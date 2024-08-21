public class TanqueCombustivel {

    private TipoCombustivel tipoCombustivel;
    private int capacidade;
    private int combustivelDisponivel;

    public TanqueCombustivel(int capacidade) {
        this.capacidade = capacidade;
        this.combustivelDisponivel = 0;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getCombustivelDisponivel() {
        return combustivelDisponivel;
    }

    public boolean abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        if (combustivelDisponivel + quantidade > capacidade) {
            return false;
        } else {
            this.tipoCombustivel = tipoCombustivel; 
            combustivelDisponivel += quantidade;
            return true;
        }
    }

    public boolean gasta(int quantidade) {
        if (combustivelDisponivel - quantidade < 0) {
            return false;
        } else {
            combustivelDisponivel -= quantidade;
            return true;
        }
    }

    @Override
    public String toString() {
        return "TanqueCombustivel [capacidade=" + capacidade + ", combustivelDisponivel=" + combustivelDisponivel
                + ", tipoCombustivel=" + tipoCombustivel + "]";
    }
}