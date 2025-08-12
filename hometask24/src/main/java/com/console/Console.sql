create table routes(
    id bigserial primary key,
    name varchar(255),
    body varchar(1024),
    length int,
    likes int
    );

update routes set likes=1 where id=1


