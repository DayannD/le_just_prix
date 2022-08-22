public class Objet {

    private float prix;
    private String photo;
    private String article;

    public Objet(float prix, String photo, String article) {
        this.prix = prix;
        this.photo = photo;
        this.article = article;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
