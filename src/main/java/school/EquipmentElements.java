package school;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public abstract class EquipmentElements implements Comparable<EquipmentElements> {

    private int registrationNumber;
    private String name;

    public EquipmentElements(int registrationNumber, String name) {
        this.registrationNumber = registrationNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EquipmentElements: " +
                "name " + name + ", registrationNumber " + registrationNumber;
    }

    @Override
    public int compareTo(EquipmentElements equipmentElements) {
        return name.compareTo(equipmentElements.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipmentElements that = (EquipmentElements) o;
        return Objects.equals(registrationNumber, that.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber);
    }

}
