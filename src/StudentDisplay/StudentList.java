/*
 * Sangeetha Pattara
 * 991575884
 * SYST10199 - Web Programming
 */
package StudentDisplay;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Students [] s= new Students[5];

        Scanner scan= new Scanner(System.in);
        System.out.println("length: "+s.length);
        for(int i=0;i<s.length;i++)
        {
            s[i]=new Students();
            System.out.println("Enter id");
            s[i].setId(scan.nextInt());
           scan.nextLine();
            System.out.println("Enter names");

            s[i].setName(scan.nextLine());
            
            System.out.println("Enter Address");

            s[i].setAddress(scan.nextLine());

        }
         System.out.println("The student names: ");
         for(int i=0;i<s.length;i++)
        {

            System.out.println("Id: "+s[i].getId()+"Name: " +s[i].getName()
                    +"Address: "+s[i].getAddress());
        }


    }



    
    
}
