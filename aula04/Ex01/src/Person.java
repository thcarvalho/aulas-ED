import java.util.Date;

public class Person {
    private int ID;
    private String name;
    private int RG;
    private int phone;
    private Date birthDate;

    //Alocando endereços de memória através do construtor
    public Person(String name, int RG, int phone, Date birthDate) {
        this.ID = 0;
        this.name = name;
        this.RG = RG;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
