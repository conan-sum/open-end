package atm.model

class Instruction(state: Int, input: String, chequing: Int, savings: Int) {
  override def toString: String = {
    if (state == 0){
      "Incorrect pin: " + input
    }
    else if (state == 1) {
      "Cheuqing: $" + chequing + "  Savings: $" + savings
    }
    else if(state == 2){
      "Select account to deposit to: "
    }
    else if(state == 3){
      "Enter amount to deposit: $" + input
    }
    else if(state == 4){
      "Select account to transfer from: "
    }
    else if(state == 5){
      "Enter amount to transfer: $" + input
    }
    else if(state == 6){
      "Select account to withdraw from: "
    }
    else if(state == 7){
      "Enter amount to withdraw: $" + input
    }
    else if(state == 8){
      "Insufficient funds, press clear to continue"
    }
    else {
      "Enter pin to login: " + input
    }
  }
}
