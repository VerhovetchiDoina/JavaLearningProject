package md.tekwillacademy.accessmodifiers;

import com.sun.security.jgss.GSSUtil;
import md.tekwillacademy.peopleevidence.Person;

public class ChisinauEvidenceService {
    public static void main(String[] args) {
        Person ionelBaiatGrozav = new Person();

        Person marcelBoy = new Person("Marcel Bivol", 160080985, 56, "Unknown");

        System.out.println(marcelBoy.getAge());
        System.out.println(ionelBaiatGrozav.getAge());
        ionelBaiatGrozav.name = "Ion Bostanel";

        marcelBoy.name = "Marcel Bivol";

        Person raisaPascalo001 = new Person( "Raisa Pascalo", "F");

        System.out.println(raisaPascalo001.getGender());
        System.out.println(raisaPascalo001.toString());
        System.out.println("Numele obiectului raisaPascalo: " + raisaPascalo001.name);


        System.out.println(Person.nationality);
        Person.nationality = "Moldovean Editat";
        System.out.println(Person.nationality);


    }
}
