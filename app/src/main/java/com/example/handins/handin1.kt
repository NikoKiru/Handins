package com.example.handin1

import android.health.connect.datatypes.units.Length

fun main() {
    /*
  A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to
  find out if he/she is elligible to vote. Let the user input their age.
   */

    println("Please enter your age below")
    val inputAge = readLine()!!;
    isAgeVallid(inputAge)


    /*
    Define two functions to print the maximum and the minimum number respectively among three numbers

     */

    val max : Int = getMax(1,18,8);

    val min : Int = getMin(1,18,-8);

    println(max); //18
    println(min); //-8

    /*
    Write a Kotlin function named calculateAverage that takes in a list of numbers and returns their average.
     */

    val listOfNumbers:List<Double> = listOf(42.0,17.0,56.0,89.0,23.0);
    println("the avarage number is " + calculateAverage(listOfNumbers))

    /*
    4.
    Write a method that returns if a user has input a valid CPR number.
    A valid CPR number has:
    10 Digits.
    The first 2 digits are not above 31.
    The middle 2 digits are not above 12.
    The method returns true if the CPR number is valid, false if it is not.
     */

    println("Please Enter a cpr number below")
    val inputtedCPR = readLine()!!
    println(isCprVallid(inputtedCPR))

    /*
    5.
    Write a program that prints the numbers from 1 to 100. But for multiples of three print
     “Fizz” instead of the number and for the multiples of five print “Buzz”.
     For numbers which are multiples of both three and five print “FizzBuzz”.
     */
    fizzBuzz()

    /*
    6.
    Write a program that takes your full name as input and displays the abbreviations of the first
     and middle names except the last name which is displayed as it is.
    For example, if your name is Robert Brett Roser, then the output should be R.B. Roser.
    Or Benjamin Dalsgaard Hughes will be B.D. Hughes
     */
    println("Please Enter your full name below")
    val fullName = readLine()!!
    abbreviation(fullName)

/*
Write a program that takes a numerical grade (0-100) as input and prints out the corresponding
american letter grade. Implement a function calculateGrade that takes an integer parameter representing the grade and returns a string representing the letter grade according to the following scale:

90-100: "A"
80-89: "B"
70-79: "C"
60-69: "D"
Below 60: "F"
 */
    println("Please Enter your grade as a number")
    val grade = readLine()!!.toInt()
    println(calculateGrade(grade))

    /*
8.
Write a Kotlin function named filterWordsByLength that takes in a list of strings and a
minimum length, and returns a list containing only the words that have a length greater
than or equal to the specified minimum length.
     */

    val words = listOf("swimming","football","golf","motorsport","handball","icehockey")
    println(filterWordsByLength(words, 6))

}

fun filterWordsByLength (words: List<String>,minLength: Int):List<String> {
    return words.filter { it.length >= minLength }
}



fun calculateGrade(grade:Int):String {
    return when (grade) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
}

fun abbreviation(name:String) {
    val nameParts: List<String> = name.split(" ") // Creates a list whit speperation on the spaces

    val lastName = nameParts.last() // defines the last name as the last index of the list
    val initials = nameParts.dropLast(1).joinToString("") { it.first().uppercaseChar() + "."} // Takes the indexs of the list appart from the last part, then takes the first letter from each index makes it uppercase and joins them with a "."

    println("$initials $lastName")
}

fun fizzBuzz() {
    for (i in 1..100) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}


fun isCprVallid(cpr:String): Boolean {
    if (cpr.length != 10 || !cpr.all {it.isDigit()}) {
        return false
    }

    val day = cpr.substring(0, 2).toInt()
    val month = cpr.substring(2,4).toInt()

    if (day > 31 || month > 12) {
        return false
    }
    return true
}


fun isAgeVallid(age:String) {
    val ageInt:Int = age.toInt()

    if (ageInt >= 18) {
        println("You are elligible to vote")
    } else {
        println("You are not elligible to vote")
    }
}

fun getMin(a:Int,b:Int,c:Int):Int{
    if (a < b && a < c) {
        return a
    } else if (b < a && b < c) {
        return b
    } else {
        return c
    }
}

fun getMax(a:Int,b:Int,c:Int):Int{
    if (a > b && a > c) {
        return a
    } else if (b > a && b > c) {
        return b
    } else {
        return c
    }
}

fun calculateAverage (numbers:List<Double>):Double {
    return numbers.sum() / numbers.size
}