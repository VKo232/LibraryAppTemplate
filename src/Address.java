/**
 * Address Class
 */
public class Address {

    /**
     * toString() : void
     * Overrides the default toString() method.
     * This will format the address in the form of
     *
     * street
     * city, province
     * postalCode
     *
     * @return
     *          String consisting of a formatted mailing address.
     */

    String street;
    String city;
    String province;
    String postalCode;

    public String toString() {
       String formatted = street + "\n" + city + ", " + province + "\n" + postalCode;
       return formatted;
    }
}
