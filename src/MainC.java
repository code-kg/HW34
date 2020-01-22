import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainC {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("homeworkC.txt");
        fileWriter.write("1. Массивы используются для хранения нескольких значений в одной переменной вместо объявления отдельных переменных для каждого значения.\n");
        fileWriter.write("2. Класс ArrayList - это массив с изменяемыми размерами, который можно найти в пакете java.util.\n");
        fileWriter.write("3. Разница между встроенным массивом и ArrayList в Java заключается в том, что размер массива нельзя изменить (если вы хотите добавить или удалить элементы в / из массива, вы должны создать новый).\n" +
                " Хотя элементы могут быть добавлены и удалены из ArrayList, когда вы хотите\n");
        fileWriter.write("4. Класс-оболочка в Java предоставляет механизм для преобразования примитива в объект и объекта в примитив.\n");
        fileWriter.write("5. add - Вставляет указанный элемент в указанную позицию в этом списке, set - Заменяет элемент в указанной позиции в этом списке на указанный элемент\n");
        fileWriter.close();

        FileReader fileReader = new FileReader("homeworkC.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            fileReader.close();
        }
    }
}
