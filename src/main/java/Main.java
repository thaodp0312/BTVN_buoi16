import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<product> dssp = new ArrayList<product>();
        dssp.add(new product(1, "Bánh", 10, 10000));
        dssp.add(new product(2, "Kẹo", 20, 20000));
        dssp.add(new product(3, "Bim bim", 30, 30000));

        System.out.println("Danh sách sản phẩm: ");
        System.out.println("ID-Name-Quantity-Price");
        for (int i = 0; i < dssp.size(); i++) {
            System.out.println(dssp.get(i));
        }

        for (int i = 0; i < dssp.size(); i++) {
            if (dssp.get(i).product_name == "Bim bim") {
                System.out.println("Thông tin sản phẩm có tên là Bim bim: ");
                System.out.println(dssp.get(i));
            }
            if (dssp.get(i).product_name == "Kẹo") {
                System.out.println("Đổi tên sản phẩm có tên là Kẹo thành Candy ");
                dssp.get(i).product_name = "Candy";
                System.out.println(dssp.get(i));
            }
            if (dssp.get(i).price == 10000) {
                dssp.remove(i);

            }

        }
        System.out.println("Danh sách sản phẩm sau khi xóa sản phẩm có giá 10000");
        for (product p : dssp) {
            System.out.println(p);
        }

        List<employee> dsnv = new ArrayList<employee>();
        dsnv.add(new employee(1, "Thảo", 37, "Lê Thanh Nghị", "0900000000"));
        dsnv.add(new employee(2, "Dương", 38, "Bách Khoa", "0911111111"));
        dsnv.add(new employee(3, "Vy", 60, "Khâm Thiên", "092222222"));
        dsnv.add(new employee(4, "My", 40, "Minh Khai", "093333333"));
        System.out.println("Danh sách nhân viên: ");
        for (employee e : dsnv) {
            System.out.println(e);
        }
        System.out.println("Nhập tên nhân viên muốn sửa: ");
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        boolean search = false;
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).name.toLowerCase().equals(ten.toLowerCase())) {
                dsnv.get(i).age = 20;
                System.out.println("Thông tin nhân viên tên " + ten + " sau khi thay đổi tuổi: ");
                System.out.println(dsnv.get(i));
                search = true;

            }

        }
        if (search == false) {
            System.out.println("Không có nhân viên nào tên " + ten);
        }
        System.out.println("Nhập mã nhân viên muốn xóa: ");

        int ma = sc.nextInt();
        boolean search2 = false;
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).ID == ma) {
                dsnv.remove(i);
                search2 = true;
            }
        }

        if (search2 == false) {
            System.out.println("Không có nhân viên nào có mã: " + ma);
        } else {
            System.out.println("Danh sách nhân viên sau khi đã xóa: ");
            for (employee e2 : dsnv) {
                System.out.println(e2);
            }
        }
    }
}

