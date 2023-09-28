def bubbleSort(lista):
    for num in range(len(lista)-1,0,-1):
        for i in range(num):
            if lista[i] > lista[i+1]:
                lista[i], lista[i+1] = lista[i+1], lista[i]
                lista[-1], lista[-1] = lista[-1], lista[-1]

lista = [1000,100000,10000,100]     
print(f"Vetor Original: {lista}")   
bubbleSort(lista)
print(f"Vetor Ordenado: {lista}")  
lista = [100000,10000,1000,100]  
print(f"Vetor Decrescente: {lista}")    
