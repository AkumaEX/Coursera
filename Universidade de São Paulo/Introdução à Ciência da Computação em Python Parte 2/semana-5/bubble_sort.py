def bubble_sort(lista):
    tam_lista = len(lista)
    for i in range(tam_lista - 1, 0, -1):
        houve_troca = False
        for j in range(i):
            if lista[j] > lista[j+1]:
                lista[j], lista[j+1] = lista[j+1], lista[j]
                houve_troca = True
        if not houve_troca:
            break
        print(lista)
    print(lista)
    return lista
