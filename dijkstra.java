import java.util.Arrays;

public class DijkstraMatriz {
    private static final int INFINITY = 999;

    public void menorCaminho(int[][] matriz) {
        int numVertices = matriz.length;
        int[] distancia = new int[numVertices];
        boolean[] visitado = new boolean[numVertices];
        int[] procedente = new int[numVertices];

        // Inicialização dos arrays
        Arrays.fill(distancia, INFINITY);
        Arrays.fill(visitado, false);
        Arrays.fill(procedente, -1);

        distancia[0] = 0; // A origem é o vértice 0

        // Encontrar o caminho mínimo para todos os vértices
        for (int i = 0; i < numVertices - 1; i++) {
            int verticeAtual = encontrarVerticeMenorDistancia(distancia, visitado);
            visitado[verticeAtual] = true;

            // Atualizar a distância dos vértices adjacentes ao vértice atual
            for (int j = 0; j < numVertices; j++) {
                if (!visitado[j] && matriz[verticeAtual][j] != 0 && distancia[verticeAtual] + matriz[verticeAtual][j] < distancia[j]) {
                    distancia[j] = distancia[verticeAtual] + matriz[verticeAtual][j];
                    procedente[j] = verticeAtual;
                }
            }
        }

        // Imprimir as distâncias mínimas e seus predecessores
        System.out.println("Distância mínima da origem até o destino:");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(i + "ª distância do vértice a partir da origem: " + distancia[i]);
            System.out.println("Predecessor: " + procedente[i]);
        }
    }

    private int encontrarVerticeMenorDistancia(int[] distancia, boolean[] visitado) {
        int minDistancia = INFINITY;
        int minVertice = -1;

        for (int i = 0; i < distancia.length; i++) {
            if (!visitado[i] && distancia[i] < minDistancia) {
                minDistancia = distancia[i];
                minVertice = i;
            }
        }

        return minVertice;
    }
}
