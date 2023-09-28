lista = [True, False]
for t in lista:
  for r in lista:
    for x in lista:
      for u in lista:
       exp= p and (not (not t or r)) or (r and x), (x and u)
       print(f'  {p}     {q}     {r}       {s}       =     {exp}')
