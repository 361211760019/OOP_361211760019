package lab8_2;

public class Preson {
    private String name;
    private String dateOfBirth;

    public Preson(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public void introduce(){
        System.out.println("My name is: "+this.name);
        System.out.println("I was born in:"+this.dateOfBirth);
    }
    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //toString
    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
