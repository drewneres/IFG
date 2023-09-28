gph = float(input("Digite quanto você ganha por hora:"))
ht = float(input("Digite quantas horas você trabalha:"))
salario_bruto = gph * ht 
fgts = salario_bruto * 0.11
ir = salario_bruto * 0.05
inss = salario_bruto * 0.10
sindicato = salario_bruto * 0.03
total_descontos = ir + inss + sindicato
salario_liquido = salario_bruto - total_descontos

print("A empresa pagou R$ {:.2f} de FGTS".format(fgts))
print("Você pagou R$ {:.2f} de Imposto de Renda".format(ir))
print("Você pagou R$ {:.2f} para INSS".format(inss))
print("Você pagou R$ {:.2f} para Sindicato".format(sindicato))
print("Seu salario bruto é R$ {:.2f}".format(salario_bruto))
print("Seu salario líquido é R$ {:.2f}".format(salario_liquido))
