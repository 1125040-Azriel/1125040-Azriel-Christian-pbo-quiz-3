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

        for ( String field : fields) {
            System.out.print(field + "\t");
        }
        System.out.println();

        for ( int i = 0; i < this.records.size(); i++) {
            T record this.records.get(i);
            String[] values = this.convertModelToValues(record);

            System.out.print(i+". ");
            for ( int j = 0; j < fields.length; j++) {
                System.out.print(fields[j]+"=" +values[j]+", ");
            }
            System.out.println();
        }
    }

    public void printByPk ( String primarykey) {
        T record : this.records {
                String[] fields = this.getFields();
                String[] values = this.convertModelToValues(record);

                for ( int i = 0; i < fields.length; i++) {
                    System.out.println(fields[i] + "=" + values[i]);
                }
                return;
            }
        }

        System.out.println("data not found.");
    }

    public void showInsertForm() {
        String[] fields = this.getFields();

        for (int i = 0; i < fields.length; i++) {

            System.out.println(fields[i]+" ");

        }


    }
}
