package com.myjdbc.CustomerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myjdbc.beans.Customer;
import com.myjdbc.dbutil.DbConn;

public class CustomerDao {
	
	public int generateCustID() {
		//int seq;
		try {
		Connection con = DbConn.getConnection();
		
		String sql = "select seqnum.nextval from dual";
		PreparedStatement stat = con.prepareStatement(sql);
		ResultSet seq = stat.executeQuery();
		
		if (seq.next()) {
			return (seq.getInt(1));
		}
		//System.out.println(seq);
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}

public String saveCustomer(Customer cust)
{
try
{
Connection con=DbConn.getConnection();

String sql="insert into Customer values(?,?,?,?)";
int seqNum= generateCustID(); 
String seq_id = ""; 
System.out.println(seqNum);
PreparedStatement stat=con.prepareStatement(sql);
if (seqNum<=9) {
	seq_id+=cust.getFirstName().substring(0, 2)+cust.getLastName().substring(0, 2)+"00"+seqNum;
	cust.setCustId(seq_id);
	}
	else if(seqNum<=99 && seqNum>=10) {
		seq_id+=cust.getFirstName().substring(0, 2)+cust.getLastName().substring(0, 2)+"0"+seqNum;
		cust.setCustId(seq_id);
	}
stat.setString(1,cust.getFirstName()); 
stat.setString(2, cust.getLastName()); 

stat.setString(3,cust.getCustId()); 
stat.setString(4,cust.getAddress());



int res= stat.executeUpdate();
if(res>0)
return "customer saved";


}
catch (Exception e) {
e.printStackTrace();
}

return "Cannot save Student";
}
}
