package assassins;

import java.util.ArrayList;

public class Assassins {
  ArrayList<String> player = new ArrayList<String>(); 
  ArrayList<String> target = new ArrayList<String>(); 
  String[] match; 

  public Assassins() {
    String rawNames = "alisa topuz Leo tomes Amy griffith Massimo elrefaie William Booth Zain Nawaz Sam Henderson Liam Rohacek Amna yasir madi malloy-gomes Jessica Richardson Nishaan Roshan Emily Ackroyd Alex Wang Kristina Nikitopoulos Bella Bartlett Hajer Allani Sahar Sultani Adam Selim Enna Malhotra Katie Archer Jack Guillemette addison milton sophia mcdonald Michael Johnstone Saif akbar Brianna Varcoe James vosper Allison Kim Sami Gupta Abdul Haddad Bartu Bilgen Bridgett Burton Karim Abadeer Oscar Davies Lauren Heath Ella Carriere Matthew Kozanczyn Owen Luongo Chris Matthews Jack Janavicius Lina Alhamzawi Beatrice Abid Ivey Caldwell Cameron Grandfield JP Lopes Rowan Clements Rahul Patel Mousa Adnan Kate Viaene Ethan Wang Neha Gobin Sienna Coughlin Zahra Saeed Justin Yi Radu Romanovschi vivienne georgiou Ariel Huang Ethan Roberts Matthew Nikkari Amy Wang Selina Mancuso Ken Chen Ricardo Rodriguez Hashem Alqusus Erwin zhang Ryan stevens Sachin Khandelwal Wesley Meynen Cassidy Armitage Sara solano Xavier baie Radu Stefan Jackson Bennitt Tameem Ghadri Adrian vedlin Rahil kochhar Karim Halwani Ashley Jarvis Theo Haag Britney Biney Oliver Baker Sureena Bhatia Hareem Shaikh Twheda Hassan Griffin Gault luca barbeito Tej Sangha Zainab Haroon Damian Desousa Rachael MacBeth Alyssa Edwards Evan Stagg";
    String[] namesArr = new String[400];
    namesArr = rawNames.split("\\s+");

    for (int i = 0; i < namesArr.length; i += 2) {
      player.add(namesArr[i] + " " + namesArr[i + 1]);
    }
    
    for (int i = 0; i < namesArr.length; i += 2) {
      target.add(namesArr[i] + " " + namesArr[i + 1]);
    }
    match = new String[player.size()]; 
  }


  public static void main(String args[]) {
    Assassins game = new Assassins(); 
    game.Matchups(); 
    String results = game.StringMatch(); 
    System.out.println(results);
  }

  public String[] Matchups() {
    int n = player.size();
    for (int i = 0; i < n;) {
      int randTarget = (int)(Math.random() * player.size()); 
      String p = player.get(0); 
      String t = target.get(randTarget);
      
      boolean found = false;

      for (String f : match) {
        if ((t + "-" + p).equals(f)) { 
          found = true; 
          break;
        }
      }

      if (!p.equals(t) && !found) {
        player.remove(0); 
        target.remove(randTarget); 
        match[i] = i + 1 + ": " + p + " - " +  t; 
        i++;
      }
    }
    return match; 
  }

  public String StringMatch() {
    String[] matchups = Matchups(); 
    StringBuilder results = new StringBuilder(); 
    
    for (String i : matchups) { 
      results.append(i); 
      results.append("\n"); 
    }

    return results.toString(); 
  }
}