package com.laptrinhjavaweb.dto;

import java.util.ArrayList;
import java.util.List;

public class TramDTO {
    private List<CellDTO> cellDTOList = new ArrayList<>();
    private CellDTO cellDTO;

    public TramDTO(){}
    public  TramDTO(CellDTO cellDTO){
        this.cellDTO = cellDTO;
        cellDTOList.add(cellDTO);
    }

    public List<CellDTO> getCellDTOList() {
        return cellDTOList;
    }

    public void setCellDTOList(List<CellDTO> cellDTOList) {
        this.cellDTOList = cellDTOList;
    }

    public CellDTO getCellDTO() {
        return cellDTO;
    }

    public void setCellDTO(CellDTO cellDTO) {
        this.cellDTO = cellDTO;
    }


}
