import java.util.Objects;
//1.1
public class Film {

    private int filmnr;
    private String produsent;
    private String tittel;
    private int aar;
    private Enum sjanger;
    private String filmselskap;

    public Film() {
    }

    public Film(int filmnr, String produsent, String tittel, int aar, String filmselskap) {
        this.filmnr = filmnr;
        this.produsent = produsent;
        this.tittel = tittel;
        this.aar = aar;
        this.filmselskap = filmselskap;
    }

    public int getFilmnr() {
        return filmnr;
    }

    public void setFilmnr(int filmnr) {
        this.filmnr = filmnr;
    }

    public String getProdusent() {
        return produsent;
    }

    public void setProdusent(String produsent) {
        this.produsent = produsent;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getAar() {
        return aar;
    }

    public void setAar(int aar) {
        this.aar = aar;
    }

    public String getFilmselskap() {
        return filmselskap;
    }

    public void setFilmselskap(String filmselskap) {
        this.filmselskap = filmselskap;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return filmnr == film.filmnr && aar == film.aar && Objects.equals(produsent, film.produsent) && Objects.equals(tittel, film.tittel) && Objects.equals(filmselskap, film.filmselskap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmnr, produsent, tittel, aar, filmselskap);
    }
}
