package ba.unsa.etf.rs.tutorijal8;

import java.util.Objects;

public class Autobusi {
    String proizvodjac, serija;
    int brsjedista, vozaci;

    public Autobusi() {
    }

    public Autobusi(String proizvodjac, String serija, int brsjedista, int vozaci) {
        this.proizvodjac = proizvodjac;
        this.serija = serija;
        this.brsjedista = brsjedista;
        this.vozaci = vozaci;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getSerija() {
        return serija;
    }

    public void setSerija(String serija) {
        this.serija = serija;
    }

    public int getBrsjedista() {
        return brsjedista;
    }

    public void setBrsjedista(int brsjedista) {
        this.brsjedista = brsjedista;
    }

    public int getVozaci() {
        return vozaci;
    }

    public void setVozaci(int vozaci) {
        this.vozaci = vozaci;
    }

    @Override
    public String toString() {
        return proizvodjac + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autobusi autobusi = (Autobusi) o;
        return brsjedista == autobusi.brsjedista &&
                vozaci == autobusi.vozaci &&
                Objects.equals(proizvodjac, autobusi.proizvodjac) &&
                Objects.equals(serija, autobusi.serija);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proizvodjac, serija, brsjedista, vozaci);
    }
}
