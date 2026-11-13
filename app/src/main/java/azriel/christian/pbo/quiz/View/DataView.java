package azriel.christian.pbo.quiz.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class DataView<T> {
    private List<T> records;
    protected Scanner scanner;

    public DataView ( Scanner scanner) {
        this.records = new ArrayList<>();
        this.scanner = scanner;
    }

    protected abstract String getPrimaryKeyValue(T data);
    protected abstract String[] getFields();
    protected abstract T convertValuesToModel (String[] values);
    protected abstract String[] convertModelToValues(T data);

    public void printAll() {
        String[] fields = getFields();
    }
}
