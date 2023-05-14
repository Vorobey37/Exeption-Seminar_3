package task_4;

public class MyArrayDataException extends NumberFormatException {
    
    public MyArrayDataException(int i, int j){
        super ("В ячейке с индексами " + i + ", " + j + " неверный формат");
    }
}
