package objectProgramming;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class Meeting {

    private String description;
    private LocalDate data;
    private Address adders;
    private int size;

    public Meeting(String description, Address adders) {
        this.description = description;
        this.data = LocalDate.now();
        this.adders = adders;
        this.size = 18;

    }

    public Meeting(String description, LocalDate data, Address adders, int size) {
        this.description = description;
        this.data = data;
        this.adders = adders;
        this.size = size;
    }

    public String descriptionMeeting() {
        return description + " addres: " + adders + " date: " + data;
    }

    public void delayMeeting(int days) {
        System.out.println("The meeting was postponed to " + data.plusDays(days));
    }
}