package bai1;

/**
 *
 * @author Tao
 */
public class Person {

    private String name;
    private String DateOfBirth;
    private String PlaceOfBirth;

    public Person() {
    }

    public Person(String name, String DateOfBirth, String PlaceOfBirth) {
        this.name = name;
        this.DateOfBirth = DateOfBirth;
        this.PlaceOfBirth = PlaceOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getPlaceOfBirth() {
        return PlaceOfBirth;
    }

    public void setPlaceOfBirth(String PlaceOfBirth) {
        this.PlaceOfBirth = PlaceOfBirth;
    }

}
