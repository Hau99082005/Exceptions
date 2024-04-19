package advance.dev;
import java.util.Scanner;

public class Main {
   public static void checkAge(int age) throws AgeException {
	   if(age <= 0) {
		   throw new AgeException("Tuổi không hợp lệ, vui long nhập lại");
	   }
   }
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int age;
	   try {
	  System.out.print("Nhập vào tuổi của bạn: ");
	   age = sc.nextInt();
	   checkAge(age);
	   System.out.println("Tuổi của bạn là: "+age);
	   
	   }catch(AgeException exception) {
		   System.out.println("Lỗi: "+exception.getMessage());
	   }catch(Exception exception) {
		   System.out.println("Lỗi không xác định: "+exception.getMessage());
	   }finally {
		   sc.close();
	   }
   }
}
