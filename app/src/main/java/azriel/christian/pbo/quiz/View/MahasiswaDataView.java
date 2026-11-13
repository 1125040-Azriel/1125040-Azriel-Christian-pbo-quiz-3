package azriel.christian.pbo.quiz.View;

import Model.Mahasiswa;
import java.util.Scanner;
public class MahasiswaDataView

public class MahasiswaDataView extends DataView <Mahasiswa> {

    public MahasiswaDataView(Scanner scanner) {
        super (scanner);
    }

    @Override
    protected String getPrimaryKeyValue ( Mahasiswa data) {
        return data.getNim();
    }

    @Override
    protected String [] getFields () {
        return new String[] {"nim", "nama", "email", "umur"};
    }
}
