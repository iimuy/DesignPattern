package com.lmch.Iterator;

public class BookShelfIteraoter implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIteraoter(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
    
}
