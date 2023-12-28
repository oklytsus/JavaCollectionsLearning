package org.softserve.academy;

import java.util.*;

class MovieInfo {
    private String director;
    private int year;
    private int rating;

    public String getDirector() {
        return director;
    }

    public Integer getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    MovieInfo(String director, int year, int rating) {
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{Director=" + director + ", Year=" + year + ", Rating=" + rating + "}";
    }
}

public class MoviesMap {
    public static void main(String[] args) {
        Map<String, MovieInfo> movieCollection = new HashMap<>();
        MovieInfo obj1 = new MovieInfo("Dir1", 2010, 7);
        movieCollection.put("Title 1", obj1);
        movieCollection.put("Title 2", new MovieInfo("Dir2", 1980, 10));
        movieCollection.put("Title 3", new MovieInfo("Dir2", 2000, 10));
        movieCollection.put("Title 4", new MovieInfo("Dir4", 2001, 5));
        movieCollection.put("Title 5", new MovieInfo("Dir2", 2019, 8));
        movieCollection.put("Title 6", new MovieInfo("Dir6", 2010, 3));

        //Get the info of a movie by its key
        Set<String> keys = movieCollection.keySet();
        for (String key : keys) {
            System.out.print(key + ": ");
            System.out.println(movieCollection.get(key));
        }
        String movieTitle = "Title 4";
        Map<String, MovieInfo> movie = new HashMap<>();
        MovieInfo movieEntry = movieCollection.get(movieTitle);
        movie.put(movieTitle, movieEntry);
        System.out.println("\nMovie by it's key " + movieTitle + " :" + movie);

        //Find all movies by a given director
        String famousDirector = "Dir2";
        System.out.println("\nMovies of " + famousDirector + ": ");
//        for (String key : keys) {
//            MovieInfo value= movieCollection.get(key);
//            if (value.getDirector().equalsIgnoreCase(famousDirector)) {
//                System.out.println(key + ": " +movieCollection.get(key));
//            }
//        }

        for (Map.Entry<String, MovieInfo> entry : movieCollection.entrySet()) {
            if (entry.getValue().getDirector().contains(famousDirector)) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        //Print all movies sorted by year
        Map<Integer, MovieInfo> sortedMovies = new TreeMap<>();
        for (Map.Entry<String, MovieInfo> entry : movieCollection.entrySet()) {
            sortedMovies.put(entry.getValue().getYear(), entry.getValue());
        }
        System.out.println("\n Sorted by Year:");
        //System.out.println(sortedMovies);
        for (Map.Entry m : sortedMovies.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
//        for (Map.Entry m : sortedMovies.entrySet()) {
//            for (Map.Entry<String, MovieInfo> m1 : movieCollection.entrySet()) {
//                if (m1.getValue().equals(m.getValue())) {
//                    System.out.println(m1.getKey() + " " + m.getValue());
//                }
//            }
//        }
        List<MovieInfo> lm = new ArrayList<>();
        for (Map.Entry<String, MovieInfo> entry : movieCollection.entrySet()) {
            lm.add(entry.getValue());
        }

        Comparator<MovieInfo> byYear = Comparator.comparing(MovieInfo::getYear);
        lm.sort(byYear);

        for (MovieInfo myMovie : lm) {
            for (Map.Entry<String, MovieInfo> m1 : movieCollection.entrySet()) {
                if (m1.getValue().equals(myMovie)) {
                    System.out.println(m1.getKey() + " " + m1.getValue());
                }
            }
        }

        //Delete movies within a range of years (e.g. 2000-2010)
        final int startYear = 2000;
        final int endYear = 2010;
        System.out.println("\nMovies Collection without years of " + startYear + " to " + endYear + ":");
        Iterator<Map.Entry<String, MovieInfo>> iter = movieCollection.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, MovieInfo> value = iter.next();
            if (value.getValue().getYear() >= startYear && value.getValue().getYear() <= endYear) {
                iter.remove();
            }
        }
        System.out.println(movieCollection);


    }
}