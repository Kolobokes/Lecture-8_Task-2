package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conditioner {
    private String name;
    private int maxTemperature = 30;
    private int minTemperature = 15;
    private int currentTemperature;
    private boolean on;

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature(){

        if (currentTemperature >= maxTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature + 1;
    }

    public void decreaseCurrentTemperature(){
        if (currentTemperature <= minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature - 1;
    }
}

