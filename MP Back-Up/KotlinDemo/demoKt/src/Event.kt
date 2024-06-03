class Event(val name: String, val date: String)

// Extension function to add tagging feature
fun Event.tag(tag: String): EventWithTag {
    return EventWithTag(this, tag)
}

// Extension function to add categorization feature
fun Event.categorize(category: String): EventWithCategory {
    return EventWithCategory(this, category)
}

// Wrapper class for tagged events
data class EventWithTag(val event: Event, val tag: String)

// Wrapper class for categorized events
data class EventWithCategory(val event: Event, val category: String)

// Usage
fun main() {
    val event = Event("Meeting", "2024-05-20")

    // Tagging the event
    val taggedEvent = event.tag("important")

    // Categorizing the event
    val categorizedEvent = event.categorize("work")

    println("Tagged event: ${taggedEvent.event.name} - Tag: ${taggedEvent.tag}")
    println("Categorized event: ${categorizedEvent.event.name} - Category: ${categorizedEvent.category}")
}
//import java.text.SimpleDateFormat
//import java.util.*

//fun main() {
  //  val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    //val eventDateStr = "2024-05-20 18:30:00" // Example date string, you can replace it with your input

    //try {
      //  val eventDate = dateFormat.parse(eventDateStr)
        //println("Event date: $eventDate")
    //} catch (e: Exception) {
      //  println("Error parsing date: ${e.message}")
        // Handle the error gracefully, e.g., log it, inform the user, etc.
   // }
//}
//data class Event(val name: String, val date: String)

//fun getEventData(eventId: Int): Event? {
    // This function simulates retrieving event data from a database or some other data source
    // If the event doesn't exist, it returns null
  //  val eventDataMap = mapOf(
    //    1 to Event("Event A", "2024-05-20"),
      //  2 to Event("Event B", "2024-05-21"),
        //3 to Event("Event C", "2024-05-22")
    //)

    //return eventDataMap[eventId]
//}

//fun main() {
  //  val eventId: Int? = 2 // Event ID to retrieve, could be null if not provided

    // Retrieving event data and handling null references gracefully
    //val event: Event? = eventId?.let { getEventData(it) }

    // Using safe call operator (?.) to access properties of the event safely
    //println("Event Name: ${event?.name}")
    //println("Event Date: ${event?.date ?: "Date Not Available"}") // Elvis operator (?:) provides a default value if date is null
//}

//class DataManager<T> {
  //  private val dataList: MutableList<T> = mutableListOf()

    //fun addData(data: T) {
      //  dataList.add(data)
    //}

    //fun removeData(data: T) {
      //  dataList.remove(data)
    //}

    //fun getDataList(): List<T> {
      //  return dataList.toList()
    //}
//}

// Example usage:

//data class Attendee(val name: String, val age: Int)

//data class Event(val eventName: String, val date: String)

//fun main() {
  //  val attendeeManager = DataManager<Attendee>()
    //val eventManager = DataManager<Event>()

    // Adding attendees
    //attendeeManager.addData(Attendee("John", 30))
    //attendeeManager.addData(Attendee("Alice", 25))

    // Adding events
    //eventManager.addData(Event("Conference", "2024-05-20"))
    //eventManager.addData(Event("Workshop", "2024-06-10"))

    // Getting lists
    //val attendees = attendeeManager.getDataList()
    //val events = eventManager.getDataList()

    //println("Attendees: $attendees")
    //println("Events: $events")
//}

//import java.time.LocalDate

//data class Event(val date: LocalDate, val type: String, val description: String)

//val events = listOf(
  //  Event(LocalDate.of(2024, 5, 1), "Conference", "Tech Conference 2024"),
    //Event(LocalDate.of(2024, 6, 15), "Meetup", "Kotlin Meetup"),
    //Event(LocalDate.of(2024, 5, 20), "Workshop", "Kotlin Coroutines Workshop"),
    //Event(LocalDate.of(2024, 7, 10), "Conference", "AI Conference 2024"),
    //Event(LocalDate.of(2024, 5, 5), "Seminar", "Cybersecurity Seminar")
//)

//fun filterEventsByDate(events: List<Event>, fromDate: LocalDate): List<Event> {
  //  return events.filter { it.date >= fromDate }
//}

//fun filterEventsByType(events: List<Event>, eventType: String): List<Event> {
  //  return events.filter { it.type.equals(eventType, ignoreCase = true) }
//}

//fun filterEvents(events: List<Event>, fromDate: LocalDate, eventType: String): List<Event> {
  //  return events.filter { it.date >= fromDate && it.type.equals(eventType, ignoreCase = true) }
//}

//fun main() {
  //  val fromDate = LocalDate.of(2024, 5, 1)
    //val eventType = "Conference"

    //val filteredByDate = filterEventsByDate(events, fromDate)
    //println("Events from $fromDate:")
    //filteredByDate.forEach { println(it) }

    //val filteredByType = filterEventsByType(events, eventType)
    //println("\n$eventType events:")
    //filteredByType.forEach { println(it) }

    //val filteredByDateAndType = filterEvents(events, fromDate, eventType)
    //println("\n$eventType events from $fromDate:")
    //filteredByDateAndType.forEach { println(it) }
//}
//class Event(private var eventName: String, private var eventDate: String) {

    // Public getter for eventName
  //  fun getEventName(): String {
    //    return eventName
    //}

    // Public setter for eventName
    //fun setEventName(newName: String) {
      //  if (newName.isNotBlank()) {
        //    eventName = newName
        //} else {
          //  throw IllegalArgumentException("Event name cannot be blank")
        //}
    //}

    // Public getter for eventDate
    //fun getEventDate(): String {
      //  return eventDate
    //}

    // Public setter for eventDate
    //fun setEventDate(newDate: String) {
      //  if (newDate.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) { // Simple date format check (YYYY-MM-DD)
        //    eventDate = newDate
        //} else {
          //  throw IllegalArgumentException("Invalid date format. Expected format: YYYY-MM-DD")
        //}
    //}
//}

//fun main() {
  //  val event = Event("Conference", "2024-09-15")

    //println("Event Name: ${event.getEventName()}")
    //println("Event Date: ${event.getEventDate()}")

    // Update event name and date
    //event.setEventName("Workshop")
    //event.setEventDate("2024-10-20")

    //println("Updated Event Name: ${event.getEventName()}")
    //println("Updated Event Date: ${event.getEventDate()}")
//}

// Define the Schedulable interface
//interface Schedulable {
  //  val id: String
    //var time: String // or any other type suitable for your use case, e.g., LocalDateTime
    //fun schedule(time: String)
    //fun reschedule(newTime: String)
//}
// Implement a couple of example event types
//class Meeting(override val id: String, override var time: String) : Schedulable {
  //  override fun schedule(time: String) {
    //    this.time = time
      //  println("Meeting $id scheduled at $time")
    //}
    //override fun reschedule(newTime: String) {
      //  this.time = newTime
        //println("Meeting $id rescheduled to $newTime")
    //}
//}
//class Task(override val id: String, override var time: String) : Schedulable {
  //  override fun schedule(time: String) {
    //    this.time = time
      //  println("Task $id scheduled at $time")
    //}
   // override fun reschedule(newTime: String) {
     //   this.time = newTime
       // println("Task $id rescheduled to $newTime")
    //}
//}
// Define the Schedule class
//class Schedule {
  //  private val events = mutableListOf<Schedulable>()
    //fun addEvent(event: Schedulable) {
      //  events.add(event)
        //event.schedule(event.time)
    //}
    //fun rescheduleEvent(id: String, newTime: String) {
      //  val event = events.find { it.id == id }
        //if (event != null) {
          //  event.reschedule(newTime)
        //} else {
          //  println("Event with id $id not found")
        //}
    //}
    //fun showSchedule() {
      //  for (event in events) {
        //    println("Event ${event.id} is scheduled at ${event.time}")
        //}
    //}
//}
// Example usage
//fun main() {
  //  val schedule = Schedule()
    //val meeting1 = Meeting("meeting1", "2024-05-20T10:00")
    //val task1 = Task("task1", "2024-05-20T12:00")
    //schedule.addEvent(meeting1)
    //schedule.addEvent(task1)
    //schedule.showSchedule()
    //schedule.rescheduleEvent("meeting1", "2024-05-20T11:00")
    //schedule.rescheduleEvent("task1", "2024-05-20T14:00")
    //schedule.showSchedule()
//}

//interface Display {
  //  fun showEventDetails(eventName: String, eventDate: String, eventLocation: String)
//}

// EventManager class implementing Display interface
//class EventManager : Display {
  //  override fun showEventDetails(eventName: String, eventDate: String, eventLocation: String) {
    //    println("Event Name: $eventName")
      //  println("Date: $eventDate")
        //println("Location: $eventLocation")
    //}

    // Other methods of EventManager class
    //fun addEvent(eventName: String, eventDate: String, eventLocation: String) {
        // Add event logic here
    //}

    //fun removeEvent(eventName: String) {
        // Remove event logic here
    //}
//}

// Example usage
//fun main() {
  //  val eventManager = EventManager()

    // Add an event
    //eventManager.addEvent("Marriage Party", "2024-05-20", "123 Main St")

    // Show event details
    //eventManager.showEventDetails("Marriage Party", "2024-05-20", "123 Main St")
//}