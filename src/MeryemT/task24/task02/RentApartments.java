package MeryemT.task24.task02;

import java.util.Scanner;

public class RentApartments {

    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    int totalRent;//toplam kira
    Scanner sc = new Scanner(System.in);

    public RentApartments() {
        daireSecimi();
    }

    public void bilgiler() {
        boolean dongu = true;
        System.out.println("Lutfen adinizi giriniz: ");
        name = sc.nextLine();
        while (dongu) {
            System.out.println("Kac odali bir daire istersiniz: ");
            roomCount = sc.nextInt();
            if (roomCount < 0 || roomCount > 3) {
                System.out.println("Oda hatali giris lutfen tekrar deneyiniz...");
                continue;//Dongu devam etsin diye
            }
            System.out.println("Balkonsuz ev gobeksiz erkek olmaz derler, balkon ister misiniz:");
            System.out.println("\n 1-> Evet \n 2-> Hayir ");
            int girdi = sc.nextInt();
            if (girdi == 1) {
                balconyOrNo = true;
                totalRent += 200;
                dongu = false;//While dongu durdurucu
            } else if (girdi == 2) {
                System.out.println("Siz bilirsiniz ben diyecegimi dedim");
                balconyOrNo = false;
                dongu = false;//While dongu durdurucu
            } else {
                System.out.println("Balkon hatali giris lutfen tekrar deneyiniz...");
            }
        }
    }

    public void daireSecimi() {
        bilgiler();
        switch (roomCount) {
            case 0:
                System.out.println(roomCount + " + 1 icin bir aylik kira tutari " + 1400 + "$");
                totalRent += 1400;
                break;
            case 1:
                System.out.println(roomCount + " + 1 icin bir aylik kira tutari " + 1700 + "$");
                totalRent += 1700;
                break;
            case 2:
                System.out.println(roomCount + " + 1 icin bir aylik kira tutari " + 2200 + "$");
                totalRent += 2200;
                break;
            case 3:
                System.out.println(roomCount + " + 1 icin bir aylik kira tutari " + 2700 + "$");
                totalRent += 2700;
                break;
            default:
                System.out.println("Cikti hatali lutfen tekrar deneyiniz...");
                break;
        }
    }
    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getRoomCount() {
//        return roomCount;
//    }
//
//    public void setRoomCount(int roomCount) {
//        this.roomCount = roomCount;
//    }
//
//    public boolean isBalconyOrNo() {
//        return balconyOrNo;
//    }
//
//    public void setBalconyOrNo(boolean balconyOrNo) {
//        this.balconyOrNo = balconyOrNo;
//    }
    @Override
    public String toString() {
        if (balconyOrNo) {
            return name + " bey " +
                    roomCount +
                    " + 1 " +
                    "+200 $ balkonla beraber kirasi " + totalRent +
                    " $ olan eviniz hayirli olsun.";
        } else {
            return name + " bey " + roomCount +
                    " + 1 kirasi " + totalRent +
                    " $ olan eviniz hayirli olsun.";
        }
    }
}
