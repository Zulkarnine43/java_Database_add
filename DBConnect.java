
import java.sql.*;


public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
        try{
            Class.forName("com.mysqli.jbdc.Driver");
                    con=DriverManager.getConnection("jbdc:mysqli://localhost:3306/test","root","");
                st = con.createStatement();
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
   
   
        try{
            String query ="select * from persons";
            rs=st.executeQuery(query);
            System.out.println("Records from database");
            while(rs.next()){
                String name =rs.getString("name");
             String age =rs.getString("age");
              System.out.println("Name"+name+ "  "+"Age"+age);
            }
            
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
    }

}
