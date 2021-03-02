package pkg;

public class PkgMd {
    /**
     * kt文件与class文件区别
     * {@link Test}
     *
     * 包相关
     * 概述：和大多数语言一样kotlin也遵循包管理，存在权限定名进行定位类、方法等
     * 默认的导入：kotlin.*
     * 还会根据平台导入java.lang.* 、kotlin.jvm.* 这样是不是在kotlin中可以直接调用java代码
     *
     * {@link Pkg1Kt}
     * 包冲突解决，import、as的使用
     *
     *
     * {@link Test}
     * {@link Test2}
     * kotlin中可见性修饰符：public、private、internal、protected，默认为public
     * internal 一般用于模块，同一个模块可见
     *
     * {@link Pkg2Kt}
     * 使用继承来解释open以及继承
     *
     * 在kotlin中存在局部的函数、局部的变量、局部类但是没有可见行修饰符修饰
     */
}
