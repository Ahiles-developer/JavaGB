package lesson_7.string;

public class StringConcat {

    public static void main(String[] args) {
        String a1 = "Hello My ";
        String a2 = "Dear World";
        String a3 = a1 + a2; // конкатенация - складывание строк
        a3 = a1.concat(a2); // конкатенация. через concat делать не стоит т.к. создается новый экземпляр

        String b1 = "Число";
        int b2 = 10;
        String b3 = b1 + b2;
        b3 = b1.concat(String.valueOf(b2)); // строки складываются только со строками, но если нужно
                                            // с числом то можно сделать это через valueOf

        String c = "(" + 2 + 3 + ")" + b3 + "!";

        for (char ch : a3.toCharArray()) {
            System.out.print(ch + " ");
        }

        System.out.println(a1.equals(a2));
        System.out.println(a1.compareTo(a2));

        String spaces = "   \n    ";
        System.out.println(spaces.trim()); // trim удаляет пробелы/табуляцию/перенос строки
        System.out.println(spaces == null);
        System.out.println(spaces.isEmpty());
        System.out.println(spaces.isBlank()); // опирается на символы
        System.out.println(spaces.trim().isEmpty());

        System.out.println(a3.substring(8)); // вырезает строку от 8-го символа
        System.out.println(a3.substring(8, 16)); // участок от и до

        for (String s : a3.split("\s+", 3)) { // /s+ - разделить по любым разделителям строк
            System.out.println(s);
        }

        System.out.println(a3.replaceAll("My", "Our"));

        System.out.println(a3.charAt(16));
        System.out.println(a3.indexOf(' ', 9));

        System.out.println(a3.startsWith("Hello"));

        System.out.println(String.join(a1, a2, b1));

        StringBuilder sb = new StringBuilder(100); // вместимость 100 символо, по умолчанию 16
        sb.append(a1);
        sb.append(a2);
        sb.append(b1);
        sb.append(8);
        System.out.println(sb);

        /*
            StringBuilder нужен для большого количества объединений строк
         */
    }

    private static String message(boolean b) {
        return "Your char had".concat(b ? " " : "n't ").concat("been found!");
    }
}
