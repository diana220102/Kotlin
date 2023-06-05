//usando finciones que regresan valores
//y funciones que no regresan valores 

fun main() {
    
    val numero1 = 12;
    val numero2 = 15;
    borde("=", 20);
    var resultado = suma(numero1, numero2);
    println(resultado);
    borde("*", 35);
}

fun borde(caracter : String, veces : Int){
    for (i in 1..veces) {
        print(caracter);
    }
    println();

}


fun suma(n1:Int,n2:Int):Int{
    return n1 + n2;
}
//ejemplo 1 de funcion anonima
val slogan = {r : Int -> println("Tu puedes con $r problemas y mas") };
//invocar funcion anonima - forma 1
slogan(resultado);
val resta = {n1 : Int, n2 : Int -> n1 - n2 };
println("Resta: ${resta(12,8)}");

val max = {n1:Int, n2}