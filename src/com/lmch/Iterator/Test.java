package com.lmch.Iterator;

public class Test {
    public static void doTest() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Aroun the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()) {
            Book book = (Book)it.next();
            System.err.println(book.getName());
        }
    }
}
