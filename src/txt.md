Ejercicio: Sistema de Inventario para una Tienda de Artículos Variados

Descripción:

Desarrolla un sistema de inventario para una tienda que vende artículos variados, incluyendo libros, electrónicos y ropa. El sistema debe permitir gestionar el inventario de estos artículos, aplicando descuentos específicos y mostrando detalles del producto de manera polimórfica.

No uses una base de datos. Debería bastarte con colecciones de Java que sigan la interfaz , la más sencilla es

Requisitos:

Abstracción:

Crea una clase abstracta Articulo que contenga atributos comunes a todos los artículos de la tienda, como id, nombre, precio y cantidadEnStock.
Define métodos abstractos en Articulo para aplicarDescuento() y mostrarDetalles().
Polimorfismo:

Implementa clases concretas para Libro, Electronico y Ropa que extiendan de Articulo.
Cada clase debe sobrescribir los métodos aplicarDescuento() y mostrarDetalles(), proporcionando implementaciones específicas. Por ejemplo, los libros podrían tener un descuento diferente en comparación con los electrónicos y la ropa.
Gestión de Inventario:

Crea una clase GestorInventario que contenga una lista de Articulo. Esta clase debe permitir agregar artículos al inventario, eliminarlos y mostrar los detalles de todos los artículos.
Funcionalidades Específicas:

Libro debe tener atributos adicionales como autor y ISBN.
Electronico puede tener atributos como marca y modelo.
Ropa podría incluir talla y color.
Implementa un método en GestorInventario para aplicar descuentos a todos los artículos y otro para mostrar los detalles de cada uno, demostrando polimorfismo.
Desafíos Adicionales:

Añade una funcionalidad para buscar artículos por nombre o categoría (libro, electrónico, ropa).
Sobrecarga el método equals para poder comparar Artículos
Crea una función para saber cuántos Artículos hay en inventario