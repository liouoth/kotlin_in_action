package func

class Func4 {
    infix fun add(s:String):String{
        return "hello world"
    }

    fun a(){
        println(this add "leo") //成员函数之间调用时需要使用this
    }
}

fun main(){
    //中缀函数调用
    println(1 infix_func 2)
    1.infix_func(2)
    //那么包装类对象存在这个成员方法吗？我不知道怎么创建Int对象
    //逻辑操作优先级，低于算数运算符，但是高于逻辑操作符 || && 等等
    1.infix_func(2) + 2*8
}

//相当于一个装饰器类直接包装一层，比如这里给Int直接加了个函数，这其实叫扩展函数
/**
 * 中缀函数是指使用中缀这种方式去调用函数的函数
 * 然后要使用中缀这种方式，需要满足以下规范：
 * 首先 必须只有一个参数，空着多个都不行
 * 不能接受可变数量参数、不能有默认值
 */
infix fun Int.infix_func(x:Int):Int{
    return 1
}




