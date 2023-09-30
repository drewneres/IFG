import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Grafo {
    private int numVertices;
    private List<List<Integer>> adjacencia;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        adjacencia = new ArrayList<>(numVertices);

        for (int i = 0; i < numVertices; i++) {
            adjacencia.add(new ArrayList<>());
        }
    }

    public void adicionarAresta(int origem, int destino) {
        adjacencia.get(origem).add(destino);
    }

    public void buscaEmProfundidade(int verticeInicial) {
        boolean[] visitado = new boolean[numVertices];
        Stack<Integer> pilha = new Stack<>();

        pilha.push(verticeInicial);

        while (!pilha.empty()) {
            int verticeAtual = pilha.pop();

            if (!visitado[verticeAtual]) {
                System.out.print(verticeAtual + " ");
                visitado[verticeAtual] = true;

                List<Integer> vizinhos = adjacencia.get(verticeAtual);
                for (int vizinho : vizinhos) {
                    if (!visitado[vizinho]) {
                        pilha.push(vizinho);
                    }
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(7);

        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 5);
        grafo.adicionarAresta(2, 6);

        System.out.println("Busca em Profundidade (DFS):");
        grafo.buscaEmProfundidade(0);
    }
}
