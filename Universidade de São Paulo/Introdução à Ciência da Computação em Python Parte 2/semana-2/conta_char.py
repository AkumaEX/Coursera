def conta_letras(frase, contar = "vogais"):
    frase = str.lower(frase)
    vogais = 0
    consoantes = 0

    for c in frase:
        if c is 'a' or c is 'e' or c is 'i' or c is 'o' or c is 'u':
            vogais += 1
        elif c is 'b' or c is 'c' or c is 'd' or c is 'f' or c is 'g' or c is 'h' or c is 'j' or c is 'k' or c is 'l' or c is 'm' or c is 'n' or c is 'p' or c is 'q' or c is 'r' or c is 's' or c is 't' or c is 'v' or c is 'w' or c is 'x' or c is 'y' or c is 'z':
            consoantes += 1

    if contar == "vogais":
        return vogais
    else:
        return consoantes
