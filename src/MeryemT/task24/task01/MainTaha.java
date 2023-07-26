package MeryemT.task24.task01;

import java.util.Scanner;

public class MainTaha {

/* TODO
    Burada iki class vardır. Biri Main diğeri ise Subscribe.
    Subscribe class'ının içinde;
    Bu variables'ları private oluşturunuz.
    String name
    boolean doYouWanaSubscribe
    String whichMember
    3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)

todo    Main class'ın içinde;
    Örnek;
    Name is Victoria, doYouWanaSubscribe true, whichMember Gold
    Eğer user(kullanıcı) Gold member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos ,
    all homework and see you soon. yazdırınız.

    Eğer user(kullanıcı) Silver member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.

    Eğer user(kullanıcı) Bronze member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.

    Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
    See you when you want to be a member. Thanks yazdırınız.
         */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Your name:");
    String name = input.nextLine();

    System.out.println("Do you want to subscribe? (true/false):");
    boolean doYouWanaSubscribe = input.nextBoolean();
    input.nextLine(); // Buffer temizleme

    String whichMember = "";
    if (doYouWanaSubscribe) {
        System.out.println("Which membership? (Gold/Silver/Bronze):");
        whichMember = input.nextLine().toLowerCase();
    }

    Subscribe user = new Subscribe(name, doYouWanaSubscribe, whichMember);
}
}

