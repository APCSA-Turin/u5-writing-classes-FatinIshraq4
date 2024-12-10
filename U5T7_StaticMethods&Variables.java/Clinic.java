public class Clinic {
    
    private static int clinics = 0;
    private static int vaccines = 0;
    private int clinicVaccineCount;
    private Person recent;

    public Clinic() {clinics++; clinicVaccineCount=0; recent=null;}

    public static int getTotalClinics() {return clinics;}

    public static int getTotalVaccineCount() {return vaccines;}

    public int getClinicVaccineCount() {return clinicVaccineCount;}

    public Person mostRecentlyVaccinated() {return recent;}

    public boolean vaccinate(Person person) {
        if(person.isVaccinated()==false) {
            person.setVaccinated(true);
            recent=person;
            clinicVaccineCount++;
            vaccines++;
            return true;
        } else {return false;}
    }

}
