# **Integrantes:**
- Diego puerto
- Cesar Villamil


#### **Part I - Introduction to Java Threads**
**2.4** Cambiaron los datos de salida. Cuando usamos el metodo start(), los números salian en desorden en ciertas partes de output, pero cuando usamos el metodo run(), los datos salían en el orden que se crearon los hilos.

Start():

![](/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/img/conStart.jpg)

Run():

![](/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/img/conRun.jpg)

¿Por qué?
Porque en el momento que usamos start() se lleva a cabo el multiprocesmaiento y no se ejecutan los hilos secuencialmente, caso contrarario, en el momento que se usa el método run(), se ejecutan los hilos secuencialmente y se evita el multiprocesamiento
#### **Part II - BBP Formula Exercise**
3. JUnit test usando uno, dos y tres hilos:

![](/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/img/TresHilos.jpg)

#### **Part III - Performance Evaluation**

Se realizaron las pruebas con 50.000 dígitos 

1. Un hilo:

![](/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/img/1.jpg)

2. Tantos hilos como nucleos(4):

![](/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/img/2.jpg)

3.  Doble de hilos que núcleos(8):

![](/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/img/3.jpg)

4. 200 hilos:

![](/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/img/4.jpg)

5. 500: hilos: (La aplicación JvisualVM no responde en este caso, el test termina antes de que abra las estadisticas)

![](/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/img/5.jpg)


