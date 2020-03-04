import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TxtAnalizer txtAnalizer = new TxtAnalizer();
        File test = new File("C:\\Users\\khodo\\Desktop\\news_test.txt");
        txtAnalizer.txtAnaliz(test);
    }
}