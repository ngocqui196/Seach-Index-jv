import java.util.Scanner;

public class jiuj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        boolean check = false;
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        for (int i = 0; i < students.length; i++) {
            if (a.equals(students[i])) {
                System.out.printf("%s Ở vị trí %d trong mảng student!", a, i);
                check = true;
                break;
            }
        }
        if (!check)
            System.out.printf("%s không có vị trí trong mảng",a);
    }
}
