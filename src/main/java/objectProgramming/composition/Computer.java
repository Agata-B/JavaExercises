package objectProgramming.composition;

import lombok.Getter;

@Getter
public class Computer {

    private Processor processor;
    private GraphicCard graphicCard;
    private PowerSuply powerSuply;

    public Computer(Processor processor, GraphicCard graphicCard, PowerSuply powerSuply) {
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.powerSuply = powerSuply;
    }


    public String description() {
        return "Computer: " + processor.getName() + " " + graphicCard.getName() + " " + powerSuply.getName();
    }


}
