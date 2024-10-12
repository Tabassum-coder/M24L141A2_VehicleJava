//Creating a Interface

interface Vehicle{
  
    //all are abstract methods
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);

}

//we use implement keyword to inherit interface
class Bicycle implements Vehicle{
    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear( int newGear){
          gear=newGear;
    }

    //to increase speed
    @Override
    public void speedUp(int increase) {
        speed=speed+increase;
}

    // to decrease speed
    @Override
    public void applyBrakes(int decrease) {
    speed = speed - decrease;
    }

    public void printStates(){
        System.out.println("Speed is :"+speed+ " and Gear is "+gear);
    }
}

class Car implements Vehicle {
    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increase) {
        speed = speed + increase;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrease) {
        speed = speed - decrease;
    }

    public void printStates() {
        System.out.println("Speed is :" + speed + " and Gear is " + gear);
    }
}

class Main{
    public static void main(String[] args) {
        Bicycle b=new Bicycle();
        b.changeGear(2);
        b.speedUp(30);
        b.applyBrakes(10);

        System.err.println("Bicycle present state is :");
        b.printStates();

        Car c = new Car();
        c.changeGear(2);
        c.speedUp(100);
        c.applyBrakes(30);

        System.err.println("Car present state is :");
        c.printStates();
    }
}
