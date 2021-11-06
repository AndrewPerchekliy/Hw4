package Objects;

import Interfuse.Production;

import java.math.BigInteger;

public class SedanProduction implements Production {

    private static final String typeOfCar = "Sedan";

    private final Test2 automaticTransmission;

    private final Test2 manualTransmission;

    private final int availabilityOfSpareParts;

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

        this.workIsGoing = workIsGoing;

        this.amountOfMoney = amountOfMoney;
    }

    public String getTypeOfCar(){
        return typeOfCar;
    }


    public boolean isWorkIsGoing() {
        return workIsGoing;
    }

    public void setWorkIsGoing(boolean workIsGoing) {
        this.workIsGoing = workIsGoing;
    }


    @Override
    public String toString() {
        return "Our production line includes two BMW Sedans: " +
                "1) " + automaticTransmission.getVersion() + " with automatic transmission" +
                "2) " + manualTransmission.getVersion() + " with manual transmission";
    }
}