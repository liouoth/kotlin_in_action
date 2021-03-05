package func

/**
 * 通过解构进行返回多个结果之类
 */

fun main(){
    val(x,y,z)=func()
    println("x=$x,y=$y,z=$z")
    var listOf = listOf<Any>("12", 1)
    listOf+="123"
    println(listOf.joinToString())
}

fun func():Triple<String,Int,Int>{
    return Triple("123",2,3)
}