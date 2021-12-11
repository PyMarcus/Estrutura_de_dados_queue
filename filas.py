import queue


# fila manual
class Fila:
    lista_encadeada = []


    @property
    def valor(self):
        return None

    @valor.setter
    def valor(self, novo_valor):
        x = novo_valor

    @classmethod
    def add(self, valor):
        Fila.lista_encadeada.append(valor)

    @classmethod
    def remove(cls):
        try:
            Fila.lista_encadeada.pop(0)
        except IndexError:
            print("Lista vazia")

    @classmethod
    def element(cls):
        return Fila.lista_encadeada[0]

    @classmethod
    def clear(cls):
        try:
            while len(Fila.lista_encadeada) > 0:
                Fila.lista_encadeada.pop()
        except IndexError:
            print("Lista vazia")

    @classmethod
    def size(cls):
        return len(Fila.lista_encadeada)


class Main:
    """Método queue"""
    @staticmethod
    def run():
        objeto = queue.Queue(5)
        objeto.put(4)  # add
        objeto.put(5)
        for n in range(objeto.qsize()):
            print(objeto.get(), end=", ", flush=True)  # imprimir
        print(objeto.get())  # obtem primeiro elemento e o remove
        print(objeto.qsize())  # tamanho
        print(objeto.get_nowait())  # remove e obtem de uma vez
        print(objeto.qsize())


if __name__ == '__main__':
    fila = Fila()
    print(fila.lista_encadeada)
    fila.add(3)
    fila.add(5)
    print(Fila.size())
    print(fila.lista_encadeada)
    fila.clear()
    print(fila.lista_encadeada)
    fila.remove()
    print(fila.lista_encadeada)

    print("NOVO:")
    main = Main()
    main.run()

