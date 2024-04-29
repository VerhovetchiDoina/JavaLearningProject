package md.tekwillacademy.demopack;

import md.tekwillacademy.demopack.anotherlevel.Library;
import md.tekwillacademy.demopack.anotherlevel.Seller;

public class RunLibraryService {
    public static void main(String[] args) {
        Library carturesti = new Library();

        carturesti.numberOfBooks = 10056;
        carturesti.address = "Constantin Tanase 6";
        carturesti.numberOfSellers = 2;

        Seller sellerIonel = new Seller();

        carturesti.seller = sellerIonel;

        sellerIonel.name = "Ionel Bogatu";

        sellerIonel.setAge(99);

        System.out.println(sellerIonel.getAge());

    }
}
