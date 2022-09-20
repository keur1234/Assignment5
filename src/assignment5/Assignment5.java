/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author abc_k
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String TempScore = " ";

        MyPropertyBean MyPropertyBean = new MyPropertyBean();
        Listener1 KonDoo1 = new Listener1();
        Listerner2 KonDoo2 = new Listerner2();
        MyPropertyBean.addPropertyChangeListener(KonDoo1);
        MyPropertyBean.addPropertyChangeListener(KonDoo2);

        while (true)
        {
            TempScore = " ";
            System.out.print("\nEnter score :" + TempScore);
            TempScore = input.nextLine();
            if (TempScore == "") break;
            MyPropertyBean.setScoreData(TempScore);
            
        }
        input.close(); 
        System.out.print("It's time to sleep");

    }
    
}
