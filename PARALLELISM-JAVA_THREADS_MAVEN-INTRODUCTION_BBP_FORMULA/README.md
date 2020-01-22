#**Integrantes:**
	- Diego puerto
	- Cesar Villamil


**Part I - Introduction to Java Threads**

2.
	- 2.4 Cambio los datos de salida. Cuando usamos el metodo start() los numeros salian en desorden en ciertas partes de output pero cuando usamos el metodo
		run() los datos salian en el orden que se crearon los hilos.

		¿Por que?
		Por que en el momento que usamos start() se lleva a cabo del multiprocesmaiento y no se ejecutan los hilos secuencialmente, caso contrarario en
		el momento que se usa el metodo run() se ejecutan los hilos secuencialmente y se evita el multiprocesam