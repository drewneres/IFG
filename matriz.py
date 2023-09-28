MatrizA = []
MatrizB = []
MatrizC = []

LinhasA = int(input("Digite o número de linhas de A: "))
ColunasA = int(input("Digite o número de colunas de A:"))

LinhasB = int(input("Digite o número de linhas de B: "))
ColunasB = int(input("Digite o número de colunas de B:"))
  

if ColunasA != LinhasB:
  print("Não tem solução")
else:
  print("\n Matriz A")
  for i in range(LinhasA):
    MatrizA.append([0]*ColunasA)
  for f in range(LinhasA):
    for c in range(ColunasA):
      MatrizA[f][c] = int(input("Elemento %d, %d :"%(f,c)))

  print("\n Matriz B")
  for i in range(LinhasB):
    MatrizB.append([0]*ColunasB)
  for f in range(LinhasB):
    for c in range(ColunasB):
      MatrizB[f][c] = int(input("Elemento %d, %d :"%(f,c)))


  print('\n',"Matrizes")
  print('\n','Matriz A')
  for linha in MatrizA:
    print(linha)
  
  print('\n','Matriz B')
  for linha in MatrizB:
    print(linha)
  


  print('\n', "Multiplicação das Matrizes")
  for k in range(LinhasA):
    MatrizC.append([0]*ColunasB)
    for i in range(ColunasB):
      MatrizC[k][i] = 0
  
  for i in range(LinhasA):
    for j in range(ColunasA):
      for k in range(ColunasB):
        MatrizC[i][k] += (MatrizA[i][j] * MatrizB[j][k])
    
  for linha in MatrizC:
    print(linha)
