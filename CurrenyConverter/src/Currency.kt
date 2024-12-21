class Currency {

    //need a map datastructure for store key and value pair (sri lankan rates)
    private val currency_list: Map<String, Int> = mapOf("usd" to 330, "eur" to 400, "gbp" to 420, "jpy" to 2)

    // use Facade Design Pattern.

    fun getCurrencyList() : Map<String, Int>{
        return currency_list
    }


}