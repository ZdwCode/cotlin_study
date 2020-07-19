package 扩展

/**
 * Extension 扩展
 * 在已有类上添加属性和方法
 * 1.继承
 * 2.装饰模式  ：在B类中实例化A类的对象
 * 3.扩展：
 *      实际上并没有加到当前类
 *      加入的方法可以访问类内部的属性
 *      如果加入的方法与类内部的方法同名则类内部方法优先级高
 *      扩展的属性没有baking field 所以扩展属性不能存值也不能初始化 必须为扩展属性显示声明get or set方法
 *
 */
open class A{

}
//继承
class B: A() {

}
//修饰
class B1{ //装饰
    var a=A()

}
//扩展
class Student(var name:String){
    fun work(){
        println("study is work")
    }
    companion object{

    }
}
fun Student.eat(){
    println("${name}吃饭")
}
fun Student.work(){
    println("fork work")


}


//扩展属性
var Student.grade:Int
    get() {
        println("grade'get() method")
        return 0
    }
    set(value) {
        println("grade'set() method")
    }

fun Student.Companion.show(){
    println("hello 111")
}
fun main(){
    var xw=Student("小王")
    xw.eat()
    Student("小红").eat()
    Student.show()

}