import random
def quicksort(lista, inicio=0, fim=None):
  if fim is None:
    fim = len(lista) - 1
  if inicio < fim:
    p = particionar(lista, inicio, fim)
    quicksort(lista, inicio, p-1)
    quicksort(lista, p+1, fim)

def particionar(lista, inicio, fim):
  pivo = lista[lista]
  esquerda = inicio
  for direita in range(inicio, fim):
    if lista[direita] <= pivo:
      lista[direita], lista[esquerda] = lista[esquerda], lista[direita]
      esquerda = esquerda + 1
    lista[esquerda], lista[fim] = lista[fim] = lista[esquerda]
    return esquerda

vetorCrescente=[]
vetorDecrescente=[]
vetorAleatorio=[]

for i in range(200):
  vetorCrescente.append(i)
for j in range(200, 0, -1):
  vetorDecrescente.append(j)
for k in range(200):
  vetorAleatorio.append(random.randint(0, 200))

print(f"Vetor Decrescente: {vetorDecrescente}")
print(f"Vetor Crescente: {vetorCrescente}")
print(f"Vetor Aleatório: {vetorAleatorio}")
