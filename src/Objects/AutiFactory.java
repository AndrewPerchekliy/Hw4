package Objects;

import Interfuse.Factori;
import Objects.Auto.SedanProduction;
import Objects.Auto.Test2;
import Objects.Auto.SUVProduction;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;

public class AutiFactory implements Factori {

    private static final String brand = "Audi";

    private final SUVProduction suvProduction;

    private final Test2 sedanProduction;

    private long numberOfWorkers;

    private final BigInteger productionSalary;

    private BigInteger amountOfMoney;

    private boolean workIsGoing;

    public AutiFactory(SUVProduction production1, Test2 production2,
                      long numberOfWorkers, BigInteger productionSalary,
                      BigInteger amountOfMoney,boolean workIsGoing) {
        this.suvProduction = production1;

        this.sedanProduction = production2;

        this.numberOfWorkers = numberOfWorkers;

        this.productionSalary = productionSalary;

        this.amountOfMoney = amountOfMoney;



        this.workIsGoing = workIsGoing;
    }

    public String getBrand(){
        return brand;
    }

    public long getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(long numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public BigInteger getProductionSalary() {
        return productionSalary;
    }

    public BigInteger getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(BigInteger amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public boolean isWorkIsGoing() {
        return workIsGoing;
    }

    public void setWorkIsGoing(boolean workIsGoing) {
        this.workIsGoing = workIsGoing;
    }

    @Override
    public void startWork(LocalTime now) {
        if(now.equals(startTime) && !isWorkIsGoing()){
            setWorkIsGoing(true);
            System.out.println("All fall into place, factory work begins!");
        }
    }

    @Override
    public void finishWork(LocalTime now) {
        if(now.equals(endTime) && isWorkIsGoing()){
            setWorkIsGoing(false);
            System.out.println("The factory work is over, good luck everyone. We hope it was a great day!");
        }
    }

    @Override
    public void checkProductions(Test2 suvProduction, SedanProduction sedanProduction) {

    }

    @Override
    public void hireEmployee() {
        setNumberOfWorkers(getNumberOfWorkers() + 1);
    }

    @Override
    public void fireEmployee() {
        setNumberOfWorkers(getNumberOfWorkers() - 1);
    }

    @Override
    public String toString() {
        return "Our factory produces " + getBrand() +  " cars and has two production facilities:" +
                "1) " + suvProduction.getTypeOfCar() + " production" +
                "2) " + sedanProduction.getTypeOfCar() + " production" +
                "At the moment we have " + getNumberOfWorkers() + " workers and our company continues to grow"
    }
}