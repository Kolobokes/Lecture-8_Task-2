package ru.netology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int stationNumber;
    private int volume;
    private int amountRadioStation = 10;

    public Radio(
            int amountRadioStation
    ){
        this.amountRadioStation = amountRadioStation;
    };

    public void nextStation(){
        if (stationNumber < this.amountRadioStation){
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
        this.stationNumber = this.amountRadioStation;
        return;
    }

    public void changeStationNumber(int stationNumber){
        if (stationNumber >= 0 && stationNumber <= this.amountRadioStation){
            this.stationNumber = stationNumber;
            return;
        }
        return;
    }

    public void increaseVolume(){
        if (volume < 100){
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
