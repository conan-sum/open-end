package atm.model

class ATM() {
  var currently: Int = 0
  var password: String = ""
  var state: State = new Initial(this)
  val set: String = "1234"

  var Chequing: Int = 0
  var Savings: Int = 0

  def current(): Instruction = {
    this.state.current()
  }

  def numpad(num: Int): Unit = {
    this.state.numpad(num)
  }

  def loggedin(): Boolean = {
    this.state.loggedin()
  }

  def login(): Unit = {
    this.state.login()
  }

  def logout(): Unit = {
    this.state.logout()
  }

  def deposit(): Unit = {
    this.state.deposit()
  }

  def withdraw(): Unit = {
    this.state.withdraw()
  }

  def transfer(): Unit = {
    this.state.transfer()
  }

  def ten(): Unit = {
    this.state.ten()
  }

  def twenty(): Unit = {
    this.state.twenty()
  }

  def fifty(): Unit = {
    this.state.fifty()
  }

  def hundred(): Unit = {
    this.state.hundred()
  }

  def clear(): Unit = {
    this.state.clear()
  }

  def execute(): Unit = {
    this.state.execute()
  }

  def chequing(num: Int): Unit = {
    this.state.chequing(num)
  }

  def savings(num: Int): Unit = {
    this.state.savings(num)
  }
}
