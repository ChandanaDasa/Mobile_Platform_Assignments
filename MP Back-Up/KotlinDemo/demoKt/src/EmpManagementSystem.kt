data class Employee(val id: Int, val name: String, val department: String)

class EmployeeManagementSystem {
    private val employees = mutableListOf<Employee>()

    fun addEmployee(employee: Employee) {
        employees.add(employee)
        println("Employee added successfully.")
    }

    fun removeEmployee(employeeId: Int) {
        val employeeToRemove = employees.find { it.id == employeeId }
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove)
            println("Employee removed successfully.")
        } else {
            println("Employee with ID $employeeId not found.")
        }
    }

    fun displayAllEmployees() {
        if (employees.isEmpty()) {
            println("No employees to display.")
        } else {
            println("List of Employees:")
            employees.forEach { println("ID: ${it.id}, Name: ${it.name}, Department: ${it.department}") }
        }
    }
}

fun main() {
    val empSystem = EmployeeManagementSystem()

    // Adding employees
    empSystem.addEmployee(Employee(1, "Chandana", "IT"))
    empSystem.addEmployee(Employee(2, "Keerthi", "HR"))
    empSystem.addEmployee(Employee(3, "Sandy", "Finance"))

    // Displaying all employees
    empSystem.displayAllEmployees()

    // Removing an employee
    empSystem.removeEmployee(2)

    // Displaying all employees after removal
    empSystem.displayAllEmployees()
}