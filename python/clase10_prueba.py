print("Creación de objetos".center(50, "-"))
if __name__ == "__main__":
    persona5 = Persona("Juan", "Pablo", 22)
    persona5.mostrar_detalles()

    print(__name__)


print("Eliminación de objetos".center(50, "-"))
del persona5
