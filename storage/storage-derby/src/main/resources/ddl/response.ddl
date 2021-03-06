create table response (
  uri            varchar(1024) not null,
  vary           varchar(1024) not null,
  status         int not null,
  headers        long varchar not null,
  cachetime      timestamp not null,
  mimetype       varchar(256),
  primary key(uri, vary)
)
