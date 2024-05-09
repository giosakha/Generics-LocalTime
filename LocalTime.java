package genlocal;
//Locale.forLanguage
import java.util.Locale;
import java.text.NumberFormat;

class LocaleConstantExample {
  public static void main(String[] args) {
      Locale usLocale = Locale.forLanguageTag("en-US");
      Locale deLocale = Locale.forLanguageTag("de-DE"); // Corrected language tag for Germany

      long number = 123456789L;
      NumberFormat denf = NumberFormat.getInstance(deLocale);
      NumberFormat usnf = NumberFormat.getInstance(usLocale);

      System.out.println(denf.format(number)); // Printing formatted number using German locale
      System.out.println(usnf.format(number)); // Printing formatted number using US locale
  }
}
//easiest wya to create the obj
import java.util.Locale;
import java.text.NumberFormat;

class LocaleConstantExample {
  public static void main(String[] args) {
      Locale deLocale = Locale.GERMANY;
      Locale usLocale = Locale.US;

      long number = 123456789L;
      NumberFormat denf = NumberFormat.getInstance(deLocale);
      NumberFormat usnf = NumberFormat.getInstance(usLocale);

      System.out.println(denf.format(number));
      System.out.println(usnf.format(number));
  }
}
//creating prior lists
import java.util.Locale;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class LanguageTagFilteringExample {
  public static void main(String[] args) {
      String ranges = "en-US; q=1.0, en-GB; q=0.5, de-DE; q=0.9";
      List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(ranges);

      Collection<Locale> localesList = new ArrayList<>();
      localesList.add(Locale.forLanguageTag("en-GB"));
      localesList.add(Locale.forLanguageTag("en-US"));
      localesList.add(Locale.forLanguageTag("ja-JP"));
      localesList.add(Locale.forLanguageTag("fr-FR"));

      List<Locale> filteredSet = Locale.filter(languageRanges, localesList);

      for (Locale locale : filteredSet) {
          System.out.println(locale.toString());
       }
    }
}
