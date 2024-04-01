/*Cameron "CJ" Robinson 10/03/23
Page 109 Chapter 3 Problem 3.4*/

public class RandomMonth {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 12) + 1;
        
        switch (number) {
            case 1: System.out.println("You pulled ... January!!"); break;
            case 2: System.out.println("You pulled ... Feburary!!"); break;
            case 3: System.out.println("You pulled ... March!!"); break;
            case 4: System.out.println("You pulled ... April!!"); break;
            case 5: System.out.println("You pulled ... May!!"); break;
            case 6: System.out.println("You pulled ... June!!"); break;
            case 7: System.out.println("You pulled ... July!!"); break;
            case 8: System.out.println("You pulled ... Auguest!!"); break;
            case 9: System.out.println("You pulled ... September!!"); break;
            case 10: System.out.println("You pulled ... October!!"); break;
            case 11: System.out.println("You pulled ... November!!"); break;
            case 12: System.out.println("You pulled ... December!!"); break;
        }
    }
}
