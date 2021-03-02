package pkg

import kotlin.Int as alias_int

/**
 * 测试可见性
 */
private var test_var1: alias_int = 1;
public var test_var2: alias_int = 1;
internal var test_var3: alias_int = 1;

class Test2{
    class Test2 private constructor(name : String){
        var name = name
    }
}

fun main(){
    println(test_var1)
}