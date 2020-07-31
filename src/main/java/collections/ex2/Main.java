package collections.ex2;

public class Main {
    public static void main(String[] args) {

        Clinic clinic = new Clinic();
        clinic.registerPatient("Adam");
        clinic.registerPatient("Tomasz");
        System.out.println(clinic);
        System.out.println( "Pacjent obsługiwany: " + clinic.handlePatient());
        System.out.println(clinic);
    }
}
