package task_4;




public class task_4 {
    public static void main(String[] args) throws Exception {
        /*
         * 1. Напишите метод, на вход которого подаётся двумерный строковый массив
            размером 4х4. При подаче массива другого размера необходимо бросить
            исключение MyArraySizeException.
           2. Далее метод должен пройтись по всем элементам массива, преобразовать в
            int и просуммировать. Если в каком-то элементе массива преобразование
            не удалось (например, в ячейке лежит символ или текст вместо числа),
            должно быть брошено исключение MyArrayDataException с детализацией, в
            какой именно ячейке лежат неверные данные.
           3. В методе main() вызвать полученный метод, обработать возможные
            исключения MyArraySizeException и MyArrayDataException и вывести
            результат расчета (сумму элементов, при условии что подали на вход
            корректный массив).
         */
        String [][]array = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "8", "7", "dfg"},
            {"5", "4", "3", "2"}};
           
            try {
                System.out.println(result(array));
            } catch (MyArraySizeException e) {
                throw new MyArraySizeException();
            } catch (MyArrayDataException e) {
                System.out.println(e);
            }
        

    }

    public static Integer result(String [][]array) throws Exception {
        int result = 0;
        
        if (array.length !=4 || array[0].length != 4) {
        throw new MyArraySizeException();
        } else {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        }   
            

        return result;
    }
}
