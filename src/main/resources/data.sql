insert into Traveller (id, nick, age, created_on, deleted) VALUES (1, 'Peter', 21, CURRENT_DATE(), false);
insert into Tour (id, traveller_id, destination, rating, experience, created_on, deleted) VALUES (1, select id from traveller where nick = 'Peter', 'Como', 5, 'I liked it, it was magnificant!', CURRENT_DATE(), false);
insert into Traveller (id, nick, age, created_on, deleted) VALUES (2, 'Samantha', 35, CURRENT_DATE(), false);
insert into Tour (id, traveller_id, destination, rating, experience, created_on, deleted) VALUES (2, select id from traveller where nick = 'Samantha', 'Zürich, Sechseläuten', 5, 'When in April the first flowers and trees start to bloom, the temperatures rise and the days become longer, the people of Zurich celebrate their traditional spring festival: Sechseläuten, or “Sächsilüüte” as it is known in local dialect. ', CURRENT_DATE(), false);
insert into Traveller (id, nick, age, created_on, deleted) VALUES (3, 'Hans', 59, CURRENT_DATE(), false);
insert into Tour (id, traveller_id, destination, rating, experience, created_on, deleted) VALUES (3, select id from traveller where nick = 'Hans', 'Altdorf', 4, 'Attinghausen, which is slightly elevated at 470 m above sea level, is located on the Gotthard route. From here a magnificent view of the valley Reuss and the world of Schächental''s mountains open up. ', CURRENT_DATE(), false);