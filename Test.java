import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Pilih menu\n1. Tambah data\n2. Ambil data\n" + 
            "3. Lihat data paling atas\n4. Lihat semua isi data stack\n" +
            "5. Buat Stack baru <clear data>\n6. Keluar\n\n" +
            "Nomor menu pilihan Anda: ");
            int input = 0;
            if (scan.hasNextInt()) {
                input = scan.nextInt();
            } else {
                scan.nextLine();
                System.out.println("\nInput harus berupa angka!!\n");
                continue;
            }
            switch (input) {
            case 1:
                System.out.print("\nMasukkan data ===> ");
                if (scan.hasNextInt()) {
                    int element = scan.nextInt();
                    stack.Push(element);
                    System.out.println("-------------------------------------------------------");
                } else {
                    scan.nextLine();
                    System.out.println("\nData harus berupa angka!!");
                    System.out.println("-------------------------------------------------------");
                }
                break;
            case 2:
                stack.Pop();
                System.out.println("-------------------------------------------------------"); 
                break;
            case 3:
                System.out.println("\nData paling atas adalah ===> " + stack.Peek());
                System.out.println("-------------------------------------------------------"); 
                break;
            case 4:
                System.out.println(stack);
                System.out.println("-------------------------------------------------------"); 
                break;
            case 5:
                stack.clear();
                System.out.println("\nStack berhasil dikosongkan");
                System.out.println("-------------------------------------------------------"); 
                break;
            case 6:
            System.out.println("\nAnda Keluar.\nTERIMAKASIH");
                scan.close();
                System.exit(0);
            default:
                break;
            }
        }  
    }
}