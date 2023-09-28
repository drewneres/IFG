def particionar(lista):
    pivo = 0
    for i in range(1, len(lista)):
        if lista[i]<=lista[0]:
            pivo += 1
            lista[pivo], lista[i] = lista[i], lista[pivo]
    lista[pivo], lista[0] = lista[0], lista[pivo]
    return pivo

def quicksort(lista):
    if len(lista) < 2:
        return lista
    i = particionar(lista)  # i: posicao do pivo
    esquerda = quicksort(lista[:i])
    direita = quicksort(lista[i + 1:])
    pivo = lista[i]
    return esquerda + [pivo] + direita

lista = [5,4,3,2,1]
print(f"Vetor original: {lista}")
print(f"Vetor ordenado: {quicksort(lista)}")

