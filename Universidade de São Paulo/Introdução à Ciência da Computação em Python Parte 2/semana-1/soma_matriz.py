def dimensoes(matriz):
    lin = len(matriz)
    col = len(matriz[0])
    return str(lin) + "X" + str(col)


def soma_matrizes(m1, m2):
    if dimensoes(m1) == dimensoes(m2):
        m3 = list()
        tam_lin = len(m1)
        tam_col = len(m1[0])
        for i in range(tam_lin):
            lin = [m1[i][j] + m2[i][j] for j in range(tam_col)]
            m3.append(lin)
        return m3
    else:
        return False
