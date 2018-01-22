def menor_nome(nomes):
    lista = []
    for nome in nomes:
        lista.append(nome.strip())

    menor = lista[0]
    for nome in lista:
        if len(nome) < len(menor):
            menor = nome

    return menor.capitalize()

