package pkg

fun main(){

}

//kotlin中类默认是final的，所以要让类可继承，必须使用open
open class Dad(){
    private val a = 1
    protected val b = 1
    internal open val c = 1
    open val d = 1 //默认是public的
}

class Son : Dad() {
    override val c = 20 //对于父类中的变量
//    override val c = 20
//    override val a = 10 a 是private的不可见
//    override val b = 10 protect 可见但是也需要变成open
    override val d = 2
}