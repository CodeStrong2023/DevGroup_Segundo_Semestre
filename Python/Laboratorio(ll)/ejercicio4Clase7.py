#Ejercicio 4: Calculadora de Impuestos
#Crear una función para calcular el total de un pago incluyendo un impuesto aplicado. (IVA)
#Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
#Proporcione el pago sin impuesto: 1000
#Proporcione el monto del impuesto: 21%
#Pago con impuesto: xxxxx
def total_del_pago(pago_sin_impuesto,impuesto):
    #Formula
   pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
   return pago_total

pago_sin_impuesto = float(input("Ingrese el pago sin impuesto: "))
impuesto = float(input("Digite el monto del impuesto:"))

#Acá ya calculamos el pago total
pagoMasImpuesto= total_del_pago(pago_sin_impuesto,impuesto)
print(f"El pago total es de : {pagoMasImpuesto}")

