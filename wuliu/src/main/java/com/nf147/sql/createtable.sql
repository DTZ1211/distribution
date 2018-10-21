-- 创建数据库
create database wuliu;

-- 消费者
create table consumer(
	consumerId nvarchar(10) not null primary key,
	name nvarchar(10),
	sex int,
	usergroupId nvarchar(10),
	conpassword nvarchar(10),
	phone nvarchar(20),
	birthday datetime,
	adaress nvarchar(50),
	remarks nvarchar(50)
);

-- 订单
create table orders(
	ordersId nvarchar(10) not null primary key,
	orderstype int,
	handoverId nvarchar(10),
	goodsname nvarchar(20),
	goodswieght int,
	mailer nvarchar(20),
	mailaddress nvarchar(50),
	readdress	nvarchar(50),
	orderstatus	int,
	mailphone	nvarchar(20),
	consignee	nvarchar(20),
	consigneephone	nvarchar(20),
	startcity	nvarchar(10),
	middlecity	nvarchar(10),
	finalcity	nvarchar(10),
	yunsongprice	decimal(18,0),
	disprice	decimal(18,0),
	yunshuprice	decimal(18,0),
	finalprice	nvarchar(10),
	car	nvarchar(10),
	remarks	nvarchar(50)
);

-- 车辆
create table cars(

	carsId  nvarchar(10) not null primary key,
	carsmodel	nvarchar(10),
	candi nvarchar(20),
	routeId	nvarchar(10),
	dom	datetime,
	dop	datetime,
	remarks	nvarchar(50)
);
-- 城市
create table country(
	countryId nvarchar(10) not null primary key,
	countryname nvarchar(10),
	provinceId nvarchar(10)
);
-- 城市区域
create table cityarea(
	cityareaId nvarchar(10) not null primary key,
	areaname nvarchar(50),
	countryId nvarchar(50)
);
-- 管理员
create table admin(
	adminId	nvarchar(10) not null primary key,
	name	nvarchar(10),
	sex	int,
	usergroupId	int,
	adminstatus	int,
	admincity	nvarchar(10),
	adminaddress	nvarchar(10),
	password	nvarchar(10),
	phone	nvarchar(20),
	remarks	nvarchar(50)
);

-- 交接单
create table handover(
	startcity 	nvarchar(10) not null primary key,
	finalcity	nvarchar(10),
	arrivecity	nvarchar(10),
	hotatus	int,
	gentime	datetime,
	remarks	nvarchar(50)
);

-- 路线
create table route(
	routeId  nvarchar(10) not null primary key,
	routename	nvarchar(10),
	startprovince	nvarchar(10),
	startcity	nvarchar(10),
	middleprovince	nvarchar(10),
	middlecity	nvarchar(10),
	finalprovince	nvarchar(10),
	finalcity	nvarchar(10),
	tranprice	decimal(18,0),
	remarks	nvarchar(10)
);

-- 配送点
create table dispoint(
	dispointId 	int not null primary key,
	dispointname	nvarchar(10),
	provinceId	nvarchar(10),
	countryId	nvarchar(10),
	adminId	nvarchar(10),
	phone	nvarchar(20),
	address	nvarchar(50),
	remarks nvarchar(10)
);
-- 配送范围
create table disscope(
	disscopeId	int not null primary key,
	disscopename	nvarchar(10),
	disprice	decimal(18,0),
	countryId	nvarchar(10),
	remarks	nvarchar(50)
);

-- 省份
create table province(
	provinceId nvarchar(10) not null primary key,
	province nvarchar(10)
);

-- 用户组
create table usergroup(
	usergroupId	nvarchar(10) not null primary key,
	usergroupname	nvarchar(10) not null,
	remarks	nvarchar(50)
);