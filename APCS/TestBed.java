package APCS;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class TestBed {
    public static void main(String[] args) {
        File[] files = new File("C:\\Users\\Collin\\Documents\\GitHub\\AP-CS\\APCS").listFiles();
        Arrays.sort(files, Comparator.comparingLong(File::lastModified));
        for (File item : files) {
            System.out.println(item.toString());
        }
    }
}