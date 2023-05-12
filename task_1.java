public class task_1 {
    public static void main(String[] args) {
        /*
         * Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самого метода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызвал метод doSomething().
         */

         try {
            doSomething();
         } catch (RuntimeException e) {
            System.out.println("ошибка" + e.getMessage());
         }

    }

    public static void doSomething() throws  RuntimeException  {
        throw new RuntimeException("message");
    };

}
