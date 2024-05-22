package library_management_system_using_anonymous_class;

public class Main {
    public static void main(String[] args) {

        LibraryItem library_book=new LibraryItem() {
            @Override
            public void checkOut(String date) {

                System.out.println("The Book is Issued on :-"+date);
            }

            @Override
            public void returnItem() {

                System.out.println("Successfully received Book");

            }


        };
    LibraryItem library_cd = new LibraryItem() {
         @Override
         public void checkOut(String date) {
             System.out.println("The Cd is Issued on :-"+date);

         }

        @Override
        public void returnItem() {
            System.out.println("Successfully received Cd");
        }


     };

    LibraryItem library_journal=new LibraryItem() {
        @Override
        public void checkOut(String date) {
            System.out.println("The Journal is Issued on :-"+date);

        }

        @Override
        public void returnItem() {
            System.out.println("Successfully received Journal");
        }


    };

    library_book.checkOut("12/5/2024");
    library_book.returnItem();

    library_cd.checkOut("15/8/2032");
    library_cd.returnItem();

    library_journal.checkOut("07/9/2023");
    library_journal.returnItem();

    }
}
