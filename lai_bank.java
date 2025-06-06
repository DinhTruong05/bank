import java.util.Scanner;

public class lai_bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap so tien gui : ");
            int tien = scan.nextInt();
            System.out.println("Nhap lai xuat / nam : ");
            double lai = scan.nextInt();
            lai = lai / 100;
            System.out.println("So thang gui : ");
            int month = scan.nextInt();
            if (tien <= 0 || lai <= 0 || month <= 0) {
                System.out.println("vui long nhap lai");
                break;
            } else {
                double tien_lai = tien * ((double) lai / 12) * month;
                System.out.println("Tien lai la: " + String.format("%,.0f", tien_lai));
            }
            System.out.println("Nhập 'end' để kết thúc hoặc nhấn Enter để tiếp tục:");
            scan.nextLine();
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
        }
        scan.close();
    }
}
