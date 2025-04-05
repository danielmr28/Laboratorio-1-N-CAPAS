* Sistema de gestión de una tienda de música 

Una desarrolladora de videojuegos ha solicitado la ayuda de los estudiantes que cursan la materia "Programación N Capas" para desarrollar algunas funcionalidades para un sistema de ventas de una tienda de musica. Este ejercicio busca simular un sistema de gestión para una tienda de música. El sistema debe permitir registrar información sobre artistas y discos, llevar un control de las ventas de discos y determinar qué discos o artistas han tenido mayores ventas. Además, debe poder actualizar las estadísticas de ventas de cada disco tras cada venta.
NOTA: Este ejercicio será evaluado por los instructores de la materia, quienes medirán los conocimientos de los estudiantes en cuanto al uso de Java, colecciones, clases, objetos y fundamentos del lenguaje. Los estudiantes deberán completar la tarea en un lapso de 24 horas, trabajando en parejas que serán elegidas al azar.
Instrucción para Entrega del Ejercicio:
Cada pareja de estudiantes debe crear un repositorio en GitHub para su equipo y subir todo el código correspondiente al ejercicio allí. Una vez que hayan completado la tarea y subido todos los cambios necesarios, deberán enviar un correo electrónico al instructor con los siguientes detalles:
Nombre completo de ambos integrantes del equipo.
Número de carnet de cada integrante.
Enlace al repositorio de GitHub donde está alojado el código.
Recuerden que el repositorio debe ser público o, en caso de ser privado, deben asegurarse de que los instructores tengan acceso al mismo. Además, es importante que ambos integrantes del equipo participen activamente en la resolución del ejercicio. Si se detecta que alguno de los miembros no ha realizado commits significativos, podría ser penalizado en la nota. Ambos deben contribuir de manera equitativa al trabajo del proyecto.
Funcionalidades Requeridas:
Definir la clase Artista:

* Atributos: id:, nombre, discoMasVendido, ventasTotales, etc.
Métodos: Constructor que inicialice todos los atributos, getters y setters para cada atributo, toString() Método para imprimir la información del artista.

Definir la clase Disco:

* Atributos: artista,, titulo, ventasTotales, etc.
Métodos: Constructor que inicialice todos los atributos,método para registrar las ventas del disco, método para mostrar los detalles del disco, etc.

* Calcular el artista con más discos vendidos:

* Implementar un método que recorra todos los discos registrados y determine qué artista tiene más unidades vendidas en total.

* Filtrar y mostrar discos con más de x unidades vendidas:

* Usar operaciones de Stream para filtrar los discos que hayan superado las 100,000 unidades vendidas y mostrar los detalles de esos discos.

* Actualizar las estadísticas de ventas de un disco después de cada venta:

* Implementar un método que, después de registrar una venta, actualice las estadísticas de ventas del disco en la clase Disco y también actualice las estadísticas del artista relacionado en la clase Artista.
