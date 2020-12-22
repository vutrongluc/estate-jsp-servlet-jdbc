package com.laptrinhjavaweb.util;

import com.laptrinhjavaweb.dto.CellDTO;
import com.laptrinhjavaweb.dto.ScanDTO;

import java.util.ArrayList;
import java.util.List;

public class ToolSwapCell {


    //hàm này đổi độ sang raddia
    public static double toRadians(
            double angleIn10thofaDegree) {
        // Angle in 10th
        // of a degree
        return (angleIn10thofaDegree *
                Math.PI) / 180;
    }


    //hàm này tính khoảng cách giữa 2 điểm khi biết tọa độ
    public static double distance(double lat1,
                                  double lat2,
                                  double lon1,
                                  double lon2) {

        // The math module contains
        // a function named toRadians
        // which converts from degrees
        // to radians.
        lon1 = toRadians(lon1);
        lon2 = toRadians(lon2);
        lat1 = toRadians(lat1);
        lat2 = toRadians(lat2);

        // Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2) +
                Math.cos(lat1) * Math.cos(lat2) *
                        Math.pow(Math.sin(dlon / 2), 2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in
        // kilometers. Use 3956
        // for miles
        double r = 6371;
        //double r = 6400;
        // calculate the result
        return (c * r);
    }

    //hàm này dùng để tìm xem một điểm có góc hướng là x có thuộc dải góc hướng phục vụ của cell là a -30 đến a+30 không. nđú có trả về true còn không trả về false
    public static boolean doTim(double a, double x, double bw) {
        boolean ketqua = false;
        // double bw = 50;      //nhap bup song   a la goc azimut   b la azimut cua diem

        if ((a >= bw) && (a < 360 - bw)) {
            if ((x > (a - bw)) && (x < (a + bw)))
                ketqua = true;
        }
        if ((a >= 360 - bw) && (a < 360)) {
            if (((x >= a - bw) && (x < 360)) || ((x >= 0) && (x < a + bw - 360)))
                ketqua = true;
        }
        if ((a >= 0) && (a < bw))
            if (((x >= 360 + a - bw) && (x < 360)) || ((x > 0) && (x < a + bw)))
                ketqua = true;


        return ketqua;
    }


    //hàm này tính góc hướng của điểm đến một cell: áp dụng công thức toán học lượng giác cos A = (B2+C2-A2)/2bc
    public static double angle(double lat1,
                               double lat2,
                               double lon1,
                               double lon2) {
        ScanDTO a = new ScanDTO(90, 0, 23, 32);
        double canhke1 = distance(a.getLatitude(), lat1, a.getLongitude(), lon1);
        //   Console.WriteLine("do dai canh ke 1 là: " + canhke1);

        double canhdoi = distance(a.getLatitude(), lat2, a.getLongitude(), lon2);
        //  Console.WriteLine("do dai canh doi là: " + canhdoi);

        double canh2diem = distance(lat1, lat2, lon1, lon2);
        //  Console.WriteLine("do dai canh2diem là: " + canh2diem);

        double cosgoc = (Math.pow(canhke1, 2) + Math.pow(canh2diem, 2) - Math.pow(canhdoi, 2)) / (2 * canhke1 * canh2diem);
        //Console.WriteLine("góc 2 điểm chưa doi là: " + cosgoc);
        double cos = (Math.acos(cosgoc) * 180) / Math.PI;

        //Console.WriteLine("góc 2 dddd điểm chưa doi là: " + cos);
        if (lon1 < lon2)
            return cos;
        else
            return (360 - cos);

    }


    static List<CellDTO> FindSwapCell(double d, double diempv, double bw, List<CellDTO> cellDTOList, List<ScanDTO> scanDTOList) {

        List<CellDTO> cellDTOList2 = new ArrayList<>();
        for (CellDTO cellDTO : cellDTOList) {
            for (ScanDTO scanDTO : scanDTOList) {
                if ((cellDTO.getPscrambcode() == scanDTO.getPsc()) && (cellDTO.getUarfcndownlink() == scanDTO.getUarfcn()) && (distance(cellDTO.getLat(), scanDTO.getLatitude(), cellDTO.getLon(), scanDTO.getLongitude()) < d)) {
                    cellDTO.getDiemList().add(scanDTO);//dòng add điểm vào trong danh sách điểm của cell
                } else
                    continue;
            }
        }

        for (CellDTO cellDTO : cellDTOList) {
            if (cellDTO.getDiemList().size() > diempv) {
                for (ScanDTO scanDTO : cellDTO.getDiemList()) {
                    scanDTO.setAnlge(angle(cellDTO.getLat(), scanDTO.getLatitude(), cellDTO.getLon(), scanDTO.getLongitude()));

                }

                cellDTOList2.add(cellDTO);
            } else
                continue;
        }

        for (CellDTO cellDTO : cellDTOList2) {
            double anlgeScanDtoAverage = 0;
            for (ScanDTO scanDTO : cellDTO.getDiemList()) {
                if (!doTim(cellDTO.getAzimuth(), scanDTO.getAnlge(), bw)) {
                    cellDTO.setDemdiem(cellDTO.getDemdiem() + 1);
                }
                anlgeScanDtoAverage = anlgeScanDtoAverage + scanDTO.getAnlge();
            }

            if ((double)(cellDTO.getDemdiem()) / (double)(cellDTO.getDiemList().size()) > 0.6) {
                cellDTO.setSwap(true);
            }
            cellDTO.setAngleTB(anlgeScanDtoAverage / (double)(cellDTO.getDiemList().size()));

        }
        return cellDTOList2;


    }


}
