import java.util.Scanner;

public class Main {
    static boolean polindrom(int num){
        int temp=num , reverseNum = 0, lastNum;
        while(temp!=0) {
            lastNum=temp%10;
            reverseNum=(reverseNum*10)+lastNum;
            temp/=10;
        }
        if (reverseNum==num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println(polindrom(246));


    }
}



