package inheritance;

public class Review {
    String body = "";
    String author = "";
    float stars;
    String establishment = "";
    String movie = null;

    public Review(String body, String author, int stars, Establishment establishment){
        this.body = body;
        this.author = author;
        this.stars = (float) stars;
        this.establishment = establishment.name;
    }

    public Review(String body, String author, int stars, Establishment establishment, String movie){
        this.body = body;
        this.author = author;
        this.stars = (float) stars;
        this.establishment = establishment.name;
        this.movie = movie;
    }

    @Override
    public String toString(){
        String info = "";
        info += establishment + "\n";
        info += "Written by: " + author + "\n";
        if(movie != null) {
            info += "Movie: " + movie + "\n";
        }
        info += stars + "/5\n";

        info += "Body: " + body;
        return info;
    }
}
