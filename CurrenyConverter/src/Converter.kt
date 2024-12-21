class Converter {

    val currency = Currency()

    val history = History()

    var c_type: String = ""

    var convert_type: String = ""

    var value: Int = 0


    //need a map datastructure for store key and value pair (sri lankan rates)
    //private val _currency_list: Map<String, Int> = mapOf("usd" to 330, "eur" to 400, "gbp" to 420)

    fun convert() {
        println("Converting Module...")



        currency.fetchingCalculation(c_type, convert_type, value)

        history.saveHistory()

        //currency.getCurrencyList()

    }

    // use the Facade Design Pattern.



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


    fun saveHistory(){
        print("saving history")

        history.saveHistory()
    }

    fun convertionHistory(){
        print("fetching history")
    }

}