/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lippy
 */
public class Connect {
    private Connection con = null;//Connection to database
    private  Statement stmt = null;//creating a statement
    
    public Connect()
    {
        try
        {
            //Database Connection
            Class.forName("com.mysql.jdbc.Driver");//Importing Driver for mySQL
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineExam","root","");//Connected  
            //Connection con = DriverManager.getConnection("jdbc:mysql://www.sandipcodes.net/sandipco_OnlineExam","sandipco_onlineExam","online.exam.28");
            stmt = con.createStatement();//Creating statement
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Sorry Some error happened");
        }
        catch(SQLException es)
        {
            System.out.println("SQL Statement is not correct");
        }  
    }
    //For Student Record
    public boolean insertStudent(String name,String dob,String gender,String address,String email,int phone,int redgNo,String password)
    {
        try
        {
          String sql = "INSERT INTO Student(Name,DOB,Gender,Address,Email,Phone,Redg_no,Password)"+"VALUES('"+name+"','"+dob+"','"+gender+"','"+address+"','"+email+"',"+phone+","+redgNo+",'"+password+"')";
           
          stmt.executeUpdate(sql);
          return true;  
        }
        catch(SQLException se)
        {
            System.out.println("SQL Error");
        }
        return false;
    }
    // For Admin Record
    public boolean insertAdmin(String name,String dob,String gender,String address,String email,int phone,int ENo,String password,int s)
    {
        try
        {
            System.out.println(name+" "+dob+" "+gender+" "+address+" "+email+" "+phone+" "+ENo+" "+password+" "+s);
          String sql = "INSERT INTO Admin(Name,DOB,Gender,Address,Email,Phone,Eno,Password,S_admin)"+"VALUES('"+name+"','"+dob+"','"+gender+"','"+address+"','"+email+"',"+phone+","+ENo+",'"+password+"',"+s+")";
            
          stmt.executeUpdate(sql);
          return true;  
        }
        catch(SQLException se)
        {
            System.out.println("SQL Error");
        }
        return false;
    }
    
    
    //For Test insertion
    public boolean insertTest(String testname,String testSub,int qNo,int Aid)
    {
        try
        {
            String sql = "INSERT INTO Test(Test_name,Test_sub,No_Of_Q,Aid) VALUES('"+testname+"','"+testSub+"',"+qNo+","+Aid+")";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
        
    //For  Getting Test Id
    public int getTestId(String testName)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "SELECT Test_id FROM Test WHERE Test_name = '"+testName+"'";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                System.out.println(rs.getInt("Test_id"));
                return rs.getInt("Test_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    //inset questions 
    public boolean insertQuestion(int Test_id,String Question,String op1,String op2,String op3,String op4, int ans)
    {
        try
        {
            String sql = "INSERT INTO Question(Test_id,Que,op1,op2,op3,op4,Ans) VALUES('"+Test_id+"','"+Question+"','"+op1+"','"+op2+"','"+op3+"','"+op4+"',"+ans+")";
            stmt.executeUpdate(sql);
            return true;
        }
        catch(SQLException se)
        {
            System.out.println("SQL Error");
        }
        return false;
        
    }
    
    
    //update the current loggined admin
    public boolean updateAdmin(String name,String dob,String address,int phone,String email,int Aid)
    {
        try 
        {
            String sql = "UPDATE Admin SET Name = '"+name+"', DOB= '"+dob+"',Address = '"+address+"',Phone = "+phone+",Email = '"+email+"' WHERE Aid = "+Aid+"";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //getting all admin
    public ResultSet getAdmin(int Aid)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "SELECT * FROM Admin WHERE Aid = "+Aid+"";
            ResultSet rs = stm.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //For Answer Insertion
    public boolean insertAnswer(int Test_id,int Sid,int Qid,int res,int result,int Tid)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "insert into Answer(Test_id,Sid,Qid,Response,Result,Tid) values("+Test_id+","+Sid+","+Qid+","+res+","+result+","+Tid+")";
            stm.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //For Closing the Connection
    public void closeConnection()
    {
        try {
            con.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //getting all students
    public ResultSet getStudent()
    {
        try
        {
            String sql = "SELECT * FROM Student";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
    }
    
    
    //getting details about super admin
    public int getSuperAdmin(int Aid)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "SELECT S_admin from Admin where Aid = "+Aid+"";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                return rs.getInt("S_admin");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    //getting details of that admin
     public ResultSet getAdmin()
    {
        try
        {
            String sql = "SELECT * FROM Admin";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     
     public boolean activeStudent(int Sid)
     {
         try
         {
             Statement stm = con.createStatement();
             int c = 1;
             String sql = "update Student set Active = "+c+" WHERE Sid = "+Sid+"";
             stm.executeUpdate(sql);
             return true;
         } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;
     }
     //deleting an student
     public boolean inactiveStudent(int Sid)
     {
         try
         {
             Statement stm = con.createStatement();
             int c = 0;
             String sql = "update Student set Active = "+c+" WHERE Sid = "+Sid+"";
             stm.executeUpdate(sql);
             return true;
         } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;
     }
     
     
      public boolean activeAdmin(int Aid)
     {
         try
         {
             Statement stm = con.createStatement();
             int c = 1;
             String sql = "update Admin set Active = "+c+" WHERE Aid = "+Aid+"";
             stm.executeUpdate(sql);
             return true;
         } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;
     }
     //Inactivatinging an admin
      public boolean inactiveAdmin(int Aid)
     {
         try
         {
             Statement stm = con.createStatement();
             int c = 0;
             String sql = "update Admin set Active = "+c+" WHERE Aid = "+Aid+"";
             stm.executeUpdate(sql);
             return true;
         } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;
     }
      
      //getting all test names
    public ResultSet getTestName()
    {
        try
        {
            Statement stm = con.createStatement();
            
            String sql = "select Test_name from Test";
            ResultSet rs = stm.executeQuery(sql);
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //getting the details of the test
    public ResultSet getTest(String testName)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "SELECT * FROM Test WHERE Test_name = '"+testName+"'";
            ResultSet rs = stm.executeQuery(sql);
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //getting the name of the student
    public String getName(int Sid)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "select Name from Student where Sid = "+Sid+"";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                System.out.println(rs.getString("Name"));
                return rs.getString("Name");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //insertion data into TestHistory
    public boolean insertTestHistory(int Sid,int Test_id,String Date)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "insert into TestHistory(Sid,Test_id,Date) values("+Sid+","+Test_id+",'"+Date+"')";
            stm.executeUpdate(sql);
           
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //insertion data into Test Temp
    public boolean insertTestTemp(int Test_id)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "insert into TestTemp (Que,Op1,Op2,Op3,Op4,Qid) Select Que,Op1,Op2,Op3,Op4,Qid from Question where Test_id ="+Test_id+"";
            stm.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //getting the number of rows in TestTemp
    public int getCount()
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "select count(*) from TestTemp";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                return rs.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    //geting the testhistory Id
    public int getTid(int Sid,String date)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "select Tid from TestHistory where Sid = "+Sid+" and Date = '"+date+"'";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                return rs.getInt("Tid");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    //getting all questions
    public ResultSet getQuestion(int count)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "Select * from TestTemp where id = "+count+"";
            ResultSet rs = stm.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //getting the answer of the question
    public int getResultOf(int Qid)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "select Ans from Question where Qid = "+Qid+"";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                return rs.getInt("Ans");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    
    
    //getting the scoreof the student
    public int getScore(int Tid)
    {
        try
        {
            Statement stm = con.createStatement();
            int result = 1;
            String sql = "select count(*) from Answer where Tid = "+Tid+" and Result = "+result+"";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                return rs.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    //result insertion 
    public void insertResult(int Tid,int Sid,int score,int Test_id)
    {
         try
        {
            Statement stm = con.createStatement();
            String sql = "insert into Result(Sid,Test_id,Tid,score) values("+Sid+","+Test_id+","+Tid+","+score+")";
            stm.executeUpdate(sql);
           
            return;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return;
    }
    public String getTestName(int Test_id)
    {
        try{
            Statement stm = con.createStatement();
            String sql = "select Test_name from Test where Test_id = "+Test_id+"";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                System.out.println("con : " + rs.getString("Test_name"));
                return rs.getString("Test_name");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ResultSet getResult(int Sid) {
            try
            {
                Statement stm = con.createStatement();
                System.out.println("con :" + Sid);
                String sql = "select * from Result where Sid = "+Sid+"";
                ResultSet rs = stm.executeQuery(sql);
                
                
                return rs;
            } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getTime(int Tid) {
        try
        {
            Statement stm = con.createStatement();
            String sql = "select Date from TestHistory where Tid = "+Tid+"";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                System.out.println(rs.getString("Date"));
                return rs.getString("Date");
            }
                  
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet getResult() {
            try
            {
                Statement stm = con.createStatement();
                String sql = "select * from Result";
                ResultSet rs = stm.executeQuery(sql);
                return rs;
            } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    public ResultSet getStudent(int Sid)
    {
        try
        {
            Statement stm = con.createStatement();
            String sql = "SELECT * FROM Student WHERE Sid = "+Sid+"";
            ResultSet rs = stm.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public boolean updateStudent(String name,String dob,String address,int phone,String email,int Sid)
    {
        try 
        {
            String sql = "UPDATE Student SET Name = '"+name+"', DOB= '"+dob+"',Address = '"+address+"',Phone="+phone+",Email = '"+email+"' WHERE Sid = "+Sid+"";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void createTestTemp() {
        try
        {
            Statement stm = con.createStatement();
            String sql = "create table TestTemp(" +
                        "id integer(10) primary key auto_increment," +
                        "Que text not null," +
                        "Op1 varchar(200) not  null," +
                        "Op2 varchar(200) not  null," +
                        "Op3 varchar(200) not null," +
                        "Op4 varchar(200) not null," +
                        "Qid Integer(10) not null)";
            stm.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropTestTemp() {
        try
        {
            Statement stm = con.createStatement();
            String sql = "drop table TestTemp";
            stm.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
