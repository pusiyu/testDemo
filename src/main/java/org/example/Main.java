package org.example;

class Inta{
    public int doInt(int...a){
        /**System.out.println("Inta doInt:" + a.length);
        for (int j : a) {
            System.out.println(j);
        }**/
        return a.length;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inta ia = new Inta();
        ia.doInt(10);
        ia.doInt();
        ia.doInt(10,6,8);
    }
}