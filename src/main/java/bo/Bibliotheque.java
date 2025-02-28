package bo;

import java.util.List;

public class Bibliotheque {

    private long noLibrary;
    private String libelle;

    private List<JeuxVideo> jeuxVideos;



    public Bibliotheque() {
    }

    public Bibliotheque(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bibliotheque ");
        sb.append("libelle : ").append(libelle);
        sb.append(", jeuxVideos : ").append(jeuxVideos);
        return sb.toString();
    }

    public List<JeuxVideo> getJeuxVideos() {
        return jeuxVideos;
    }

    public void setJeuxVideos(List<JeuxVideo> jeuxVideos) {
        this.jeuxVideos = jeuxVideos;
    }

    public long getNoLibrary() {
        return noLibrary;
    }

    public void setNoLibrary(long noLibrary) {
        this.noLibrary = noLibrary;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}


