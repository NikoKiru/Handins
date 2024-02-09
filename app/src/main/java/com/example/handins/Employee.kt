package com.example.handins

class Employee(val firstName:String,val lastName:String, salary:Double) {

    var salary: Double = maxOf(salary, 0.0)
        get() = field

    fun yearlySalary(){
        salary * 12
    }

    override fun toString(): String {
        return "Employee(firstName='$firstName', lastName='$lastName', salary=$salary)"
    }


}

fun main(){
    val employee1 = Employee("Nikolaj","Lastname",1000.0)
    val employee2 = Employee("Josephine","Lastname",2000.0)

    println(employee1)
    println(employee2)

    employee1.salary *= 1.10
    employee2.salary *= 1.10
    println("10% raise for everyone yay!")

    println(employee1)
    println(employee2)




}