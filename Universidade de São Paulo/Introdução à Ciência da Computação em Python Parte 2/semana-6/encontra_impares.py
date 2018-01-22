def encontra_impares(lista, i = None):
    if i == None:
        i = len(lista) - 1
    if i == -1:
        return []
    else:
        if lista[i] % 2 == 0:
            return encontra_impares(lista, i - 1)
        else:
            return encontra_impares(lista, i - 1) + [lista[i]]
