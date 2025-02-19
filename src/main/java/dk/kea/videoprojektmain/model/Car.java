package dk.kea.videoprojektmain.model;

public class Car {

    // id gør det nemmere at håndtere databasen ift. CRUD senere.
    int id;
    String brand;
    int age;
    String type;
    String colour;
    String licenseplate;
    String image;


    // contructors
    public Car(int id, String brand, int age, String type, String colour, String licenseplate, String image) {
        this.id = id;
        this.brand = brand;
        this.age = age;
        this.type = type;
        this.colour = colour;
        this.licenseplate = licenseplate;
        this.image = image;
    }
    public Car(String brand, int age, String type, String colour, String licenseplate, String image) {
        this.brand = brand;
        this.age = age;
        this.type = type;
        this.colour = colour;
        this.licenseplate = licenseplate;
        this.image = image;
    }

    public Car() {}


    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }
}
