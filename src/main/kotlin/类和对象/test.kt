package 类和对象

fun main(){

    //val p=Person()
    //var t=Test();
    //var t1=Test("jack")
   // var t2=Test("jacl",20)

    var car=car("奥迪",20)
    car.show()
}
class Person(){
    init {
        println("init 被调用")
    }
}
class Test(){
    var name: String? =null
    var age:Int?=null

    constructor(name:String):this(){
        this.name=name;
        println("name is $name")
    }

    constructor(name:String,age:Int):this(){
        println("name is $name,age is $age")
    }
}

class car(brand:String){
    var brand :String ?=null
    init {
        this.brand=brand;
        println("brand is $brand")
    }

    constructor(brand :String,No:Int):this(brand){

    }
    fun show(){
        println("brean is $brand from function of show()")
    }

}