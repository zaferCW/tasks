package Rumeysa.task24.task02;

import java.util.Scanner;

public class Main {

/* TODO
    Burada iki adet class vardır. Biri Main diğeri ise rentApartments
    rentApartments'ın içinde;
    Bu variable'ları private olarak oluşturun;
    String name
    int roomCount
    boolean balconyOrNo

   Bütün variable'lar için getter ve setter oluşturunuz.

    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.

    Main class'ın içinde;
    userName rent is amountOfRent
     */
   static  Scanner input = new Scanner(System.in);
public static void main(String[] args) {

   System.out.println("Your name:");
   String name = input.nextLine();

   rentApartments user = new rentApartments(name, input);

   user.roomNumber();

   System.out.println("Do you want balcony? (true/false)");
   user.setBalconyOrNo(input.nextBoolean());



   user.balcony();
   System.out.println(user);


}

}
class rentApartments{

   private String name;
   private int roomCount;
   private boolean balconyOrNo;
   int rent;
   Scanner input;
   public rentApartments() {
   }

   public rentApartments(String name, Scanner input) {
      this.name = name;
      this.input = input;
   }

   public int roomNumber() {

      do {
       System.out.println("how many rooms do you want?");
       roomCount = input.nextInt();
         rent = 0;
         if (roomCount == 0) {
            rent = 1400;
         } else if (roomCount == 1) {
            rent = 1700;
         } else if (roomCount == 2) {
            rent = 2200;
         } else if (roomCount == 3) {
            rent = 2700;
         } else {
            System.out.println("Invalid room count. Please enter a valid value (0, 1, 2, or 3).");
         }
      } while (roomCount < 0 || roomCount > 3);
      return rent;
   }
   public void balcony(){
      if (balconyOrNo){
         rent += 200;
      }
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRoomCount(int i) {
      return roomCount;
   }

   public void setRoomCount(int roomCount) {
      this.roomCount = roomCount;

   }

   public boolean isBalconyOrNo() {
      return balconyOrNo;
   }

   public void setBalconyOrNo(boolean balconyOrNo) {
      this.balconyOrNo = balconyOrNo;
   }

   @Override
   public String toString() {
      return name + ", rent is " + rent;
   }
}
