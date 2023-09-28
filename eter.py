import random
for t in range(4):
    pilha = []
    pagina = []

    def criaPilha(pil):
        while len(pil)<8:
            pil.append(random.randint(0, 9))
        pagina.append(pilha)

    for i in range(4):
        pilha=[]
        criaPilha(pilha)

    print(f"pagina {t + 1} cheia: {pagina}")

    for p in range(4):
        for j in range(2):
            pagina[p].pop(-1)

    print(f"pagina {t + 1} -20% (dois elementos): {pagina}")

    for p in range(4):
        pagina[p].pop(-1)

    print(f"pagina {t + 1} -20%(um elemento): {pagina}\n")

def moverTorre(height,fromPole, toPole, withPole):
    if height >= 1:
        moverTorre(height-1,fromPole,withPole,toPole)
        moverDisk(fromPole,toPole)
        moverTorre(height-1,withPole,toPole,fromPole)
 
def moverDisk(fp,tp):
    print("Movendo o disco de", fp, "para", tp)
 
moverTorre(3,"A","B","C")
 
