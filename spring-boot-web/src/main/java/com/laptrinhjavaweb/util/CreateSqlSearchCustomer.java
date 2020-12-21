package com.laptrinhjavaweb.util;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.dto.CustormerDTO;

public class CreateSqlSearchCustomer {

    public static String CreatSQLSearch(CustormerDTO custormerDTO)
    {
        StringBuilder sql = new StringBuilder();
        sql.append(" select * from custormer where ");

        if(!(custormerDTO.getFullname()==null) && !(custormerDTO.getFullname().equals("")))
            sql.append(" fullname LIKE " +"'%"+ custormerDTO.getFullname() +"%'"+ " and ");
        if(!(custormerDTO.getPhone()==null) && !(custormerDTO.getPhone().equals("")))
            sql.append(" phone LIKE " +"'%"+ custormerDTO.getPhone() +"%'"+" and ");
        if(!(custormerDTO.getEmail()==null) && !(custormerDTO.getEmail().equals("")))
            sql.append(" email LIKE " +"'%"+ custormerDTO.getEmail() +"%'"+ " and ");

        String query = sql.toString().trim();
        String[] splits = query.split(" ");
        StringBuilder query2 = new StringBuilder();
        for(int i=0; i<splits.length - 1; i++)
        {
            query2.append(splits[i]+" ");
        }
        return query2.toString();


    }

}
