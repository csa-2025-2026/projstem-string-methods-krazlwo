public class Main
{
  public static void main(String[] args)
  {
   lastFirstN("cream", "butter", 3);
   stringManip("hello", "dogman");
   System.out.println(removeStr("mushroom", "ush"));
   

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstn;
    String lastn;

   //ex 
   //s1 = cream
   //s2 = butter
   //n = 3
   // output should give 4

   firstn = s1.substring(0, n);
   
   //last n letters of s2
   int startPosition;
   startPosition = s2.length() - n;
   lastn = s2.substring(startPosition);
  

    output = firstn + lastn;
    System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    String poe;
    poe = s1.toUpperCase();

    //string s2

    String joe;
    joe = s2.substring(0, 1);
    String firstcapletter;
    String lowercaseletters;
    String printedlowletters; 

    firstcapletter = joe.toUpperCase();
    lowercaseletters = s2.substring(1);
    printedlowletters = lowercaseletters.toLowerCase();


    System.out.println(poe);
    System.out.println(firstcapletter + printedlowletters);
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
  //  int id;
    //id = s1.indexOf(s2);
    //int pie;
    //pie = s2.length(); (needed to put id in the front)

  //String before;
  //String after;

    //before = s1.substring(id, pie);
    //after = s1.substring(pie);

    //String output = before + after;
    //return output;
    String output;
    String before;
    String after;
    int startofs2 = s1.indexOf(s2);
    int endofs2 = startofs2 + s2.length(); 

    before = s1.substring(0, startofs2);
    after = s1.substring(endofs2);
    output = before + after;
    return output;
  }
}
