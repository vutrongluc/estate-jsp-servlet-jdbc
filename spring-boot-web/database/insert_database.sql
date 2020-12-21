use test;
insert into role(code,name) values('MANAGER','Quản trị');
insert into role(code,name) values('STAFF','Người dùng');

insert into user(user_name,password,full_name,status)
values('admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','trương tùng lâm',1);
insert into user(user_name,password,full_name,status)
values('nguyenvana','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn A',1);
insert into user(user_name,password,full_name,status)
values('nguyenvanb','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','nguyễn văn B',1);

INSERT INTO user_role(user_id,role_id) VALUES (1,1);
INSERT INTO user_role(user_id,role_id) VALUES (2,2);
INSERT INTO user_role(user_id,role_id) VALUES (3,2);

INSERT INTO building(name, street, ward, district, type) values('Nhà của Lực', '115 trần duy hưng','tây hồ','QUAN_1','tang_tret,nguyen_can');
INSERT INTO building(name, street, ward, district, type) values('Nhà của Lực ', '115 trần duy hưng2','tây hồ 2','QUAN_2','noi_that,nguyen_can');
INSERT into building(district, name, street, type, ward, numberofbasement, floorarea, rentprice)
            value ('QUAN_1', 'Alpha 2 Building Tower', '153 nguyễn đình chiểu', 'TANG_TRET', 'Phường 6', 1, 200, 20  );

            INSERT into building(district, name, street, type, ward, numberofbasement, floorarea, rentprice)
            value ('QUAN_1', 'Nam Giao Building Tower', '59 phan xích long', 'NGUYEN_CAN,NOI_THAT', 'Phường 2', 2, 500, 15  );

                        INSERT into building(district, name, street, type, ward, numberofbasement, floorarea, rentprice)
            value ('QUAN_2', 'ACM Tower', '96 cao thắng', 'NGUYEN_CAN,TANG_TRET', 'Phường 4', 2, 650, 18  );

            INSERT into building(district, name, street, type, ward, numberofbasement, floorarea, rentprice)
            value ('QUAN_3', 'IDD 1 Building', '111 Lý Chính Thắng', 'TANG_TRET,NGUYEN_CAN,NOI_THAT', 'Phường 7', 1, 200, 12  );


INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('100', '1');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('300', '1');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('350', '2');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('400', '2');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('300', '3');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('600', '3');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('250', '4');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('100', '4');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('300', '4');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('350', '5');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('400', '5');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('200', '5');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('100', '6');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('250', '6');
INSERT INTO `test`.`rentarea` (`value`, `buildingid`) VALUES ('400', '6');

INSERT INTO assignmentbuilding (buildingid, userid) value(3,2);
INSERT INTO assignmentbuilding (buildingid, userid) value(3,2);
INSERT INTO assignmentbuilding (buildingid, userid) value(4,3);
INSERT INTO assignmentbuilding (buildingid, userid) value(4,3);
INSERT INTO assignmentbuilding (buildingid, userid) value(5,2);
INSERT INTO assignmentbuilding (buildingid, userid) value(6,3);
INSERT INTO assignmentbuilding (buildingid, userid) value(4,2);
INSERT INTO assignmentbuilding (buildingid, userid) value(4,3);

INSERT INTO `test`.`custormer` (`email`, `fullname`, `phone`) VALUES ('abc@gmail.com', 'Vũ Văn A', '0901000119');
INSERT INTO `test`.`custormer` (`email`, `fullname`, `phone`) VALUES ('vutronglucbka@gmail.com', 'Vũ Trọng Lực', '0901704109');
INSERT INTO `test`.`custormer` (`email`, `fullname`, `phone`) VALUES ('Vuvansuu@gmail.com', 'Vũ Văn Sửu', '097735815');
INSERT INTO `test`.`custormer` (`email`, `fullname`, `phone`) VALUES ('lethiluat@gmail.com', 'Lê Thị Luật', '0806007436');





ALTER TABLE building
DROP FOREIGN KEY fk_building_district;

ALTER TABLE buildingrenttype
DROP FOREIGN KEY fk_buildingtype_building;


/*câu search theo database đã tối giản*/

select  building.id as buildingId , building.name as ten_toa_nha,
 building.districtcode as quan, building.renttypebuilding as loai_toa_nha, user.username as nhan_vien, building.rentprice as gia_thue,
 building.numberofbasement as so_luong_tang_ham, building.floorarea as dien_tich_san from building
 LEFT join assignmentbuilding on assignmentbuilding.buildingid = building.id
 LEFT join user on user.id = assignmentbuilding.staffid
 WHERE EXISTS( SELECT * FROM rentarea where rentarea.buildingid=building.id and rentarea.value >=200 and rentarea.value <=400 )
 and building.name LIKE '%building%'
  and building.districtcode = 'Q1'
  and building.numberofbasement = 1
  and building.floorarea = 200
and user.id =2
and (building.renttypebuilding Like '%noi_that%' or building.renttypebuilding Like '%nguyen_can%' or building.renttypebuilding Like '%tang_tret%')
GROUP BY building.id;



use test;
insert into role(code,name) values('MANAGER','Quản trị');
insert into role(code,name) values('STAFF','Người dùng');

insert into users(email, fullname, password, phone, status, user_name)
values('admin','trương tùng lâm','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','12324344324243',1, 'admin');
insert into users(email, fullname, password, phone, status, user_name)
values('admin3','trương tùng lâm staff','123456','12324344324243',1, 'staff');
insert into users(email, fullname, password, phone, status, user_name)
values('admin2','trương tùng lâm staff 2','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','12324344324243',1, 'staff');

INSERT INTO user_role(user_id,role_id) VALUES (1,1);
INSERT INTO user_role(user_id,role_id) VALUES (2,2);
INSERT INTO user_role(user_id,role_id) VALUES (3,2);

INSERT INTO building(name, street, ward, district, type) values('Nhà của Lực', '115 trần duy hưng','tây hồ','Q1','tang_tret,nguyen_can');
INSERT INTO building(name, street, ward, district, type) values('Nhà của Lực ', '115 trần duy hưng2','tây hồ 2','Q2','noi_that,nguyen_can');



LOAD DATA INFILE "C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\scanl1.csv" INTO TABLE scan FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' IGNORE 1 LINES (latitude,longitude,psc,uarfcn);
