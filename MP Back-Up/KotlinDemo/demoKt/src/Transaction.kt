data class Transaction(
    val amount: Double,
    val type: TransactionType
)

enum class TransactionType {
    INCOME, EXPENSE
}
// Extension function to calculate total expenses
fun List<Transaction>.totalExpenses(): Double {
    return this.filter { it.type == TransactionType.EXPENSE }
        .sumOf { it.amount }
}

// Extension function to calculate total incomes
fun List<Transaction>.totalIncomes(): Double {
    return this.filter { it.type == TransactionType.INCOME }
        .sumOf { it.amount }
}
fun main() {
    val transactions = listOf(
        Transaction(100.0, TransactionType.INCOME),
        Transaction(50.0, TransactionType.EXPENSE),
        Transaction(200.0, TransactionType.INCOME),
        Transaction(30.0, TransactionType.EXPENSE)
    )

    val totalExpenses = transactions.totalExpenses()
    val totalIncomes = transactions.totalIncomes()

    println("Total Expenses: $$totalExpenses")
    println("Total Incomes: $$totalIncomes")
}
// Base class for all transaction-related exceptions
//open class TransactionException(message: String) : Exception(message)

// Exception class for invalid transaction amounts
//class InvalidAmountException(message: String) : TransactionException(message)

// Exception class for insufficient funds
//class InsufficientFundsException(message: String) : TransactionException(message)

// Exception class for unauthorized transactions
//class UnauthorizedTransactionException(message: String) : TransactionException(message)

// Exception class for transaction timeout
//class TransactionTimeoutException(message: String) : TransactionException(message)

// Exception class for general transaction failures
//class TransactionFailureException(message: String) : TransactionException(message)
//fun processTransaction(amount: Double, accountBalance: Double, authorized: Boolean) {
  //  if (amount <= 0) {
    //    throw InvalidAmountException("Transaction amount must be greater than zero.")
    //}
    //if (!authorized) {
      //  throw UnauthorizedTransactionException("User is not authorized to perform this transaction.")
    //}
   // if (accountBalance < amount) {
     //   throw InsufficientFundsException("Insufficient funds to complete the transaction.")
    //}

    // Simulate transaction processing...
    //val transactionSuccessful = simulateTransactionProcessing(amount)

    //if (!transactionSuccessful) {
      //  throw TransactionFailureException("Transaction failed due to an unknown error.")
    //}
//}
//fun simulateTransactionProcessing(amount: Double): Boolean {
    // Simulate some processing logic
  //  return true // Or false if the transaction fails
//}
//fun main() {
  //  try {
    //    processTransaction(100.0, 50.0, true)
    //} catch (e: TransactionException) {
      //  println("Transaction error: ${e.message}")
    //}
//}
// Define a data class for Transaction
//data class Transaction(val id: String, val amount: Double, val description: String?)
// Function to process a transaction which might be null
//fun processTransaction(transaction: Transaction?) {
    // Safe call operator to check for null
  //  transaction?.let {
    //    println("Processing transaction with ID: ${it.id} and amount: ${it.amount}")
        // Safe call on a nullable property
      //  println("Description: ${it.description ?: "No description provided"}")
    //} ?: run {
        // Handle the case when transaction is null
      //  println("No transaction data available.")
    //}
//}
//fun getTransactionDescription(transaction: Transaction?): String {
  //  return transaction?.description ?: "Description not available"
//}
//fun printTransactionDetails(transaction: Transaction? = null) {
  //  val id = transaction?.id ?: "Unknown ID"
    //val amount = transaction?.amount ?: 0.0
    //println("Transaction Details: ID=$id, Amount=$amount, Description=$description")
//}
//fun printTransactionId(transaction: Transaction?) {
    // Will throw an exception if transaction is null
  //  println("Transaction ID: ${transaction!!.id}")
//}
//fun handleTransaction(transaction: Transaction?) {
  //  if (transaction == null) {
    //    println("Transaction is null, using default values.")
      //  val defaultTransaction = Transaction("default_id", 0.0, "No description")
        //processTransaction(defaultTransaction)
   // } else {
     //   processTransaction(transaction)
    //}
//}

//fun main() {
  //  val transaction1: Transaction? = Transaction("1", 100.0, "Payment for services")
    //val transaction2: Transaction? = null
    //handleTransaction(transaction1)
    //handleTransaction(transaction2)
//}

 //data class Transaction(val id: Int, val amount: Double, val description: String)
 //fun <C : Collection<Transaction>> filterTransactionsByAmount(collection: C, minAmount: Double): C {
   // return collection.filter { it.amount >= minAmount } as C
//}fun <C : Collection<Transaction>> sumTransactionAmounts(collection: C): Double {
  //  return collection.sumOf { it.amount }
//}
//fun <C : Collection<Transaction>> findTransactionById(collection: C, id: Int): Transaction? {
  //  return collection.find { it.id == id }
//}
//fun <K> filterTransactionsByAmount(map: Map<K, Transaction>, minAmount: Double): Map<K, Transaction> {
  //  return map.filterValues { it.amount >= minAmount }
//}
 //fun <K> sumTransactionAmounts(map: Map<K, Transaction>): Double {
   //  return map.values.sumOf { it.amount }
 //}
   //     fun <K> findTransactionById(map: Map<K, Transaction>, id: K): Transaction? {
    //return map[id]
//}
//fun main() {
  //  val transactionsList = listOf(
    //    Transaction(1, 100.0, "Groceries"),
      //  Transaction(2, 250.0, "Electronics"),
        //Transaction(3, 75.0, "Books")
    //)

    //val filteredList = filterTransactionsByAmount(transactionsList, 100.0)
    //println("Filtered List: $filteredList")

   // val totalAmountList = sumTransactionAmounts(transactionsList)
    //println("Total Amount in List: $totalAmountList")
    //val transactionListById = findTransactionById(transactionsList, 2)
    //println("Transaction with ID 2 in List: $transactionListById")
    //val transactionsMap = mapOf(
      //  1 to Transaction(1, 100.0, "Groceries"),
        //2 to Transaction(2, 250.0, "Electronics"),
        //3to Transaction(3, 75.0, "Books")
    //)
    //val filteredMap = filterTransactionsByAmount(transactionsMap, 100.0)
    //println("Filtered Map: $filteredMap")
    //val totalAmountMap = sumTransactionAmounts(transactionsMap)
    //println("Total Amount in Map: $totalAmountMap")
    //val transactionMapById = findTransactionById(transactionsMap, 2)
    //println("Transaction with ID 2 in Map: $transactionMapById")
//}

//class Transaction {

    // Private backing fields
   // private var _transactionId: String = ""
   // private var _amount: Double = 0.0
   // private var _transactionType: String = ""
  //  private var _accountNumber: String = ""

    // Public getter for transactionId
 //   val transactionId: String
      //  get() = _transactionId

    // Public getter and setter for amount
  //  var amount: Double
      //  get() = _amount
      //  set(value) {
        //    if (value >= 0) {
           //     _amount = value
          //  } else {
            //    throw IllegalArgumentException("Amount must be non-negative")
            //}
      //  }

    // Public getter and setter for transactionType
   // var transactionType: String
      //  get() = _transactionType
     //   set(value) {
         //   if (value in listOf("Deposit", "Withdrawal", "Transfer")) {
         //       _transactionType = value
          //  } else {
              //  throw IllegalArgumentException("Invalid transaction type")
           // }
    //    }

    // Public getter and setter for accountNumber with restricted access
   // var accountNumber: String
      //  get() = "**" + _accountNumber.takeLast(4) // Masked for privacy
       // private set(value) { // Setter is private to protect data
        //    _accountNumber = value
       // }

    // Constructor
   // constructor(transactionId: String, amount: Double, transactionType: String, accountNumber: String) {
     //   this._transactionId = transactionId
     //   this.amount = amount
     //   this.transactionType = transactionType
  //      this._accountNumber = accountNumber // Direct access within the class
  //  }

    // Method to update account number, if needed
 //   fun updateAccountNumber(newAccountNumber: String) {
       // if (newAccountNumber.length == 10) {
       //     _accountNumber = newAccountNumber
       // } else {
          //  throw IllegalArgumentException("Account number must be 10 digits")
     //   }
   // }
//}

//fun main() {
 //   val transaction = Transaction("TX123", 1000.0, "Deposit", "1234567890")
 //   println("Transaction ID: ${transaction.transactionId}")
  //  println("Amount: ${transaction.amount}")
  //  println("Transaction Type: ${transaction.transactionType}")
 //   println("Account Number: ${transaction.accountNumber}")

    // Update amount and transaction type
   // transaction.amount = 1500.0
   // transaction.transactionType = "Withdrawal"
  //  println("Updated Amount: ${transaction.amount}")
 //   println("Updated Transaction Type: ${transaction.transactionType}")

    // Attempt to update account number using method
   // transaction.updateAccountNumber("0987654321")
  //  println("Updated Account Number: ${transaction.accountNumber}")
//}

//interface Exportable {
  //  fun exportToCSV(transactions: List<Transaction>): String
//}
//data class Transaction(
   // val id: Int,
  //  val date: String,
   // val amount: Double,
   // val description: String
//)
//class CSVExporter : Exportable {
  //  override fun exportToCSV(transactions: List<Transaction>): String {
      //  val header = "ID,Date,Amount,Description"
       // val csvData = transactions.joinToString(separator = "\n") { transaction ->
         //   "${transaction.id},${transaction.date},${transaction.amount},${transaction.description}"
       // }
        //return "$header\n$csvData"
  //  }
//}
//fun main() {
   // val transactions = listOf(
      //  Transaction(1, "2023-05-20", 100.0, "Grocery shopping"),
       // Transaction(2, "2023-05-21", 250.0, "Electronics purchase"),
       // Transaction(3, "2023-05-22", 75.0, "Restaurant dinner")
   // )

  //  val exporter: Exportable = CSVExporter()
   // val csv = exporter.exportToCSV(transactions)

  //  println(csv)
//}