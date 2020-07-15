package 多态

open class Animal(){
   open fun sleep(){
        println("动物冬眠")
    }
}
class dog():Animal(){
    override fun sleep() {
        println("在家睡觉")
    }
}

fun wheretoSleep(animal: Animal){
    animal.sleep();
}

fun main(){
    var an=Animal()
    var dog=dog()

    wheretoSleep(an)
    wheretoSleep(dog)
}