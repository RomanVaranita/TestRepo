public class Main {
  enum Season {
    WINTER,
    SPRING,
    SUMMER,
    FALL,
  }
  public static Season getSeason(String month) {
    return switch (month.toLowerCase() ) {
     case "dec", "jan", "feb" -> Season.WINTER;
     case "mar", "apr", "may" -> Season.SPRING;
     case "jun", "jul", "aug" -> Season.SUMMER;
     case "sep", "oct", "nov" -> Season.FALL;
    };
  }

  public static void main(String[] args) {
    System.out.println("Hello world!");

  }
}