package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    float stars = 0;
    int totalReviews;
    String price = "$";
    ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, int price){
        this.name = name;
        this.price = this.price.repeat(price);
    }

    public Review addReview(Review review){
        reviews.add(review);
        this.totalReviews++;
        this.stars = (float) ((this.stars + review.stars) / (float) totalReviews);
        return review;
    }

    @Override
    public String toString(){
        String info = "";
        info += this.name + "\n";
        info += stars + "/5"+ "\n";
        info += this.price;
        if(reviews.size() == 1){
            info += "\n" + reviews.size() + " Review";
        } else if(reviews.size() > 0) {
            info += "\n" + reviews.size() + " Reviews";
        }
        return info;
    }
}
