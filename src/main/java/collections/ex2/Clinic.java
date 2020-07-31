package collections.ex2;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.Queue;

@Getter
@Setter
public class Clinic {

    private Queue<String> patientsName = new LinkedList<>();

    public void registerPatient(String name){
        patientsName.add(name);
    }

    public String handlePatient(){
String poll = patientsName.poll();
        return poll;
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "patientsName=" + patientsName +
                '}';
    }
}

