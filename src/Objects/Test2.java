package Objects;

import Interfuse.Auto;

public class Test2 implements Auto {

    private final String version;

    private static final String brand = "AuDi";

    private static final String typeOfCar = "Sedan";

    private final String transmissionType;

    private final String driveUnit;

    private final int maxSpeed;

    private final byte accelerationTo100;

    private byte fuelSupply;

    private final double fuelTankVolume;

    private double clearance;

    public Test2(String version, String transmissionType, String driveUnit, int maxSpeed, byte fuelSupply, double fuelTankVolume,
                 double clearance, byte accelerationTo100) {
        this.version = version;

        this.transmissionType = transmissionType;

        this.driveUnit = driveUnit;

        this.maxSpeed = maxSpeed;

        this.fuelSupply = fuelSupply;

        this.fuelTankVolume = fuelTankVolume;

        this.clearance = clearance;

        this.accelerationTo100 = accelerationTo100;
    }

    public String getVersion() {
        return version;
    }

    public String getBrand() {
        return brand;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void drive() {
        System.out.printf("Sedan is drive", getVersion());
    }

    @Override
    public void brake() {
        System.out.println("Sedan is brake");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Sedan is turn on " + direction);
    }

    @Override
    public void openTrunk() {
        System.out.println("Sedan's trunk opened");
    }
}