# Ejercicio 4: Calculadora de impuestos
# Crear una función para calcular el total de un pago incluyendo
# un impuesto aplicado (IVA).
# Formula = pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el impuesto: 21
# Pago con impuesto: *******

def calculadora_Impuestos(pago, impuesto):
    pagoTotal = pago + pago * (impuesto/100)
    print(pagoTotal)

pago = int(input("Digite el pago sin impuestos: "))
impuesto = int(input("Digite el valor del impuesto en %: "))
calculadora_Impuestos(pago, impuesto)