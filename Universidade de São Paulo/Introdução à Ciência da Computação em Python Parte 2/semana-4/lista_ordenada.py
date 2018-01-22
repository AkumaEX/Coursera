def ordenada(lista):
    tam_lista = len(lista)
    for i in range(1, tam_lista):
        if lista[i-1] > lista[i]:
            return False
    return True

