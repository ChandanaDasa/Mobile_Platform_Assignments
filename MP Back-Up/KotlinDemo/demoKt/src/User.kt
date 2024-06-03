class User(private val username: String, private val password: String) {
    private var isLoggedIn: Boolean = false

    // Dummy expenses data
    private val expenses: Map<String, Double> = mapOf(
        "Groceries" to 100.0,
        "Utilities" to 50.0,
        "Entertainment" to 80.0
    )

    fun login(username: String, password: String): Boolean {
        if (this.username == username && this.password == password) {
            isLoggedIn = true
            return true
        }
        return false
    }

    fun displayExpenseSummary() {
        if (!isLoggedIn) {
            println("Please login first to view expenses.")
            return
        }

        println("Expense Summary:")
        expenses.forEach { (category, amount) ->
            println("$category: $${"%.2f".format(amount)}")
        }
    }
}

fun main() {
    val user = User("username", "password")

    // Logging in
    if (user.login("username", "password")) {
        println("Login successful!")
        // Displaying expense summary
        user.displayExpenseSummary()
    } else {
        println("Invalid username or password.")
    }
}