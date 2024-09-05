import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    /*Задача1
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("Ваше число четное");
        }
        else{
            System.out.println("Ваше число нечетное");
        }
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача2
        System.out.print("Введите первое целое число: ");
        int first = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int second = in.nextInt();
        System.out.print("Введите третье целое число: ");
        int third = in.nextInt();
        int min = Math.min(first, Math.min(second, third));
        System.out.println("Минимальное число: " + min);
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача3
        int x = 5;
        for (int i=1;  i < 10; i++) {
            int result = x * i;
            System.out.println(x + " * " + i + " = " + result);
        }
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача4
        System.out.print("Введите целое число N: ");
        int N = in.nextInt();
        int sum = 0;
        for (int i = 1; i<=N; i++) {
            sum+=i;
        }
       System.out.println("Сумма всех чисел от 1 до введённого числа: " + sum);
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача5
        System.out.print("Введите целое число N: ");
        int N = in.nextInt();
        if (N < 1) {
            System.out.println("Число должно быть больше или равно 1.");
            return;
        }
        int[] f = new int[N];
        f[0] = 0;
        if (N > 1) {
            f[1] = 1;
            for (int i = 2; i < N; ++i) {
                f[i] = f[i - 1] + f[i - 2];
            }
        }
        for (int i = 0; i < N; ++i) {
            System.out.println(f[i]);
        }
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача6
        System.out.print("Введите целое число: ");
        int x = in.nextInt();
        if (x <= 1) {
            System.out.println(x + " не является простым числом.");
        } else {
            boolean  PrimeNumber = true;
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    PrimeNumber = false;
                    break;
                }
            }
            if (PrimeNumber) {
                System.out.println(x + " является простым числом.");
            } else {
                System.out.println(x + " не является простым числом.");
            }
        }

    /*Задача7
        System.out.print("Введите целое число N: ");
        int N = in.nextInt();
        System.out.println("числа от N до 1 в обратном порядке:");
        for (int i = N; i>=1; i--) {
            System.out.println(i);
        }
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача8
        System.out.print("Введите целое число A: ");
        int a = in.nextInt();
        System.out.print("Введите целое число B: ");
        int b = in.nextInt();
        int sum = 0;
        for (int i = Math.min(a, b); i<=Math.max(a, b); i++) {
            if (i%2==0) sum+=i;
        }
        System.out.println("Сумма всех четных чисел в диапазоне от A до B (включительно) " + sum);
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача9
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String ReverseStr = new StringBuilder(str).reverse().toString();
        System.out.println("Обратный порядок строки: " + ReverseStr);
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача10
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        System.out.println("Количество цифр в этом числе: " + String.valueOf(number).length());
    *///////////////////////////////////////////////////////////////////////////////////////\
    /*Задача11
        System.out.print("Введите целое число N: ");
        int n = in.nextInt();
        float a = 1;
        for (int i = 1; i<=n; i++) {
            a *=i;
        }
        System.out.println("Факториал числа: " + n + " = " + a);
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача12
        System.out.print("Введите целое число N: ");
        int n = in.nextInt();
        n = Math.abs(n);
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println("Сумма всех цифр числа: " + sum);
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача13
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
           System.out.println(str + " Введенная строка является палиндромом");
        } else {
            System.out.println(str + " Введенная строка не является палиндромом.");
        }
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача14
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] a = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++){
            a[i] = in.nextInt();}
        System.out.printf("Максимальное число в массиве: " + Arrays.stream(a).max().getAsInt());
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача15
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] a = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++){
            a[i] = in.nextInt();}
        System.out.printf("Сумма всех элементов массива: " + Arrays.stream(a).sum());
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача16
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] a = new int[size];
        System.out.println("Введите элементы массива: ");
        int plus = 0;
        int minus = 0;
        for (int i=0; i<size; i++) {
            a[i] = in.nextInt();
            if (a[i]>0) plus++;
            if (a[i]<0) minus++;
        }
        System.out.printf("количество положительных чисел: " + plus + " Количество отрицательных чисел: " + minus);
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача17
        System.out.print("Введите целое число A: ");
        int a = in.nextInt();
        System.out.print("Введите целое число B: ");
        int b = in.nextInt();
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                if (PrimeNumber(i)) {
                System.out.print(i + " ");
                }
            }
    }

       private static boolean PrimeNumber(int num) {
            if (num < 2) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
    *///////////////////////////////////////////////////////////////////////////////////////
    /*Задача18
            System.out.print("Введите строку: ");
            String str = in.nextLine();
             int VowelsCount = 0, ConsonantsCount = 0;
             String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouyAEIOUY";
             for (char i : str.toCharArray()) {
                if (Character.isLetter(i)) {
                    if (vowels.indexOf(i) >= 0) {
                        VowelsCount++;
                   } else {
                        ConsonantsCount++;
                   }
               }
           }
            System.out.println("Количество гласных: " + VowelsCount);
           System.out.println("Количество согласных: " + ConsonantsCount);
    *////////////////////////////////////////////////////////////////////////////////////////
    /*Задача19
        System.out.print("Введите строку состоящую из нескольких слов: ");
        String str = in.nextLine();
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
           reversed.append(words[i]).append(" ");
        }
        System.out.println("Слова в обратном порядке: " + reversed.toString().trim());
    *////////////////////////////////////////////////////////////////////////////////////////
    /*Задача20
        System.out.print("Введите целое число: ");
        int n = in.nextInt();
        int originalNum = n;
        int sum = 0;
        int CountDigits = String.valueOf(n).length();

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, CountDigits);
            n /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " является числом Армстронга.");
        } else {
            System.out.println(originalNum + " не является числом Армстронга.");
        }
     */
    }
}




