import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number-character combined string: ");
        String s1 = sc.nextLine();
        String new_str = "";
        boolean found = false;
        int count = 1;

        for (int i = 0; i <= s1.length() - 1; i++) {
            char ch = s1.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                for (int j = 0; j < i; j++) {
                    if (ch == s1.charAt(j)) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    found = false;
                    continue;
                }

                for (int a = i + 1; a <= s1.length() - 1; a++) {
                    if (ch == s1.charAt(a)) {
                        count++;
                    }
                }

                new_str += ch;
                new_str += count;
                found = false;
                count = 1;
            }
        }
        System.out.println("Re-constructed string is: " + new_str);
    }
}
