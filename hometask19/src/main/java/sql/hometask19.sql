create table persons (
id bigserial primary key,
name  varchar,
password varchar,
salary int 
);

insert into persons (name, password, salary) values 
('Ivan', 'qwezxc', 3000),
('Anton', 'qwezxc', 2000),
('Zakhar', 'qwezxc', 2500),
('Andrej', 'qwezxc', 2000),
('Viktor', 'qweqwe', 1500);

	
update persons set password='asasasas' where name='Viktor';

delete from persons;

select name, salary from persons where salary in(2000,2500) and salary between 2500 and 3000 order by salary desc;

drop table persons;
