package com.myjdbc.CustomerService;

import java.util.ArrayList;

import javax.swing.JTable;
import com.myjdbc.CustomerDao.CustomerDao;
import com.myjdbc.beans.Customer;



public class CustomerService {

public static void main(String[] args) {

CustomerDao dao=new CustomerDao();
//ArrayList<Student> studList= dao.getAllStudents();

//Student student= dao.getStudentsById(1005);
//System.out.println(student);

/*for(Student student:studList)
{
System.out.println(student);

}*/


Customer cust=new Customer();
cust.setFirstName("rohit");
cust.setLastName("sharma");
cust.setCustId(""); 
cust.setAddress("DXC");


System.out.println(dao.saveCustomer(cust));

}


}