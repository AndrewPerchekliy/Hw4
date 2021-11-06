package Objects;

import Interfuse.Factori;

public class AutiFactory implements Factori {

    private static final String brand = "Audi";

    private final SUVProduction suvProduction;

    private final Test2 sedanProduction;

    private long numberOfWorkers;


    public AutiFactory(SUVProduction production1, Test2 production2,
                      long numberOfWorkers) {
        this.suvProduction = production1;

        this.sedanProduction = production2;

        this.numberOfWorkers = numberOfWorkers;

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