/* 
1FN Primera forma normal: Atributos atómicos (Sin campos repetidos). 
Esto quiere decir que ningún campo puede tener el mismo tipo de valor
 como varios campos materia (materia1, materia2,…).

2FN Segunda forma normal: Cumplir con 1FN y Cada campo de la tabla debe 
depender de una clave única. Es decir en las tablas no se puede repetir
los campos primarios ya que los mismos son únicos por tanto si existe 
una relación uno a muchos se debe crear una tabla aparte donde cohabitaran
la llave primaria de la primera tabla y la llave primaria de la segunda
tabla de esta forma logramos relacionar de manera efectiva dos tablas 
respetando las llaves primarias.

3FN Tercera forma normal: Cumple 1FN y 2FN y los campos que NO son clave
NO deben tener dependencias. Esto nos indica que todos los campos de la
tabla deben estar estrechamente relacionados con el campo primario y no
serlo de manera transitiva, por ejemplo, en una tabla torneos tenemos
el código del torneo el nombre el ganador y la fecha de nacimiento del
ganador, como observamos no podemos tener la fecha de nacimiento del 
ganador en dicha tabla ya que no está relacionada para nada con el 
torneo y además existe la posibilidad que en varios registros el mismo
ganador tenga diferentes fechas de nacimiento por lo cual no mantendría
la consistencia de los datos.

4FN Cuarta forma normal: Cumplir 1FN 2FN y 3FN. Los campos multivaluados se identifican por una clave única. Cuando relacionamos dos tablas totalmente independientes cada una de la otra debemos relacionarlas a través de una tabla aparte de las mismas donde solo colocaremos las llaves primarias de cada tabla ya que colocar cualquier otra información relacionada con las tablas implicaría repetir datos, además de hacer la tarea de actualización de registros primarias más compleja, ya que por ejemplo si deseo actualizar el nombre del curso no solo lo tendría que hacer en la tabla cursos sino también en cada tabla donde coloque el nombre lo cual no garantiza la integridad de la información, adiciona información innecesaria en los registros y hace más complejo el trabajo de administrar los datos.Normalización: 

*/