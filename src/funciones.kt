fun main(args:Array<String>)
{
    fun imprimir()
    {
        println("Lo que sea")
    }
    //  :Unit es como void de Java sirve para que no retornemos nada
    fun saludo(numero1:Int,numero2:Int)
    {
        println(numero1+numero2)
    }
    fun restar(x:Int,z:Int):Int
    {
        return x+z
    }
    fun despedida()
    {
        var dato:String="roy"
        println("hasta luego ".capitalize()+dato.capitalize())
    }
//  otro ejemplo de declarar una funcion
    fun square(c:Int):Int=c*c

    fun ejemplo(vararg palabras:String)
    {
        for (palabra in palabras)
            println(palabra)
    }
/*     funciones tipo genericas que pueden regresar cualquier tipo de valor
          <T> es un ejemplo puede se cualquier numero      */
    fun <T>generica(t:T):Unit
    {
        println(t)
    }

//  llamando funciones
    saludo(12,78)
    imprimir()
    restar(6,2)
    despedida()
    println(square(6))
    ejemplo("Roy","Andy")
    generica("hola")
    generica(12)
    generica(false)

}