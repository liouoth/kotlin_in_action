package pkg

//import pkg.test_var2 //通过import引入
/**
 * 当一个class文件中，出现两个class就会转变为kt文件
 * 反之当文件中只存在一个class，且与file同名，那么就会转为kotlin class文件
 *
 * kotlin class允许将一些变量、枚举、函数放在class之外
 */
var things:Float = 3.14f

class Test {
}
fun main(){
    println(test_var2) // public 可以直接访问
    println(test_var3) // internal 可以直接访问
}