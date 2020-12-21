package com.laptrinhjavaweb.util;

import com.laptrinhjavaweb.dto.AssignmentBuildingDTO;
import com.laptrinhjavaweb.dto.AssignmentDTO;

import java.util.ArrayList;
import java.util.List;

public class ConvertAssignmentDTOtoAssignmentBuildingDTOs {
    public static List<AssignmentBuildingDTO> convert(AssignmentDTO assignmentDTO)
    {
        List<AssignmentBuildingDTO> result = new ArrayList<AssignmentBuildingDTO>();
        for(Integer integer:assignmentDTO.getIdstaff() )
        {
            result.add(new AssignmentBuildingDTO(assignmentDTO.getBuildingid(), integer));
        }
        return result;
    }
}
