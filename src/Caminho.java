public class Caminho {
    private Ponto pontoOrigem;
    private Ponto pontoDestino;
    private int distancia;

    public Caminho(Ponto pontoOrigem, Ponto pontoDestino, int distancia) {
        this.pontoOrigem = pontoOrigem;
        this.pontoDestino = pontoDestino;
        this.distancia = distancia;
    }

    public Ponto getPontoOrigem() {
        return pontoOrigem;
    }

    public Ponto getPontoDestino() {
        return pontoDestino;
    }

    public int getDistancia() {
        return distancia;
    }

    @Override
    public String toString() {
        return "Caminho{" +
                "pontoOrigem='" + pontoOrigem + '\'' +
                ", pontoDestino='" + pontoDestino + '\'' +
                ", distancia=" + distancia +
                '}';
    }
}
