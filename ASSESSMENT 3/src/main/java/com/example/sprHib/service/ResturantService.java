package com.example.sprHib.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sprHib.dao.ResturantDao;
import com.example.sprHib.model.Resturant;



@Service
public class ResturantService {

@Autowired
ResturantDao resturantDao;

public String saveResturant(Resturant resturant)
{
try {
resturantDao.saveResturant(resturant);
return "Success";
}
catch (Exception e) {
return  "Error "+e;
}
}


public ArrayList<Resturant> getResturants()
{
try {
return resturantDao.getResturants();
}
catch (Exception e) {
return  null;
}
}


public Object getResturant(int resturantId)
{
try {
return resturantDao.getResturant(resturantId);
}
catch (Exception e) {
return  e;
}
}


public String deleteResturant(int resturantId)
{
try {
return resturantDao.deleteResturant(resturantId);
}
catch (Exception e) {
return  "Error"+e;
}
}


public String updateResturant(Resturant resturant)
{
try {
return resturantDao.updateResturant(resturant);
}
catch (Exception e) {
return  "Error"+e;
}
}

}
