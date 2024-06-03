data class emp(val name: String, val salary: Double, val role:String)

fun getEmp(name: String, salary: Double, role: String): emp {
    return emp(name, salary, role)
}

fun main() {
    val emp1 = emp("Chandana", 10.0, "Developer")
    val emp2 = emp("Sandy", 11.0, "Analyst")
    val emp3 = emp("John", 100.0, "Tester")

    val (name, salary, role) = getEmp("Chandana", 10.0, "Developer");
    println("$name, $salary, $role")

}