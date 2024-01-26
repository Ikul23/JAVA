package kuleshovi.seminars;

import java.util.ArrayList;


         import java.util.List;
        
        public class seminar3_1 {
            static List<ArrayList<String>> catalog = new ArrayList<>();
        
            public static void main(String[] args) {
                addBook("Жанр #1", "Книга #1");
                addBook("Жанр #1", "Книга #2");
                addBook("Жанр #1", "Книга #3");
                addBook("Жанр #1", "Книга #4");
                addBook("Жанр #1", "Книга #5");
                addBook("Жанр #1", "Книга #6");
                addBook("Жанр #2", "Книга #7");
                addBook("Жанр #2", "Книга #8");
                addBook("Жанр #3", "Книга #9");
                printCatalog();
            }
        
            /**
             * Метод добавления книги
             */
            static void addBook(String genre, String bookname) {
                for (ArrayList<String> books : catalog) {
                    if (books.size() > 0 && books.get(0).equals(genre)) {
                        books.add(bookname);
                        return;
                    }
                }
        
                ArrayList<String> newGenre = new ArrayList<>();
                newGenre.add(genre);
                newGenre.add(bookname);
                catalog.add(newGenre);
            }
        
            /**
             * Метод, позволяющий распечатать коллекцию
             */
            static void printCatalog() {
                for (ArrayList<String> books : catalog) {
                    for (String book : books) {
                        System.out.printf("%s\t\t", book);
                    }
                    System.out.println();
                }
            }
        }
        