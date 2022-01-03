# Crehana - Testing unitario en Java - Operaciones

Este repositorio contiene todo el código relacionado a las clases teórico-practicas del curso.

## Tabla de contenido

Estos son los topicos más importantes que aparecen en este archivo:
- [Consideraciones](#Consideraciones)  

## Requisitos

Para poder utilizar el código de este proyecto deberás tener las siguientes herramientas instaladas:
- [Java 11](https://www.oracle.com/ar/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)
- **IDE**:
  - [IntelliJ](https://www.jetbrains.com/es-es/idea/download/) - **Recomendado**
  - [Eclipse](https://www.eclipse.org/downloads/)
  
## Consideraciones

Algunas consideraciones que van a hacer que los estudiantes logren un mejor resultado:
- Las librerías de testing que se vayan a agregar se deben considerar agregarlas en el **pom.xml** con **<scope>test</scope>** esto hace que las mismas solo se agreguen en la etapa de testing. Si por alguna razón se genera el jar de la aplicación la misma no contendrá las librerías de testing, ya que no son necesarias para que la aplicación funcione.a aplicación la misma no contendrá las librerías de testing, ya que no son necesarias para que la aplicación funcione.
- Para buscar cual es la ultima version de las librerías se recomienda usar [mvnrepository](https://mvnrepository.com/)