package school;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board extends EquipmentElements {
    public Board(int registrationNumber, String name) {
        super(registrationNumber, name);
    }

    @Override
    public String toString() {
        return "Board: " + "name " + getName() + ", registrationNumber " + getRegistrationNumber();
    }
}
