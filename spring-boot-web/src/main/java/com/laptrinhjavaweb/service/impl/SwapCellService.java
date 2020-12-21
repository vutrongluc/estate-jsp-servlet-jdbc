package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dto.CellDTO;
import com.laptrinhjavaweb.dto.ScanDTO;
import com.laptrinhjavaweb.service.ISwapCellService;
import com.laptrinhjavaweb.util.ToolSwapCell;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SwapCellService implements ISwapCellService {
    @Override
    public List<CellDTO> FindSwapCell(Double d, Double diempv, Double bw, List<CellDTO> cellDTOList, List<ScanDTO> scanDTOList) {

        List<CellDTO> cellDTOList2 = new ArrayList<>();
        for (CellDTO cellDTO : cellDTOList) {
            for(ScanDTO scanDTO: scanDTOList){
                if (/*(cellDTO.getPscrambcode() == scanDTO.getPsc()) &&*/ (cellDTO.getUarfcndownlink() == scanDTO.getUarfcn()) /*&& (ToolSwapCell.distance(cellDTO.getLat(), scanDTO.getLatitude(), cellDTO.getLon(), scanDTO.getLongitude()) < d)*/)
                {
                    cellDTO.getDiemList().add(scanDTO);//dòng add điểm vào trong danh sách điểm của cell
                }
                else
                    continue;
            }
        }

        for(CellDTO cellDTO : cellDTOList)
        {
            if(Double.valueOf(cellDTO.getDiemList().size())>diempv)
            {
                for(ScanDTO scanDTO:cellDTO.getDiemList())
                {
                    scanDTO.setAnlge(ToolSwapCell.angle(cellDTO.getLat(), scanDTO.getLatitude(), cellDTO.getLon(), scanDTO.getLongitude()  ));

                }

                cellDTOList2.add(cellDTO);
            }
            else
                continue;
        }

        for(CellDTO cellDTO:cellDTOList2)
        {
            Double anlgeScanDtoAverage = 0.D;
            for(ScanDTO scanDTO : cellDTO.getDiemList())
            {
                if(!ToolSwapCell.doTim(cellDTO.getAzimuth(),scanDTO.getAnlge(), bw ))
                {
                    cellDTO.setDemdiem(cellDTO.getDemdiem()+1);
                }
                anlgeScanDtoAverage = anlgeScanDtoAverage+scanDTO.getAnlge();
            }

            if(Double.valueOf(cellDTO.getDemdiem()) / Double.valueOf(cellDTO.getDiemList().size())> 0.6)
            {
                cellDTO.setSwap(true);
            }
            cellDTO.setAngleTB(anlgeScanDtoAverage/Double.valueOf(cellDTO.getDiemList().size()));

        }
        return cellDTOList2;


    }
}
