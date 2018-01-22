def soma_lista(lista, tam = None):
    if tam == None:
        tam = len(lista)
    if tam == 1:
        return lista[0]
    else:
        return soma_lista(lista, tam - 1) + lista[tam-1]
