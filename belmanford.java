import java.util.*;

public class BellmanFord {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> grafo = new HashMap<>();

        grafo.put("a", Map.of("b", -1, "c", 4));
        grafo.put("b", Map.of("c", 3, "d", 2, "e", 2));
        grafo.put("c", new HashMap<>());
        grafo.put("d", Map.of("b", 1, "c", 5));
        grafo.put("e", Map.of("d", -3));

        BellmanFord bellmanFord = new BellmanFord();
        Map<String, Integer> distancias = bellmanFord.bellmanFord(grafo, "a");

        System.out.println(distancias);
    }

    public Map<String, Integer> bellmanFord(Map<String, Map<String, Integer>> grafo, String origem) {
        Map<String, Integer> distancias = new HashMap<>();
        for (String vertice : grafo.keySet()) distancias.put(vertice, Integer.MAX_VALUE);
        distancias.put(origem, 0);

        for (int i = 1; i < grafo.size(); i++) {
            for (String u : grafo.keySet()) {
                for (Map.Entry<String, Integer> aresta : grafo.get(u).entrySet()) {
                    String v = aresta.getKey();
                    int peso = aresta.getValue();
                    if (distancias.get(v) > distancias.get(u) + peso) {
                        distancias.put(v, distancias.get(u) + peso);
                    }
                }
            }
        }

        return distancias;
    }
}
