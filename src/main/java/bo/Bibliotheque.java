package bo;

public class Bibliotheque {

    private long noLibrary;
    private String libelle;

    public Bibliotheque() {
    }

    public Bibliotheque(String libelle) {
        this.libelle = libelle;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bibliotheque ");
        sb.append("noLibrary : ").append(noLibrary);
        sb.append(", libelle : '").append(libelle).append('\'');
        return sb.toString();
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


