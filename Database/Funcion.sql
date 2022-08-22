--#1 Funcion Mostrar Plantas Disponibles
set serveroutput on;

CREATE OR REPLACE function f_MostrarPlanta
return sys_refcursor
is 
    CURSOR_PLANTA SYS_REFCURSOR;

BEGIN
     open CURSOR_PLANTA for SELECT IDPLANTA, NOMBRECOMUN FROM PLANTA;
     return CURSOR_PLANTA;
END;
---- verificacion ----
declare 
    x sys_refcursor;
    v_id_planta number(38);
    v_nombre_comun varchar2(100);
begin 
 
   x := f_MostrarPlanta;
   loop
       FETCH x INTO v_id_planta, v_nombre_comun;
       DBMS_OUTPUT.PUT_LINE('Plantas Disponibles: '||v_id_planta||' '||v_nombre_comun);
   exit when x%notfound;
   end loop;
 
end;

--#2 Funcion Mostrar Precios De Los Productos
set serveroutput on;

CREATE OR REPLACE function f_MostrarPrecioProducto
return sys_refcursor
is 
    CURSOR_PRECIO SYS_REFCURSOR;

BEGIN
     open CURSOR_PRECIO for SELECT NOMBRE, PRECIOPRODUCTO, DESCRIPCIONPRODUCTO FROM PRODUCTOVIVERO;
     return CURSOR_PRECIO;
END;
---- verificacion ----
declare 
    x sys_refcursor;
    v_nombre varchar2(50);
    v_precio_producto number(38);
    v_descripcion_producto varchar2(150);
begin 
 
   x := f_MostrarPrecioProducto;
   loop
       FETCH x INTO v_nombre, v_precio_producto, v_descripcion_producto;
       DBMS_OUTPUT.PUT_LINE('A continuacion la lista de los productos que ofrecemos en el vivero:
       '||' Nombre: '||v_nombre||' 
        Precio: '||v_precio_producto||' colones'||' 
        Descripcion: '||v_descripcion_producto);
   exit when x%notfound;
   end loop;
 
end;

--#3 Procedure Mostrar información De Cada Planta
CREATE OR REPLACE PROCEDURE Proc_Informacion_Planta
as
    cursor C1 is
        SELECT IDPLANTA, NOMBRECOMUN, PRECIOPLANTA, DESCRIPCION
        FROM PLANTA;
    SupId PLANTA.IDPLANTA%type;
    SupName PLANTA.NOMBRECOMUN%type;
    SupPrecio PLANTA.PRECIOPLANTA%type;
    SupDescripcion PLANTA.DESCRIPCION%type;
begin
    open C1;
    fetch C1 into SupiD, SupName, SupPrecio, SupDescripcion;
    while C1%found loop
        dbms_output.put_line('Código / Nomnbre Planta / Precio / Descripcion: ('||
         SupId || ' - ' ||
         SupName || ' - ' ||
         SupPrecio || ' - ' ||
         SupDescripcion || ')');
    fetch C1 into SupId, SupName, SupPrecio, SupDescripcion;
    end loop;
close C1;
end;

execute Proc_Informacion_Planta;

--#4 Procedure Mostrar Productos De Vivero Disponibles
CREATE OR REPLACE PROCEDURE Proc_Producto_Vivero
as
    cursor C1 is
        SELECT NOMBRE, PRECIOPRODUCTO, DESCRIPCIONPRODUCTO
        FROM PRODUCTOVIVERO;
    SupNombre PRODUCTOVIVERO.NOMBRE%type;
    SupPrecio PRODUCTOVIVERO.PRECIOPRODUCTO%type;
    SupDescripcion PRODUCTOVIVERO.DESCRIPCIONPRODUCTO%type;
begin
    open C1;
    fetch C1 into SupNombre, SupPrecio, SupDescripcion;
    while C1%found loop
        dbms_output.put_line('Nombre / Precio / Descripcion: ('||
         SupNombre || ' - ' ||
         SupPrecio || ' - ' ||
         SupDescripcion || ')');
    fetch C1 into SupNombre, SupPrecio, SupDescripcion;
    end loop;
close C1;
end;

execute Proc_Producto_Vivero;

--#5 Procedure Mostrar Productos De Vivero Disponibles
CREATE OR REPLACE PROCEDURE insertCliente
(v_Id_Cliente IN CLIENTE.IDCLIENTE%TYPE,
 v_Nombre IN CLIENTE.NOMBRE%TYPE,
 v_Primer_Apellido IN CLIENTE.PRIMERAPELLIDO%TYPE,
 v_Cedula IN CLIENTE.CEDULA%TYPE,
 v_Telefono IN CLIENTE.TELEFONO%TYPE,
 v_Correo_Electronico IN CLIENTE.CORREOELECTRONICO%TYPE,
 out_result OUT VARCHAR2)
AS
BEGIN
  INSERT INTO CLIENTE (IDCLIENTE, NOMBRE, PRIMERAPELLIDO, CEDULA, TELEFONO, CORREOELECTRONICO)
  values (v_Id_Cliente, v_Nombre, v_Primer_Apellido, v_Cedula, v_Telefono, v_Correo_Electronico);
  commit;
  
  out_result := 'TRUE';
  
EXCEPTION
  WHEN OTHERS THEN 
  out_result := 'FALSE';
  ROLLBACK;
END;

--#6 Procedure
CREATE OR REPLACE PROCEDURE inCli(v_Id_Cliente IN CLIENTE.IDCLIENTE%TYPE,
 v_Nombre IN CLIENTE.NOMBRE%TYPE,
 v_Primer_Apellido IN CLIENTE.PRIMERAPELLIDO%TYPE,
 v_Cedula IN CLIENTE.CEDULA%TYPE,
 v_Telefono IN CLIENTE.TELEFONO%TYPE,
 v_Correo_Electronico IN CLIENTE.CORREOELECTRONICO%TYPE)
IS
BEGIN

  INSERT INTO cliente (IDCLIENTE, NOMBRE, PRIMERAPELLIDO, CEDULA, TELEFONO, CORREOELECTRONICO)
values (v_Id_Cliente, v_Nombre, v_Primer_Apellido, v_Cedula, v_Telefono, v_Correo_Electronico);

  COMMIT;

END;
--logica producto vivero y planta
--#6.1 Producto Vivero
CREATE OR REPLACE PROCEDURE inProductoVivero(v_Id_Producto IN PRODUCTOVIVERO.IDPRODUCTO%TYPE,
 v_Nombre IN PRODUCTOVIVERO.NOMBRE%TYPE,
 v_Descripcion_Producto IN PRODUCTOVIVERO.DESCRIPCIONPRODUCTO%TYPE,
 v_Precio_Producto IN PRODUCTOVIVERO.PRECIOPRODUCTO%TYPE,
 v_Id_Proveedor IN PRODUCTOVIVERO.IDPROVEEDOR%TYPE)
IS
BEGIN

  INSERT INTO PRODUCTOVIVERO (IDPRODUCTO, NOMBRE, DESCRIPCIONPRODUCTO, PRECIOPRODUCTO, IDPROVEEDOR)
values (v_Id_Producto, v_Nombre, v_Descripcion_Producto, v_Precio_Producto, v_Id_Proveedor);

  COMMIT;

END;
--#6.2 Planta
CREATE OR REPLACE PROCEDURE inPlanta(v_Id_Planta IN PLANTA.IDPLANTA%TYPE,
v_Nombre_Comun IN PLANTA.NOMBRECOMUN%TYPE,
v_Nombre_Cientifico IN PLANTA.NOMBRECIENTIFICO%TYPE,
v_Id_Clima IN PLANTA.IDCLIMA%TYPE,
v_Id_Suelo IN PLANTA.IDSUELO%TYPE,
v_Id_ExposicionSolar IN PLANTA.IDEXPOSICIONSOLAR%TYPE,
v_Id_Riego IN PLANTA.IDRIEGO%TYPE,
v_Id_Tipo_Planta IN PLANTA.IDTIPOPLANTA%TYPE,
v_Id_Estacion_Florecimiento IN PLANTA.IDESTACIONFLORECIMIENTO%TYPE,
v_Id_Region IN PLANTA.IDREGION%TYPE,
v_Toxicidad IN PLANTA.TOXICIDAD%TYPE,
v_Id_Peste IN PLANTA.IDPESTE%TYPE,
v_Id_Enfermedad IN PLANTA.IDENFERMEDAD%TYPE,
v_Descripcion IN PLANTA.DESCRIPCION%TYPE,
v_Precio_Planta IN PLANTA.PRECIOPLANTA%TYPE,
v_Id_Propagacion IN PLANTA.IDPROPAGACION%TYPE,
v_Imagen_Planta IN PLANTA.IMAGENPLANTA%TYPE,
v_Id_Proveedor IN PLANTA.IDPROVEEDOR%TYPE)
IS
BEGIN

  INSERT INTO planta (IDPLANTA, NOMBRECOMUN, NOMBRECIENTIFICO, IDCLIMA, IDSUELO, IDEXPOSICIONSOLAR, IDRIEGO, IDTIPOPLANTA
                        , IDESTACIONFLORECIMIENTO, IDREGION, TOXICIDAD, IDPESTE, IDENFERMEDAD, DESCRIPCION, PRECIOPLANTA
                        , IDPROPAGACION, IMAGENPLANTA, IDPROVEEDOR)
values (v_Id_Planta, v_Nombre_Comun, v_Nombre_Cientifico, v_Id_Clima, v_Id_Suelo, v_Id_ExposicionSolar, v_Id_Riego
                        , v_Id_Tipo_Planta, v_Id_Estacion_Florecimiento, v_Id_Region, v_Toxicidad, v_Id_Peste
                        , v_Id_Enfermedad, v_Descripcion, v_Precio_Planta, v_Id_Propagacion, v_Imagen_Planta, v_Id_Proveedor);

  COMMIT;

END;

--#7
CREATE OR REPLACE PROCEDURE p_MostrarPlanta(v_Id_Cliente IN CLIENTE.IDCLIENTE%TYPE,
 v_Nombre IN CLIENTE.NOMBRE%TYPE,
 v_Primer_Apellido IN CLIENTE.PRIMERAPELLIDO%TYPE,
 v_Cedula IN CLIENTE.CEDULA%TYPE,
 v_Telefono IN CLIENTE.TELEFONO%TYPE,
 v_Correo_Electronico IN CLIENTE.CORREOELECTRONICO%TYPE)
IS
BEGIN

  INSERT INTO cliente (IDCLIENTE, NOMBRE, PRIMERAPELLIDO, CEDULA, TELEFONO, CORREOELECTRONICO)
values (v_Id_Cliente, v_Nombre, v_Primer_Apellido, v_Cedula, v_Telefono, v_Correo_Electronico);

  COMMIT;

END;

--8
set SERVEROUTPUT ON;

--creacion de body del paquete
create or replace procedure mostrarInfo
as
    select IDCLIENTE, NOMBRE, PRIMERAPELLIDO, CEDULA, TELEFONO, CORREOELECTRONICO from cliente;
    
    begin
        
    end;

execute mostrarInfo;

----------------------------------------------------------
create or replace procedure mostrarInfo
as
    cursor c_mostrar is
        select IdCliente,Nombre,PrimerApellido,Cedula,Telefono,CorreoElectronico
        from Cliente;
    v_Id Cliente.IdCliente%type;
    v_Nom Cliente.Nombre%type;
    v_Ape Cliente.PrimerApellido%type;
    v_Ced Cliente.Cedula%type;
    v_Tel Cliente.Telefono%type;
    v_email Cliente.CorreoElectronico%type;
begin
    open c_mostrar;
    fetch c_mostrar into v_Id, v_Nom, v_Ape, v_Ced, v_Tel, v_email;
    while c_mostrar%found loop
    fetch c_mostrar into v_Id, v_Nom, v_Ape, v_Ced, v_Tel, v_email;
    end loop;
close c_mostrar;
end;

execute mostrarInfo;

insert into cliente (IDCLIENTE, NOMBRE, PRIMERAPELLIDO, CEDULA, TELEFONO, CORREOELECTRONICO) values (1,'Ricardo','Manzanares', 
    '123456789','11111111','rmorales@gmail.com');
    
insert into Cliente(IdCliente,Nombre,PrimerApellido,Cedula,Telefono,CorreoElectronico)
values(4,'Alonso','Nuñez',305020598,89562312,'alon@gmail.com');
insert into Cliente(IdCliente,Nombre,PrimerApellido,Cedula,Telefono,CorreoElectronico)
values(3,'Jose','Corrales',345897821,89789312,'jose@gmail.com');

















