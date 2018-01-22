def insertion_sort(lista):
    tam_lista = len(lista)
    for i in range(1, tam_lista):
        chave = lista[i]
        j = i
        while j > 0 and chave < lista[j-1]:
            lista[j] = lista[j-1]
            j -= 1
        lista[j] = chave
    return lista