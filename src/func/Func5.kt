package func

/**
 * 根据作用域，函数可以分为：成员函数、扩展函数、局部函数
 */
class Func5 {
    fun func(){} //成员函数在类中
}
//扩展函数，可以脱离类存在
var a = 10
fun ext_func(){
    var b = 10
    //局部函数存在于函数内
    fun inner_func(){
        println("$a,$b") //可以直接访问到外部的数据，这样就能够构成一个闭包的形式
    }
    inner_func()
}

//泛型函数
fun <T> generic_func(t:T):T{return t}









