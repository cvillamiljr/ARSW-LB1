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

Gráfica Tiempo VS Hilos:

![](/PARALLELISM-JAVA_THREADS_MAVEN-INTRODUCTION_BBP_FORMULA/img/grafica.jpg)

- Un hilo: 84 Segundos
- Tantos hilos como nucleos(4): 40 Segundos
- Doble de hilos que núcleos(8): 23 Segundos
- 200 hilos: 14 Segundos
- 500 hilos: 14 Segundos

Preguntas:

1. According to Amdahls law, where S (n) is the theoretical performance improvement, P the parallel fraction of the algorithm, and n the number of threads, the greater n, the greater the improvement should be. Why is the best performance not achieved with the 500 threads? How does this performance compare when 200 are used?. 

    No se logra el mejor rendiiento con 500 hilos porque la capacidad de procesamiento del computador es de 4 nucleos, es decir, se tienen muchos hilos los cuales no pueden ser atendidos todos al mismo tiempo, como sería deseado. A pesar de no poder ver el rendimiento exacto debido al problema de JvisualVM, se calculó un tiempo aproximado y tanto 200 como 500 hilos dieron 14 segundos, debido a que en este punto, ya se estaba usando al máximo la capacidad del computador. 
    
2. How does the solution behave using as many processing threads as cores compared to the result of using twice as much?

    Usando el doble de hilos que núcleos, de mejora el tiempo casi a la mitad

3. According to the above, if for this problem instead of 500 threads on a single CPU, 1 wire could be used on each of 500 hypothetical machines, would Amdahls's law be better applied? If, instead, c threads were used in 500 / c distributed machines (where c is the number of cores of said machines), would it be improved? Explain your answer.

    Si se usaram 500 hilos, cada uno en una máquina diferente, el tiempo de ejecución no mejoraría debido a que de acuerdo con la ley de Amdahls, se estarian usando núcleos con baja freciencia y esto se traduce en bajo rendimiento. En el otro caso, se estaría aprovechando al máximo cada nucleo de todos los computadores, ya que se tiene una alta frecuencia en cada uno de ellos.
