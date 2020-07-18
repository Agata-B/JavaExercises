package school;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class OneClass {

    private String classesNumber;
    private int seatsNumber;

    private Set<Chair> chairs = new HashSet<>();
    private Set<Table> tables = new HashSet<>();
    private Board board;

    public OneClass(String classesNumber, int seatsNumber) {
        this.classesNumber = classesNumber;
        this.seatsNumber = seatsNumber;
    }

    public Set<EquipmentElements> getEquipment() {
        Set<EquipmentElements> equipmentElements = new HashSet<>();
        equipmentElements.addAll(chairs);
        equipmentElements.addAll(tables);
        if (board != null)
            equipmentElements.add(board);
        return equipmentElements;
    }

    public void addChair(Chair... chairs) {
        for (Chair chair : chairs) {
            this.chairs.add(chair);
        }
    }

    public void addTable(Table... tables) {
        for (Table table : tables) {
            this.tables.add(table);
        }
    }

    public void addBoard(Board board) {
        this.board = board;
    }

    @Override
   public String toString() {
        return "OneClass{" +
                "classesNumber='" + classesNumber + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", chairs=" + chairs +
                ", tables=" + tables +
                ", board=" + board +
                '}';
    }
}
