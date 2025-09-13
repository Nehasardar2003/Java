class Vehical{
    void run(int speed)
    {
        System.out.println("Vehicle Speed...."+ speed);
    }
}
class Bike extends Vehical{
    void run(int speed)
    {
        System.out.println("Bike Speed...."+ speed);
    }
}
class Car extends Vehical{
    void run(int speed)
    {
        System.out.println("Car Speed...."+ speed);
    }
}
public class VehicalDetails{
    public static void main(String[] args) {
        Bike b=new Bike();
        Car c= new Car();
        b.run(45);
        c.run(60);
    }
}