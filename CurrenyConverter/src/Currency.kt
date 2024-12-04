class Currency : Operations() {


    var c_type: String = ""

    var convert_type: String = ""

    var value: Int = 0

    //need a map datastructure for store key and value pair (sri lankan rates)
    private val _currency_list: Map<String, Int> = mapOf("usd" to 330, "eur" to 400, "gbp" to 420)






    fun convertCurrency(){

        checkingInputs()
    }

    fun checkingInputs(){
        println("checking input currency")

        if(_currency_list.containsKey("usd")) {
            println("the entered currency founded")

            fetchingCalculation()
        }else{
            println("the entered currency not founded")

        }
    }


    override fun fetchingCalculation(){
        println("fetching rates")

        // sample convert logic

        val Totalrate: Int? = _currency_list.get("usd")

        if (Totalrate != null) {
            println("${convert_type} : ${Totalrate * value}")
        }


    }

    fun saveHistory(){
        print("saving history")
    }

    fun convertionHistory(){
        print("fetching history")
    }



}