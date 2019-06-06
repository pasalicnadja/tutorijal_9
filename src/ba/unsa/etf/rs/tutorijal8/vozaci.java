package ba.unsa.etf.rs.tutorijal8;

import java.time.LocalDate;
import java.util.Objects;

public class vozaci {
    String ime, prezime;
    int JMBG;
    LocalDate datumrodjenja,datumzaposlenja;

    public vozaci() {

    }

    public vozaci(String ime, String prezime, int JMBG, LocalDate datumrodjenja, LocalDate datumzaposlenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.datumrodjenja = datumrodjenja;
        this.datumzaposlenja = datumzaposlenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getJMBG() {
        return JMBG;
    }

    public void setJMBG(int JMBG) {
        this.JMBG = JMBG;
    }

    public LocalDate getDatumrodjenja() {
        return datumrodjenja;
    }

    public void setDatumrodjenja(LocalDate datumrodjenja) {
        this.datumrodjenja = datumrodjenja;
    }

    public LocalDate getDatumzaposlenja() {
        return datumzaposlenja;
    }

    public void setDatumzaposlenja(LocalDate datumzaposlenja) {
        this.datumzaposlenja = datumzaposlenja;
    }

    @Override
    public String toString() {
        return ime +" "+ prezime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        vozaci vozaci = (vozaci) o;
        return JMBG == vozaci.JMBG &&
                Objects.equals(ime, vozaci.ime) &&
                Objects.equals(prezime, vozaci.prezime) &&
                Objects.equals(datumrodjenja, vozaci.datumrodjenja) &&
                Objects.equals(datumzaposlenja, vozaci.datumzaposlenja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, JMBG, datumrodjenja, datumzaposlenja);
    }
}
