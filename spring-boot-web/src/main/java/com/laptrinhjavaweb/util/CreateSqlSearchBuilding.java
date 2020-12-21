package com.laptrinhjavaweb.util;

import com.laptrinhjavaweb.dto.BuildingDTO;

public class CreateSqlSearchBuilding {

    public static String CreatSQLSearch(BuildingDTO buildingDTO)
    {
        StringBuilder sql = new StringBuilder();
        sql.append("select  * from building\n" +
                " LEFT join assignmentbuilding on assignmentbuilding.buildingid = building.id\n" +
                " LEFT join user on user.id = assignmentbuilding.userid where");

        if(!(buildingDTO.getName()==null) && !(buildingDTO.getName().equals("")))
            sql.append(" building.name LIKE " +"'%"+ buildingDTO.getName() +"%'"+ " and ");
        if(!(buildingDTO.getFloorarea()== null))
            sql.append(" building.floorarea = "+ buildingDTO.getFloorarea() +" and ");
        if(!(buildingDTO.getDistrict()==null) &&!(buildingDTO.getDistrict().equals("")))
            sql.append(" building.district = "+"'"+ buildingDTO.getDistrict() +"'"+" and ");
        if(!(buildingDTO.getWard()==null) && !(buildingDTO.getWard().equals("")))
            sql.append(" building.ward LIKE " +"'%"+ buildingDTO.getWard() +"%'"+" and ");
        if(!(buildingDTO.getStreet()==null) && !(buildingDTO.getStreet().equals("")))
            sql.append(" building.street LIKE " +"'%"+ buildingDTO.getStreet() +"%'"+ " and ");
        if(!(buildingDTO.getNumberofbasement() == null) && !(buildingDTO.getNumberofbasement().equals("")))
            sql.append("building.numberofbasement = "+ buildingDTO.getNumberofbasement() +" and " );
        if(!(buildingDTO.getDirection()==null) && !(buildingDTO.getDirection().equals("")))
            sql.append("building.direction = '"+ buildingDTO.getDirection() + "' and " );

        if(!(buildingDTO.getLevel()==null) && !(buildingDTO.getLevel().equals("")))
            sql.append("building.level = "+ buildingDTO.getLevel() + " and " );

        if(!(buildingDTO.getRentareafrom() == null) && (buildingDTO.getRentareato() == null))
            sql.append("EXISTS( SELECT * FROM rentarea where rentarea.buildingid=building.id and rentarea.value >=  "+ buildingDTO.getRentareafrom() + ") and " );

        if((buildingDTO.getRentareafrom() == null) && !(buildingDTO.getRentareato() == null))
            sql.append("EXISTS( SELECT * FROM rentarea where rentarea.buildingid=building.id and rentarea.value <=  "+ buildingDTO.getRentareato() + ") and " );

        if(!(buildingDTO.getRentareafrom() == null) && !(buildingDTO.getRentareato() == null))
            sql.append("EXISTS( SELECT * FROM rentarea where rentarea.buildingid=building.id and rentarea.value >=  "+ buildingDTO.getRentareafrom() +" and rentarea.value <= " + buildingDTO.getRentareato()  + ") and " );

        if(!(buildingDTO.getRentareafrom() == null) && (buildingDTO.getRentareato() == null))
            sql.append("EXISTS( SELECT * FROM rentarea where rentarea.buildingid=building.id and rentarea.value >=  "+ buildingDTO.getRentareafrom() + ") and " );

        if((buildingDTO.getRentareafrom() == null) && !(buildingDTO.getRentareato() == null))
            sql.append("EXISTS( SELECT * FROM rentarea where rentarea.buildingid=building.id and rentarea.value <= " + buildingDTO.getRentareato()  + ") and " );


        if(!(buildingDTO.getCost_from() == null) && (buildingDTO.getCost_to() == null))
            sql.append("building.rentprice >= "+ buildingDTO.getCost_from() + " and " );


        if((buildingDTO.getCost_from() == null) && !(buildingDTO.getCost_to() == null))
            sql.append("building.rentprice <= "+ buildingDTO.getCost_to()  + " and " );

        if(!(buildingDTO.getCost_from() == null) && !(buildingDTO.getCost_to() == null))
            sql.append("building.rentprice >= "+ buildingDTO.getCost_from()+ " and building.rentprice <=  "+buildingDTO.getCost_to()  + " and " );


        if(!(buildingDTO.getIdstaff()==null))
            sql.append(" user.id = "+ buildingDTO.getIdstaff() + " and " );


        if(!(buildingDTO.getType()==null))
        {
            if(buildingDTO.getType().equals("NOI_THAT"))
                sql.append(" building.type LIKE '%NOI_THAT%'" + " and ");
            if(buildingDTO.getType().equals("TANG_TRET"))
                sql.append(" building.type LIKE '%TANG_TRET%'" + " and ");
            if(buildingDTO.getType().equals("NGUYEN_CAN"))
                sql.append(" building.type LIKE '%NGUYEN_CAN%'" + " and ");

            if(buildingDTO.getType().equals("NGUYEN_CAN,NOI_THAT"))
                sql.append(" (building.type LIKE '%NGUYEN_CAN%' or building.type LIKE '%NOI_THAT%' )" + " and ");

            if(buildingDTO.getType().equals("TANG_TRET,NGUYEN_CAN"))
                sql.append(" (building.type LIKE '%NGUYEN_CAN%' OR building.type LIKE '%TANG_TRET%')" + " and ");

            if(buildingDTO.getType().equals("TANG_TRET,NOI_THAT"))
                sql.append(" (building.type LIKE '%NOI_THAT%' OR building.type LIKE '%TANG_TRET%' )" + " and ");

            if(buildingDTO.getType().equals("TANG_TRET,NGUYEN_CAN,NOI_THAT"))
                sql.append(" ( building.type LIKE '%NOI_THAT%' OR building.type LIKE '%TANG_TRET%' OR building.type LIKE '%NGUYEN_CAN%' )" + " and ");



        }


        String query = sql.toString().trim();
        String[] splits = query.split(" ");
        StringBuilder query2 = new StringBuilder();
        for(int i=0; i<splits.length - 1; i++)
        {
            query2.append(splits[i]+" ");
        }
        return query2.append(" group by building.id ").toString();


    }
}
