package org.softserve.academy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.lang.*;
import java.util.*;

class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;
    // constructor, getters, setters

    Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(getRanking(), otherPlayer.getRanking());
    }

    public String getName() {
        return name;
    }
}

class PlayerRankingComparator implements Comparator<Player> {

    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
        return Integer.compare(firstPlayer.getRanking(), secondPlayer.getRanking());
    }

}

class PlayerAgeComparator implements Comparator<Player> {

    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
        return Integer.compare(firstPlayer.getAge(), secondPlayer.getAge());
    }

}

public class FootballTeam {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 30);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : ");
        LinkedList<String> playersName = new LinkedList<String>();
        for (Player player : footballTeam) playersName.add(player.getName());
        System.out.println(playersName);

        Collections.sort(footballTeam);

        System.out.print("\nAfterSorting : ");
        playersName.clear();
        for (Player player : footballTeam) playersName.add(player.getName());
        System.out.println(playersName);

        PlayerAgeComparator playerComparator = new PlayerAgeComparator();
        //Collections.sort(footballTeam, playerComparator);
        footballTeam.sort(playerComparator);
        System.out.print("\nAfterSorting by age: ");
        playersName.clear();
        for (Player player : footballTeam) playersName.add(player.getName());
        System.out.println(playersName);

//        Comparator byRanking =
//                Comparator.comparingInt(Player::getRanking);
//        Comparator<Player> byRanking = Comparator
//                .comparing(Player::getRanking);

        Comparator<Player> byRanking = (pl1, pl2) -> Integer.compare(pl1.getRanking(), pl2.getRanking());
        footballTeam.sort(byRanking);
        System.out.print("\nAfterSorting by R: ");
        playersName.clear();
        for (Player player : footballTeam) playersName.add(player.getName());
        System.out.println(playersName);

        Comparator<Player> byName  = Comparator
                .comparing(Player::getName);
        footballTeam.sort(byName);
        System.out.print("\nAfterSorting by Name: ");
        playersName.clear();
        for (Player player : footballTeam) playersName.add(player.getName());
        System.out.println(playersName);
    }
}
