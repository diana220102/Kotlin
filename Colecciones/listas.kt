fun main(){
    //lista inmutable
    val readOnly : List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");

    println(readOnly);

    println("Longitud de la lista: ${readOnly.size}");

    println("Elemento en la lista numero 3: ${readOnly.get(3)}");

    println("primero elemento de la lista: ${readOnly.first()}");
    println("primero elemento de la lista: ${readOnly.last()}");

    //mostrar los elementos de la lista usando estructura for
    println("Elemento readOnly")
    println("---------------------")
    for (elemento in readOnly){
        println(elemento);
        println("*************");
    }

    //mostrar los elementos de la lista usando el metodo for Each
    println("Elementos de readOnly usando forEach:");
    readOnly.forEach{
        println(it)
    }

    //lista Mutable
    var mutableList : MutableList<String> = mutableListOf("Lunes", "Martes");
    println("lista de mutable: $mutableList");
    mutableList.add("Miercoles");
    println("Lista mutable: $mutableList");
    

    //Trabajando con las listas mutables vacías 
    var emptyList : MutableList<String> = mutableListOf();
    println("¿La lista esta vacias?: ${emptyList.none()}");
    println("Primer elemento de emptyList: ${emptyList.firstOrNull()}");
    println("Primer elemento de emptyList: ${emptyList.lastOrNull()}");
    println("elemento en la posiscion 2 de emptyList: ${emptyList.elementAtOrNull(2)}");

    //agregando elementos a emptyList

    readOnly.forEach{
        emptyList.add(it);
    }
    println("la lista que estaba vacia: $emptyList");

    //Ordena una lista 

    val numerosDeLoteria = listOf(11, 2, 44, 33, 45, 55, 66, 58, 60);
    println("Numero de loteria: $numerosDeLoteria");
    val numerosOrdenados = numerosDeLoteria.sorted();
    println("Numeros de loteria Ordenados: $numerosOrdenados");

    val numeroDesendiente = numerosDeLoteria.sortedDescending();
    println("Numeros de loteria Ordenados: $numeroDesendiente");
    val numerosPares = numerosDeLoteria.filter{num -> num % 2==0};
    println("Numeros pares: $numerosPares");
}