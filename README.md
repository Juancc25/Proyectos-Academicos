# Combinación Lineal

Este programa calcula la combinación linela de varios números expresados inicialmente mediante du MCD, hallado por el método de Euclides.

Este programa tiene su base del algoritmo de Euclides, el cual permite que pueda ser calculado el máximo común divisor de dos o más números. 
Una gran ventaja que acompaña el uso del algoritmo de Euclides reside en su uso un poco completo, en su uso al representar el resultado en 
forma de combinación lineal. La combinación lineal resultante no tiene limitaciones respecto a los números que sean utilizados.

El programa esta diseñado de forma sencilla, minimalista y limpia, con el fin de crear en el usuario comodidad a la hora de su uso. El programa
consta de componentes intuitivos que guían al usuario a su correcto y debido uso. En la interfaz principal están expuestas tres cuadros de textos 
en donde se mostrarán los procedimientos y resultados.

En el primer cuadro que aparece en la interfaz el usuario deberá ingresar solo números naturales, los cuales serán utilizados para el correcto 
desarrollo del programa. Además, es preciso aclarar que existe funciones que se encargan de comprobar que los datos ingresados cumplan las condiciones.  

A continuación, después de haber ingresado la cantidad de números que le programa va a procesar, el usuario deberá ingresar los números del proceso 
separados por ‘,’, tal como lo índica el programa. En el caso en el que la condición no se cumpla, el programa anunciará el respectivo error.

En el primer caso se muestra el error ya que “z” no es considerado como un número, y el segundo se genera por que hace falta un número.
Ahora bien, se hace una breve explicación de cómo funciona el programa. Este realiza las operaciones por separado, tomando los números ingresados y 
ordenándolos para su correcta ejecución. Luego con ayuda del algoritmo de Euclides calcula el Máximo Común Divisor entre pares de números, este resultado 
lo compara con el siguiente número y así sucesivamente hasta evaluarlos todos.

En el primer cuadrante, se mostrará el proceso de cálculo del M.C.D y en el cuadrante dos el proceso de despeje, en ambos cuadrantes con los números 
ordenados de mayor a menor. En el último cuadrante (El de la parte de abajo) es donde se expresarán los números como combinación lineal. 
Primero mostrando los dos números ingresados por el usuario de primeras (En este caso no se ordenan de mayor a menor ya que esto genera 0ros innecesarios 
en la combinación lineal), luego su resultado con el tercero si lo hay y así sucesivamente, despejando y mostrando todo el procedimiento que se realizó 
para hallarlo. Si el procedimiento es muy largo se habilita una barra para bajar o subir en el texto de cada cuadro.

Se recuerda que no hay problema con la cantidad de números, y es capaz de soporta números grandes. No hay que preocuparse por el orden de los números. 
Lo único a lo que hay que poner atención es que se pongan la cantidad correcta de números que se escogen en el primer cuadro para poner texto, pues de 
lo contrario el programa no iniciara su proceso.

Por último, el resultado del M.C.D de los números se mostrará en el mismo espacio donde se mostraban los errores anteriormente. Pero esta vez en color azul, 
para una mejor distinción. El programa viene con un ejemplo predeterminado con los 4 números 168,280,252,917. Solo se tiene que oprimir calcular para ver 
su solución y procedimiento. Luego de darle a calcular el resultado es el siguiente.

Toca tener claro cómo se calcula el Máximo Común Divisor y como se halla la combinación lineal.
Primero que todo el MCD se halla mediante el algoritmo de Euclides, por lo que se tiene que ordenar la lista de números ingresados por el usuario de mayor 
a menor y a continuación con el primer par ir calculando el MCD y cuyo resultado se compara con el siguiente número hasta evaluarlos todos, este proceso a 
su vez se muestra en los cuadrantes uno y dos con su cálculo y despeje que servirán para hallar su combinación lineal.
 
Para la combinación lineal se debe evadir ordenar los números, pues si se hace de mayor a menor se generan ceros en la combinación lineal. El proceso puede 
generar para la combinación lineal números multiplicado por 0, esto se debe a que en el proceso de cálculo el coeficiente se iguala a 0. Esto no quiere decir 
que el algoritmo este mal.
