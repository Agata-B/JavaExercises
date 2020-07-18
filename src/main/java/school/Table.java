package school;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Table extends EquipmentElements {
    public Table(int registrationNumber, String name) {
        super(registrationNumber, name);
    }

    @Override
    public String toString() {
        return "Table: " + "name " + getName() + ", registrationNumber " + getRegistrationNumber();
    }
}
