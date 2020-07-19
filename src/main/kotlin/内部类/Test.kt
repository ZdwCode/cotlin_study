package 内部类

class Bank{

    var money:Money=Money(0)
    class Money(var card:Int){//如果不加inner修饰符 则为嵌套类，嵌套类不能访问宿主的方法

    }

    inner class Crad(){
        fun save(count:Int){
            money.card+=count
            print("存款成功，余额为${money.card}")
        }

        fun withdraw(count:Int){
            if(money.card>count){
                money.card-=count
                print("取款成功，余额为${money.card}")
            }else{
                print("余额不足")
            }
        }
    }
}

fun main(){
   Bank().Crad().save(200)
    var bank:Bank= Bank()
    bank.Crad().withdraw(30)
}