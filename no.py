class No:
    def __init__(self, valor=None, esquerda=None, direita=None):
        self.valor = valor
        self.esquerda = esquerda
        self.direita = direita
    def __repr__(self):
        return '%s <- %s -> %s' % (self.esquerda and self.esquerda.valor, self.valor, self.direita and self.direita.valor)


def caminho(raiz):
    if not raiz:
        return
    caminho(raiz.esquerda)
    print(raiz.valor)
    caminho(raiz.direita)

def altura(raiz):
    if raiz is None:
        return 0
    return max(altura(raiz.esquerda), altura(raiz.direita)) + 1

def balanceada(raiz):
    if raiz is None:
        return True

    altura1 = altura(raiz.esquerda)
    altura2 = altura(raiz.direita)

    if abs(altura1 - altura2) > 1:
        return False

    return balanceada(raiz.esquerda) and balanceada(raiz.direita)

def inserir(raiz, no):
    if raiz is None:
        raiz = no
    elif no.valor > raiz.valor:
        if raiz.direita is None:
            raiz.direita = no
        else:
            inserir(raiz.direita, no)
    else: 
        if raiz.esquerda is None:
            raiz.esquerda = no
        else:
            inserir(raiz.esquerda, no)


def busca(raiz, valor):
    if raiz is None:
        return None

    if raiz.valor == valor:
        return raiz

    if raiz.valor < valor:
        return busca(raiz.direita, valor)

    return busca(raiz.esquerda, valor)

def arvoreInteligivel(No, level=0) :
    if No == None : return
    arvoreInteligivel(No.direita, level+1)
    print('  '*level + str(No.valor))
    arvoreInteligivel(No.esquerda, level+1)

def iguais(a1, a2):
    if a1 is None and a2 is None:
        return True

    if a1 is not None and a2 is not None:
        return ((a1.valor == a2.valor) and
                iguais(a1.esquerda, a2.esquerda) and
                iguais(a1.direita, a2.direita))

    return False

raiz = No(1)
i=[7,9,10,11,12,14,15,16]


for valor in i:
    no = No(valor)
    inserir(raiz, no)

raiz2 = No(1)

for valor in i:
    no = No(valor)
    inserir(raiz2, no)

arvoreInteligivel(raiz)
arvoreInteligivel(raiz2)
print('São iguais? ', iguais(raiz, raiz2))
print('A primeira arvore é balanceada? ', balanceada(raiz))
print('A segunda arvore é balanceada? ', balanceada(raiz2))
