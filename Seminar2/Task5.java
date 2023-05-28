package Seminar2;
// Задание 5.
// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class Task5 {
    public static void main(String[] args) throws SecurityException, IOException {
        String[] fileList = dirList("./");
        Logger logger = Logger.getLogger(Task5.class.getName());
        try {
            writeFile(fileList);
        }
        catch (IOException ex){
            logger.log(Level.SEVERE, "Error", ex);
            FileHandler fh = new FileHandler("logger2.txt");
        }
        catch (NullPointerException npe){
            logger.log(Level.SEVERE, "Error", npe); 
            FileHandler fh = new FileHandler("logger2.txt");          
        }

    }
    private static String[] dirList(String dir) {
        File file = new File(dir);
        String[] fileList = file.list();

        return fileList;
    }
    private static void writeFile(String[] str) throws IOException {
        try(FileWriter writer = new FileWriter("filesList.txt", false)) {
           // запись всей строки
            for (int i=0; i <str.length; i++)
            writer.write(str[i] + "\n");
            writer.flush();
        } 
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}    

