package inheritance;

public class Review {
    String body = "";
    String author = "";
    float stars;
    String restaurant = "";

    public Review(String body, String author, int stars, Restaurant restaurant){
        this.body = body;
        this.author = author;
        this.stars = (float) stars;
        this.restaurant = restaurant.name;
    }

    @Override
    public String toString(){
        String info = "";
        info += restaurant + "\n";
        info += "Written by: " + author + "\n";
        info += "Body: " + body + "\n";
        info += stars + "/5";
        return info;
    }
}
