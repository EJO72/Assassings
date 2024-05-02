package assassins;

import java.util.ArrayList;

public class Assassins {
  ArrayList<String> player = new ArrayList<String>(); 
  ArrayList<String> target = new ArrayList<String>(); 
  String[] match; 

  public Assassins() {
    // fill in names here
    String rawNames = "";
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