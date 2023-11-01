# EJERCICIO 4: Calculadora de impuestos..

# Crear una funcion que calcule el total de un pago incluyendo..
# - IVA
# Formula: pago_total = pagoSinImpuesto + pagoSinImpuesto * (impuesto /100)

# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: xxxxx

def TotalConImp(pagoSinImpuesto, impuesto):
    pagoTotal = pagoSinImpuesto + pagoSinImpuesto * (impuesto/100)
    return pagoTotal

#Ejecutamos la funcion, pidiendo los datos

pagoSinImpuesto = float(input("Ingrese el monto sin impuesto: "))
impuesto = float(input("Ingrese el impuesto a aplicar: "))
pagoConImp = TotalConImp(pagoSinImpuesto,impuesto)
print(f"El pago con impuesto es: {pagoConImp}") #pasamos la var 