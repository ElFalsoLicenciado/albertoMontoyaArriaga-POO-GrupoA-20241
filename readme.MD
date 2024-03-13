# Tarea #7 Unidad 2

## Realizar métodos para poder agregar o retirar dinero de la cuenta bancaria. Considerar lo siguiente:

1. La cuenta bancaria debe de ser alguno de estos tipos: A, B o C y debe de incluirse al momento de de registrar un usuario con una cuenta. Si se ingresa un valor diferentes a esos 3 advertirle al usuario y no permitir darlo de alta.

    - Si el número de cuenta es de tipo A la cuenta puede tener hasta $50,000
    - Si el número de cuenta es de tipo B la cuenta puede tener hasta $100,000
    - Si el número de cuenta es de tipo C la cuenta puede tener saldo ilimitado

    - Al momento de retirar dinero de la cuenta el saldo mínimo para la cuenta de tipo de tipo A es de $1,000
    - Al momento de retirar dinero de la cuenta el saldo mínimo para la cuenta de tipo de tipo B es de $5,000
   - Al momento de retirar dinero de la cuenta el saldo mínimo para la cuenta de tipo de tipo C es de $10,000

2. Crear un método para poder ver la cuenta de algún empleado (SI ES QUE CUENTA CON ELLA) con el siguiente formato:
    - "El número de cuenta del empleado Pedro es 12345, su saldo es 10000 y la cuenta es de tipo A" (los datos son variables)

3. Realizar todas las validaciones correspondientes y advertirle al usaurio antes de hacer cualquier modificación que debes utilizar la ```sobrecarga de métodos``` para que existan funciones con el mismo nombre pero realicen una función diferente.

### En base al ejercicio del empleado y la cuenta bancaria, modificarlo para que ahora un empleado pueda tener múltiples cuentas bancarias, no solamente 1, además, incluir las siguientes opciones. (Utilizar un arreglo o un arrayList)

    - Opción para mostrar a todos los usuarios con su información
    - Opción mostrar la información de algún usuario en específico

# Además, crear una clase llamada Banco, y que pueda almacenar todas las cuentas bancarias existentes en el sistema, y añadirle la opción para poder listar todas las cuentas existentes y alguna en específico.

Realizar el ejercicio utilizando un menú (en consola) para que el usuario pueda seguir usando el programa hasta que desee salir de el.

