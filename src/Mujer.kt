class Mujer:Persona{
    //sobrescribir variables con override tambien
    override var edad:Int=10
    /*  El constructor declara estas propiedades y con super le indica que va a heredar de la clase Persona
    como no esta definido las propiedades le indica que va heredar de la clase persona
    mismas variables que esta en el constructor */
    constructor(nombre:String,edad:Int,telf:String):super(nombre, edad, telf)

    // override nos indica que va a sobrescribir un metodo
    override fun despedida()
    {
        println("Bye")
    }
}

fun main(args:Array<String>)
{
    val ana=Mujer("ana",30,"978456465")
    ana.despedida()

    val bety=Persona("bety",19,"978456123")
    bety.despedida()
}