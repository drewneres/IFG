núm =[[], []]
valor = 0
for c in range (1,6):
  valor = int(input("Digite o {c}°. valor: "))
  if valor %2 == 0:
   núm [0].append(valor)
  else:
    núm [1].append(valor)
print("-=+"* 30)
print(f"Os valores digitados são pares: {núm[0]}")
print(f"Os valores digitados são impares: {núm[1]}")  
