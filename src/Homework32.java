import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

public class Homework32 {

  public static Map<Month, Integer> buildMonthsMap() {
    Map<Month, Integer> months = new HashMap<>();

    months.put(Month.JANUARY, 31);
    months.put(Month.FEBRUARY, 28);
    months.put(Month.MARCH, 31);
    months.put(Month.APRIL, 30);
    months.put(Month.MAY, 31);
    months.put(Month.JUNE, 30);
    months.put(Month.JULY, 31);
    months.put(Month.AUGUST, 31);
    months.put(Month.SEPTEMBER, 30);
    months.put(Month.OCTOBER, 31);
    months.put(Month.NOVEMBER, 30);
    months.put(Month.DECEMBER, 31);

    return months;
  }

  public static Map<Month, Season> buildSeason() {
    Map<Month, Season> seasons = new HashMap<>();

    seasons.put(Month.JANUARY, Season.WINTER);
    seasons.put(Month.FEBRUARY, Season.WINTER);
    seasons.put(Month.MARCH, Season.SPRING);
    seasons.put(Month.APRIL, Season.SPRING);
    seasons.put(Month.MAY, Season.SPRING);
    seasons.put(Month.JUNE, Season.SUMMER);
    seasons.put(Month.JULY, Season.SUMMER);
    seasons.put(Month.AUGUST, Season.SUMMER);
    seasons.put(Month.SEPTEMBER, Season.FALL);
    seasons.put(Month.OCTOBER, Season.FALL);
    seasons.put(Month.NOVEMBER, Season.FALL);
    seasons.put(Month.DECEMBER, Season.WINTER);

    return seasons;


  }

  public static void main(String[] args) throws IOException  {
    BufferedReader imputReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the minth: ");
    String month = imputReader.readLine();

  }
}
