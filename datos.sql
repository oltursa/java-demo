create table persona(
CPERSONA integer primary key identity(1,1),
NOMBRE VARCHAR(250) NOT NULL,
PATERNO VARCHAR(250) NOT NULL,
MATERNO VARCHAR(250) NOT NULL,
ACTIVO BIT NOT NULL DEFAULT 1,
FH_CREACION DATETIME NOT NULL DEFAULT GETDATE()
)

drop table persona

insert into persona(NOMBRE,PATERNO,MATERNO,ACTIVO) 
values('nombre 1','paterno 1','materno 1',1),
('nombre 2','paterno 2','materno 2',0)
