class Currency : AbstractConvertOperations() {

    //need a map datastructure for store key and value pair (sri lankan rates)
    private val primary_currency_list: Map<String, Int> = mapOf("usd" to 330, "eur" to 400, "gbp" to 420, "jpy" to 2)

    private val secondary_currency_list: Map<String, Double> = mapOf("usd" to 0.0034, "eur" to 0.0033, "gbp" to 0.0027, "jpy" to 0.53)

    // use Facade Design Pattern.



    override fun fetchingCalculation(c_type: String, convert_type: String, value: Int){
        println("fetching rates")

        if(primary_currency_list.containsKey(c_type)) {
            println("the entered currency founded")

            val Totalrate: Int? = primary_currency_list.get(c_type)


            if (Totalrate != null) {
                println("${convert_type} : ${Totalrate * value}")
            }

        }else if(c_type == "lkr"){
            val Totalrate: Double? = secondary_currency_list.get(convert_type)

            if (Totalrate != null) {
                println("${convert_type} : ${value * Totalrate}")
            }
        }
        else{

            println("the entered currency not founded")

        }

        // sample convert logic

    }


}