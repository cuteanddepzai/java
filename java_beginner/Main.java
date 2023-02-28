package java_beginner;

class Second {
    private int num = 10;

    public void setNum(int a) {
        this.num = a;
    }

    public int getNum(){
        return this.num;
    }
}

class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

public class Main extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Main myFastCar = new Main();
        Second sec = new Second();
        sec.setNum(1000);
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
        System.out.println(sec.getNum());
    }
}
