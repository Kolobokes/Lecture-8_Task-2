package ru.netology;

public class Radio {
    private int stationNumber;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public void nextStation(){
        if (stationNumber < 9){
            stationNumber = stationNumber + 1;
            this.stationNumber = stationNumber;
            return;
        }
        this.stationNumber = 0;
        return;
    }

    public void prevStation(){
        if (stationNumber > 0){
            stationNumber = stationNumber - 1;
            this.stationNumber = stationNumber;
            return;
        }
        this.stationNumber = 9;
        return;
    }

    public void changeStationNumber(int stationNumber){
        if (stationNumber >= 0 && stationNumber <= 9){
            this.stationNumber = stationNumber;
            return;
        }
        return;
    }

    public void increaseVolume(){
        if (volume < 10){
            volume = volume + 1;
            this.volume = volume;
            return;
        }
        return;
    }

    public void decreaseVolume(){
        if (volume > 0){
            volume = volume - 1;
            this.volume = volume;
            return;
        }
        return;
    }
}
