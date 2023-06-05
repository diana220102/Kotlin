//Trabajando mapas
fun main() {
    //Mapa Inmutable
    val ladas : Map<Int, String> = mapOf(1 to "USA", 34 to "España", 52 to "Mexico", 233 to "Ghana");
    
    //imprimendo el conjunto clave-valor
    println(ladas);
   
    //imprimiendo un conjunto usando un for
    for((key, value) in ladas){
      println("la lada de $value es $key");
    }
    //imprimiendo el mapa usando lamda 
    ladas.forEach{(k,v) -> println("$k -> $v")}
    
    //recupera un solo elemento del mapa
    println(ladas.get(52));
    println(ladas[52]);

    //recuperar su tamaño, cuantos pares hay en el elemento
    println("Tamaño: ${ladas.size}");
    //recuperar solo las claves
    println("Claves del mapa: ${ladas.keys}");
    //recuperar solamente los valores 
    println("valores del mapa: ${ladas.values}");
    //recuperar las entradas
    println("Entradas del mapa: ${ladas.entries}");
    //recuperar un valor si existe, sino, envia el default
    println("Valor de la lada 48: ${ladas.getOrDefault(48, "pais desconocido")}");
    //Comprobar si el mapa esta vacio
    println("Mapa vacio: ${ladas.isEmpty()}");
    //comprobar si existe una clave en el mapa
    println("Existe la clave lada 86: ${86 in ladas}");
    //comprobar si existe un valor en el mapa
    println("Existe el valor Mexico en el mapa:${ "Mexico" in ladas.values}");
    
    // Mapa mutable
    var nums = mutableMapOf("one" to 1, "two" to 2, "tree" to 3, "for" to 4);
    println("Mapa de numeros: $nums");
    //eliminar valores del mapa
    nums.remove("two");
    println("Mapa nuevo de numeros: $nums");
    nums["six"] = 6;
    println("Mapa nuevo de numeros: $nums");

    var sortedNums = nums.toSortedMap();
    println("Mapa ordenado: $sortedNums");

    //reto
    //crear un diccionario español ingles usanod un mapa 
    //1.-Funcion para  crear o cargar el diccionario
    // 2.-función para consulta, reciba una palabra en español
    // y regrese su traduccion, si no existe traduccion, un valor por default 
    //


}