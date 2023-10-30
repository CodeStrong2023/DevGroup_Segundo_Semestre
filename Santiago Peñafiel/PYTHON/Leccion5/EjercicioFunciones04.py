"""
Ejercicio 4: Calculadora de impuestos
Crear una funcion para calcular el total de un pago incluyendo un impuesto aplicado (IVA)
Formula: pago_total = pago_sin_impuestos + pago_sin_impuestos *(impuesto/100)
Proporcione el pago sin impuestos: 1000
Proporcione el monto del impuesto: 21%
pago con impuestos: xxxx
"""
#Creamos la funcion para calcular el total del pago incluyendo el impuesto
def calcular_total_pago(pago_sin_impuestos, impuesto):
    pago_total = pago_sin_impuestos + pago_sin_impuestos *(impuesto/100)
    return pago_total

#Ejecutamos la funcion
pago_sin_impuesto = float(input("Digite el pago sin impuestos: "))
impuesto =float(input("Digite el monto del impuesto a aplicar: "))
pago_con_impuesto =calcular_total_pago(pago_sin_impuesto, impuesto)
print(f'El pago con impuestos es: {pago_con_impuesto}')