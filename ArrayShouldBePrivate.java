package Demo;
import java.util.*;

public class ArrayShouldBePrivate{
  
  public static final String arr[]={"Hello","My","Name","is"};
  
  public static final int[] arr2={1,2,3,4,5,56};
  
  private static final int arr3[]={10,20,30,40};
  
  protected static final int arr4[]={123,345,678,901};
  
  try{
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
      Statement stmt = con.createStatement(); {
         try(ResultSet rs = stmt.executeQuery("select * from MyPlayers");){
            //Retrieving the data
            while(rs.next()) {
            
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }} catch (SQLException e) {
            e.printStackTrace();
      }
  try{
    
  }catch(Exception e){
    System.out.println("Exception"+e);
  }
}
