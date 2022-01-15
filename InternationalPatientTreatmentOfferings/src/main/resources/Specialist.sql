create Specialist(
name varchar(20),
exprienceinyears int,
contact BIGINT,
Ailment_id int,
FOREIGN KEY(Ailment_id) references Ailment(id));