fun main(args:Array<String>) {

    //variables
    var edad: Int = 25
    var nombre: String = "Roy"
    var estado: Boolean = false
    var estatura: Double = 1.66
    var numero: Int
    numero = 23
    var numero2: Float
    numero2 = 23.2f
    var numerofloat: Float = 24.23f
    var numero3: Double = edad.toDouble() - numero
    var numero4 = edad + numero
    edad = estatura.toInt()
    numerofloat = numero.toFloat()

    //-------------------------------------------------------------
    //constantes
    val Pi: Double = 3.1416
    val test: Int
    test = 8
    //--------------------------------------------------------------
    //Arreglos
    var colores = arrayOf("azul", "rojo", "verde")
    var numeros = arrayOf(12, 24, 36, 48)

    if (estado) {
        println(edad)
    } else {
        println("No estoy casado porque tengo " + edad + " años " + Pi)
        println(colores[0])
        println(numero3)
        println(numero4)
    }
    if (test < 200)
        println("es menor")
    else
        println("es mayor")





}