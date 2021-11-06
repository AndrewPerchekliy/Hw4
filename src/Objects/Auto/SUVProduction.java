package Objects.Auto;

import Interfuse.Production;

import java.math.BigInteger;

public class SUVProduction implements Production {

    private static final String typeOfCar = "SUV";
    private final Test automaticTransmission;
    private final Test manualTransmission;
    private final int availabilityOfSpareParts;
    private int numberOfSpareParts;
    private boolean workIsGoing;
    private BigInteger amountOfMoney;

    public SUVProduction(Test auto1, Test auto2, int availabilityOfSpareParts,
                         int numberOfSpareParts,boolean workIsGoing, BigInteger amountOfMoney) {
        Test automaticTransmission = null;
        Test manualTransmission = null;
        if(auto1.getTransmissionType().equals("automatic") &&
                auto2.getTransmissionType().equals("manual")){
            automaticTransmission = auto1;
            manualTransmission = auto2;
        }
        else if(auto2.getTransmissionType().equals("automatic") &&
                auto1.getTransmissionType().equals("manual")){
            automaticTransmission = auto2;
            manualTransmission = auto1;
        }
        this.automaticTransmission = automaticTransmission;
        this.manualTransmission = manualTransmission;
        this.availabilityOfSpareParts = availabilityOfSpareParts;
        this.numberOfSpareParts = numberOfSpareParts;
        this.workIsGoing = workIsGoing;
        this.amountOfMoney = amountOfMoney;
    }

    public String getTypeOfCar(){
        return typeOfCar;
    }

    public int getAvailabilityOfSpareParts() {
        return availabilityOfSpareParts;
    }

    public int getNumberOfSpareParts() {
        return numberOfSpareParts;
    }

    public void setNumberOfSpareParts(int numberOfSpareParts) {
        this.numberOfSpareParts = numberOfSpareParts;
    }

    @Override
    public boolean checkAvailabilityOfSpareParts() {
        if(getNumberOfSpareParts() < getAvailabilityOfSpareParts()){
            System.out.println("На внедорожники не хватает запчастей, нужно срочно заказывать!");
            return  true;
        }
        else{
            System.out.println("Все нормально, продолжаем работать!");
            return false;
        }
    }

    @Override
    public void orderSpareParts(int ordered) {
        setNumberOfSpareParts(getNumberOfSpareParts()+ordered);
        System.out.printf("Мы заказали  ... запчастей для внедорожников. " +
                 ordered, getNumberOfSpareParts());
    }

    @Override
    public String toString() {
        return "Our production line includes two BMW SUVs: " +
                "1) " + automaticTransmission.getVersion() + " with automatic transmission" +
                "2) " + manualTransmission.getVersion() + " with manual transmission";
    }
}