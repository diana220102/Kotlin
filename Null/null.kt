fun main() {
    var nombre : String? = null;
    println("Imprimiendo nombre como valo nulo de nombre: ")
    println(nombre);
    nombre = "Ginger";
   // println(nombre?.length);

    // var longitud = nombre?.length ?: 0;
    // println("longitud de tu nombre es: ");
    // println(longitud);

    try{
        println("nombre: $nombre");

    }catch(exception :  NullPointerException){
        println("Ha ocurrido un error");
        println(exception);
    } finally{
        println("Lo que esta en el FINALLY, se ejecta siempre");

    }
    var longitud = 0;
    println("------------------------------------------------------------");
    try {
        var longitud = nombre?.length;
        println("Valor de longitud : $longitud");

    }catch (error : NullPointerException){
        //hubo un error, no se pudo obtener la longitu del nombre
        var longitud = 0;
        println("Valor de logitud: $longitud");
    }finally{
        println("Finally");
    }
    println("Termina prueba try");
}