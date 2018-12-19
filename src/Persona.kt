open class Persona constructor(nombre: String, edad:Int,telf:String) // El constructor se declara como si fuera un extends
{
    public var x:Int=1
    internal var y:Int=2
    protected var m:Int=3
    private var z:Int=4

    var nombre:String=""
    open var edad:Int=21
    var telf:String="978205518"
    // para valores nullos tenemos que poner el simbolo "?"
    var nombre2:String?=null
    var edad2:Int?=null
    // Inizialización Perezosa se usa para no declarar el valor y no ocupar esapacio en memoria, solo funciona  val
    val edad3:Int by lazy { 9 }
    // Inicialización Tardía
    lateinit var nombre3:MiClase
    class MiClase{

    }
    // init nos permite igualar los valores al constructor es el estado inicial del objeto
    init {
        this.nombre=nombre
        this.edad=edad
    }
 /*   constructor()
    {
        this.nombre="FFFF"
        this.edad=123123
    }
 */
    fun saludar(nombre:String)
    {
        println("Hola como etas "+nombre)
    }
    // open nos permite dar permiso de sobrescribir metodos tambien se puede usar en clases para la herencia
    open fun despedida()
    {
        println("Adios")
    }
    fun cambiarnombre(nNombre:String)
    {
        this.nombre=nNombre
    }
    class niño
    {
        var estatura:Double=1.40
        var apellido:String=""

        fun sumar(a:Int,b:Int)
        {
            println(a+b)
        }
    }
    inner class animal
    {
        var peso:Float=70.23f

        fun atacar()
        {
            println("Ataquar !!!")
        }
    }

}
