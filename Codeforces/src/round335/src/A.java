import java.util.Scanner;

/**
 * Created by balaji on 09/12/15.
 */
public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0, b=0, c=0, x=0, y=0, z=0;
        String line = scanner.nextLine();
        String parts[] = line.split(" ");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);
        c = Integer.parseInt(parts[2]);
        line = scanner.nextLine();
        String parts2[] = line.split(" ");
        x = Integer.parseInt(parts2[0]);
        y = Integer.parseInt(parts2[1]);
        z = Integer.parseInt(parts2[2]);
        scanner.close();

        int deficit = 0;
        int excess = 0;

        if (a > x)
            excess += (a-x)/2;
        else
            deficit += x - a;

        if (b > y)
            excess += (b-y)/2;
        else
            deficit += y - b;

        if (c > z)
            excess += (c-z)/2;
        else
            deficit += z - c;
        if (deficit > excess) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
