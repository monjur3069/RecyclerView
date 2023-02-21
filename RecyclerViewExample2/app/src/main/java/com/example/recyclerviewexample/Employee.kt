package com.example.recyclerviewexample

data class Employee(
    val id: Int,
    val name: String,
    val designation: String
)

val employeeList = mutableListOf(
    Employee(1,"Akash","Mobile App Developer"),
    Employee(2,"Tanvir","Mobile App Developer"),
    Employee(3,"Tasin","Mobile App Developer"),
    Employee(4,"Monjur","Mobile App Developer"),
    Employee(5,"Parvez","Mobile App Developer"),
)