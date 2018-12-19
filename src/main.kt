fun main(args:Array<String>)
{
    //creando un objeto roy de la clase Persona
    val roy=Persona("Axl Rose",50,"78465446")
    // creando objeto de una ckase anidada
    val niñoroy=Persona.niño()
    println(niñoroy.estatura)
    //marca error porque la clase animal es inner
        //val animalito=Persona.animal()
    //imprimir la propiedad(atributo) de la clase
    println(roy.edad)
    println(roy.nombre)
    //llamar metodo
    roy.cambiarnombre("Roy Andy")
    println(roy.nombre)
    //  Los data class son como los metodos get y set de java --- POJO = Metodos get y set
        //  data class Persona3(var nombre: String,var edad: Int)

}