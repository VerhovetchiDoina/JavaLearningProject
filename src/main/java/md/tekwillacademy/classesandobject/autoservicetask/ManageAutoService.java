package md.tekwillacademy.classesandobject.autoservicetask;

import java.util.concurrent.Callable;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage masterLuxObject = new Garage("Str. Calea Orheiului 147", 3, 220);
        System.out.println(masterLuxObject.address);

        Garage autoLux = new Garage();
        System.out.println(autoLux.numberOfBoxes);
        System.out.println(autoLux.address);
        System.out.println(autoLux.dimensionSqFt);

        autoLux.address = "Str. Stefan cel Mare si Sfint";
        autoLux.dimensionSqFt = 250.6;
        autoLux.numberOfBoxes = 5;


        System.out.println("Informatii despre obiectul autoLuxe de pe adresa " + autoLux.address +
                " cu numarul de boxe " + autoLux.dimensionSqFt + " si dimensiunea " + autoLux.numberOfBoxes );

        Tool hummer001 = new Tool( "Hummer");
        System.out.println(hummer001.material);
        System.out.println(hummer001.nameOfTheTool);

        Tool key = new Tool("Lucky Key");
        System.out.println(key.nameOfTheTool);

        Worker ionCelHarnic = new Worker("Ion");
        System.out.println(ionCelHarnic.pricePerHour);
        ionCelHarnic.yearsOfExperience = 5;
        System.out.println(ionCelHarnic.yearsOfExperience);

        Worker marcelCelPuternic = new Worker();

        Car masinaLuiNicoleta = new Car( "Ferrari", "Red", 3, 4500);
        System.out.println(masinaLuiNicoleta.make);

        Car masinaLuiAdrian = new Car("Mercedes", "Black", 3, 5000);
        System.out.println(masinaLuiAdrian.colorOfTheCar);
    }
}