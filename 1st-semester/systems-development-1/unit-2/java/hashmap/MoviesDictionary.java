/*
Create a Java program that allows you to read 20 movie names and the duration of the movie; it must be stored in a hashmap dictionary.
Print the dictionary and then ask the user to enter a movie name and display its duration.
*/

import java.util.HashMap;
import java.util.Scanner;

public class MoviesDictionary {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> movies = new HashMap<>();
        String movieName;
        int movieDuration;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce a movie name: ");
            movieName = input.next();

            System.out.println("Duration: ");
            movieDuration = input.nextInt();

            movies.put(movieName, movieDuration);
        }

        System.out.println(movies);
        System.out.println("Type a movie name: ");
        movieName = input.next();

        if (movies.containsKey(movieName)) {
            movieDuration = movies.get(movieName);
            System.out.println("Movie duration: " + movieDuration);
        } else {
            System.out.println("That movie isn't in the dictionary.");
        }

        input.close();
    }
}
