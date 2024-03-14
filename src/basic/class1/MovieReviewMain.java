package basic.class1;

import java.time.Duration;
import java.time.Instant;

public class MovieReviewMain {
    public static void main(String[] args) {
        Instant beforeTime = Instant.now();  // 코드 실행 전에 시간 받아오기
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
        Instant afterTime = Instant.now();
        long diffTime = Duration.between(beforeTime, afterTime).toMillis(); // 두 개의 실행 시간
        System.out.println("실행 시간(ms): " + diffTime);
    }
}
