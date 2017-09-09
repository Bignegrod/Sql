--1--

select concat(concat(substr(RUTEMP,1,length(RUTEMP)-1) ,'-')
, substr(rutemp,-1,1) ) as run_empleado,
concat(concat(concat(PATERNO, ' ') ,concat(MATERNO, ' ')), concat(NOMBRE, ' ')) as nombre, 
DIRECCION ,
FONO1 ,
NVL(to_char(FONO2),'NO POSEE FONO')  as fono2
from empleado
order by nombre;





--2--
select concat(concat(substr(RUTEMP,1,length(RUTEMP)-1) ,'-'), substr(rutemp,-1,1) ) as run_empleado,
sueldo, 
concat(trunc(sueldo/100000), '%') as porcentaje
from empleado
where idcategoria = 2
order by run_empleado;






--3--
select initcap(concat(concat(concat(PATERNO, ' ') ,concat(MATERNO, ' ')), concat(NOMBRE, ' '))) as nombre, 
lower(concat(concat(substr(nombre,1,2),'.'),PATERNO)) as nom_usuario,
concat(concat( concat(lower(substr(ecivil,1,1)),'*'), 
concat(substr(rutemp,1,4),lower(substr(direccion,1,1)))) ,
concat('_',upper(substr(direccion,2,1)))) as contraseña
from empleado 
order by nom_usuario;
