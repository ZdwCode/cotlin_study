package 单例

/**
 * 1 饿汉式
 *      直接创建
 * 2 懒汉式
 *      需要时才创建
 */
//饿汉式
class Person private constructor(){
    companion object{
        val instance=Person()
    }
}
//懒汉式
class Sqlite private constructor(){
    companion object{
        var default:Sqlite?=null
        fun getdefault():Sqlite{
            if(default==null){
                synchronized(this){
                        default=Sqlite()
                }
            }
            return default!!
        }
    }
}
//cotlin 里的懒汉式
class Sqlite2 private constructor(){
    companion object{
        val default:Sqlite2 by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            Sqlite2()
        }
    }
    fun show (){
        println("hello world")
    }
}
fun main(){
    Person.instance
    var sqlite:Sqlite=Sqlite.getdefault()
    Sqlite2.default.show()
}