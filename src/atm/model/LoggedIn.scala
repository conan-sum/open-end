package atm.model

class LoggedIn(atm: ATM) extends State(atm){


  override def current(): Instruction = {
    new Instruction(1,"",atm.Chequing,atm.Savings)
  }

  override def loggedin(): Boolean = {
    true
  }

  override def numpad(num: Int): Unit = {

  }

  override def login(): Unit = {

  }

  override def logout(): Unit = {
    atm.state = new Initial(atm)
  }

  override def deposit(): Unit = {
    atm.state = new Deposit(atm)
  }

  override def withdraw(): Unit = {
    atm.state = new Withdraw(atm)
  }

  override def transfer(): Unit = {
    atm.state = new Transfer(atm)
  }

  override def ten(): Unit = {

  }

  override def twenty(): Unit = {

  }

  override def fifty(): Unit = {

  }

  override def hundred(): Unit = {

  }

  override def clear(): Unit = {

  }

  override def execute(): Unit = {

  }

  override def chequing(num: Int): Unit = {

  }

  override def savings(num: Int): Unit = {

  }
}
