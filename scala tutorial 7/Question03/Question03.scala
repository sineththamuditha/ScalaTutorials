object question03 extends App{

    case class Account(id:String,accno:String,balance:Double) {
        var NIC = id
        var AccountNo = accno
        var Balance = balance

        def withdraw(amnt:Double) = this.Balance = this.Balance - amnt
        def deposite(amnt:Double) = this.Balance = this.Balance + amnt
        def transfer(that:Account, amnt:Double) = {this.withdraw(amnt); that.deposite(amnt);}

        override def toString(): String = s"ID:${this.NIC}  Account No:${this.AccountNo}  Balance:${this.Balance}"
    }

    val acc01 = Account("001","A:0908-9001",50065.7)
    val acc02 = Account("002","A:0908-9002",10257.2)

    println("Before transfer")
    println(acc01)
    println(acc02)

    acc01.transfer(acc02, 2067);

    println("After transfer")
    println(acc01)
    println(acc02)

}
