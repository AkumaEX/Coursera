def sao_multiplicaveis(m1, m2):
    num_col_m1 = len(m1[0])
    num_lin_m2 = len(m2)
    if num_lin_m2 == num_col_m1:
        return True
    else:
        return False

