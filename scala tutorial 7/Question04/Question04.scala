object question04 extends App{

    case class Account(accno:String,balance:Double) {
        var AccountNo = accno
        var Balance = balance

        override def toString(): String = s"Account No:${this.AccountNo}  Balance:${this.Balance}"
    }

    case class Bank() {
        var accounts:List[Account] = List();

        def addOneAccount(acc:Account):Unit = {
            this.accounts = this.accounts :+ acc
        }

        def addAccounts(accs:List[Account]):Unit = {
            accs.foreach(addOneAccount(_))
        }

        def printBank() = this.accounts.foreach(println(_))

        def listNegative() = this.accounts.filter(_.Balance < 0).foreach(println(_))

        def calculateSum() = this.accounts.reduce( (x,y) => Account("",x.balance + y.balance))

        def calculateInterest(x:Account) = if x.balance<0 then x.balance*.1 else x.balance*.05

        def finalBalances() = this.accounts = this.accounts.map((x) => (Account(x.accno,x.balance + calculateInterest(x))))
    }

    var testBank = Bank()

    testBank.addAccounts(List(Account("1021-01",7500),Account("1021-02",-204)))

    //testBank.printBank()
    println("Negative balance accounts: ")
    testBank.listNegative()

    println("\nSum of all balances:")
    println(testBank.calculateSum().balance)

    println("\nFinal balances: ")
    testBank.finalBalances()
    testBank.printBank()

}
