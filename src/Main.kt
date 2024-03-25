
fun main() {
    val cars = Car("subaru", "legacy", "white", 50, 15)
    cars.carry(50)
    cars.identify()
    cars.calculateParkingFees()
    val bus = Bus("subaru", "legacy", "white", 40)
    bus.capacity
    bus.maxTripFare(25.0)

}


class Car(var make: String, var model: String, var color: String, var capacity: Int, var hours: Int) {
    fun carry(people: Int) {
        if (capacity == people) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $people people")
        }
    }

    fun identify() {
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(): Int {
        hours *= 20
        println("$hours")
        return hours
    }
}

//max
//product of hours
class Bus(var make: String, var model: String, var color: String, var capacity: Int) {
    fun maxTripFare(fare: Double) {
        println("$fare")
    
    }

    fun calculateParkingFees(hours: Int) {
        capacity *= 10
        println(capacity)
    }
}