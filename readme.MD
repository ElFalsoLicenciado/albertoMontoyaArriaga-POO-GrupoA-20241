# Tarea #4 Unidad 2
## Ejercicio 1:
Crear una clase llamada ***Rectangulo*** la cual pueda calcular el **área** y el **perímetro**. Debes de considerar que el usuario puede ingresarte ```enteros``` o ```doubles```, por lo que debes utilizar la ```sobrecarga de métodos``` para que existan funciones con el mismo nombre pero realicen una función diferente.

## Ejercicio 2:
Crear una clase ***Empleado*** y crear métodos llamados **calcularSalario** para poder calcular el *salario de la persona*.
>El / Los métodos pueden recibir hasta 3 parámetros: *sueldoBase*, *bonificación* y *horas extras*.
>Si el usuario manda por parámetro solo el *sueldo*, retornar solo eso.
>Si el usuario manda por parámetro *sueldo* y *bonificación*, retornar *sueldo* + *bonificación*.
>Si el usuario manda por parámetro *sueldo*, *bonificación* y *horas extras*, retornar *sueldo* + *bonificación* + (horas * 20)
>Todos los métodos deben de llamarse igual por lo que tienes que usar la ```sobrecarga de métodos```.

## Ejercicio 3:
Realizar una clase llamada ***CalculadoraImpuestos*** que cuente con un método llamado **calcularImpuestos**.
>Este método puede recibir hasta 4 parámetros, *ingresos* (```int```), *porcentajeImpuesto*s (```double```), *dividendos* (```double```) y *exención* (```double```).
>Si el usuario manda solo los *ingresos*, retornar *ingresos* + 0.15
>Si el usuario manda *ventas* y *porcentajeImpuesto* retornar *ventas* * (*porcentajeImpuesto* / 100).
>Si el usuario manda *dividendos*, *porcentajeImpuesto* y *exención*.
>>Calcular los *impuestos* = *dividendos* * (*porcentajeImpuesto* / 100).
>>Si los *impuestos* son mayores que la *exención* retornar los *impuestos* menos la *exención*, sino retornar 0.