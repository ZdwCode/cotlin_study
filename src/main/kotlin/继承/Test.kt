package 继承

fun main(){
    var father=Father("爸爸",20)
    father.show()
}
open class Animal(var name:String="动物"){
    open fun show (){
        println("Animal say:'I am $name'")
    }
}

open class Father(name:String,var age:Int):Animal(name){
    init {
        this.name=name
    }
    override fun show(){
        super.show()
        println("Father say :' i am $name',my age is $age")
    }
}

class Child(name:String,age: Int ):Father(name,age){

}