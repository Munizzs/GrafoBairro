import java.util.*;

public class Mapa {
    private List<Ponto> pontos = new ArrayList<>();
    private List<Caminho> caminhos = new ArrayList<>();

    public Mapa() {

    }

    public void adicionarPonto(Ponto ponto){
        pontos.add(ponto);
    }

    public void adicionarCaminho(Ponto origem, Ponto destino, int distancia){
        Caminho caminho = new Caminho(origem,destino,distancia);
        caminhos.add(caminho);
    }

    public void encontrarCaminhoCurto(Ponto partida, Ponto destino){
        Map<Ponto, Integer> distancias = new HashMap<>();
        Map<Ponto, Ponto> predecessores = new HashMap<>();
        Set<Ponto> visitados = new HashSet<>();
        PriorityQueue<Ponto> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

        for (Ponto ponto : pontos) {
            distancias.put(ponto, Integer.MAX_VALUE);
        }
        distancias.put(partida, 0);
        filaPrioridade.add(partida);

        while (!filaPrioridade.isEmpty()) {
            Ponto atual = filaPrioridade.poll();

            if (atual.equals(destino)) break;

            if (!visitados.contains(atual)) {
                visitados.add(atual);

                for (Caminho caminho : caminhos) {
                    if (caminho.getPontoOrigem().equals(atual)) {
                        Ponto adjacente = caminho.getPontoDestino();
                        int novaDistancia = distancias.get(atual) + caminho.getDistancia();

                        if (novaDistancia < distancias.get(adjacente)) {
                            distancias.put(adjacente, novaDistancia);
                            predecessores.put(adjacente, atual);
                            filaPrioridade.add(adjacente);
                        }
                    }
                }
            }
        }

        List<Ponto> caminho = new ArrayList<>();
        Ponto passo = destino;

        while (passo != null && predecessores.containsKey(passo)) {
            caminho.add(passo);
            passo = predecessores.get(passo);
        }
        caminho.add(partida);
        Collections.reverse(caminho);

        System.out.println("Caminho mais curto de " + partida + " até " + destino + ":");
        for (Ponto ponto : caminho) {
            System.out.print(" -> "+ponto.getNome());
        }
        System.out.println("\nDistância total: " + distancias.get(destino) + " metros");
    }

    public void MostrarPontos(){
        System.out.println("Pontos:");
        for(Ponto ponto : pontos){
            System.out.println(ponto);
        }
    }

    public void MostrarCaminhos(){
        System.out.println("Caminhos:");
        for(Caminho caminho : caminhos){
            System.out.println(caminho);
        }
    }
}
