class Converter () : AbstractConvertOperations()  {

    val currency = Currency()



    var c_type: String = ""

    var convert_type: String = ""

    var value: Int = 0


    //need a map datastructure for store key and value pair (sri lankan rates)
    //private val _currency_list: Map<String, Int> = mapOf("usd" to 330, "eur" to 400, "gbp" to 420)

    fun convert() {
        println("Converting Module...")

        convertCurrency()

        //currency.getCurrencyList()

    }

    // use Facade Design Pattern.

    fun convertCurrency(){

        fetchingCalculation()
    }

    //fun checkingInputs(){
        //println("checking input currency")

        //val currency_list: Map<String, Int> = currency.getCurrencyList()

        //if(currency_list.containsKey("usd")) {
            //println("the entered currency founded")

            //fetchingCalculation()
        //}else{
            //println("the entered currency not founded")

        //}
    //}


    // adjust these fetching calculation according to the entered currency (primary currency)


    // check if entered Primary currency type is in the list
    // if entered lkr currency as primary currency it is needed to be divided with secondary currency
    override fun fetchingCalculation(){
        println("fetching rates")

        val primary_currency_list: Map<String, Int> = currency.getPrimaryCurrencyList()

        val secondary_currency_list: Map<String, Double> = currency.getSecondaryCurrencyList()

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

    fun saveHistory(){
        print("saving history")
    }

    fun convertionHistory(){
        print("fetching history")
    }

}