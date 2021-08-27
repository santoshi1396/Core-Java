import java.io.*;
import java.sql.*;
import java.util.*;

public class FileData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i;
			File f=new File("data.txt");
			FileWriter fw= new FileWriter("data.txt");
			fw.write("tom,CartoonNetwork, 1990,$5000");
			fw.write("\n jerry, CartoonNetwork,1989,$4500");
			fw.write("\n popye,Disney,1995,$3000");
			fw.write("\n chotabhim,bollywood,2000,$6000");
			fw.close();
			
			if(f.createNewFile()){
				System.out.println("File Created Sucefully");
			}
			else{
				System.out.println("Already exist");

			}
			
			FileReader fr=new FileReader("data.txt");
			while((i=fr.read())!=-1){
				System.out.print((char)i);
			}
			System.out.println("\n");
			StringTokenizer st =new StringTokenizer("tom,CartoonNetwork,1990,$5000", ",");
		        while (st.hasMoreTokens()){
		        System.out.println(st.nextToken());
		        }
		        System.out.println("\n");
				StringTokenizer st1=new StringTokenizer("jerry,CartoonNetwork,1989,$4500", ",");
		        while (st1.hasMoreTokens()){
		            System.out.println(st1.nextToken());
		        }
		        System.out.println("\n");

	            StringTokenizer st2 =new StringTokenizer("popye,Disney,1995,$3000", ",");
	            while (st2.hasMoreTokens()){
		            System.out.println(st2.nextToken());
		        }
		        System.out.println("\n");

	            StringTokenizer st3 =new StringTokenizer("chotabhim,bollywood,2000,$6000", ",");
	            while (st3.hasMoreTokens()){
		            System.out.println(st3.nextToken());

		        }
	            
	            ArrayList<String> al=new ArrayList<String>();
	    		al.add("tom,CartoonNetwork, 1990,$5000");
	    		al.add("jerry, CartoonNetwork,1989,$4500");
	    		al.add(" popye,Disney,1995,$3000");
	    		al.add("chotabhim,bollywood,2000,$6000");
	    		
	    		Iterator<String> itr=al.iterator();
	    		while(itr.hasNext())
	    		{
	    		System.out.println(itr.next());	
	    		}
	    		System.out.println("\n");
	    		
	    		Class.forName("com.mysql.jdbc.Driver");
	    		String url="jdbc:mysql://localhost:3306/";
	    		String databaseName="dbCartoonDetails";
	    		String username="root";
	    		String password ="";
	    		
	    		Connection con= DriverManager.getConnection(url+databaseName,username,password);
	    		
	    		if(con!= null)
	    		{
	    			System.out.println("Connected to database");
	    		}else{
	    			System.out.println("Failed connection");
	    		}
	    	
	    		PreparedStatement stmt=con.prepareStatement("Insert into cartoondetails (name,address,dob,salary) values(?,?,?,?);");
	    		stmt.setString(1, "tom");
	    		stmt.setString(2,"CartoonNetwork");
	    		stmt.setString(3,"1990");
	    		stmt.setString(4,"$5000");
			int j=stmt.executeUpdate();
			
	    		stmt.setString(1, "jerry");
	    		stmt.setString(2,"CartoonNetwork");
	    		stmt.setString(3,"1989");
	    		stmt.setString(4,"$4500");
	                j=stmt.executeUpdate();
			
	    		stmt.setString(1, "chotabhim");
	    		stmt.setString(2,"bollywood");
	    		stmt.setString(3,"2000");
	    		stmt.setString(4,"$6000");
			j=stmt.executeUpdate();
			
	    		stmt.setString(1, "popye");
	    		stmt.setString(2,"Disney");
	    		stmt.setString(3,"1995");
	    		stmt.setString(4,"$3000");

	    		 j=stmt.executeUpdate();  
	    		System.out.println(j+" records inserted");  
	    		System.out.println("\n");
	    		
	    		ResultSet rs=stmt.executeQuery("select * from cartoondetails");
	    		while(rs.next())
	    		{
	    			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
	    		}
	    		con.close();
	         
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}


