package bo;

public class JeuxVideo {

    private long noJeuxVideo;
    private String titre;
    private String editeur;
    private int ageConseille;


    public JeuxVideo(String titre, String editeur, int ageConseille) {
        this.titre = titre;
        this.editeur = editeur;
        this.ageConseille = ageConseille;
    }

    public JeuxVideo() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JeuxVideo ");
        sb.append("noJeuxVideo : ").append(noJeuxVideo);
        sb.append(", titre : '").append(titre).append('\'');
        sb.append(", editeur : '").append(editeur).append('\'');
        sb.append(", ageConseille : ").append(ageConseille);

        return sb.toString();
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
