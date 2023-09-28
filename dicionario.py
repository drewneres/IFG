matriculas = [
    {
        "Nome":"Maicão da bike ",
        "Matricula":2019132325,
        "Data de nascimento": "17 de janeiro"
    },
    {
        "Nome":"Dj azeitona",
        "Matricula":5220135555,
        "Data de nascimento": "20 de junho"
    },        
    {
        "Nome":"Cleber Joel",
        "Matricula":7220385154,
        "Data de nascimento": "11 de agosto"
    },
    {
        "Nome":"Kerolaine Xerox",
        "Matricula":1120443812,
        "Data de nascimento": "23 de maio"
    },
    {
        "Nome":"João Motoboy",
        "Matricula":6220895432,
        "Data de nascimento": "10 de outubro"
    },
]
for matriculas in matriculas:
    for chave, valor in matriculas.items():
        print(chave, "=", valor)
    print()
