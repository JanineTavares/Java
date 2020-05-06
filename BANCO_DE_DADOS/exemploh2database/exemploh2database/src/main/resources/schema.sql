drop table if exists funcionario;
drop table if exists cliente;

create table funcionario(
    id_funcionario bigint auto_increment,
    nome varchar(100) not null,
    salario double not null,
    rg int not null,
    primary key(id_funcionario));

create table cliente(
    id_cliente bigint auto_increment,
    nome varchar(100) not null,
    idade int not null,
    endereco varchar (200) not null,
    primary key(id_cliente));
