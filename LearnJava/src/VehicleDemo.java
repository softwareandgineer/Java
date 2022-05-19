public class VehicleDemo
{
    static public void main(String[] args)
    {
        Vehicle minivan = new Vehicle();
        minivan.print();

        Vehicle minivan2 = new Vehicle(21, 200, 6); //implement custom values
        minivan2.print();
    }
}
