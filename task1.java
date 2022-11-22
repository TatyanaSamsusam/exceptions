import java.util.Arrays;
import java.util.Scanner;

/*Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество дата_рождения номер_телефона пол
Форматы данных: фамилия, имя, отчество - строки
дата_рождения - строка формата dd.mm.yyyy
номер_телефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.
Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и
 показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, 
нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. 
Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные 
данные, вида <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
Не забудьте закрыть соединение с файлом.
При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
*/

public class task1 {
    public static String getText() {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String name = input.nextLine();
        return name;
    }

    public static int getNumber(String text) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        int number = 0;
        try {
            number = input.nextInt();
        } catch (Exception e) {
            throw new Exception("не получилось превратить введенный символ в int");
        }
        return number;
    }

    public static int[] fillArray() {
        int size = 3;
        int[] newArray1 = new int[size];
        try {
                newArray1[0] = getNumber("введите день рождения: ");
                newArray1[1] = getNumber("введите месяц рождения: ");
                newArray1[2] = getNumber("введите год рождения: ");
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
        return newArray1;
    }

    public static int fillPhone () {
        int phoneNumber = 0;
        try {
            phoneNumber = getNumber("введите номер телефона в формате 8XXXXXXXXXX: ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("введенный номер телефона: ");
        return phoneNumber;
    }

    public static String getGender() {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите пол: F или M: ");
        String gender = input.nextLine();
        return gender;
    }
    public static void main(String[] args) {
        boolean play = true;
        while (play){
        try {
            String fullName = getText();
            int[] dateOfBirth = fillArray(); 
            int phone = fillPhone();
            String gender = getGender();
            String preFinalDate = Arrays.toString(dateOfBirth); //преобразовала интовый массив dateOfBirth в строку
        
            String finalDate =String.join(".", preFinalDate);
            System.out.println(fullName);
            System.out.println(finalDate);
            System.out.println(phone);
            System.out.println(gender);
                  
        play = false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
    }
}
