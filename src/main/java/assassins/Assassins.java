package assassins;

import java.util.ArrayList;

public class Assassins {
  ArrayList<String> player = new ArrayList<String>(); 
  ArrayList<String> target = new ArrayList<String>(); 
  String[] match; 
  // SAMPLE NAMES 
  public Assassins() {
    player.add("alisa topuz");
    player.add("Leo tomes");
    player.add("Amy griffith");
    player.add("Massimo elrefaie");
    player.add("William Booth");
    player.add("Zain Nawaz");
    player.add("Sam Henderson");
    player.add("Liam Rohacek");
    player.add("Amna yasir");
    player.add("madi malloy-gomes");
    player.add("Jessica Richardson");
    player.add("Nishaan Roshan");
    player.add("Emily Ackroyd");
    player.add("Alex Wang");
    player.add("Kristina Nikitopoulos");
    player.add("Bella Bartlett");
    player.add("Hajer Allani");
    player.add("Sahar Sultani");
    player.add("Adam Selim");
    player.add("Enna Malhotra");
    player.add("Katie Archer");
    player.add("Jack Guillemette");
    player.add("addison milton");
    player.add("sophia mcdonald");
    player.add("Michael Johnstone");
    player.add("Saif akbar");
    player.add("Brianna Varcoe");
    player.add("James vosper");
    player.add("Allison Kim");
    player.add("Sami Gupta");
    player.add("Abdul Haddad");
    player.add("Bartu Bilgen");
    player.add("Bridgett Burton");
    player.add("Karim Abadeer");
    player.add("Oscar Davies");
    player.add("Lauren Heath");
    player.add("Ella Carriere");
    player.add("Matthew Kozanczyn");
    player.add("Owen Luongo");
    player.add("Chris Matthews");
    player.add("Jack Janavicius");
    player.add("Lina Alhamzawi");
    player.add("Beatrice Abid");
    player.add("Ivey Caldwell");
    player.add("Cameron Grandfield");
    player.add("JP Lopes");
    player.add("Rowan Clements");
    player.add("Rahul Patel");
    player.add("Mousa Adnan");
    player.add("Kate Viaene");
    player.add("Ethan Wang");
    player.add("Neha Gobin");
    player.add("Sienna Coughlin");
    player.add("Zahra Saeed");
    player.add("Justin Yi");
    player.add("Radu Romanovschi");
    player.add("vivienne georgiou");
    player.add("Ariel Huang");
    player.add("Ethan Roberts");
    player.add("Matthew Nikkari");
    player.add("Amy Wang");
    player.add("Selina Mancuso");
    player.add("Ken Chen");
    player.add("Ricardo Rodriguez");
    player.add("Hashem Alqusus");
    player.add("Erwin zhang");
    player.add("Ryan stevens");

    target.add("alisa topuz");
    target.add("Leo tomes");
    target.add("Amy griffith");
    target.add("Massimo elrefaie");
    target.add("William Booth");
    target.add("Zain Nawaz");
    target.add("Sam Henderson");
    target.add("Liam Rohacek");
    target.add("Amna yasir");
    target.add("madi malloy-gomes");
    target.add("Jessica Richardson");
    target.add("Nishaan Roshan");
    target.add("Emily Ackroyd");
    target.add("Alex Wang");
    target.add("Kristina Nikitopoulos");
    target.add("Bella Bartlett");
    target.add("Hajer Allani");
    target.add("Sahar Sultani");
    target.add("Adam Selim");
    target.add("Enna Malhotra");
    target.add("Katie Archer");
    target.add("Jack Guillemette");
    target.add("addison milton");
    target.add("sophia mcdonald");
    target.add("Michael Johnstone");
    target.add("Saif akbar");
    target.add("Brianna Varcoe");
    target.add("James vosper");
    target.add("Allison Kim");
    target.add("Sami Gupta");
    target.add("Abdul Haddad");
    target.add("Bartu Bilgen");
    target.add("Bridgett Burton");
    target.add("Karim Abadeer");
    target.add("Oscar Davies");
    target.add("Lauren Heath");
    target.add("Ella Carriere");
    target.add("Matthew Kozanczyn");
    target.add("Owen Luongo");
    target.add("Chris Matthews");
    target.add("Jack Janavicius");
    target.add("Lina Alhamzawi");
    target.add("Beatrice Abid");
    target.add("Ivey Caldwell");
    target.add("Cameron Grandfield");
    target.add("JP Lopes");
    target.add("Rowan Clements");
    target.add("Rahul Patel");
    target.add("Mousa Adnan");
    target.add("Kate Viaene");
    target.add("Ethan Wang");
    target.add("Neha Gobin");
    target.add("Sienna Coughlin");
    target.add("Zahra Saeed");
    target.add("Justin Yi");
    target.add("Radu Romanovschi");
    target.add("vivienne georgiou");
    target.add("Ariel Huang");
    target.add("Ethan Roberts");
    target.add("Matthew Nikkari");
    target.add("Amy Wang");
    target.add("Selina Mancuso");
    target.add("Ken Chen");
    target.add("Ricardo Rodriguez");
    target.add("Hashem Alqusus");
    target.add("Erwin zhang");
    target.add("Ryan stevens");
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

      if (!p.equals(t) && !found)
      {
        player.remove(0); 
        target.remove(randTarget); 
        match[i] = p + "-" +  t; 
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