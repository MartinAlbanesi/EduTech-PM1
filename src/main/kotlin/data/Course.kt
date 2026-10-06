package main.kotlin.data

data class Course(
    val id: Long,
    val name: String,
    val startDate: String,
    val endDate: String,
    val time: String,
    val location: String,
    val instructor: String,
    val image: String,
    val capacity: Int
)
