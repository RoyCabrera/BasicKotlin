fun main(args:Array<String>)
{
    var lista= listOf("Roy","Paul","Steve","José")
    for (item in lista)
    {
        println(item)
    }
    for (x in 1..10)
        println(x)

    for (z in 4..10 step 2)
        println(z)

    for (c in 10 downTo 1 step 3)
        println(c)
    //########################################
    var numero:Int=1

    while (numero<10)
    {
        println(numero)
        numero++
    }
    do {
        println("Es igual a 10")
        numero++
    } while (numero==10)



}