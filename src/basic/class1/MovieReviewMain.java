package basic.class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "1";
        movieReview1.review = "2";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "3";
        movieReview2.review = "4";

        MovieReview[] movieReviewList = {movieReview1, movieReview2};
        for(MovieReview movieReview: movieReviewList){
            System.out.println(movieReview.title);
            System.out.println(movieReview.review);
        }
    }
}
