package org.softserve.academy;

import java.util.*;

class Movie {
    private String name;
    private int year;
    private int rating;

    public String getName() {
        return name;
    }

    public Integer getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    Movie(String name, int year, int rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" + name + ", Year=" + year + ", Rating=" + rating + "}";
    }
}

public class MovieMain {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Stranger", 2021, 10));
        movies.add(new Movie("Wind of main", 2014, 8));
        movies.add(new Movie("New reality", 1980, 3));
        Movie obj5 = new Movie("Star Wars", 1999, 4);
        Movie obj6 = new Movie("Millenium", 2020, 9);
        movies.add(obj5);
        movies.add(obj6);

        System.out.println("List of movies:");
        for (Movie movie : movies) System.out.println(movie);
        //Print all movies released after 2010
        final int yearReleased = 2010;
        System.out.printf("\nMovies released after %d:", yearReleased);
        for (Movie movie : movies) {
            if (movie.getYear() >= yearReleased) System.out.println(movie);
        }
        //Sort the movies by rating (from highest to lowest)
//        movies.sort(new Comparator<Movie>() {
//            @Override
//            public int compare(Movie m1, Movie m2) {
//                return (int) (m1.getRating() - m2.getRating());
//            }
//        });
        Comparator<Movie> byRating = Comparator.comparing(Movie::getRating);
        movies.sort(byRating);
        System.out.println("\n by Rating:");
        for (Movie movie : movies) System.out.println(movie);

        //Print the names of all movies
        ArrayList<String> moviesNames = new ArrayList<String>();
        for (Movie movie : movies) moviesNames.add(movie.getName());
        System.out.println("\nMovies names: " + moviesNames);

        //Find the movie with the highest rating
//        Movie bestMovie = movies.get(0);
//        for (Movie movie : movies) {
//            if (movie.getRating() > bestMovie.getRating()) {
//                bestMovie = movie;
//            }
//        }
        ArrayList<Integer> moviesRating = new ArrayList<Integer>();
        for (Movie movie : movies) moviesRating.add(movie.getRating());
        int highestRating = Collections.max(moviesRating);
        System.out.println("\nMovie with the highest rating is: ");
        for (Movie movie : movies) {
            if (movie.getRating() == highestRating) System.out.println(movie);
        }

        //Remove all movies from the collection with a rating lower than a given value
        final int lowestRating = 5;
//        for (int i = 0; i < movies.size(); i++) {
//            Movie movie = movies.get(i);
//            if (movie.getRating() < lowestRating) {
//                movies.remove(movie);
//                i--;
//            }
//        }
        movies.removeIf(movie -> movie.getRating() < lowestRating);
        System.out.println("\nList after deletion:");
        for (Movie movie : movies) System.out.println(movie);

        //Check if a movie with a given name is in the collection
        String movieName = "Star Wars";
        boolean isMovie = false;
        boolean hasParasite = false;

        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                System.out.println("\nMovie \"" + movieName + "\" was found:" + movie);
                isMovie = true;
                break;
            }
        }
        if (!isMovie) {
            System.out.println("\nMovie \"" + movieName + "\" was not found");
        }


    }
}
