public class Visit {
    private String imie_lekarza;
    private String nazwisko_lekarza;
    private String imie_pacjenta;
    private String nazwisko_pacjenta;
    private String data_wizyty;
    private String godzina_wizyty;


    public Visit(String imie_lekarza, String nazwisko_lekarza, String imie_pacjenta, String nazwisko_pacjenta,
                   String data_wizyty, String godzina_wizyty) {
        this.imie_lekarza = imie_lekarza;
        this.nazwisko_lekarza = nazwisko_lekarza;
        this.imie_pacjenta = imie_pacjenta;
        this.nazwisko_pacjenta = nazwisko_pacjenta;
        this.data_wizyty = data_wizyty;
        this.godzina_wizyty = godzina_wizyty;

    }

    public String getImie_lekarza() {
        return imie_lekarza;
    }

    public void setImie_lekarza() {
        this.imie_lekarza = imie_lekarza;
    }

    public String getNazwisko_lekarza() {
        return nazwisko_lekarza;
    }

    public void setNazwisko_lekarza() {
        this.nazwisko_lekarza = nazwisko_lekarza;
    }

    public String getImie_pacjenta() {
        return imie_pacjenta;
    }

    public void setImie_pacjenta() {
        this.imie_pacjenta = imie_pacjenta;
    }

    public String getNazwisko_pacjenta() {
        return nazwisko_pacjenta;
    }

    public void setNazwisko_pacjenta() {
        this.nazwisko_pacjenta = nazwisko_pacjenta;
    }
    public String getData_wizyty(){
        return data_wizyty;
    }
    public void setData_wizyty(){
        this.data_wizyty = data_wizyty;
    }
    public String getGodzina_wizyty(){
        return godzina_wizyty;
    }
    public void setGodzina_wizyty(){
        this.godzina_wizyty = godzina_wizyty;
    }

}


