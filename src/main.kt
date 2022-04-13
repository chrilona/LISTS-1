fun main(){
    (returnEven(listOf("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten")))
    println(peopleHeight(listOf(1.79,2.20,1.98,1.50)))
    var a =Person("Elizabeth",22,2.2,56)
    var b =Person("Molly",24,1.7,60)
    var c =Person("Josphine",21,1.5,45)
    var persons=mutableListOf<Person>(a,b,c)
    persons.addAll(listOf())
    var sorted = persons.sortedByDescending { ag->ag.age }
    println(sorted)
    var g = Car("KZE 616J", 200)
    var h = Car("KBU 907H", 100)
    var i = Car("KDG 107R", 300)
    var j = listOf(g, h, i)
    println(mileage(j))


}
fun returnEven(numbers:List<String>):List<String>{
     numbers.forEachIndexed { index, number->
         if ((index%2)==0){
println(number)
         }
     }
    return numbers
}
fun peopleHeight(heightInMetres:List <Double>):String{
    var height = heightInMetres.sum()
    var averag = heightInMetres.average()
    var combined = " Total height $height and average height is $averag"
    return combined
}
data class Person(var name:String,var age:Int,var height:Double,var weight:Int)
    fun sortDescendind( persons:List<String>){

    }
data class Car(var reg:String,var mileage:Int)

fun mileage(mileagee:List<Car>):Int{
    var total=0
    mileagee.forEach { y->y.mileage
        total+=y.mileage
    }
    var totall=total/mileagee.count()
    return totall
}
