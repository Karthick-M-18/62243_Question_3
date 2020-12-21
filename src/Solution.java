import java.util.Scanner;

public class Solution {
    public static String filter(int startElement, int endElement){
        return null;
    }

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int startElement = scan.nextInt();
        int endElement = scan.nextInt();
        String clOne = ChildOne.filter(startElement,endElement);
        String clTwo = ChildTwo.filter(startElement,endElement);
        System.out.println(clOne);
        System.out.println(clTwo);
//        clOne = clOne.strip();
//        clTwo = clTwo.strip();
//        String try2[] = clOne.split(" ");
//        String try3[] = clTwo.split(" ");
//        System.out.println(try2[0] + " " + try2[try2.length - 1]);
//        System.out.println(try3[0] + " " + try3[try3.length - 1]);
//
    }
}

