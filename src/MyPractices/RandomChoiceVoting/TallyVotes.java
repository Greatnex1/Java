package MyPractices.RandomChoiceVoting;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//this program reads a data file and counts candidates vote via  vote.txt
public class TallyVotes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("vote.txt"));
        ArrayList<Ballot> ballots = readFile(input);
        Collections.sort(ballots);
        oneRound(ballots);

    }



    //Reads a data file of voter preference, returning a list of the resulting ballots
    public static ArrayList<Ballot> readFile(Scanner input) {
        ArrayList<Ballot> result = new ArrayList<>();
        while(input.hasNext()){
            String text = input.nextLine();
            result.add(new Ballot(text.split("\t")));
        }
        return result;
    }
    public static void oneRound(ArrayList<Ballot> ballots) {
        int index = 0;
        while (index < ballots.size()) {
           String next = ballots.get(index).getCandidate();
            int count = processVotes(next, index, ballots);
            index += count;

        }
    }

    public static int processVotes(String name, int index, ArrayList<Ballot> ballots) {
        int count = 0;
        while (index < ballots.size() && ballots.get(index).getCandidate().equals(name)) {
            index++;
            count++;
        }

        double percent = 100.0 * count / ballots.size();
        System.out.printf("%d votes for  %s (%4.1f%%)\n", count, name, percent);
    return count ;  }




}
