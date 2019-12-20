import java.util.*;

import static java.util.stream.Collectors.toMap;

public class ProblemB {
  public static void main(String[] args) {
    int maxTestCase = 500;
    int minCandidates = 2;
    int maxCandidates = 10;
    int maxVotes = 50000;
    int enteredVotes = 0;
    int contestedCandidates = 0;
    int contestedCandidatesNumber = 1;
    int enteredTestcases = 0;
    int totalVotesPerCase = 0;
    List<String> winners= new ArrayList<String>();
    Map<Integer, Integer> candidateVoteMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt()) {
      enteredTestcases = sc.nextInt();
    }
    if (enteredTestcases > 0 && enteredTestcases <= 500) {
      while (enteredTestcases > 0) {
        contestedCandidatesNumber = 0;
        totalVotesPerCase = 0;
        if (sc.hasNextInt()) {
          contestedCandidates = sc.nextInt();
          if (contestedCandidates >= minCandidates && contestedCandidates < maxCandidates) {
            while (contestedCandidates > 0) {
              if (sc.hasNextInt()) {
                enteredVotes = sc.nextInt();
                if (enteredVotes < maxVotes) {
                  candidateVoteMap.put(contestedCandidatesNumber, enteredVotes);
                } else {
                  System.out.println("No entry for votes");
                }
                totalVotesPerCase = totalVotesPerCase + enteredVotes;
                enteredVotes = 0;
                contestedCandidates--;
                contestedCandidatesNumber++;
              }
            }
            Map<Integer, Integer> sortedMap = candidateVoteMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                    LinkedHashMap::new));

            Iterator<Integer> itr2 = sortedMap.keySet().iterator();
           // System.out.println("totalVotesPerCase "+totalVotesPerCase);
           // System.out.println("contestedCandidatesNumber "+ contestedCandidatesNumber);
            while (itr2.hasNext()) {
              Integer key = itr2.next();
              Integer topVotes = sortedMap.get(key);
              //System.out.println("top votes  "+ topVotes);
              if (((topVotes * 100) / totalVotesPerCase) > 50) {
                //System.out.println("majority winner " + (key+1));
                winners.add("majority winner " + (key+1));
                break;
              } else if (((topVotes * 100) / totalVotesPerCase) <=50) {
                if (topVotes == totalVotesPerCase / (contestedCandidatesNumber)) {
                  //System.out.println("no winner ");
                  winners.add("no winner ");
                  break;
                } else {
                 // System.out.println("minority winner " + (key+1));
                  winners.add("minority winner " + (key+1));
                  break;
                }
              }
              sortedMap= new HashMap<>();
              candidateVoteMap= new HashMap<>();
            }
          } else {
            System.out.println("Enter valid number of contestants");
          }

        } else {
          System.out.println("Enter valid number of testcases");
        }
        enteredTestcases--;
      }
    } else {
      System.out.println("Too many testcases");
    }
    winners.forEach(System.out::println);
  }

}
