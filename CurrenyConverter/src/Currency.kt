class Currency {

    //need a map datastructure for store key and value pair (sri lankan rates)
    private val currency_list_primary: Map<String, Int> = mapOf("usd" to 330, "eur" to 400, "gbp" to 420, "jpy" to 2)

    private val currency_list_secondary: Map<String, Double> = mapOf("usd" to 0.0034, "eur" to 0.0033, "gbp" to 0.0027, "jpy" to 0.53)

    // use Facade Design Pattern.

    fun getPrimaryCurrencyList() : Map<String, Int>{
        return currency_list_primary
    }

    fun getSecondaryCurrencyList(): Map<String, Double>{
        return currency_list_secondary
    }


}