package atm.model

class Initial(atm: ATM) extends State(atm){
  var str: String = atm.password
  var State: Int = -1

  override def current(): Instruction = {
    new Instruction(State, str,atm.Chequing,atm.Savings)
  }

  override def loggedin(): Boolean = {
    false
  }

  override def numpad(num: Int): Unit = {
    val str1: String = num.toString()
    str = str + str1
  }

  override def login(): Unit = {
    if(str == atm.set){
      atm.state = new LoggedIn(atm)
    }
    else{
      State = 0
      str = ""
    }
  }

  override def logout(): Unit = {

  }

  override def deposit(): Unit = {

  }

  override def withdraw(): Unit = {

  }

  override def transfer(): Unit = {

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
    str = ""
  }

  override def execute(): Unit = {

  }

  override def chequing(num: Int): Unit = {

  }

  override def savings(num: Int): Unit = {

  }
}
