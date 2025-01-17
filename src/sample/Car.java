package sample;

public class Car {

    private int speed;
    private String name;
    private boolean flg;

    Car(){
    }


    Car{int speed, String name}{
        this.speed=speed;
        this.name=name;
    }

    void stepOnAccel(){
        speed=speed+10;
        System.out.println("スピードが"+speed+"km/hに増えました");
    }

    void stepBrake(){
        speed=speed+10;
        System.out.println("スピードが"+speed+"km/hに減りました");
    }



}
