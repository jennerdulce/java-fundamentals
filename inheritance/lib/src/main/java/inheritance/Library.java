/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args){
        Theater amc = new Theater("AMC", 3);
        Review testReview = new Review("Testing body paragraph", "Jenner Dulce", 5, amc, "Hulk");
        System.out.println(testReview);
    }
}
