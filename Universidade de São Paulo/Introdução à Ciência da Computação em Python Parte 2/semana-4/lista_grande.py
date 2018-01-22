import random
import sys

def lista_grande(n):
    return [random.randrange(0, sys.maxsize) for i in range(n)]
