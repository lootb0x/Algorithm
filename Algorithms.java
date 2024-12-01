import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twodigits = twodigits();
        int bigfivehundred = bigfivehundred();
        int greatest = greatest();
        int smallest = smallest();
        int sum = sum();
        double average = average();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twodigits);
        System.out.println(bigfivehundred);
        System.out.println(greatest);
        System.out.println(smallest);
        System.out.println(sum);
        System.out.println(average);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }
    public static int twodigits() throws FileNotFoundException{
        s = new Scanner(f);
        int twodigits = 0;
        while (s.hasNext()) {
            String car = s.nextLine();
            if (car.length()==2)
                twodigits++;
        }
        return twodigits;
    }
    public static int bigfivehundred() throws FileNotFoundException{
        s = new Scanner(f);
        int bigfivehundred = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
            bigfivehundred++;
        }
        return bigfivehundred;
    }
    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int largest  = 0;
        while (s.hasNext()) {
            int greatest = s.nextInt();
            if (greatest > largest)
            largest = s.nextInt();
        }
        return largest;
    }
    public static int smallest() throws FileNotFoundException{
        s = new Scanner(f);
        int smallest = 999;
        while (s.hasNext()) {
            int greatest = s.nextInt();
            if (greatest < smallest)
            smallest = s.nextInt();
        }
        return smallest;
    }
    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            sum += s.nextInt();
        }
        return sum;
    }
    public static double average() throws FileNotFoundException{
        s = new Scanner(f);
        double sum = 0;
        double amount = 0;
        while (s.hasNext()) {
            sum += s.nextInt();
                amount++;
        }
        sum /= amount;
        double average = sum;
        return average;
    }
    public static int mode() throws FileNotFoundException{
       return 189;
    }
}
