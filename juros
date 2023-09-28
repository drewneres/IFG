depósito = float(input("Depósito inicial: "))
taxa = float(input("Taxa de juros: "))
investimento = float(input("Depósito mensal:"))
mês = 1
saldo = depósito
while mês <= 36:
    saldo = saldo + (saldo * (taxa / 100)) + investimento
    print ("Saldo do mês %d é de R$%5.2f." % (mês, saldo))
    mês = mês + 1
print ("O ganho obtido com os juros foi de R$%8.2f." % (saldo-depósito))
