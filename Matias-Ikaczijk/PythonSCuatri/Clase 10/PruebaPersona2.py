from Persona import Persona2

print("Creamos objetos".center(50, "-"))

if __name__ == "__main__":
    persona5 = Persona2("José ", "Flores ", 39)
    persona5.mostrar_detalle()

    print(__name__)

print("Eliminamos objetos".center(50, "-"))

del persona5