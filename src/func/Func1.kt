package func

class Func1 {
    fun test(){}
}

fun main(){
    Func1().test() //通过创建对象，然后调用成员函数
}

//kotlin中将static关键字去除，直接将函数放在类外，可以根据不同的修饰，调用。
fun staticFunc(){}