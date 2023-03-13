// package Praktikum.Modul1;

// public class Library {
//   private String szTitleBook;
//   private int intYear;
//   private int intIDBook;
//   private int intTotalAuthor;
//   protected String[] szNameAuthor;
//   private String[] szBookCategory = {"Technology", "Philosophy", "History", "Religion", "Psychology", "Political", "Fiction"};

//   Library() {

//   }

//   Library(String szTitleBook, int intYear, int intIDBook, int intTotalAuthor, String[] szNameAuthor) {
//     this.szTitleBook = szTitleBook;
//     this.intYear = intYear;
//     this.intIDBook = intIDBook;
//     this.intTotalAuthor = intTotalAuthor;
//     this.szNameAuthor = szNameAuthor;
//   }

//   public void getBookInformation() {
//     System.out.printf("\nBook title: %s\n", szTitleBook);

//     System.out.printf("Published year: %d\n", intYear);

//     System.out.printf("Book ID: %d\n", intIDBook);

//     if (intTotalAuthor > 1) {
//       System.out.print("Name of the Authors");
//       for (int i = 0; i < this.intTotalAuthor; i++) {
//         System.out.printf("Name of the authors: %s, ", this.szNameAuthor[i]);
//       }
//     } else {
//       for (int i = 0; i < this.intTotalAuthor; i++) {
//         if (i == this.intTotalAuthor - 1)
//           System.out.printf("Name of the author: %s", this.szNameAuthor[i]);
//         return;
//       }
//     }
//   }
//   public void getCategory() {
//     for (int i = 0; i < szBookCategory.length; i++) {
//       System.out.printf("%d. %s\n",i+1,szBookCategory[i]);
//     }
//   }
// }
