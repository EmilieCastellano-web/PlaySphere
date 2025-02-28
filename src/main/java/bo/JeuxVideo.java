package bo;

public class JeuxVideo {

    private long noJeuxVideo;
    private String titre;
    private String editeur;
    private int ageConseille;
    private int memoire;
    private boolean acheter;

    public JeuxVideo(long noJeuxVideo, String titre, String editeur, int ageConseille, int memoire, boolean acheter) {
        this.noJeuxVideo = noJeuxVideo;
        this.titre = titre;
        this.editeur = editeur;
        this.ageConseille = ageConseille;
        this.memoire = memoire;
        this.acheter = acheter;
    }

    public JeuxVideo() {
    }


    public int getMemoire() {
        return memoire;
    }

    public void setMemoire(int memoire) {
        this.memoire = memoire;
    }

    public boolean isAcheter() {
        return acheter;
    }

    public void setAcheter(boolean acheter) {
        this.acheter = acheter;
    }

    public long getNoJeuxVideo() {
        return noJeuxVideo;
    }

    public void setNoJeuxVideo(long noJeuxVideo) {
        this.noJeuxVideo = noJeuxVideo;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getAgeConseille() {
        return ageConseille;
    }

    public void setAgeConseille(int ageConseille) {
        this.ageConseille = ageConseille;
    }
}
