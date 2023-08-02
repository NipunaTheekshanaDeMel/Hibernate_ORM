package lk.ijse;

import lk.ijse.entity.Author;
import lk.ijse.entity.Book;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author();
        author1.setId(1);
        author1.setName("Harper Lee");

        Author author2 = new Author();
        author2.setId(2);
        author2.setName("J.K. Rowling");

        Author author3 = new Author();
        author3.setId(3);
        author3.setName("F. Scott Fitzgerald");

        Book book1 = new Book();
        book1.setId(1);
        book1.setName("To Kill a Mockingbird");

        Book book2 = new Book();
        book2.setId(2);
        book2.setName("Harry Potter and the Sorcerer's Stone");

        Book book3 = new Book();
        book3.setId(3);
        book3.setName("The Great Gatsby");


        //Create Database & Insert Values
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(author1);
        session.persist(author2);
        session.persist(author3);
        session.persist(book1);
        session.persist(book2);
        session.persist(book3);
        transaction.commit();
        session.close();

    }
}
