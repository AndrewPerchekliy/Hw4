package Objects.Auto;

import Interfuse.Production;
import Objects.Auto.Test2;

import java.math.BigInteger;
import java.time.LocalTime;

public class SedanProduction implements Production {

    private static final String typeOfCar = "Sedan";

    private final Test2 automaticTransmission;

    private final Test2 manualTransmission;

    private final int availabilityOfSpareParts;

    private int numberOfSpareParts;

    private boolean workIsGoing;

    private BigInteger amountOfMoney;


    public SedanProduction(Test2 auto1, Test2 auto2, int availabilityOfSpareParts,
                           int numberOfSpareParts, boolean workIsGoing, BigInteger amountOfMoney) {
        Test2 automaticTransmission = null;
        Test2 manualTransmission = null;

        if(auto1.getTransmissionType().equals("automatIc") &&
                auto2.getTransmissionType().equals("manual")){
            automaticTransmission = auto1;
            manualTransmission = auto2;
        }
        else if(auto2.getTransmissionType().equals("automatiK") &&
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

    public void setNumberOfSpareParts(int numberOfSpareParts) {
        this.numberOfSpareParts = numberOfSpareParts;
    }

    public boolean isWorkIsGoing() {
        return workIsGoing;
    }

    public void setWorkIsGoing(boolean workIsGoing) {
        this.workIsGoing = workIsGoing;
    }

    @Override
    public void startProduction(LocalTime now) {
        if(now.equals(startTime) && !isWorkIsGoing()){
            setWorkIsGoing(true);
            System.out.println("All fall into place, work on Sedans begins!");
        }
    }

    @Override
    public void finishProduction(LocalTime now) {
        if(now.equals(endTime) && isWorkIsGoing()){
            setWorkIsGoing(false);
            System.out.println("The work is over, good luck everyone. We hope it was a great day!");
        }
    }

    @Override
    public String toString() {
        return "Our production line includes two BMW Sedans: " +
                "1) " + automaticTransmission.getVersion() + " with automatic transmission" +
                "2) " + manualTransmission.getVersion() + " with manual transmission" +
                "Our working day starts at " + startTime + " and ends at " + endTime + " o'clock";
    }
}