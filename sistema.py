print('Qual distribuição você considera melhor?')
print('''1- Fedora
2- Ubuntu
3- Mint
4- Debian
5- Mandriva
6- Slackware
0- Sair''')

opcoes = ['Fedora', 'Ubuntu', 'Mint', 'Debian', 'Mandriva', 'Slackware']
sistemas = [0] * 6
while True:
    while True:
        opcao = int(input('Digite a opção: '))
        if opcao > 6 or opcao < 0:
            print('Opção inválida.')
        else:
            break
    if opcao == 0: #quando você digitar '0' na mensagem 'Digite a opção' ele para de contabilizar o voto e segue para o cálculo da enquete.
        break
    sistemas[opcao - 1] = sistemas[opcao - 1] + 1


print('Distribuição de     Votos  %')
print('-------------------   ----------')
cont = 0
melhor = 0
melhorSis = ''
perc = 0
for s in sistemas:
    print('%s %d %.2f%%' % (opcoes[cont], s,(s * 100) / sum(sistemas) ))
    if s > melhor:
        melhor = s
        melhorSis = opcoes[cont]
        perc = (s * 100) / sum(sistemas)
    cont += 1

print('-------------------   ----------')
print('Total                    %d' % sum(sistemas))
print('O Sistema Operacional mais votado foi o %s, com %d votos, correspondendo a %.2f dos votos.' % (melhorSis, melhor, perc))
