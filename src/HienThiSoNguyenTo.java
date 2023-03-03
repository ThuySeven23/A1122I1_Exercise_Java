
public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int numbers = 2;
        System.out.println("Cac so nguyen to duoc in ra: ");
        while (count < 20) {
            boolean check = true;
            for (int i = 2; i < numbers; i++) {
                if (numbers % i == 0) { //
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.print(numbers + " ");
                count++;
            }
            numbers++;
        }
    }
}
