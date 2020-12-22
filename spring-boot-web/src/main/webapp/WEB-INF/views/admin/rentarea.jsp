<%--
  Created by IntelliJ IDEA.
  User: cuncon
  Date: 12/15/2020
  Time: 9:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<c:url var="buildingListURL" value="/admin/list"/>
<c:url var="buildingEdit" value="/admin/edit"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Rentarea</title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs ace-save-state" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">Tòa nhà ${buildingById.name} </a>
                </li>
            </ul><!-- /.breadcrumb -->
        </div>

        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="table-responsive">

                        <table class="table table-bordered" id="listRentarea">
                            <thead>
                            <tr>
                                <th><input type="checkbox" id="checkAll"></th>
                                <th>Diện tích thuê</th>

                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="item" items="${rentareaByBuildingId}">
                                <tr>
                                    <td><input type="checkbox" id="${item.id}"
                                               value="${item.id}"> <input type="hidden" name="value"
                                                                          value="${item.value}"></td>

                                    <td>${item.value}</td>


                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>

                        <div class="btn-group pull-right">
                            <button type="button" class="btn btn-white btn-info btn-bold"
                                    id="DeleteRentArea" data-toggle="tooltip" title="Xóa diện tích thuê">
                                <i class="fa fa-plus-circle"></i>
                            </button>
                        </div>


                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right"
                                   for="rent"> Diện tích thuê</label>
                            <div class="col-sm-9">
                                <input type="number" id="rent"
                                       name="rent" class="form-control" value=""/>
                            </div>
                        </div>

                        <ul class="pagination" id="pagination"></ul>

                    </div>
                </div>
            </div>


            <div class="row">
                <div class="col-xs-12">
                    <button type="button" class="btn btn-primary" id="btnThemDienTichThue">Thêm diện tích thuê
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>

<script>


    $('#btnThemDienTichThue').click(function (e) {
        e.preventDefault();
        var data = {};


        data['value'] = $('#rent').val();
        data['buildingid'] = ${buildingById.id};


        editbuilding(data);

    });




    $('#DeleteRentArea').click(
        function (e) {
            e.preventDefault();
            var data = {};
            //var staffs = [];
            var staffs = $('#listRentarea').find(
                'tbody input[type=checkbox]:checked').map(
                function () {
                    return $(this).val();
                }).get();

            data['mangId'] = staffs;


            DeleteRentarea(data);

        });


    function DeleteRentarea(data) {
        $.ajax({
            type: "DELETE",
            url: "/api/rentarea",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');

                window.location.href = "/admin/rentarea?id=${buildingById.id}";


            },
            error: function (response) {
                console.log('failed');

                window.location.href = "/admin/rentarea?id=${buildingById.id}";
                console.log(response);
            }
        });


    }


    function editbuilding(data) {
        $.ajax({
            type: "POST",
            url: "/api/rentarea",
            //url: "http://10.5.2.227:8080/spring/api/new",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');

                window.location.href = "/admin/rentarea?id=${buildingById.id}";


            },
            error: function (response) {
                console.log('failed');

                window.location.href = "/admin/rentarea?id=${buildingById.id}";
                console.log(response);
            }
        });


    }
</script>


</body>
</html>
