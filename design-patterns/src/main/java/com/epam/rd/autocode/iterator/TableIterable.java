package com.epam.rd.autocode.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TableIterable implements Iterable<String> {
    private String[] columns;
    private int[] rows;

    public TableIterable(String[] columns, int[] rows) {
        this.columns = columns;
        this.rows = rows;
    }

    @Override
    public Iterator<String> iterator() {
        return new TableIterator();
    }

    private class TableIterator implements Iterator<String> {
        private int colIndex;
        private int rowIndex;

        @Override
        public boolean hasNext() {
            return colIndex < columns.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            String element = columns[colIndex]  + rows[rowIndex];

            rowIndex++;
            if (rowIndex == rows.length) {
                rowIndex = 0;
                colIndex++;
            }

            return element;
        }

    }
}
