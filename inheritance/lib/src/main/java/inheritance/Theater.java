package inheritance;

import java.util.ArrayList;
import java.lang.Exception;

public class Theater extends Establishment{
    ArrayList<String> listOfMovies = new ArrayList<>();

    public Theater(String name, int price) {
        super(name, price);
    }

    public String addMovie(String movie){
        listOfMovies.add(movie);
        return "" + movie + "added to the collection";
    }

    public String removeMovie(String movie) {
        int movieList = listOfMovies.size();
        for(int i = 0; i < movieList; i++){
            if(listOfMovies.get(i) == movie){
                listOfMovies.remove(i);
                return "" + movie + "successfully removed from the collection";
            }
        }
//        throw new Exception("Movie" + movie + "is not in the collection");
        return "Movie" + movie + "is not in the collection";
    }

    @Override
    public String toString(){
        String info = "";
        info += this.name + "\n";
        info += stars + "/5"+ "\n";
        info += this.price + "\n";
        if(reviews.size() == 1){
            info += "\n" + reviews.size() + " Review \n";
        } else if(reviews.size() > 0) {
            info += "\n" + reviews.size() + " Reviews \n";
        }
        if(listOfMovies.size() > 0){
            info += "Movies: " + listOfMovies;
        }
        return info;
    }
}

// Streams, collections, lambdas