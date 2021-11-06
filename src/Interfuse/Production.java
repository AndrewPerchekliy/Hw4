package Interfuse;

import java.time.LocalTime;

public interface Production {
    void startProduction(LocalTime now);
    void finishProduction(LocalTime now);

    default void checkProductionProgress(int planProgress, int progress){
        if(planProgress <= progress){
            System.out.println("We are doing great!");
        }
        else{
            System.out.println("We need to push!");
        }
    }
}