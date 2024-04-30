package assassins;

public class NameSplitter {
  public static void main(String args[]) {
    String namesArr[] = Split();
    printNames(namesArr);
  }

  public static String[] Split() {
    String rawNames = "alisa topuz Leo tomes Amy griffith Massimo elrefaie William Booth Zain Nawaz Sam Henderson Liam Rohacek Amna yasir madi malloy-gomes Jessica Richardson Nishaan Roshan Emily Ackroyd Alex Wang Kristina Nikitopoulos Bella Bartlett Hajer Allani Sahar Sultani Adam Selim Enna Malhotra Katie Archer Jack Guillemette addison milton sophia mcdonald Michael Johnstone Saif akbar Brianna Varcoe James vosper Allison Kim Sami Gupta Abdul Haddad Bartu Bilgen Bridgett Burton Karim Abadeer Oscar Davies Lauren Heath Ella Carriere Matthew Kozanczyn Owen Luongo Chris Matthews Jack Janavicius Lina Alhamzawi Beatrice Abid Ivey Caldwell Cameron Grandfield JP Lopes Rowan Clements Rahul Patel Mousa Adnan Kate Viaene Ethan Wang Neha Gobin Sienna Coughlin Zahra Saeed Justin Yi Radu Romanovschi vivienne georgiou Ariel Huang Ethan Roberts Matthew Nikkari Amy Wang Selina Mancuso Ken Chen Ricardo Rodriguez Hashem Alqusus Erwin zhang Ryan stevens";
    String[] namesArr = new String[200];
    namesArr = rawNames.split("\\s+");
    return namesArr;
  } 

  public static void printNames(String[] namesArr) {
    for (int i = 0; i < namesArr.length; i += 2) {
      System.out.println("player.add(\"" + namesArr[i] + " " + namesArr[i + 1] + "\");");
    }
    
    System.out.println("");
    for (int i = 0; i < namesArr.length; i += 2) {
      System.out.println("target.add(\"" + namesArr[i] + " " + namesArr[i + 1] + "\");");
    }
  }
}
