fun main() {
    arrNums()
       val people = listOf(
       Person("Jemima", 19, 150, 60),
       Person("Stephanie", 21, 180, 65),
       Person("Mary", 20, 160, 55)
   )

   val sortedPeople = people.sortedByDescending { it.age }
    println(sortedPeople)
    println(arrStrings("John","Jane","Jean"))

    val cars = listOf(
        Vehicle("KDE 767", 7000.0),
        Vehicle("KZC468", 2000.0),
        Vehicle("KBT289", 1000.0)
    )
    val averageMileage = carDetails(cars)
    println("The average mileage of the cars is $averageMileage")

}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
fun arrNums(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var addition = numbers[1]+numbers[4]
    println(addition)

    println(numbers.indexOf(158))

    println(numbers.sorted())

}



//2. Given a list of Person objects, each with the attributes, name, age, height, and weight
//    . Sort the list in order of descending age (2 points)
data class Person(var name: String,var age: Int,var height: Int,var weight: Int)


//3. Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)

fun arrStrings(str1: String,str2: String,str3: String): Array<String>{
    return arrayOf(str1,str2,str3)
}


//4. Write a function that takes in a list of Car objects each with a registration and
//mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)

data class Vehicle(val registration: String, val mileage: Double)
fun carDetails(cars: List<Vehicle>): Double{
    var totalMileage = 0.0
    for (car in cars){
        totalMileage += car.mileage
    }
    return totalMileage / cars.size
}