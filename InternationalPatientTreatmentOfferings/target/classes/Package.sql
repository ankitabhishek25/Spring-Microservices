create table Package(
id int primary key auto_increment,
name varchar(20),
testdetails varchar(30),
cost float(4,2),
duration int,
Ailment_id int,
FOREIGN KEY(Ailment_id) references Ailment(id));
