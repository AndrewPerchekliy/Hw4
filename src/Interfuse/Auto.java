package Interfuse;

public interface Auto {

    void drive();
    void brake();
    void turn(String direction);
    void openDoors(byte[] doorsArray);
    void openTrunk();
    void refuel(byte liters);

    default void startTheAuto(){
        System.out.println("машина заводится и готово к поездке");
    }
}