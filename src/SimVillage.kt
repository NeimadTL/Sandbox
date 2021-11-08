 fun main(args: Array<String>) {
     val greetingFunction = { playerName: String, numBuildings: Int ->
         val currentYear = 2018
         println("Adding $numBuildings houses")
         "Welcome to SimVillage, $playerName! (copyright $currentYear)"
     }
     // runSimulation("Guyal", ::printConstruction, greetingFunction)
     runSimulation()
 }

  inline fun runSimulation(playerName: String, costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String) {
     val numBuildings = (1..3).shuffled().last()
      costPrinter(numBuildings)
     println(greetingFunction(playerName, numBuildings))
  }

 fun runSimulation() {
     val greetingFunction = configureGreetingFunction()
     println(greetingFunction("Guyal"))
     println(greetingFunction("Guyal"))
     println(greetingFunction("Guyal"))
 }

 fun configureGreetingFunction(): (String) -> String {
     val structureType = "hospitals"
     var numBuildings = 5
     return { playerName: String ->
         val currentYear = 2018
         numBuildings += 1
         println("Adding $numBuildings $structureType")
         "welcome to SimVillage, $playerName! (copyright $currentYear)"
     }
 }

 fun printConstruction(numBuildings: Int){
     val cost = 500
     println("construction cost: ${cost * numBuildings}")
 }