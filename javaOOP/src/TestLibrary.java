import java.util.Scanner;

public class TestLibrary {
  public static void main(String[] args) {
    Scanner insert = new Scanner(System.in);
    Library lib = new Library();
    System.out.println("There is 7 categories of the book in the library:");
    lib.getCategory();
    System.out.println("Fill the data of each category (in sequence)!");

    //TECHNOL0GY BOOK CATEGORY
    System.out.println();

    System.out.print("Total of Technology books category\t: ");
    int intTotalBookEachCategory = insert.nextInt();
    while (intTotalBookEachCategory < 5) {
      System.out.println("You must add minimum 5 books each category!");
      System.out.print("Total of Technology books category\t: ");
      intTotalBookEachCategory = insert.nextInt();
    }
    insert.nextLine();

    System.out.println();

    Library[] Technology = new Library[intTotalBookEachCategory];
    for (int i = 0; i < Technology.length; i++) {
      System.out.printf("\nTitle of technology book no.%d\t: ", (i + 1));
      String TechBookTitle = insert.nextLine();

      System.out.printf("Published year of technology book no.%d\t: ", (i + 1));
      int YearTechBook = insert.nextInt();

      System.out.printf("ID of technology book no.%d\t: ", (i + 1));
      int IDBookTech = insert.nextInt();

      System.out.printf("Total author of technology book no.%d\t: ", (i + 1));
      int TotalAuthorTechBook = insert.nextInt();

      insert.nextLine();
      Technology[i] = new Library(TechBookTitle, YearTechBook, IDBookTech, TotalAuthorTechBook,
          new String[TotalAuthorTechBook]);

      for (int j = 0; j < TotalAuthorTechBook; j++) {
        System.out.printf("\nName of author no.%d of book no.%d\t: ", (j + 1), (i + 1));
        Technology[i].szNameAuthor[j] = insert.nextLine();
      }
    }

    //PHILOSOPHY BOOK CATEGORY
    System.out.print("\nTotal of Philosophy books category\t: ");
    intTotalBookEachCategory = insert.nextInt();
    while (intTotalBookEachCategory < 5) {
      System.out.println("You must add minimum 5 books each category!");
      System.out.print("Total of Philosophy books category\t: ");
      intTotalBookEachCategory = insert.nextInt();
    }
    insert.nextLine();

    System.out.println();

    Library[] Philosophy = new Library[intTotalBookEachCategory];
    for (int i = 0; i < Philosophy.length; i++) {
      System.out.printf("\nTitle of Philosophy book no.%d\t: ", (i + 1));
      String PhiBookTitle = insert.nextLine();

      System.out.printf("Published year of Philosophy book no.%d\t: ", (i + 1));
      int YearPhiBook = insert.nextInt();

      System.out.printf("ID of Philosophy book no.%d\t: ", (i + 1));
      int IDBookPhi = insert.nextInt();

      System.out.printf("Total author of Philosophy book no.%d\t: ", (i + 1));
      int TotalAuthorPhiBook = insert.nextInt();

      insert.nextLine();
      Philosophy[i] = new Library(PhiBookTitle, YearPhiBook, IDBookPhi, TotalAuthorPhiBook,
          new String[TotalAuthorPhiBook]);

      for (int j = 0; j < TotalAuthorPhiBook; j++) {
        System.out.printf("\nName of author no.%d of book no.%d\t: ", (j + 1), (i + 1));
        Philosophy[i].szNameAuthor[j] = insert.nextLine();
      }
    }

    //HISTORY BOOK CATEGORY
    System.out.print("\nTotal of History books category\t: ");
    intTotalBookEachCategory = insert.nextInt();
    while (intTotalBookEachCategory < 5) {
      System.out.println("You must add minimum 5 books each category!");
      System.out.print("Total of History books category\t: ");
      intTotalBookEachCategory = insert.nextInt();
    }
    insert.nextLine();

    System.out.println();

    Library[] History = new Library[intTotalBookEachCategory];
    for (int i = 0; i < History.length; i++) {
      System.out.printf("\nTitle of History book no.%d\t: ", (i + 1));
      String HistoryBookTitle = insert.nextLine();

      System.out.printf("Published year of History book no.%d\t: ", (i + 1));
      int YearHistoryBook = insert.nextInt();

      System.out.printf("ID of History book no.%d\t: ", (i + 1));
      int IDBookHistory = insert.nextInt();

      System.out.printf("Total author of History book no.%d\t: ", (i + 1));
      int TotalAuthorHistoryBook = insert.nextInt();

      insert.nextLine();
      History[i] = new Library(HistoryBookTitle, YearHistoryBook, IDBookHistory, TotalAuthorHistoryBook,
          new String[TotalAuthorHistoryBook]);

      for (int j = 0; j < TotalAuthorHistoryBook; j++) {
        System.out.printf("\nName of author no.%d of book no.%d\t: ", (j + 1), (i + 1));
        History[i].szNameAuthor[j] = insert.nextLine();
      }
    }

    //PSCHYCOLOGY BOOK CATEGORY
    System.out.print("\nTotal of Pschycology books category\t: ");
    intTotalBookEachCategory = insert.nextInt();
    while (intTotalBookEachCategory < 5) {
      System.out.println("You must add minimum 5 books each category!");
      System.out.print("Total of Pschycology books category\t: ");
      intTotalBookEachCategory = insert.nextInt();
    }
    insert.nextLine();

    System.out.println();

    Library[] Pschycology = new Library[intTotalBookEachCategory];
    for (int i = 0; i < Pschycology.length; i++) {
      System.out.printf("\nTitle of Pschycology book no.%d\t: ", (i + 1));
      String PschycologyBookTitle = insert.nextLine();

      System.out.printf("Published year of Pschycology book no.%d\t: ", (i + 1));
      int YearPschycologyBook = insert.nextInt();

      System.out.printf("ID of Pschycology book no.%d\t: ", (i + 1));
      int IDBookPschycology = insert.nextInt();

      System.out.printf("Total author of Pschycology book no.%d\t: ", (i + 1));
      int TotalAuthorPschycologyBook = insert.nextInt();

      insert.nextLine();
      Pschycology[i] = new Library(PschycologyBookTitle, YearPschycologyBook, IDBookPschycology, TotalAuthorPschycologyBook,
          new String[TotalAuthorPschycologyBook]);

      for (int j = 0; j < TotalAuthorPschycologyBook; j++) {
        System.out.printf("\nName of author no.%d of book no.%d\t: ", (j + 1), (i + 1));
        Pschycology[i].szNameAuthor[j] = insert.nextLine();
      }
    }


    //RELIGION BOOK CATEGORY
    System.out.print("\nTotal of Religion books category\t: ");
    intTotalBookEachCategory = insert.nextInt();
    while (intTotalBookEachCategory < 5) {
      System.out.println("You must add minimum 5 books each category!");
      System.out.print("Total of Religion books category\t: ");
      intTotalBookEachCategory = insert.nextInt();
    }
    insert.nextLine();

    System.out.println();

    Library[] Religion = new Library[intTotalBookEachCategory];
    for (int i = 0; i < Religion.length; i++) {
      System.out.printf("\nTitle of Religion book no.%d\t: ", (i + 1));
      String ReligionBookTitle = insert.nextLine();

      System.out.printf("Published year of Religion book no.%d\t: ", (i + 1));
      int YearReligionBook = insert.nextInt();

      System.out.printf("ID of Religion book no.%d\t: ", (i + 1));
      int IDBookReligion = insert.nextInt();

      System.out.printf("Total author of Religion book no.%d\t: ", (i + 1));
      int TotalAuthorReligionBook = insert.nextInt();

      insert.nextLine();
      Religion[i] = new Library(ReligionBookTitle, YearReligionBook, IDBookReligion, TotalAuthorReligionBook,
          new String[TotalAuthorReligionBook]);

      for (int j = 0; j < TotalAuthorReligionBook; j++) {
        System.out.printf("\nName of author no.%d of book no.%d\t: ", (j + 1), (i + 1));
        Religion[i].szNameAuthor[j] = insert.nextLine();
      }
    }

    //POLITICAL BOOK CATEGORY
    System.out.print("\nTotal of Political books category\t: ");
    intTotalBookEachCategory = insert.nextInt();
    while (intTotalBookEachCategory < 5) {
      System.out.println("You must add minimum 5 books each category!");
      System.out.print("Total of Political books category\t: ");
      intTotalBookEachCategory = insert.nextInt();
    }
    insert.nextLine();

    System.out.println();

    Library[] Political = new Library[intTotalBookEachCategory];
    for (int i = 0; i < Political.length; i++) {
      System.out.printf("\nTitle of Political book no.%d\t: ", (i + 1));
      String PoliticalBookTitle = insert.nextLine();

      System.out.printf("Published year of Political book no.%d\t: ", (i + 1));
      int YearPoliticalBook = insert.nextInt();

      System.out.printf("ID of Political book no.%d\t: ", (i + 1));
      int IDBookPolitical = insert.nextInt();

      System.out.printf("Total author of Political book no.%d\t: ", (i + 1));
      int TotalAuthorPoliticalBook = insert.nextInt();

      insert.nextLine();
      Political[i] = new Library(PoliticalBookTitle, YearPoliticalBook, IDBookPolitical, TotalAuthorPoliticalBook,
          new String[TotalAuthorPoliticalBook]);

      for (int j = 0; j < TotalAuthorPoliticalBook; j++) {
        System.out.printf("\nName of author no.%d of book no.%d\t: ", (j + 1), (i + 1));
        Political[i].szNameAuthor[j] = insert.nextLine();
      }
    }

    //FICTION BOOK CATEGORY
    System.out.print("\nTotal of Fiction books category\t: ");
    intTotalBookEachCategory = insert.nextInt();
    while (intTotalBookEachCategory < 5) {
      System.out.println("You must add minimum 5 books each category!");
      System.out.print("Total of Fiction books category\t: ");
      intTotalBookEachCategory = insert.nextInt();
    }
    insert.nextLine();

    System.out.println();

    Library[] Fiction = new Library[intTotalBookEachCategory];
    for (int i = 0; i < Fiction.length; i++) {
      System.out.printf("\nTitle of Fiction book no.%d\t: ", (i + 1));
      String FictionBookTitle = insert.nextLine();

      System.out.printf("Published year of Fiction book no.%d\t: ", (i + 1));
      int YearFictionBook = insert.nextInt();

      System.out.printf("ID of Fiction book no.%d\t: ", (i + 1));
      int IDBookFiction = insert.nextInt();

      System.out.printf("Total author of Fiction book no.%d\t: ", (i + 1));
      int TotalAuthorFictionBook = insert.nextInt();

      insert.nextLine();
      Fiction[i] = new Library(FictionBookTitle, YearFictionBook, IDBookFiction, TotalAuthorFictionBook,
          new String[TotalAuthorFictionBook]);

      for (int j = 0; j < TotalAuthorFictionBook; j++) {
        System.out.printf("\nName of author no.%d of book no.%d\t: ", (j + 1), (i + 1));
        Fiction[i].szNameAuthor[j] = insert.nextLine();
      }
    }



    //GET INFORMATION
    //TECHNOLOGY
    System.out.println();
    for (int i = 0; i < Technology.length; i++) {
      System.out.println("\n\nTechnology books category");
      System.out.printf("Information of technology book no.%d: ", (i + 1));
      System.out.println();
      Technology[i].getBookInformation();
    }
    
    //PHILOSOPHY
    System.out.println();
    for (int i = 0; i < Philosophy.length; i++) {
      System.out.println("\n\nPhilosophy books category");
      System.out.printf("Information of Philosophy book no.%d: ", (i + 1));
      System.out.println();
      Philosophy[i].getBookInformation();
    }

    //HISTORY
    System.out.println();
    for (int i = 0; i < History.length; i++) {
      System.out.println("\n\nHistory books category");
      System.out.printf("Information of History book no.%d: ", (i + 1));
      System.out.println();
      History[i].getBookInformation();
    }

    //PSCHYLOGY
    System.out.println();
    for (int i = 0; i < Pschycology.length; i++) {
      System.out.println("\n\nPschycology books category");
      System.out.printf("Information of Pschycology book no.%d: ", (i + 1));
      System.out.println();
      Pschycology[i].getBookInformation();
    }

    //RELIGION
    System.out.println();
    for (int i = 0; i < Religion.length; i++) {
      System.out.println("\n\nReligion books category");
      System.out.printf("Information of Religion book no.%d: ", (i + 1));
      System.out.println();
      Religion[i].getBookInformation();
    }

    //POLITICAL
    System.out.println();
    for (int i = 0; i < Political.length; i++) {
      System.out.println("\n\nPolitical books category");
      System.out.printf("Information of Political book no.%d: ", (i + 1));
      System.out.println();
      Political[i].getBookInformation();
    }

    //FICTION
    System.out.println();
    for (int i = 0; i < Fiction.length; i++) {
      System.out.println("\n\nFiction books category");
      System.out.printf("Information of Fiction book no.%d: ", (i + 1));
      System.out.println();
      Fiction[i].getBookInformation();
    }
    insert.close();
  }
}

class Library {
  private String szTitleBook;
  private int intYear;
  private int intIDBook;
  private int intTotalAuthor;
  protected String[] szNameAuthor;
  private String[] szBookCategory = { "Technology", "Philosophy", "History", "Religion", "Psychology", "Political",
      "Fiction" };

  Library() {

  }

  Library(String szTitleBook, int intYear, int intIDBook, int intTotalAuthor, String[] szNameAuthor) {
    this.szTitleBook = szTitleBook;
    this.intYear = intYear;
    this.intIDBook = intIDBook;
    this.intTotalAuthor = intTotalAuthor;
    this.szNameAuthor = szNameAuthor;
  }

  public void getBookInformation() {
    System.out.printf("\tBook title\t: %s\n", szTitleBook);

    System.out.printf("\tPublished year\t: %d\n", intYear);

    System.out.printf("\tBook ID\t: %d\n", intIDBook);

    System.out.print("\tName of the Author(s)\t: ");
    for (int i = 0; i < this.intTotalAuthor; i++) {
      if (i == this.intTotalAuthor - 1)
        System.out.printf(this.szNameAuthor[i]);
        System.out.println();
      return;
    }
  }

  public void getCategory() {
    for (int i = 0; i < szBookCategory.length; i++) {
      System.out.printf("%d. %s\n", i + 1, szBookCategory[i]);
    }
  }
}
