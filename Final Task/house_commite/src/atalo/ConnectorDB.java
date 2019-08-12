package atalo;
//import com.mysql.cj.jdbc.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;



public class ConnectorDB
{
    private static Connection connect;
    
  //-------------------------empty constructor:
    public ConnectorDB() {}
    
    
  //-------------------------Select Tenant:
    public static String SelectTenant(String username) { // check username and password for tenant
    	String pass="";
        try {
            PreparedStatement statement = connect.prepareStatement("select password from tenant where userName = "+"'"+username+"'");
            ResultSet result = statement.executeQuery();
            	while(result.next()) {
                pass=result.getString(1);
                }
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
          return pass;
    }


    //-------------------------Select HouseCommite:
    public static String SelectHouseCommite(String username) { //check username and password for housecommite
    	String pass="";
        try {
            PreparedStatement statement = connect.prepareStatement("select password from housecommite where username = "+"'"+username+"'");
            ResultSet result = statement.executeQuery();
            
            while(result.next()) {
               pass=result.getString(1); 
            }
            
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
       
        return pass;
    }
    
//-----------------------------Select Supplier:     
    public static String SelectSupplier(String specializes) {//show supplier
    	String answer1="",answer2="";
    	int i=1;
        try {
            PreparedStatement statement = connect.prepareStatement("select * from supplier where specializes = "+"'"+specializes+"'");
            ResultSet result = statement.executeQuery();
            	while(result.next())
            	{
            		 while (i<5)
                	 {
                        answer1=result.getString(i++);
                    	   answer2+= answer1 + " , " ;
                	 }       
            }
        } catch (SQLException var2) {
            var2.printStackTrace();
        } 
        return answer2;
    }
    
//------------------------Update Tenant Password:   
  public static void UpdateTenantPassword(String username,String password) { //enter new password for tenant
        String sqlupdate = "UPDATE tenant SET password=?  WHERE userName =? ";
        try {
            PreparedStatement pst = connect.prepareStatement(sqlupdate);
            pst.setString(1,password);
            pst.setString(2,username);
            pst.executeUpdate();
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
    }
  
//------------------------Update housecommite Password: 
    public static void UpdateHouseCommitePassword(String username,String password) { //enter new pass for housecommite
        String sqlupdate = "UPDATE housecommite SET password=?  WHERE username =? ";
        try {
            PreparedStatement pst = connect.prepareStatement(sqlupdate);
            pst.setString(1,password);
            pst.setString(2,username);
            pst.executeUpdate();
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
    }
    
 //--------------------------------------------------------------------------//    
    public static void InsertTenant(int id,String firstname,String lastname,String username,String password,String email,int monthlypayment) {
        String sqlInsert = "insert into tenant (id,firstname,lastname,username,password,email,appartmentnum,monthlypayment) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = connect.prepareStatement(sqlInsert);
            pst.setInt(1, id);
            pst.setString(2, firstname);
            pst.setString(3, lastname);
            pst.setString(4, username);
            pst.setString(5, password);
            pst.setString(6,email);
            pst.setInt(7, id);
            pst.setInt(8, monthlypayment);
            pst.execute();
           
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
    }
    

  //-------------------------drop table:
    public static void DropTable() {
        String sqlDrop = "drop table tenant";
        try {
            PreparedStatement pst = connect.prepareStatement(sqlDrop);
            pst.execute();
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
    }
    
    //-------------------------Create Table:
    public static void CreateTable() {
        String sqlcreate = "\r\n" + 
        		"CREATE TABLE tenant (\r\n" + 
        		"    ID int,\r\n" + 
        		"    FirstName varchar(255),\r\n" + 
        		"    LastName varchar(255),\r\n" + 
        		"    userName varchar(255),\r\n" + 
        		"    password varchar(255),\r\n" + 
        		"    email varchar(255),\r\n" + 
        		"	 appartmentnum int,\r\n" + 
        		"	 monthlypayment int,\r\n" + 
        		"    January int,\r\n" + 
        		"    February int,\r\n" + 
        		"    March int,\r\n" + 
        		"    April int,\r\n" + 
        		"    May int,\r\n" + 
        		"    June int,\r\n" + 
        		"    July int,\r\n" + 
        		"    August int,\r\n" + 
        		"    September int,\r\n" + 
        		"    October int,\r\n" + 
        		"    November int,\r\n" + 
        		"    December int\r\n" + 
        		");";
        try {
            PreparedStatement pst = connect.prepareStatement(sqlcreate);
            pst.execute();
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
    }
    
    //-------------------------update tenant that pay:
    public static void UpdatePay(String month,int apartment_num,int value) {//update tenant that pay
        String sqlupdate = "UPDATE tenant SET " + month + " =? WHERE appartmentnum =?";
        try {
          PreparedStatement pst = connect.prepareStatement(sqlupdate);
            pst.setInt(1,value);
            pst.setInt(2,apartment_num);
            pst.executeUpdate();
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
    }
    
    //-------------------------Delete Pay:
    public static void UpdatePayD(String month,int apartment_num) {// delete tenant pay
        String sqlupdate = "UPDATE tenant SET " + month + " =? WHERE appartmentnum =?";
        try {
            PreparedStatement pst = connect.prepareStatement(sqlupdate);
            pst.setInt(1,0);
            pst.setInt(2,apartment_num);
            pst.executeUpdate();
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
    }
    
//-----------------------------Select Month Pay:
    public static String SelectMonthPay(String username) {//show payments for a tenant
    	int i=1;
    	String answer1="",answer2="";
    	 try {
             PreparedStatement statement = connect.prepareStatement("select January,February,March,April,May,June,July,August,September,October,November,December from tenant where username= "+"'"+username+"'");
             ResultSet result = statement.executeQuery();
         while(result.next()) 
         {
        	 while (i<13)
        	 {
                answer1=result.getString(i++);
               if(!(answer1.matches("0")))
            	   answer2+= answer1 + " , " ;
        	 }                       
          }
         } catch (SQLException var2) {
             var2.printStackTrace();
         }
    	 return answer2;
    }
    
//-------------------------------Select all pay:
    public static String SelectAllPay() {//show all tenants pay
    	int i=1;
    	String answer1="",answer2="";
    	 try {
             PreparedStatement statement = connect.prepareStatement("select appartmentnum,January,February,March,April,May,June,July,August,September,October,November,December from tenant");
             ResultSet result = statement.executeQuery();
         while(result.next()) 
         {
        	 while (i<14) // i=1 14-1 =13 (12 month)
        	 {
               answer1=result.getString(i++);
               if(!(answer1.matches("0")))    // 0 exit
               {
            	   if (i==2) {
            		   answer2+= "appartment "+answer1 + " = ";
            		   }
            	   else 
            		   answer2+= answer1 + " , " ;
        	   }
        	 }
        	i=1;
        	answer2+=" ";
         }
    	 } catch (SQLException var2) {
             var2.printStackTrace();
         }
    	 return answer2;  	
    }

  //-------------------------------Select sum of month:
    public static String SelectAllSum(String month) { //show sum of pay in a month
    	String answer="";
    	 try {
    		 
             PreparedStatement statement = connect.prepareStatement("select sum(monthlypayment)from tenant where "+month+"!=0");
             ResultSet result = statement.executeQuery();
         while(result.next()) 
         {
        	    answer="the sum of -"+month+"- = " + result.getString(1);
               
         }
         } catch (SQLException var2) {
             var2.printStackTrace();
         }	 
    	 return answer;
    }
    
    //-------------------------------Select pays for a tenant:
  public static String SelectTenantPay(String appartmentnum) {//show pays for a tenant
    	int i=1;
    	String answer1="",answer2="appartment -"+appartmentnum+"- payments:";
    	 try {
             PreparedStatement statement = connect.prepareStatement("select January,February,March,April,May,June,July,August,September,October,November,December from tenant where appartmentnum= "+"'"+appartmentnum+"'");
             ResultSet result = statement.executeQuery();

         while(result.next()) 
         {
        	 while (i<13)
        	 {
                answer1=result.getString(i++);
               if(!(answer1.matches("0")) )
            	   answer2+= answer1 + " , " ; 
        	 }           
          }
         } catch (SQLException var2) {
             var2.printStackTrace();
         }
    	 return answer2;	
    }
  
  //-------------------------------check if already have this supplier:
    public static String CheckIfExist(String phone) { //check if already have this supplier
    	String ans="";
        try {
            PreparedStatement statement = connect.prepareStatement("select firstname from supplier  where phonenumber="+phone);
            ResultSet result = statement.executeQuery();
            	while(result.next()) {
                ans+=result.getString(1);}
        } catch (SQLException var2) {
            var2.printStackTrace();
        }
        return ans;
    }
    
    //-------------------------------Insert Into Supplier
    public static void InsertSupplier(int id,String firstname,String lastname,String phonenumber,String special) {
        String sqlInsert = "insert into supplier (id,firstname,lastname,phonenumber,specializes) values (?,?,?,?,?)";
        try {
            PreparedStatement pst = connect.prepareStatement(sqlInsert);
            pst.setInt(1, id);
            pst.setString(2, firstname);
            pst.setString(3, lastname);
            pst.setString(4, phonenumber);
            pst.setString(5, special);
            pst.execute();
        } 
        catch (SQLException var2) {
            var2.printStackTrace();
        }
    }
    
    /*
    //-------------------------------Insert Into housecommite: NOT GOOD
    public static void InsertHousecommite(int id,String firstname,String lastname, String username, String password, String seniority) {
        String sqlInsert = "insert into housecommite (id,firstname,lastname,seniority) values (?,?,?,?)";
        try {
            PreparedStatement pst = connect.prepareStatement(sqlInsert);
            pst.setInt(1, id);
            pst.setString(2, firstname);
            pst.setString(3, lastname);
            pst.setString(4, username);
            pst.setString(5, password);
            pst.setString(6, seniority);
            pst.execute();
        } 
        catch (SQLException var2) {
            var2.printStackTrace();
        }
    }
    */
    
    //-------------------------------Select Max:
    public static int SelectMax() {//search the max id in supplier so the new one will be the next after him
    	int answer=-1;
        try {
            PreparedStatement statement = connect.prepareStatement("select max(id) from supplier");
            ResultSet result = statement.executeQuery();
            	while(result.next()) {
                  answer=result.getInt(1);}
        } catch (SQLException var2) {
            var2.printStackTrace();
        } 
        return answer;
    }
    
    //-------------------------------connection to the driver class:
    public static void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException var1) {
            var1.printStackTrace();
        }
    }
    
    //-------------------------------ConectingToSQL to Data base - project
    public static void ConectingToSQL() {
    	
        connection();
        String host = "jdbc:mysql://localhost:3306/project";
        String username = "root";
        String password = "64893872";
        
        try {            
            connect = (Connection)DriverManager.getConnection(host+"?serverTimezone=UTC", username, password);
        } catch (SQLException var4) {
            var4.printStackTrace();
        }
    }
    
    //-------------------------------Main:
    @SuppressWarnings("resource")
	public static void main(String[] argv) {
    	new Scanner(System.in);
    	ConectingToSQL();   
    }
}
