# 3.5  Método con listas llamado COLA

# Escritura de datos de tipo fifo (first input / first output). Primero q entra, primero q sale

cola = ["Ariel", "Lorena" , "Luis" , "Oscar"]
cola.append("Josefina")
cola.append("Estefan")
print(cola)

# sacamos elementos
Retira = cola.pop(0) # Ariel atendido
print(f"Atendido {Retira}")
print(cola)

Retira = cola.pop(0) # Lorena atendida
print(f"Atendida {Retira}")
print(cola)

Retira = cola.pop(0) # Luis atendido
print(f"Atendido {Retira}")
print(cola)

Retira = cola.pop(0) # Oscar atendido
print(f"Atendido {Retira}")
print(cola)

Retira = cola.pop(0) # Josefina atendido
print(f"Atendida {Retira}")
print(cola)

Retira = cola.pop(0) # Estefan atendido
print(f"Atendido {Retira}")
print(cola)
