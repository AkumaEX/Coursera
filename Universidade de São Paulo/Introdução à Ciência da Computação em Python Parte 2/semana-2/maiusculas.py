def maiusculas(frase):
    palavra = ""
    for c in frase:
        if ord(c) >= 65 and ord(c) <= 90:
            palavra += c
    return palavra
