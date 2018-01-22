def ordena(lista):
    tam_lista = len(lista)
    for i in range(tam_lista - 1):
        menor = i
        for j in range(i + 1, tam_lista):
            if lista[j] < lista[menor]:
                menor = j
        lista[i], lista[menor] = lista[menor], lista[i]
    return lista