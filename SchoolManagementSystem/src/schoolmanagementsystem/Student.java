
package schoolmanagementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public  class Student extends person {
    
    private String MumName;
    private String Adress;
    private int Grade;
   
    
    public Student(){};

    public Student(String MumName, String Adress, int Grade) {
        super.ID = ID;
       super.FirstName = FirstName;
        super.LastName = LastName;
        super.DadName = DadName;
        this.MumName = MumName;
        this.Adress = Adress;
        super.ConectNumber = ConectNumber;
        this.Grade = Grade;
        super.Gender = Gender;
    }

    

    
 @Override
    public int getID() {
        return ID;
    }
 @Override
    public void setID(int ID) {
       super.ID = ID;
    }
 @Override
    public String getFirstName() {
        return FirstName;
    }
 @Override
    public void setFirstName(String FirstName) {
       super.FirstName = FirstName;
    }
 @Override
    public String getLastName() {
        return LastName;
    }
 @Override
    public void setLastName(String LastName) {
        super.LastName = LastName;
    }
 @Override
    public String getDadName() {
        return DadName;
    }
 @Override
    public void setDadName(String DadName) {
       super.DadName = DadName;
    }

    public String getMumName() {
        return MumName;
    }

    public void setMumName(String MumName) {
        this.MumName = MumName;
    }
    
    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }
 @Override
    public int getConectNumber() {
        return ConectNumber;
    }
 @Override
    public void setConectNumber(int ConectNumber) {
        super.ConectNumber = ConectNumber;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int Grade) {
        this.Grade = Grade;
    }
 @Override
    public String getGender() {
        return Gender;
    }
 @Override
    public void setGender(String Gender) {
        super.Gender = Gender;
    }
    
    public void Add() 
    {
        try{
            int i=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Name:");
        String fname=input.nextLine();
        
         System.out.println("Enter Last Name:");
        String lname=input.nextLine();
        String s=" ";
        String txt=".txt";
        
        String perant="F:\\SchoolManagementSystem\\student";
        File std=new File(perant,fname+s+lname+txt);
        std.createNewFile();
        FileOutputStream fos = new FileOutputStream(std);
        OutputStreamWriter osw = new OutputStreamWriter( fos, "UTF-16" );
        BufferedWriter bw = new BufferedWriter(osw);

        
        System.out.println("ID:"+ ++i);
        bw.write("ID:"+i++);
        bw.newLine();
       
       
        
       
        bw.write("First Name:"+fname);
        bw.newLine();
        
       
        bw.write("Last Name:"+lname);
        bw.newLine();
        
        System.out.println("Enter Dad Name:");
        String DadName=input.nextLine();
         if(DadName.length()<3)
        {
        System.out.println("Sorry,your dad name must be longer");
        System.out.println("Enter Dad Name again please:");
        String dadname=input.nextLine();
        bw.write("Last Name:"+dadname);
        bw.newLine();
        }
        else
        {
        bw.write("Dad Name:"+DadName);
        bw.newLine();
        }
        System.out.println("Enter Mum Name:");
        String MumName=input.nextLine();
        if(MumName.length()<3)
        {
        System.out.println("Sorry,your mum name must be longer");
        System.out.println("Enter Mum Name again please:");
        String mumname=input.nextLine();
        bw.write("Last Name:"+mumname);
        bw.newLine();
        }
        else{
        bw.write("Mum Name:"+MumName);
        bw.newLine();
        }

        System.out.println("Enter Adress:");
        String Adress=input.nextLine();
        if(Adress.length()<5)
        {
        System.out.println("Sorry,your adress must be longer");
        System.out.println("Enter adress again please:");
        String adress=input.nextLine();
        bw.write("Adress:"+adress);
        bw.newLine();
        }
        else
        {
        bw.write("Adress:"+Adress);
        bw.newLine();
        }
        
        System.out.println("Enter connect number:");
        String ConNum=input.nextLine();
        if(ConNum.length()<7||ConNum.length()>10)
        {
        System.out.println("Sorry,");
        System.out.print("Enter connect number again please:");
        String connum=input.nextLine();
        bw.write("Connect number:"+connum);
        bw.newLine();
        }
        else
        {
        bw.write("Connect number:"+ConNum);
        bw.newLine();
        }
        
        
          System.out.println("Enter Gender(male or female):");
        String Gender=input.nextLine();
        
        bw.write("Gender:"+Gender);
        bw.newLine();
        
        System.out.println("Enter the Grade:");
        int grade=input.nextInt();
        
        bw.write("Grade:"+grade);
        bw.newLine();
        
        bw.close();
       std.getName();   
        }
        catch(Exception e)
        {
            System.out.println("There is exception!");
        }
    }
    public void findFile(String name,File file) 
    {
        try{
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
                findFile(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
                System.out.println(fil.getParentFile());
                System.out.println("found");
                String perant="F:\\SchoolManagementSystem\\student";
                File st=new File(perant,name);
          FileInputStream fis = new FileInputStream(st);
          InputStreamReader isr = new InputStreamReader( fis, "UTF-16" );
          BufferedReader br = new BufferedReader(isr);
          int c;
            while ((c = br.read()) != -1) {
                System.out.print((char)c);
            }
            br.close();
            }
            else
            {
                System.out.println("This name not existed");
            }
        }
        
        }
        catch(Exception e)
        {System.out.println("There is exception!");
        }
        
    }
    
    public void ShowAll()
    {
        File student=new File ("F:\\SchoolManagementSystem\\student");
        try
        {
            if(student.isDirectory())
            {
                File stdu[]=student.listFiles();
                if(stdu!=null)
                { System.out.println("\n"+student.getName()+" contains:");
                for(int i=0;i<stdu.length;i++)
                {
                    System.out.println((i+1)+")"+stdu[i].getName());
                    
                }
            }
                else
                System.out.println("you don't have any student");
            }
            
            
            else
            {
                System.out.println("student Diretory is not exit");
            }
        }
       catch(Exception e) {
            System.out.println("There is Exception!");}
    
    }
   public void deleteFile()
   {
       File student=new File ("F:\\SchoolManagementSystem\\student");
       try
       {
           if(student.isDirectory())
       { 
          File deleteList[]=student.listFiles();
          for(int i=0;i<deleteList.length;i++)
          {
              System.out.println((i+1)+") "+deleteList[i].getName());
          }
          Scanner in = new Scanner(System.in);
          System.out.println("enter the number you want delete");
                    int a = in.nextInt();
                    String deletedName = deleteList[a-1].getName();
                    if(deleteList[a-1].delete())
                    {
                    System.out.println(deletedName+"Succesfully deleted");
                    }
       }
       else
        { 
            System.out.println("File not exists!"); 
        }
       }
         
       catch(Exception e)
       { 
           System.out.println("There is Exception!");
       }
       
   }    
}

