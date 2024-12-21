class Converter () : AbstractConvertOperations()  {

    val currency = Currency()

    val converter: String = ""

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

    override fun fetchingCalculation(){
        println("fetching rates")

        val currency_list: Map<String, Int> = currency.getCurrencyList()

        if(currency_list.containsKey("usd")) {
            println("the entered currency founded")

            val Totalrate: Int? = currency_list.get("usd")


            if (Totalrate != null) {
                println("${convert_type} : ${Totalrate * value}")
            }

        }else{
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