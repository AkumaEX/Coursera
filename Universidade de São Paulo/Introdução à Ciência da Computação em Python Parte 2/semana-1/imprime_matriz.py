def imprime_matriz(matriz):

    for lin in matriz:
        for elem in lin:
            ultimo = lin[-1]
            if elem != ultimo:
                print(elem, end=" ")
            else:
                print(elem)

