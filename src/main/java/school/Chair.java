package school;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chair extends EquipmentElements {
    public Chair(int registrationNumber, String name) {
        super(registrationNumber, name);
    }

    @Override
    public String toString() {
        return "Chair: " + "name " + getName() + ", registrationNumber " + getRegistrationNumber();
    }
}
