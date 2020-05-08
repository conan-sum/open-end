package atm.controller

import atm.model.ATM
import javafx.event.{ActionEvent, EventHandler}

/**
  * EventHandlers for each of the button on the microwave. NumberAction takes
  * an Int representing the which number button was pressed. You may assume
  * that each of these classes has a reference to the same ATM object.
  */


class Login(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.login()
}

class Logout(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.logout()
}

class Deposit(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.deposit()
}

class Withdraw(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.withdraw()
}

class Transfer(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.transfer()
}

class Ten(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.ten()
}

class Twenty(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.twenty()
}

class Fifty(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.fifty()
}

class Hundred(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.hundred()
}

class NumberAction(atm: ATM, number: Int) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.numpad(number)
}

class Clear(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.clear()
}

class Execute(atm: ATM) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.execute()
}

class Chequing(atm: ATM, num: Int) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.chequing(num)
}

class Savings(atm: ATM, num: Int) extends EventHandler[ActionEvent] {
  override def handle(event: ActionEvent): Unit = atm.savings(num)
}