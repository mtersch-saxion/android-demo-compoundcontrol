package nl.saxion.mbi12.ap1819.example.compountcontroldemo.model;

public class Artist {
    private String name, countryOfBirth;
    private int yearOfBirth, id;
    private static int nextId = 1;

    public Artist(String name, String countryOfBirth, int yearOfBirth) {
        this.id = nextId++;
        this.name = name;
        this.countryOfBirth = countryOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public Artist clone() {
        Artist clonedArtist = new Artist(name, countryOfBirth, yearOfBirth);
        clonedArtist.id = id;

        return clonedArtist;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
