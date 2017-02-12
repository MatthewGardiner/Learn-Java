/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupProject;

/**
 *
 * @author Team 3
 */
//imports sql api and the Scanner
import java.sql.*;
import java.util.Scanner;

public class main {
//Decalaration of the variables used across the program
  //used for connection to the database
  static Connection c = null;
  //used for executing sql statements
  static Statement stmt = null;
  // used for second layer of case statements
  static String oIn;
  //used for option selection of first layer of case statement
  static int addInput;
  //used when parsing arguments to add and delete methods
  static String dbIn;
  // used for parsing arguments to the edit method
  static String one, two, three, four, five;
  public static void main( String args[] )
  { 
//executing the connect and create database methods
    db_connect();  
    db_create();
    
//USER INTERACTION
    
    //Asks and takes the user's input to which program function	
    Scanner uIn = new Scanner(System.in);
    System.out.println("which function? 1=add or 2=edit 3=remove 4= print only");
    addInput = Integer.parseInt(uIn.nextLine());
    
    
    //switch statement taking the users option from above and moving on to ask what which table they would like to interact with
    switch(addInput){
        case 1: System.out.println("add to tutor groups= 1, add tutor=2, add student=3");
                oIn = uIn.nextLine();
                switch(Integer.parseInt(oIn)){
                    //takes the value of oIn and then asks user what they would like to add to that table
                    //db_add(dbIn) then takes the value of dbIn and parses it to the db_add() method
                    case 1: System.out.println("Enter new row with syntax group_number, tutor_names, student_names, student_uob_number \nmake sure to have \"\" around each variable ");
                            dbIn = uIn.nextLine();
                            db_add(dbIn);
                           break;
                    case 2: System.out.println("Enter new row with syntax tutor_names, tutor_uob_number, tutor_email, group_number \nmake sure to have \"\" around each variable");
                            dbIn = uIn.nextLine();
                            db_add(dbIn);
                           break;
                    case 3: System.out.println("Enter new row with syntax student_names, student_uob_number, student_email, student_course, group_number\nmake sure to have \"\" around each variable");
                            dbIn = uIn.nextLine();
                            db_add(dbIn);
                           break;
                    default: System.out.println("ENTER A NUMBER BETWEEN 1 - 3");
                           break;              
                }
                    
                break;
        //Case 2 gets user input for which table and row they want to edit
        case 2: System.out.println("edit tutor groups= 1, edit tutor=2, edit student=3");
                oIn = uIn.nextLine();
                switch(Integer.parseInt(oIn)){
                    // takes input for what the user wants to edit and saves each variable to String one to five
                    case 1: System.out.println("ENTER group_number");
                            one = uIn.nextLine();
                            System.out.println("ENTER tutor_names");
                            two = uIn.nextLine();
                            System.out.println("ENTER student_names");
                            three = uIn.nextLine();
                            System.out.println("ENTER student_uob_number");
                            four = uIn.nextLine();
                            five="";
                            //executes edit method parsing the users input
                            db_edit_row_text(one, two, three, four, five);
                           break;
                    case 2: System.out.println("ENTER tutor_uob_number");
                            one = uIn.nextLine();
                            System.out.println("ENTER tutor_names");
                            two = uIn.nextLine();
                            System.out.println("ENTER tutor_email");
                            three = uIn.nextLine();
                            System.out.println("ENTER group_number");
                            four = uIn.nextLine();
                            five = "";
                            db_edit_row_text(one, two, three, four, five);
                           break;
                    case 3: System.out.println("ENTER student_uob_number");
                            one = uIn.nextLine();
                            System.out.println("ENTER student_names");
                            two = uIn.nextLine();
                            System.out.println("ENTER student_email");
                            three= uIn.nextLine();
                            System.out.println("ENTER student_course");
                            four = uIn.nextLine();
                            System.out.println("ENTER group_number");
                            five = uIn.nextLine();
                            db_edit_row_text(one, two, three, four, five);
                           break;
                    default: System.out.println("NOT A NUMBER BETWEEN 1-3");
                           break;              
                }
        //case 3 takes user input of which table the user would like to delete from    
        case 3: System.out.println("remove from tutor groups= 1, edit tutor=2, edit student=3");
                oIn = uIn.nextLine();
                switch(Integer.parseInt(oIn)){
                    // select which row to delete via either group number or UoB number depending on which table
                    case 1: System.out.println("Enter Group number you want to remove");
                            dbIn = uIn.nextLine();
                            // executes remove method parsing the users input to which row will be deleted
                            db_remove_row(dbIn);
                           break;
                    case 2: System.out.println("Enter tutor's UoB you want to remove");
                            dbIn = uIn.nextLine();
                            db_remove_row(dbIn);
                           break;
                    case 3: System.out.println("Enter Student's UoB you wish to remove");
                            dbIn = uIn.nextLine();
                            db_remove_row(dbIn);
                           break;
                    default:System.out.println("DID NOT ENTER A NUMBER 1 - 3");
                           break;              
                }
        //does nothing just used to escape case statement if the user wants only to see contents of database
        case 4: System.out.println("PRINT ONLY\n");
        //a catch if user does not enter a number 1 - 4
        default:  //System.out.println("NO FUNCTION ENTERED");
                  break;
    }
    // executes print method and executes close method
    db_print_all();
    db_close();
    
  }
  //Connects to the sqlite database
  public static void db_connect(){
      try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:TGS.db");
            c.setAutoCommit(false);
      }catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
       }
      System.out.println("Opened database successfully");
  
  }
  //Creates the 3 tables used in this system 
  public static void db_create(){
      try{
            stmt = c.createStatement();
            // Strings for storing sql commands 
            String tutor_group = "CREATE TABLE IF NOT EXISTS tutor_groups"+
                                 "(group_number INTEGER(2) PRIMARY KEY,"+
                                 "tutor_names TEXT,"+
                                 "student_names TEXT,"+
                                 "student_uob_number INTEGER(8));";
            String tutor = "CREATE TABLE IF NOT EXISTS tutor"+
                           "(tutor_names TEXT,"+
                           "tutor_uob_number INTEGER(8),"+
                           "tutor_email TEXT,"+
                           "group_number INTEGER(2) PRIMARY KEY);";
            String student = "CREATE TABLE IF NOT EXISTS student"+
                             "(student_names TEXT,"+
                             "student_uob_number INTEGER(8),"+
                             "student_email TEXT,"+
                             "student_course TEXT,"+
                             "group_number INTEGER(2) PRIMARY KEY);"; 
            // Executes the sql commands                 
            stmt.executeUpdate(tutor_group);
            stmt.executeUpdate(tutor);
            stmt.executeUpdate(student);
            // closes sql statement and comits changes to the database.
            stmt.close();
            c.commit();
            System.out.println("TABLE CREATED");
            
      }catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);      
      }
  }
  //close database connection
  public static void db_close(){
      try{
        c.close();
      }catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);      
      }
  }
  //adds a row to the database based on input which table was selected and the row inputed by the user
  public static void db_add(String ui){
      try{
            stmt = c.createStatement();
            // stores sql commands to be executed
            String tutor ="INSERT INTO tutor (tutor_names, tutor_uob_number, tutor_email, group_number) "+
                        "VALUES" +"(" + ui+ ")";
            String student="INSERT INTO student (student_names, student_uob_number, student_email, student_course, group_number) "+
                            "VALUES"+"("+ui+")";
            String tutor_groups="INSERT INTO tutor_groups (group_number, tutor_names, student_names, student_uob_number) "+
                        "VALUES" +"(" + ui+ ")";
            //adds user input to table based on which table they selected in the case statements
            switch(Integer.parseInt(oIn)){
                case 1: stmt.execute(tutor_groups);
                    break;
                case 2: stmt.execute(tutor);
                    break;
                case 3: stmt.execute(student);
                    break;
                default:
                    break;                    
            }
            // closes sql statement and commits the row to the database
            stmt.close();
            c.commit();
            System.out.println("ADDED TO DATABASE");
      }catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);      
      }
  }
  //removes user specified row from db
  public static void db_remove_row(String id){
      try{
            stmt = c.createStatement();
            // stores the commands to be executed
            String tutor_groups ="DELETE FROM tutor_groups WHERE group_number=\""+ id + "\"";
            String tutor ="DELETE FROM tutor WHERE tutor_uob_number=\""+ id + "\"";
            String student ="DELETE FROM student WHERE student_uob_number=\""+ id + "\"";
            // executes the sql commands based on which table was selected in the case statements 
            switch(Integer.parseInt(oIn)){
                case 1: stmt.execute(tutor_groups);
                    break;
                case 2: stmt.execute(tutor);
                    break;
                case 3: stmt.execute(student);
                    break;
                default:
                    break;                    
            }            
            // closes sql staement and comits changes to database
            stmt.close();
            c.commit();
            System.out.println("REMOVED ROW: "+ id +" FROM DATABASE");      
      }catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);          
      }
  
  }
  //edits a row in the user chosen table and row
  public static void db_edit_row_text(String one, String two, String three, String four, String five){
      try{
          stmt = c.createStatement();
          // stores sql commands to be executed
          String tutor_groups ="UPDATE tutor_groups "+
                      "SET tutor_names='"+ two +"', student_names='" + three + "', student_uob_number='"+ four +"' "+ 
                      "WHERE group_number=\""+ one + "\"";
          String tutor ="UPDATE tutor " +
                        "SET tutor_names='"+ two +"', tutor_email='"+ three + "', group_number='"+ four +"' " +
                        "WHERE tutor_uob_number=\""+ one +"\"";
          String student = "UPDATE student "+
                           "SET student_names='"+ two +"', student_email='"+ three  +"', student_course='"+ four +"', group_number='"+ five +"' "+
                           "WHERE student_uob_number=\"" + one + "\"";
          switch(Integer.parseInt(oIn)){
              // edits the table selected with the command stored in the strings above
              case 1: stmt.executeUpdate(tutor_groups);
                  break;
              case 2: stmt.executeUpdate(tutor);
                  break;
              case 3: stmt.executeUpdate(student);
                  break;
              default: System.out.println("it broked");    
                  break;
          }
            
            stmt.close();
            c.commit();
            System.out.println("EDITED ROW: "+ one +" IN DATABASE");       
      }catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);          
      }
  }
  
  //prints all the contents of the tables in TGS.db
  public static void db_print_all(){
      try{
            ResultSet tgr = stmt.executeQuery( "SELECT * FROM tutor_groups;" );
            while(tgr.next()){
                int group_number = tgr.getInt("group_number");
                String tutor_name = tgr.getString("tutor_names");
                String student_name = tgr.getString("student_names");
                int uob = tgr.getInt("student_uob_number");
                
                System.out.println("TUTOR GROUPS\n");
                System.out.println("Group Number: "+group_number);
                System.out.println("Tutor's Name: "+tutor_name);
                System.out.println("Students Names: "+student_name);
                System.out.println("Student UoB numbers: "+uob);
                System.out.println();
            }
            tgr.close();            
            ResultSet tut = stmt.executeQuery("SELECT * FROM tutor;");
            while(tut.next()){
                String tutor_name = tgr.getString("tutor_names");
                int tutor_uob = tgr.getInt("tutor_uob_number");
                String tutor_email = tgr.getString("tutor_email");
                int group_number = tgr.getInt("group_number");
                System.out.println("TUTORS\n");
                System.out.println("Tutor Name: " + tutor_name);
                System.out.println("Tutor's UoB: "+tutor_uob);
                System.out.println("Tutor's E-Mail: "+tutor_email);
                System.out.println("Tutor's Group Number: "+group_number);
                System.out.println("");
            }
            tut.close();
            ResultSet stu = stmt.executeQuery("SELECT * FROM student;");
            while(stu.next()){
                String student_name = stu.getString("student_names");
                int student_uob = stu.getInt("student_uob_number");
                String student_email = stu.getString("student_email");;
                String student_course = stu.getString("student_course");;
                int group_number = stu.getInt("group_number");;
                System.out.println("STUDENTS\n");
                System.out.println("Student's Name: "+student_name);
                System.out.println("Student's UoB number:"+student_uob);
                System.out.println("Student's E-Mail: "+student_email);
                System.out.println("Student's Course: "+student_course);
                System.out.println("Student's Group Number: "+group_number);
                System.out.println("");
            }
            stu.close();

            stmt.close();
            c.commit();
            
      }catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);      
      }  
  }
}
