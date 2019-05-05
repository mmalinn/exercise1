public class Patient {
    private String imie;
    private String nazwisko;
    private String adres;
    public Patient(String imie, String nazwisko, String adres){
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.adres = adres;
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
    public String getAdres(){
        return adres;
    }
    public void setAdres() {
        this.adres = adres;
    }
}
