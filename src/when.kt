fun main(args:Array<String>)
{
    var nombrecompleto:Boolean
    nombrecompleto=true

    when(nombrecompleto)
    {
        true->{
            println("Es vedadero")
        }
        false-> {
            println("Es falso")
        }
    }

    var numero5:Int
    numero5=25

    when(numero5)
    {
        in 1..10->{
            println("Es de rango 1")
        }
        in 11..20->{
            println("Es de rango 2")
        }
        in 21..30->{
            println("Es de rango 3")
        }
        else->{
            println("Sin rango")
        }
    }
    var test:Int
    test=1

    when (test) {
        1 -> {
            println("1")
        }
        is Int -> {
            println("es entero")
        }
        7, 8, 9 -> {
            println("valores 3")
        }
        else -> {
            println("no se encontró el valor")
        }
    }
}