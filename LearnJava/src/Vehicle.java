public class Vehicle {
    int passengers;
    int fuelCapacity;
    int milesPerGallon;
    //class inclusive method to calculate other variables

    Vehicle() //sets up default values
    {
        passengers = 7;
        fuelCapacity = 16;
        milesPerGallon = 21;
    }

    Vehicle(int passengers, int fuelCapacity, int milesPerGallon)//sets up custom values
    {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.milesPerGallon = milesPerGallon;
    }
    int getRange()
    {
        return fuelCapacity * milesPerGallon;
    }

    void print()
    {
        System.out.println("This minivan has " + passengers + " passengers");
        System.out.println("This minivan can travel " + getRange() + " miles in total");
    }
}
