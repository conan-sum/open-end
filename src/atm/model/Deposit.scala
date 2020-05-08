package atm.model

class Deposit(atm: ATM) extends State(atm){
  var action: Int = 2
  var amount: Int = 0

  var State: Int = 2

  override def current(): Instruction = {
    new Instruction(State,amount.toString,atm.Chequing,atm.Savings)
  }

  override def loggedin(): Boolean = {
    true
  }

  override def numpad(num: Int): Unit = {
    if(State == 3) {
      val value: String = amount.toString
      if (value.length < 5) {
        amount = (value + num.toString).toInt
      }
    }
  }

  override def login(): Unit = {

  }

  override def logout(): Unit = {

  }

  override def deposit(): Unit = {

  }

  override def withdraw(): Unit = {
    if(State == 2) {atm.state = new Withdraw(atm)}
  }

  override def transfer(): Unit = {
    if(State == 2) {atm.state = new Transfer(atm)}
  }

  override def ten(): Unit = {
    if(State == 3){amount = 100}
  }

  override def twenty(): Unit = {
    if(State == 3){amount = 200}
  }

  override def fifty(): Unit = {
    if(State == 3){amount = 500}
  }

  override def hundred(): Unit = {
    if(State == 3){amount = 1000}
  }

  override def clear(): Unit = {
    atm.state = new LoggedIn(atm)
  }

  override def execute(): Unit = {
    if(State == 3) {
      if (action == 0) {
        atm.Chequing += amount
        atm.state = new LoggedIn(atm)
      }

      else if (action == 1) {
        atm.Savings += amount
        atm.state = new LoggedIn(atm)
      }

    }
  }

  override def chequing(num: Int): Unit = {
    if(State == 2) {
      action = 0
      State = 3
    }
  }

  override def savings(num: Int): Unit = {
    if(State == 2) {
      action = 1
      State = 3
    }
  }
}
