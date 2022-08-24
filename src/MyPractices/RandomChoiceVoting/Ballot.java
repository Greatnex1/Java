package MyPractices.RandomChoiceVoting;

import java.util.ArrayList;
import java.util.Arrays;

public class Ballot implements Comparable<Ballot> {
    private ArrayList <String> preferences;

    public Ballot(String[] names) {
        preferences = new ArrayList<>();
//        for ( String next: names
//             ) {preferences.add(next);}
//
      preferences.addAll(Arrays.asList(names));
    }
//    returns the current first-choice for this ballot
    public String getCandidate(){
        return preferences.get(0);
    }
    public void eliminate(String name){
        preferences.remove(name);
    }
//    compares ballots alphabetically by firs choice candidate

    public int compareTo(Ballot other){
        return getCandidate().compareTo(other.getCandidate());
    }
}
