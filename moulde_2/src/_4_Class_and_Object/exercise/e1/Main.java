package _4_Class_and_Object.exercise.e1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2+bx+c");
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b =scanner.nextInt();
        System.out.println("enter c");
        int c =scanner.nextInt();
        QuadracticEquation quadracticEquation = new QuadracticEquation(a,b,c);
        System.out.println("deta:"+quadracticEquation.getDiscriminant());
        if (quadracticEquation.getDeta()>0){
            System.out.println("nghiem 1:"+quadracticEquation.getRoot1());
            System.out.println("nghiem 2:"+quadracticEquation.getRoot2());
        }else if(quadracticEquation.getDeta()==0){
            System.out.println("nghiem:"+quadracticEquation.getRoot1());
        }else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
