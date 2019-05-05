public class Doctor {
    private String imie;
    private String nazwisko;
    private String specjalizacja;
    public Doctor(String imie, String nazwisko, String specjalizacja){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.specjalizacja = specjalizacja;
    }
    public String getImie(){
        return imie;
    }
    public void setImie(){
        this.imie = imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public void setNazwisko(){
        this.nazwisko = nazwisko;
    }
    public String getSpecjalizacja(){
        return specjalizacja;
    }
    public void setSpecjalizacja(){
        this.specjalizacja = specjalizacja;
    }
}
