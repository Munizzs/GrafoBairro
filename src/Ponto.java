public class Ponto {
    private String nome;

    public Ponto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
