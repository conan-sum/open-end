package atm.model

abstract class State(atm: ATM) {
  def current(): Instruction

  def loggedin(): Boolean

  def numpad(num: Int)

  def login(): Unit

  def logout(): Unit

  def deposit(): Unit

  def withdraw(): Unit

  def transfer(): Unit

  def ten(): Unit

  def twenty(): Unit

  def fifty(): Unit

  def hundred(): Unit

  def clear(): Unit

  def execute(): Unit

  def chequing(act: Int): Unit

  def savings(act: Int): Unit
}
