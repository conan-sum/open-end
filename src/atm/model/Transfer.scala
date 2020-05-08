package atm.model

class Transfer(atm: ATM) extends State(atm){
  var action: Int = 2
  var amount: Int = 0

  var State = 4

  override def current(): Instruction = {
    new Instruction(State,amount.toString,atm.Chequing,atm.Savings)
  }

  override def loggedin(): Boolean = {
    true
  }

  override def numpad(num: Int): Unit = {
    if(State == 5) {
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
    if(State == 4) {
      atm.state = new Deposit(atm)
    }
  }

  override def withdraw(): Unit = {
    if(State == 4) {
      atm.state = new Withdraw(atm)
    }
  }

  override def transfer(): Unit = {

  }

  override def ten(): Unit = {
    if(State == 5){amount = 100}
  }

  override def twenty(): Unit = {
    if(State == 5){amount = 200}
  }

  override def fifty(): Unit = {
    if(State == 5){amount = 500}
  }

  override def hundred(): Unit = {
    if(State == 5){amount = 1000}
  }

  override def clear(): Unit = {
    atm.state = new LoggedIn(atm)
  }

  override def execute(): Unit = {
    if(State == 5) {
      if (action == 0) {
        if (amount <= atm.Chequing) {
          atm.Chequing -= amount
          atm.Savings += amount
          atm.state = new LoggedIn(atm)
        }
        else {
          State = 8
        }
      }
      else if (action == 1) {
        if (amount <= atm.Savings) {
          atm.Chequing += amount
          atm.Savings -= amount
          atm.state = new LoggedIn(atm)
        }
        else {
          State = 8
        }
      }
    }
  }

  override def chequing(num: Int): Unit = {
    if(State == 4) {
      action = 0
      State = 5
    }
  }

  override def savings(num: Int): Unit = {
    if (State == 4) {
      action = 1
      State = 5
    }
  }
}
