class Triangulo:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def semelhantes(self, t):
        t1 = [self.a, self.b, self.c]
        t1.sort()
        t2 = [t.a, t.b, t.c]
        t2.sort()

        if t1[0]/t2[0] == t1[1]/t2[1] == t1[2]/t2[2]:
            return True
        else:
            return False
