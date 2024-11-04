create database Sports_Shop;

create table HomeT_Shirts(
model varchar(50),
size varchar(10000),
price int not null
);

create table AwayT_Shirts(
model varchar(50),
size varchar(10000),
price int not null
);

create table Shoes(
model varchar(50),
size varchar(10000),
Color varchar(100),
price int not null
);

create table SoccerBalls(
model varchar(50),
price int not null
);

insert into HomeT_Shirts values("Barcelona","80LG ,75XL ,72L ,70M ,68S","1200");
insert into HomeT_Shirts values("Real Madrid","80LG ,75XL ,72L ,70M ,68S","1000");
insert into HomeT_Shirts values("Jeventus","80LG ,75XL ,72L ,70M ,68S","800");
insert into HomeT_Shirts values("Inter","80LG ,75XL ,72L ,70M ,68S","600");
insert into HomeT_Shirts values("Bayern","80LG ,75XL ,72L ,70M ,68S","700");
select* from HomeT_Shirts;

insert into AwayT_Shirts values("Barcelona","80LG ,75XL ,72L ,70M ,68S","1200");
insert into AwayT_Shirts values("Real Madrid","80LG ,75XL ,72L ,70M ,68S","1000");
insert into AwayT_Shirts values("Jeventus","80LG ,75XL ,72L ,70M ,68S","800");
insert into AwayT_Shirts values("Inter","80LG ,75XL ,72L ,70M ,68S","600");
insert into AwayT_Shirts values("Bayern","80LG ,75XL ,72L ,70M ,68S","700");
select* from AwayT_Shirts;

insert into Shoes values("Adidas M17","42 ,43 ,44 ,45","Blue","1150");
insert into Shoes values("Adidas Max97","42 ,43 ,44 ,45","Black","900");
insert into Shoes values("Adidas P6","42 ,43 ,44 ,45","White","700");
insert into Shoes values("Puma RSX","42 ,43 ,44 ,45","Green","830");
insert into Shoes values("Nike AirMax","42 ,43 ,44 ,45","Black","1200");
select* from Shoes;

insert into SoccerBalls values("Wilson","1200");
insert into SoccerBalls values("Addidas","1000");
insert into SoccerBalls values("Puma","1400");
insert into SoccerBalls  values("Nike","800");
insert into SoccerBalls values("BMikassa","450");
select* from SoccerBalls;