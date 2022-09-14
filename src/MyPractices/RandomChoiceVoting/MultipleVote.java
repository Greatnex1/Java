package MyPractices.RandomChoiceVoting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static MyPractices.RandomChoiceVoting.TallyVotes.readFile;

public class MultipleVote {
    public static void main(String[] args)throws FileNotFoundException {

        Scanner input = new Scanner(new File("vote.txt"));
        ArrayList<Ballot> ballots = readFile(input);

        int round = 1;
        boolean done = false;

        while (!done) {
            System.out.println("Round #" + round);
            Collections.sort(ballots);
            done = oneRound(ballots);
            System.out.println("----------------------------------");
            round++;
        }
    }
        public static ArrayList<Ballot> readFile(Scanner input){
            ArrayList <Ballot> result = new ArrayList<>();
            while(input.hasNext()){
                String text = input.nextLine();
                result.add(new Ballot(text.split("\t")));
            }
            return result;
        }
        public  static boolean oneRound(ArrayList<Ballot> ballots){
        String top = null;
        String bottom = null;
        int topCount = 0;
        int bottomCount = ballots.size() + 1;
        int index = 0;
        while (index < ballots.size()){
            String next = ballots.get(index).getCandidate();
            int count = processVotes(next, index, ballots);
            if(count > topCount){
                topCount = count;
                top = next;
            }
            if(count < bottomCount){
                bottomCount = count;
                bottom = next;
        }
            index += count;
        }
            if(topCount == bottomCount) {
                System.out.println("Election has no winner");
                return  true;
            } else if (topCount > ballots.size()/2.0) {
                System.out.println("Winner is " + top);
                return  true;
            }
            else {
                System.out.println("No winner, eliminating" + bottom);
                eliminate(bottom,ballots);
                return false;
            }

            }

    private static void eliminate(String cadidate, ArrayList<Ballot> ballots) {
        for (Ballot b : ballots) {
            b.eliminate(cadidate);
        }
    }

    public static int processVotes(String name, int index, ArrayList<Ballot> ballots) {
        int count =0;
        while (index < ballots.size() && ballots.get(index).getCandidate().equals(name)) {
            index++;
            count++;
        }

        double percent = 100.0 * count / ballots.size();
        System.out.printf("%d votes for  %s (%4.1f%%)\n", count, name, percent);
        return count ;  }

}



