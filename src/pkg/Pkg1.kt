package pkg

/**
 * 导入冲突：
 * 在java中，由于ide有很高的自动化，所以当存在不同包下面同名的函数之类的，会进行自动校验
 * kotlin中可以通过import
 * 并用as解决冲突的问题
 * import不仅仅用于类的导入，也可以是方法、属性、枚举常量
 */
import pkg.Int
//import basic.Cat as Int 使用as去除冲突，这里的话使用as制造的冲突
import basic.fun_when2 as like //引入了一个函数
fun main(){
    like(1);
}

//默认会引入kotlin.* ，当冲突时，将和java一样使用权限定名来解决
fun test(age:kotlin.Int){}
