package Lessons.lesson4.task5;

public class BookTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("Java",new Author("Schildt"));

//        Book book2 = book1;

        Book book2 = (Book) book1.clone();

        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor().getName());
        book2.getAuthor().setName("Andre");
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor().getName());
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());








//
//
//
//
//
//
//
//        System.out.println(book1.getName());
//        System.out.println(book2.getName());
//
//        book2.setName("Clean Code");
//
//        System.out.println(book1.getName());
//        System.out.println(book2.getName());

    }
}
