import java.io.IOException;

public class task_2 {
    public static void main(String[] args) {
        /*
         * Создайте класс Счетчик, у которого есть метод add(), увеличивающий
значение внутренней int переменной на 1.Сделайте так, чтобы с объектом
такого типа можно было работать в блоке try-with-resources. Нужно бросить
исключение, еслиработа с объектом типа счетчик была не в ресурсном try
и/или ресурс остался открыт. Подумайте какой тип исключения подойдет
лучше всего.
         */
    }

}

 class  Count implements AutoCloseable {

    Integer value = 0;

    void add() throws IOException {
        if (isClose()) {
            throw new IOException("message");
        }
        value = value++;
    }

    Integer getValue() throws IOException {
        if (isClose()) {
            throw new IOException("ресурс закрыт")
        }
        return value;
    }

    @Override
    void close() throws Exception {
        value = null;
    }

    boolean isClose(){
        return value == null;
    }

}
