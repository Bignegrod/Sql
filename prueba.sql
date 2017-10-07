--1--
select nombre "NOMBRE SALA",direccion,telefono, descripcion_comuna "COMUNA",
descripcion_region "Region"
from sala_ventas join comunas
using (cod_comuna)
join regiones
using (cod_region);
--2--
select upper(nombre)"NOMBRE SALA" ,COUNT(rut_vendedor)"ruteano"
from vendedores join sala_ventas
using (cod_sala)
group by upper(nombre)
having count(rut_vendedor)>1;
--3--

--4--
select  nro_patente,fecha_mantencion, sum(valor_mantencion+nvl(valor,0))"total"
from cobros_adic_mantencion c right join mantenciones m
on(m.cod_mantencion=c.cod_mantencion)
group by nro_patente,fecha_mantencion;