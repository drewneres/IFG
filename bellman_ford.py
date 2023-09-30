def bellman_ford(grafo, source):
    distancia, ant = dict(), dict()
    for j in grafo:
        distancia[j], ant[j] = float('inf'), None
    distancia[source] = 0

    for _ in range(len(grafo) - 1):
        for j in grafo:
            for i in grafo[j]:
                if distancia[i] > distancia[j] + grafo[j][i]:
                    distancia[i], ant[i] = distancia[j] + grafo[j][i], j

    for j in grafo:
        for i in grafo[j]:
            assert distancia[i] <= distancia[j] + grafo[j][i]

    return distancia, ant
    
if __name__ == '__main__':
    grafo = {
        'a': {'b': -1, 'c':  4},
        'b': {'c':  3, 'd':  2, 'e':  2},
        'c': {},
        'd': {'b':  1, 'c':  5},
        'e': {'d': -3}
    }

    distancia, ant = bellman_ford(grafo, source='a')

    print(distancia)
    
    grafo = {
        'a': {'c': 3},
        'b': {'a': 2},
        'c': {'b': 7, 'd': 1},
        'd': {'a': 6},
    }
 
    distancia, ant = bellman_ford(grafo, source='a')

    print(distancia)