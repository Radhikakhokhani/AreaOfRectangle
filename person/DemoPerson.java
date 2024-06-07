
package tnsif.region.personalinfo;

import tnsif.region.countrystatepack.City;
import tnsif.region.countrystatepack.Country;

public class DemoPerson {
    public static void main(String[] args) {
        // Create City and Country objects
        City city = new City("Surat");
        Country country = new Country("India");

        // Create a Person object
        Person person = new Person("Radhika", city, country);

        // Print the Person object
        System.out.println(person);
    }
}
