package atm.view

import javafx.scene.input.MouseEvent
import atm.controller._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.TextField
import scalafx.scene.layout.GridPane

object ATM extends JFXApp {
  val ATMmodel = new atm.model.ATM()



  var textField: TextField = new TextField {
    editable = false
    style = "-fx-font: 26 ariel;"
    this.text.value = ATMmodel.current().toString

  }

  var ten: ATMButton = new ATMButton("$100", new Ten(ATMmodel),1,1)
  var twenty :ATMButton = new ATMButton("$200", new Twenty(ATMmodel),1,1)
  var fifty :ATMButton = new ATMButton("$500", new Fifty(ATMmodel),1,1)
  var hundred :ATMButton = new ATMButton("$1000", new Hundred(ATMmodel),1,1)

  var zero :ATMButton = new ATMButton("0", new NumberAction(ATMmodel, 0),1,1,30)
  var login :ATMButton = new ATMButton("Login", new Login(ATMmodel),1,1)
  var logout :ATMButton = new ATMButton("Logout", new Logout(ATMmodel),1,1)

  var one :ATMButton =  new ATMButton("1", new NumberAction(ATMmodel, 1),1,1, 30)
  var two :ATMButton =  new ATMButton("2", new NumberAction(ATMmodel, 2),1,1,30)
  var three :ATMButton =  new ATMButton("3", new NumberAction(ATMmodel, 3),1,1,30)

  var four :ATMButton = new ATMButton("4", new NumberAction(ATMmodel, 4),1,1, 30)
  var five :ATMButton = new ATMButton("5", new NumberAction(ATMmodel, 5),1,1,30)
  var six :ATMButton = new ATMButton("6", new NumberAction(ATMmodel, 6),1,1,30)

  var seven :ATMButton = new ATMButton("7", new NumberAction(ATMmodel, 7),1,1,30)
  var eight :ATMButton = new ATMButton("8", new NumberAction(ATMmodel, 8),1,1,30)
  var nine :ATMButton = new ATMButton("9", new NumberAction(ATMmodel, 9),1,1,30)

  var deposit = new ATMButton("Deposit", new Deposit(ATMmodel),1,0.75,22)
  var transfer = new ATMButton("Transfer", new Transfer(ATMmodel),1,0.75,22)
  var withdraw = new ATMButton("Withdraw", new Withdraw(ATMmodel),1,0.75,22)
  var execute = new ATMButton("Execute", new Execute(ATMmodel),1,0.75,22)
  var clear = new ATMButton("Clear", new Clear(ATMmodel),4,0.75)

  var cheuqing = new ATMButton("Chequing", new Chequing(ATMmodel,0),2,0.75)
  var savings = new ATMButton("Savings", new Savings(ATMmodel,1),2,0.75)

  stage = new PrimaryStage {
    title = "ATM Machine"
    scene = new Scene() {
      content = List(
        new GridPane {
          hgap = 0.0
          vgap = 0.0

          add(textField, 0, 0, 4, 1)

          add(deposit, 0, 2)
          add(transfer, 1, 2)
          add(withdraw, 2, 2)
          add(execute, 3,2)

          add(ten, 3, 4)
          add(twenty, 3, 5)
          add(fifty, 3, 6)
          add(hundred, 3, 7)

          add(seven, 0, 4)
          add(eight, 1, 4)
          add(nine, 2, 4)
          add(four, 0, 5)
          add(five, 1, 5)
          add(six, 2, 5)
          add(one, 0, 6)
          add(two, 1, 6)
          add(three, 2, 6)

          add(logout, 0, 7)
          add(zero, 1, 7)
          add(login, 2, 7)

          add(cheuqing,0,3,2,1)
          add(savings,2,3,2,1)

          add(clear,0,8,4,1)

        }
      )
    }

    addEventFilter(MouseEvent.MOUSE_CLICKED, (_: MouseEvent) => {
      textField.text.value = ATMmodel.current().toString
    })
  }




}
