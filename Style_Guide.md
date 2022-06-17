**Índice**

# Nombramiento de elementos: Métodos, clases, variables, etc.

Deben ser elegidos de tal manera que el solo nombre describa el uso que se dará dentro del programa.

Buenos nombramientos:

```java
String nameUser = "Juan";
int ageUser = 30;
boolean isMarried = false;
```

Malo nombramientos:

```java
String n = "Juan";
int a = 30;
boolean m = false;
```

Además de eso es recomendable que se escriban:

- Empezando con mayúscula si se trata del nombre de una clase o interfaz, y empezando cada palabra con mayúscula. O en otras palabras, usar `PascalCase.`

```java
public class HelloWorld {
    // ...
}

public interface NombreDescriptivo {
    // ...
}
```

- Sólo con mayúsculas si es el nombre de una constante. DIAS_HABILES

```java
final String  DIAS_HABILES = "Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo";
final int DIAS_HABILES_INT = 7;
final boolean DIAS_HABILES_BOOLEAN = true;
```

- Para nombrar variables se recomienda usar camelCase o snake_case.

```java
// camelCase
String nombreUsuario = "Juan";
int edadUsuario = 30;
boolean esCasado = false;

// snake_case
String nombre_usuario = "Juan";
int edad_usuario = 30;
boolean es_casado = false;
```

- Para nombrar métodos se recomienda usar camelCase o snake_case con verbos en infinitivo.

```java
public static void saludarUsuario() {
    System.out.println("Hola mundo!");
}

public static void saludarEsposa(String nombreEsposa) {
    System.out.println("Hola " + nombreEsposa + "!");
}
```

# Consejos generales

- Las clases deben tener un comentario muy bien escrito, el cual describe la finalidad de la clase
- Si se llega a utilizar varias clases, es mejor separarlas en packages.
- Al momento de escribir un método, se debe escribir un comentario que describe el método.
- Se debe dar un `enter` entre bloques de código: Al finalizar una sentencia `if, while, etc.`

# Consejos más específicos

- Si un método recibe muchos parámetros, se debe pensar en separar ese método, en varios más pequeños.
- Si se observa mucha repetición de código, se debe pensar en separar ese código en métodos y reducir la complejidad al leer.

> Hay que recordar que escribimos código para que otras personas puedan leerlo. Vale más tener más líneas de código con una esctructura legible, que tener todo unido. Se debe evitar a toda costa caer al `código spaghetti`.
