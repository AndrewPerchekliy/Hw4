package Interfuse;

import Objects.Auto.Test2;
import Objects.Auto.SedanProduction;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Factori {
    void startWork(LocalTime now);
    void finishWork(LocalTime now);
    void checkProductions(Test2 suvProduction, SedanProduction sedanProduction);
    void issueSalary();
    void celebrateFactoryBirthday(LocalDate now);
    void hireEmployee();
    void fireEmployee();

    default void checkFactoryProgress(int planProgress, int progress){
        if(planProgress <= progress){
            System.out.println("У нас все отлично!");
        }
        else{
            System.out.println("Нам нужно подтолкнуть!");
        }
    }
}