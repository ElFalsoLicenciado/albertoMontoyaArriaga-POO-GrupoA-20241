# Tarea #6 Unidad 2
Se desea crear una clase llamada ```Producto``` que represente un artículo en un inventario. La clase debe tener los siguientes atributos privados:

  1. ```nombre```: Una cadena que representa el nombre del producto
  2. ```precio```: Un número de punto flotante que representa el precio del producto.
  3. ```stock```: Un número entero que representa la cantidad de existencias disponibles del producto.

# Se deben proporcionar los siguientes métodos públicos:

## 1. Constructores:

  - Un constructor que tome tres parámetros (```nombre```, ```precio``` y ```stock```) para inicializar todos los atributos del producto.
  - Un constructor que tome dos parámetros (```nombre``` y ```precio```) y establezca el _stock_ en 0 por defecto.
## 2. Getters y setter para todos los atributos:
  - ```getNombre()``` y ```setNombre(String nombre)```.
  - ```getPrecio()``` y ```setPrecio(double precio)```.
  - ```getStock()``` y ```setStock(int stock)```.
## 3. Métodos adicionales:
  - ```aumentarStock(int cantidad)```: Aumenta el _stock_ del producto en la cantidad especificada, con validación para asegurarse de que la cantidad sea mayor que reo.
  - ```reducirStock(int cantidad)```: Reduce el _stock_ del producto en la cantidad especificada, con validadción para asegurarse que la cantidad sea mayor que 0 y menor o gigual al _stock_ actual. 
## Además, se deben incluir las siguientes validaciones en los setters:
- El _precio_ y el _stock_ no pueden ser negativos.
- El _nombre_ no puede ser nulo.
- La cantidad a reducir del _stock_ debe ser menor o igual al _stock_ actual.