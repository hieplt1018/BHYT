DROP TABLE IF EXISTS Admin;
DROP TABLE IF EXISTS BHYT;
CREATE TABLE Admin (Username varchar(255) NOT NULL, Password varchar(255) NOT NULL, PRIMARY KEY (Username));
CREATE TABLE BHYT (MaTheBHYT varchar(255) NOT NULL, HoTen varchar(255) NOT NULL, LoaiBHYT varchar(255) NOT NULL, TienBHYT double NOT NULL, NgaySinh date NOT NULL, Vung varchar(255) NOT NULL, Mien varchar(255) NOT NULL, ThanhPho varchar(255) NOT NULL, Quan varchar(255) NOT NULL, Phuong varchar(255) NOT NULL, Thon varchar(255) NOT NULL, NguoiTrongHoGD int(10), NgayDong date NOT NULL, PRIMARY KEY (MaTheBHYT));
