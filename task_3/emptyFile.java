package task_3;

import java.io.FileNotFoundException;

public class emptyFile extends FileNotFoundException {
    
    public emptyFile() {
        super("файла не существует");
    }
}
