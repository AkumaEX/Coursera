def busca(lista, elemento):
    tam_lista = len(lista)
    for i in range(tam_lista):
        if lista[i] == elemento:
            return i
    return False
