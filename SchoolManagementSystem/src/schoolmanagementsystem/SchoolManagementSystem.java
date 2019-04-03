
package schoolmanagementsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class SchoolManagementSystem {
    Student s=new Student();
    Teacher t=new Teacher();
    public void manageStudent() 
    {
        int x;
        System.out.println("\nplease choose one of the following options:\n"
               +"\n1-Add Student "
               + "\n2-Search student"
               + "\n3-Delete student"+
               "\n4-Show all students"
                + "\n5-Back \n");
       Scanner input=new Scanner(System.in);
       x=input.nextInt();
       switch(x)
       {
           case 1:
               s.Add();
               manageStudent();
               break;
               
           case 2:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First name to be searched.. " );
        String fname = scan.next();
        System.out.println("Enter the First name to be searched.. " );
        String lname = scan.next();
        String directory = "F:\\SchoolManagementSystem\\student";
        s.findFile(fname+" "+lname+".txt",new File(directory));
        
             manageStudent();
             break;
             
           case 3:
             s.deleteFile();
             manageStudent();
             break;
             
           case 4:
               s.ShowAll();
               manageStudent();
               break;
           case 5:
               mainWindow();
               break;
       }
        
    }
    
    public void manageTeacher() 
    {
        int a;
        System.out.println("\nplease choose one of the following options:\n"
               +"\n1-Add Teacher "
               + "\n2-Search teacher"
               + "\n3-Delete teacher"+
               "\n4-Show all teachers"
                + "\n5-Back \n");
       Scanner input=new Scanner(System.in);
       a=input.nextInt();
       switch(a)
       {
           case 1:
               t.Add();
               manageTeacher();
               break;
               
           case 2:
             
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First name to be searched:" );
        String fname = scan.next();
        System.out.println("Enter the First name to be searched: " );
        String lname = scan.next();
        String directory = "F:\\SchoolManagementSystem\\teacher";
        t.findFile(fname+" "+lname+".txt",new File(directory));
        
             manageTeacher();
             break;
             
           case 3:
             t.deleteFile();
             manageTeacher();
             break;
             
           case 4:
               t.ShowAll();
               manageTeacher();
               break;
           case 5:
               mainWindow();
               break;
       }
        
    }
    
    
    public void mainWindow()
    {
        System.out.println("\nplease choose one of the following options:\n" 
               + "\n1-Manage Student:"
               + "\n2-Manage Teacher:");
       Scanner input=new Scanner(System.in);
       int a=input.nextInt();
       switch(a)
       {
           case 1:
               manageStudent();
               break;
               
           case 2:
               manageTeacher();
               break;
       }
    }
    public static void main(String[] args) 
    {
       SchoolManagementSystem m=new SchoolManagementSystem();
       m.mainWindow();
       

    }
    
}
