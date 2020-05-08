package atm.view

import javafx.event.{ActionEvent, EventHandler}
import scalafx.scene.control.Button

class ATMButton (display: String, action: EventHandler[ActionEvent], xScale: Double = 1.0, yScale: Double = 1.0, textSize: Double = 25.0) extends Button {
  minWidth = 130 * xScale
  minHeight = 100 * yScale
  onAction = action
  text = display
  style = "-fx-font: " + textSize.toString + " ariel;"
}
