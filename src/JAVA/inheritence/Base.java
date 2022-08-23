package JAVA.inheritence;

import javax.crypto.spec.PSource;

public class Base {
    private String name, surname;
    private int ID, birthYear;

    public Base(String name, String surname, int ID, int birthYear) {
        setName(name);
        setBirthYear(birthYear);
        setID(ID);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String toString() {
        return "Base{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                ", birthYear=" + birthYear +
                '}';
    }
}
