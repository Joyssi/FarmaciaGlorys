CREATE DATABASE FarmaciaGlorys
GO

USE [FarmaciaGlorys]
GO

--Creación de tablas de la BD
-------------------------------------------------------------------------
--Tabla Persona
CREATE TABLE [Persona] (
 [Cedula] VARCHAR(18) PRIMARY KEY,
 [Nombres] VARCHAR(40) NOT NULL,
 [Apellidos] VARCHAR(40) NOT NULL,
 [Direccion] VARCHAR(100) NULL,
 [Telefono] VARCHAR(12) NOT NULL
 )
 GO

--Tabla Empleado
CREATE TABLE [Empleado] (
  [Cedula] VARCHAR(18) PRIMARY KEY NOT NULL,
  [CorreoE] NVARCHAR(40)NOT NULL,
  [Edad] INT NULL,
)
GO

--Tabla Cliente
CREATE TABLE [Cliente] (
  [Cedula] VARCHAR(18) PRIMARY KEY NOT NULL,
  [CorreoC] NVARCHAR(30) NULL,
)
GO

--Tabla Venta
CREATE TABLE [Venta] (
  [IDVenta] INT PRIMARY KEY IDENTITY,
  [CedulaE] VARCHAR(18) NOT NULL,
  [CedulaC] VARCHAR(18) NOT NULL,
  [FechaVenta] DATE NOT NULL,
  [DirecPedidoVenta] VARCHAR(100) NULL
)
GO

--Tabla VentaProducto
CREATE TABLE [VentaProducto] (
  [IDVentaProducto] INT PRIMARY KEY IDENTITY,
  [IDProducto] INT NOT NULL,
  [IDVenta] INT NOT NULL,
  [CantProductosVendidos] INT NOT NULL,
  [TotalVenta] DECIMAL (12,2) NOT NULL
)
GO

--Tabla Producto
CREATE TABLE [Producto] (
  [IDProducto] INT PRIMARY KEY IDENTITY,
  [NomProducto] VARCHAR(30) NOT NULL,
  [DescripProducto] VARCHAR(100) NULL,
  [CantProducto] INT NOT NULL,
  [PrecioProducto] DECIMAL(12,2) NOT NULL,
  [FechaVencimiento] DATE NOT NULL,
  [IDMarca] INT NOT NULL,
  [IDCategoria] INT NOT NULL,
  [IDPresentacion] INT NOT NULL
)
GO

--Tabla Marca
CREATE TABLE [Marca] (
  [IDMarca] INT PRIMARY KEY IDENTITY,
  [NombreMarca] VARCHAR(20) NOT NULL
)
GO

--Tabla Categoria
CREATE TABLE [Categoria] (
  [IDCategoria] INT PRIMARY KEY IDENTITY,
  [NombreCategoria] VARCHAR(20) NOT NULL
)
GO

--Tabla Presentación
CREATE TABLE [Presentacion] (
  [IDPresentacion] INT PRIMARY KEY IDENTITY,
  [FormaDosificacion] VARCHAR(20) NOT NULL
)
GO

--Tabla CompraProducto
CREATE TABLE [CompraProducto] (
  [IDCompraProducto] INT PRIMARY KEY IDENTITY,
  [IDProducto] INT NOT NULL,
  [IDCompra] INT NOT NULL,
  [PrecioCompra] DECIMAL(12,2) NOT NULL,
  [CantProductosComprados] INT NOT NULL,
  [TotalCompra] DECIMAL (12,2) NOT NULL
)
GO

--Tabla Compra
CREATE TABLE [Compra] (
  [IDCompra] INT PRIMARY KEY IDENTITY,
  [FechaCompra] DATE NOT NULL,
  [CedulaP] VARCHAR(18) NOT NULL
)
GO

--Tabla Proveedor
CREATE TABLE [Proveedor] (
  [Cedula] VARCHAR(18) PRIMARY KEY NOT NULL,
  [CorreoP] NVARCHAR(30)NULL
  
)
GO

--Relaciones de las tablas
--------------------------------------------------------------------------
ALTER TABLE [Empleado]
ADD CONSTRAINT [FK_Empleado_Persona]
FOREIGN KEY ([Cedula])
REFERENCES [Persona] ([Cedula])
GO

ALTER TABLE [Cliente]
ADD CONSTRAINT [FK_Cliente_Persona]
FOREIGN KEY ([Cedula])
REFERENCES [Persona] ([Cedula])
GO

ALTER TABLE [Venta] 
ADD CONSTRAINT [FK_Venta_Empleado]
FOREIGN KEY ([CedulaE])
REFERENCES [Empleado] ([Cedula])
GO

ALTER TABLE [Venta] 
ADD CONSTRAINT [FK_Venta_Cliente]
FOREIGN KEY ([CedulaC])
REFERENCES [Cliente] ([Cedula])
GO

ALTER TABLE [VentaProducto]
ADD CONSTRAINT [FK_VentaProducto_Producto]
FOREIGN KEY ([IDProducto]) 
REFERENCES [Producto] ([IDProducto])
GO

ALTER TABLE [VentaProducto] 
ADD CONSTRAINT [FK_VentaProducto_Venta]
FOREIGN KEY ([IDVenta])
REFERENCES [Venta] ([IDVenta])
GO

ALTER TABLE [Producto]
ADD CONSTRAINT [FK_Producto_Presentacion]
FOREIGN KEY ([IDPresentacion]) 
REFERENCES [Presentacion] ([IDPresentacion])
GO

ALTER TABLE [Producto] 
ADD CONSTRAINT [FK_Producto_Categoria]
FOREIGN KEY ([IDCategoria]) 
REFERENCES [Categoria] ([IDCategoria])
GO

ALTER TABLE [Producto] 
ADD CONSTRAINT [FK_Producto_Marca]
FOREIGN KEY ([IDMarca]) 
REFERENCES [Marca] ([IDMarca])
GO

ALTER TABLE [Compra] 
ADD CONSTRAINT [FK_Compra_Proveedor]
FOREIGN KEY ([CedulaP]) 
REFERENCES [Proveedor] ([Cedula])
GO

ALTER TABLE [CompraProducto]
ADD CONSTRAINT [FK_CompraProducto_Compra]
FOREIGN KEY ([IDCompra])
REFERENCES [Compra] ([IDCompra])
GO

ALTER TABLE [CompraProducto]
ADD CONSTRAINT [FK_CompraProducto_Producto]
FOREIGN KEY ([IDProducto])
REFERENCES [Producto] ([IDProducto])
GO

ALTER TABLE [Proveedor]
ADD CONSTRAINT [FK_Proveedor_Persona]
FOREIGN KEY ([Cedula])
REFERENCES [Persona] ([Cedula])
GO

--Procedimientos almacenados de la tabla Empleado
---------------------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para Mostrar Empleado:
CREATE PROCEDURE MostrarEmpleado
AS
BEGIN
SELECT Empleado.Cedula, Nombres, Apellidos, Direccion, Telefono, CorreoE, Edad
FROM Empleado inner join Persona ON Empleado.Cedula=Persona.Cedula
END
GO

EXECUTE MostrarEmpleado
GO

----------------------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para insertar un Empleado:
CREATE PROCEDURE InsertarEmpleado
@Cedula VARCHAR(18),
@Nombres VARCHAR(40),
@Apellidos VARCHAR(40),
@Direccion VARCHAR(100),
@Telefono VARCHAR(12),
@CorreoE NVARCHAR(30),
@Edad INT
AS
BEGIN
INSERT INTO Persona(Cedula, Nombres, Apellidos, Direccion, Telefono)
VALUES (@Cedula, @Nombres, @Apellidos, @Direccion, @Telefono)
INSERT INTO Empleado(CorreoE, Edad, Cedula)
VALUES ( @CorreoE,@Edad, @Cedula)
END
GO

EXECUTE InsertarEmpleado  '121-090909-1000K' ,'José Luis', 'López Gaitán', 'Parque Central', '87654323', 'gaitan345@gmail.com', 18
GO

-----------------------------------------------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para actualizar un Empleado:
CREATE PROCEDURE ActualizarEmpleado
@Cedula VARCHAR(18),
@Nombres VARCHAR(40),
@Apellidos VARCHAR(40),
@Direccion VARCHAR(100),
@Telefono VARCHAR(12),
@CorreoE VARCHAR(30),
@Edad INT
AS
BEGIN
UPDATE Persona SET Nombres=@Nombres, Apellidos=@Apellidos, 
Direccion=@Direccion, Telefono=@Telefono WHERE Cedula=@cedula
UPDATE Empleado SET CorreoE=@CorreoE, Edad=@Edad WHERE Cedula=@Cedula
END
GO

EXECUTE ActualizarEmpleado '121-090909-1000K', 'Manuel Antonio', 'Duarte Lumbí', 'Null', '23434554', 'manuelA2@gmail.com', 23
GO

---------------------------------------------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para eliminar un Empleado:
CREATE PROCEDURE EliminarEmpleado
@Cedula VARCHAR(18)
AS
BEGIN
DELETE FROM Empleado WHERE Cedula=@Cedula
DELETE FROM Persona WHERE Cedula=@Cedula
END
GO

EXECUTE EliminarEmpleado '121-090909-1000K'
GO

------------------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para consultar la tabla Empleado
CREATE PROCEDURE ConsultarEmpleado
@Nombres VARCHAR(40)
AS
BEGIN
SELECT Empleado.Cedula, Nombres, Apellidos, Direccion, Telefono, CorreoE, Edad
FROM Empleado inner join Persona
ON Empleado.Cedula=Persona.Cedula
WHERE Empleado.Cedula like '%'+RTRIM(@Nombres)+'%' or Nombres like
'%'+RTRIM(@Nombres)+'%' or Apellidos like '%'+RTRIM(@Nombres)+'%'
or Telefono like '%'+RTRIM(@Nombres)+'%' or CorreoE like '%'+RTRIM(@Nombres)+'%'
or Edad like '%'+RTRIM(@Nombres)+'%'
END
GO

EXECUTE ConsultarEmpleado 'Joharen'
GO
------------------------------------------------------------------------------------------------------------------------

--Vista de la tabla Empleado
CREATE VIEW Listado_Empleado
AS
SELECT Empleado.Cedula, Nombres, Apellidos, Direccion, Telefono, CorreoE
FROM Empleado inner join Persona
ON Empleado.Cedula=Persona.Cedula
GO

SELECT * FROM Listado_Empleado
GO

--Procedimientos almacenados de la tabla Cliente
------------------------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para Mostrar Cliente:
CREATE PROCEDURE MostrarCliente
AS
BEGIN
SELECT Cliente.Cedula, Nombres, Apellidos, Direccion, Telefono, CorreoC
FROM Cliente inner join Persona ON Cliente.Cedula=Persona.Cedula
END
GO

EXECUTE MostrarCliente
GO
--------------------------------------------------------------------------------------------------------------------------------

--Procedimiento almacenado para ingresar un Cliente.
CREATE PROCEDURE InsertarCliente
@Cedula VARCHAR(18),
@Nombres VARCHAR(40),
@Apellidos VARCHAR(40),
@Direccion VARCHAR(100),
@Telefono VARCHAR(12),
@CorreoC NVARCHAR(30)
AS
BEGIN
INSERT INTO Persona(Cedula, Nombres, Apellidos, Direccion, Telefono)
VALUES (@Cedula, @Nombres, @Apellidos, @Direccion, @Telefono)
INSERT INTO Cliente(CorreoC, Cedula)
VALUES ( @CorreoC, @Cedula)
END
GO

EXECUTE InsertarCliente '121-989798-1001J', 'Elieth Izayana', 'Cruz Álvarez', 'Null', '84567587', 'cruzalvarez@gmail.com'
GO
------------------------------------------------------------------------------------------------------------------------------------

--Procedimiento almacenado para actualizar un Cliente
CREATE PROCEDURE ActualizarCliente
@Cedula VARCHAR(18),
@Nombres VARCHAR(40),
@Apellidos VARCHAR(40),
@Direccion VARCHAR(100),
@Telefono VARCHAR(12),
@CorreoC VARCHAR(30)
AS
BEGIN
UPDATE Persona SET Nombres=@Nombres, Apellidos=@Apellidos, 
Direccion=@Direccion, Telefono=@Telefono WHERE cedula=@cedula
UPDATE Cliente SET CorreoC=@CorreoC WHERE Cedula=@Cedula
END
GO

EXECUTE ActualizarCliente '121-989798-1001J', 'Joyssi Dayana', 'Romero Cruz', 'Null', '88888888', 'cruzromeroj@gmail.com'
GO
-------------------------------------------------------------------------------------------------------------------------------

--Procedimiento almacenado para eliminar un Cliente:
CREATE PROCEDURE EliminarCliente
@Cedula VARCHAR(18)
AS
BEGIN
DELETE FROM Cliente WHERE Cedula=@Cedula
DELETE FROM Persona WHERE Cedula=@Cedula
END
GO

EXECUTE EliminarCliente  '121-989798-1001J'
GO
-------------------------------------------------------------------------------------------------------------------------------

--Procedimiento almacenado para consultar la tabla Cliente
CREATE PROCEDURE ConsultarCliente
@Nombres VARCHAR(40)
AS
BEGIN
SELECT Cliente.Cedula, Nombres, Apellidos, Direccion, Telefono, CorreoC
FROM Cliente inner join Persona
ON Cliente.Cedula=Persona.Cedula
WHERE Cliente.Cedula like '%'+RTRIM(@Nombres)+'%' or Nombres like
'%'+RTRIM(@Nombres)+'%' or Apellidos like '%'+RTRIM(@Nombres)+'%'
END
GO

EXECUTE ConsultarCliente 'Mejía'
GO

--Vista de la tabla Clientes
CREATE VIEW Listado_Cliente
AS
SELECT Cliente.Cedula, Nombres, Apellidos, Direccion, Telefono, CorreoC
FROM Cliente inner join Persona
ON Cliente.Cedula=Persona.Cedula
GO

SELECT * FROM Listado_Cliente
GO

--Procedimientos almacenados de la tabla Marca
------------------------------------------------------------------------------
--Procedimiento almacenado para mostrar los datos de la tabla Marca
CREATE PROCEDURE MostrarMarca
AS
BEGIN
   SELECT IDMarca, NombreMarca
   FROM Marca
 END
 GO

 EXECUTE MostrarMarca
 GO
 ------------------------------------------------------------------------------------

 --Procedimiento almacenado para insertar un nuevo registro en la tabla Marca
CREATE PROCEDURE InsertarMarca
@NombreMarca VARCHAR(10)
AS
BEGIN
INSERT INTO [Marca] ([NombreMarca])
VALUES (@NombreMarca)
END
GO

EXECUTE InsertarMarca 'RAMOS'
GO

---------------------------------------------------------------------------------

--Vista de la tabla Marca
CREATE VIEW Listado_Marca
AS
SELECT IDMarca, NombreMarca
FROM Marca
GO

SELECT * FROM Listado_Marca
GO
------------------------------------------------------------------------------------------------------------------

--Procedimientos almacenados de la tabla Categoria
------------------------------------------------------------------------------------------------------------------

--Procedimiento para mostrar los datos de la tabla Categoria
CREATE PROCEDURE MostrarCategoria
AS
BEGIN
   SELECT IDCategoria, NombreCategoria
   FROM Categoria
 END
 GO

 EXECUTE MostrarCategoria
 GO
 ---------------------------------------------------------------------------------------------------------------

 --Procedimiento almacenado para insertar un nuevo registro en la tabla Categoría
CREATE PROCEDURE InsertarCategoria
@NombreCategoria VARCHAR (20)
AS
BEGIN
INSERT INTO [Categoria] ([NombreCategoria])
VALUES (@NombreCategoria)
END
GO

EXECUTE InsertarCategoria 'Fitofármacos'
GO

----------------------------------------------------------------------------------------------------------------

--Vista de la tabla Categoría
CREATE VIEW Listado_Categoria
AS
SELECT IDCategoria, NombreCategoria
FROM Categoria
GO

SELECT * FROM Listado_Categoria
GO
---------------------------------------------------------------------------------------------------------------

--Procedimientos almacenados de la tabla Presentación
-----------------------------------------------------------------------------------------------------------------------------------------------------

--Procedimiento almacenado para mostrar los datos de la tabla Presentación
CREATE PROCEDURE MostrarPresentacion
AS
BEGIN
   SELECT IDPresentacion, FormaDosificacion
   FROM Presentacion
 END
 GO

 EXECUTE MostrarPresentacion
 GO
 -------------------------------------------------------------------------------------------

 --Procedimiento almacenado para insertar un nuevo registro en la tabla Presentacion
CREATE PROCEDURE InsertarPresentacion
@FormaDosificacion VARCHAR (20)
AS
BEGIN
INSERT INTO [Presentacion] ([FormaDosificacion])
VALUES (@FormaDosificacion)
END
GO

EXECUTE InsertarPresentacion 'Tableta'
GO

---------------------------------------------------------------------------------------------

--Vista de la tabla Presentación
CREATE VIEW Listado_Presentacion
AS
SELECT IDPresentacion, FormaDosificacion
FROM Presentacion
GO

SELECT * FROM Listado_Presentacion
GO
---------------------------------------------------------------------------------------------------------------------------------------------

--Procedimientos almacenados de la tabla Producto
--------------------------------------------------------------------------------------------------------------------------------------------------

--Procedimiento para mostrar los datos de la tabla Producto
CREATE PROCEDURE MostrarProducto
AS
BEGIN
SELECT Producto.IDProducto, NomProducto, DescripProducto, CantProducto, PrecioProducto, FechaVencimiento, IDMarca, IDCategoria, IDPresentacion
FROM Producto
END
GO

EXECUTE MostrarProducto
GO
----------------------------------------------------------------------------

--Procedimiento almacenado para insertar un nuevo registro en la tabla Producto
 CREATE PROCEDURE InsertarProductos
  @NombreProducto VARCHAR(20),
  @DescripProducto VARCHAR(100),
  @CantProducto INT,
  @PrecioProducto DECIMAL(12,2),
  @FechaVencimiento DATE,
  @IDMarca INT,
  @IDCategoria INT,
  @IDPresentacion INT
AS
  BEGIN
    INSERT INTO [Producto] ([NomProducto], [DescripProducto], [CantProducto], [PrecioProducto], [FechaVencimiento], [IDMarca], [IDCategoria], [IDPresentacion])
    VALUES (@NombreProducto, @DescripProducto, @CantProducto, @PrecioProducto, @FechaVencimiento, @IDMarca, @IDCategoria, @IDPresentacion)
  END
  GO

  EXECUTE InsertarProductos 'Cetirizina', 'Producto de PASHA S.A', 800, 4.50, '2024-03-12', 2, 1, 1
  GO

  --------------------------------------------------------------------------------------

  --Procedimiento almacenado para actualizar un registro existente de la tabla Producto
CREATE PROCEDURE ActualizarProducto
@IDProducto INT,
@NomProducto VARCHAR(30),
@DescripProducto VARCHAR(100),
@CantProducto INT,
@PrecioProducto DECIMAL(12,2),
@FechaVencimiento DATE,
@IDMarca INT,
@IDCategoria INT,
@IDPresentacion INT
AS
BEGIN
UPDATE Producto
SET NomProducto=@NomProducto, DescripProducto=@DescripProducto, 
CantProducto=@CantProducto, PrecioProducto=@PrecioProducto,
FechaVencimiento=@FechaVencimiento, IDMarca=@IDMarca,
IDCategoria=@IDCategoria, IDPresentacion=@IDPresentacion
WHERE IDProducto=@IDProducto
END
GO

EXECUTE ActualizarProducto 3, 'Cetirizina', 'Producto de PASHA S.A', 900, 5, '2021-03-12', 2, 1, 1
GO

------------------------------------------------------------------------------------

--Procedimiento almacenado para eliminar un rgistro existente de la tabla Producto
CREATE PROCEDURE EliminarProducto
@IDProducto INT
AS
BEGIN
DELETE FROM Producto
WHERE IDProducto=@IDProducto
END
GO

EXECUTE EliminarProducto 3
GO

----------------------------------------------------------------------------

--Procedimiento almacenado para consultar los datos de la tabla Producto
CREATE PROCEDURE ConsultarProducto
@NomProducto VARCHAR(20)
AS
BEGIN
SELECT Producto.IDProducto, NomProducto, DescripProducto, CantProducto, PrecioProducto, FechaVencimiento, IDMarca, IDCategoria, IDPresentacion
FROM Producto
WHERE Producto.NomProducto like '%'+RTRIM(@NomProducto)+'%' or PrecioProducto like
'%'+RTRIM(@NomProducto)+'%' or FechaVencimiento like '%'+RTRIM(@NomProducto)+'%' or
CantProducto like '%'+RTRIM(@NomProducto)+'%'
END
GO

EXECUTE ConsultarProducto 'Loratadina'
GO

---------------------------------------------------------------------------

--Vista de la tabla Producto
CREATE VIEW Listado_Producto
AS
SELECT IDProducto, NomProducto, DescripProducto, CantProducto, PrecioProducto, FechaVencimiento, IDMarca, IDCategoria, IDPresentacion
FROM Producto
GO

SELECT * FROM Listado_Producto
GO
--------------------------------------------------------------------------------------------------------------------------------

--Procedimientos almacenados de la tabla Venta
------------------------------------------------------------------------------------------------------------------------------------------------

--Procedimiento almacenado para mostrar los datos de la tabla Venta
CREATE PROCEDURE MostrarVenta
AS
BEGIN
SELECT Venta.IDVenta, CedulaE, CedulaC, FechaVenta, DirecPedidoVenta, IDProducto, CantProductosVendidos, TotalVenta
FROM Venta inner join VentaProducto ON Venta.IDVenta=VentaProducto.IDVenta
END
GO

EXECUTE MostrarVenta
GO

-------------------------------------------------------------------------------

--Procedimiento almacenado para insertar un nuevo registro de la tabla Venta
CREATE PROCEDURE InsertarVenta
@CedulaE VARCHAR(18),
@CedulaC VARCHAR(18),
@FechaVenta DATE,
@DirecPedidoVenta VARCHAR(100)
AS
BEGIN
INSERT INTO Venta (CedulaE, CedulaC, FechaVenta, DirecPedidoVenta)
VALUES (@CedulaE, @CedulaC, @FechaVenta, @DirecPedidoVenta)
END
GO

-------------------------------------------------------------------------------------------


--Procedimiento almacenado para consultar los datos de la tabla Venta
CREATE PROCEDURE ConsultarVentas
@CedulaE VARCHAR(40)
AS
BEGIN
SELECT Venta.IDVenta, CedulaE, CedulaC, FechaVenta, DirecPedidoVenta, IDProducto, CantProductosVendidos, TotalVenta
FROM Venta inner join VentaProducto
ON Venta.IDVenta=VentaProducto.IDVenta
WHERE Venta.IDVenta like '%'+RTRIM(@CedulaE)+'%' or CedulaC like
'%'+RTRIM(@CedulaE)+'%' or FechaVenta like '%'+RTRIM(@CedulaE)+'%' or IDProducto like '%'+RTRIM(@CedulaE)+'%'
or CantProductosVendidos like '%'+RTRIM(@CedulaE)+'%'
END
GO

EXECUTE ConsultarVentas '121-181002-1000K'
GO

----------------------------------------------------------------------------

--Vista de la tabla Venta
CREATE VIEW Listado_Venta
AS
SELECT Venta.IDVenta, CedulaE, CedulaC, FechaVenta, DirecPedidoVenta, IDVentaProducto, IDProducto, CantProductosVendidos, TotalVenta
FROM Venta inner join VentaProducto
ON Venta.IDVenta=VentaProducto.IDVenta
GO

SELECT * FROM Listado_Venta
GO
----------------------------------------------------------------------------

--Procedimientos almacenados de la tabla secundaria VentaProducto
-------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------
--Procedimiento almacenado para insertar un nuevo registro en la tabla VentaProducto
CREATE PROCEDURE InsertarVentaProducto
  @IDProducto INT,
  @CantProductosVendidos INT,
  @TotalVenta DECIMAL (12,2)
AS
  BEGIN
    DECLARE @codVenta INT;
	SET @codVenta = (SELECT max(IDVenta) FROM Venta);
    INSERT INTO [VentaProducto] ([IDProducto],[IDVenta], [CantProductosVendidos], [TotalVenta])
    VALUES (@IDProducto, @codVenta, @CantProductosVendidos, @TotalVenta)
  END
  GO
-------------------------------------------------------------------------------------------------------------------------------------------------

--Procedimientos almacenados de la tabla Proveedor
-------------------------------------------------------------------------------------------------------------------------------------------------

--Procedimiento almacenado para Mostrar los datos de la tabla Proveedor:
CREATE PROCEDURE MostrarProveedor
AS
BEGIN
SELECT Proveedor.Cedula, Nombres, Apellidos, Direccion, Telefono, CorreoP
FROM Proveedor inner join Persona ON Proveedor.Cedula=Persona.Cedula
END
GO

EXECUTE MostrarProveedor
GO

----------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para insertar un proveedor:
CREATE PROCEDURE InsertarProveedor
@Cedula VARCHAR(18),
@Nombres VARCHAR(40),
@Apellidos VARCHAR(40),
@Direccion VARCHAR(100),
@Telefono VARCHAR(12),
@CorreoP NVARCHAR(30)
AS
BEGIN
INSERT INTO Persona(Cedula, Nombres, Apellidos, Direccion, Telefono)
VALUES (@Cedula, @Nombres, @Apellidos, @Direccion, @Telefono)
INSERT INTO Proveedor(CorreoP, Cedula)
VALUES ( @CorreoP, @Cedula)
END
GO

EXECUTE InsertarProveedor '121-090807-1001J', 'Julio César', 'Olivas Somarriba', 'Frente a la Iglesia Divino Niño', '87241256', 'olivasj123@gmail.com'
GO

------------------------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para actualizar un proveedor:
CREATE PROCEDURE ActualizarProveedor
@Cedula VARCHAR(18),
@Nombres VARCHAR(40),
@Apellidos VARCHAR(40),
@Direccion VARCHAR(100),
@Telefono VARCHAR(12),
@CorreoP VARCHAR(30)
AS
BEGIN
UPDATE Persona SET Nombres=@Nombres, Apellidos=@Apellidos, 
Direccion=@Direccion, Telefono=@Telefono WHERE Cedula=@cedula
UPDATE Proveedor SET CorreoP=@CorreoP WHERE Cedula=@Cedula
END
GO

EXECUTE ActualizarProveedor '121-090807-1001J', 'Mauricio Rene', 'Rubio Ortega', 'Frente a la Iglesia Divino Niño', '87264512', 'rubiom831@gmail.com'
GO

-----------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para eliminar un proveedor:
CREATE PROCEDURE EliminarProveedor
@Cedula VARCHAR(18)
AS
BEGIN
DELETE FROM Proveedor WHERE Cedula=@Cedula
DELETE FROM Persona WHERE Cedula=@Cedula
END
GO

EXECUTE EliminarProveedor '121-090807-1001J'
GO

-----------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para consultar la tabla Compra
CREATE PROCEDURE ConsultarProveedor
@Nombres VARCHAR(40)
AS
BEGIN
SELECT Proveedor.Cedula, Nombres, Apellidos, Direccion, Telefono, CorreoP
FROM Proveedor inner join Persona
ON Proveedor.Cedula=Persona.Cedula
WHERE Proveedor.Cedula like '%'+RTRIM(@Nombres)+'%' or Nombres like
'%'+RTRIM(@Nombres)+'%' or Apellidos like '%'+RTRIM(@Nombres)+'%'
END
GO

EXECUTE ConsultarProveedor '121-090805-1001M'
GO

-------------------------------------------------------------------------------------------------------------

--Vista de la tabla Proveedor
CREATE VIEW Listado_Proveedor
AS
SELECT Proveedor.Cedula, Nombres, Apellidos, Direccion, Telefono, CorreoP
FROM Proveedor inner join Persona
ON Proveedor.Cedula=Persona.Cedula
GO

SELECT * FROM Listado_Proveedor
GO
-----------------------------------------------------------------------------------------------------------------------

--Procedimientos almacenados de la tabla Compra
---------------------------------------------------------------------------------------------------------------------------
--Procedimiento almacenado para mostrar los datos de la tabla Compra
CREATE PROCEDURE MostrarCompra
AS
BEGIN
SELECT Compra.IDCompra, FechaCompra, CedulaP, IDProducto, PrecioCompra, CantProductosComprados, TotalCompra
FROM Compra inner join CompraProducto ON Compra.IDCompra=CompraProducto.IDCompra
END
GO

EXECUTE MostrarCompra
GO
--------------------------------------------------------------------------------------------------------------------------

--Procedimiento almacenado para insertar un nuevo registro en la tabla Compra
CREATE PROCEDURE InsertarCompra
  @FechaCompra VARCHAR(12),
  @CedulaP VARCHAR(18)
AS
  BEGIN
    INSERT INTO [Compra] ([FechaCompra], [CedulaP])
    VALUES (@FechaCompra, @CedulaP)
  END
  GO
-----------------------------------------------------------------------------------------------------------------------------

--Procedimiento almacenado para consultar los datos de la tabla Compra
CREATE PROCEDURE ConsultarCompras
@CedulaP VARCHAR(40)
AS
BEGIN
SELECT Compra.IDCompra, FechaCompra, CedulaP,IDProducto, PrecioCompra, CantProductosComprados, TotalCompra
FROM Compra inner join CompraProducto
ON Compra.IDCompra=CompraProducto.IDCompra
WHERE Compra.IDCompra like '%'+RTRIM(@CedulaP)+'%' or FechaCompra like
'%'+RTRIM(@CedulaP)+'%' or CedulaP like '%'+RTRIM(@CedulaP)+'%' or IDProducto like '%'+RTRIM(@CedulaP)+'%'
or PrecioCompra like '%'+RTRIM(@CedulaP)+'%' or CantProductosComprados like '%'+RTRIM(@CedulaP)+'%'
END
GO

EXECUTE ConsultarCompras '121-090805-1001M'
GO

-------------------------------------------------------------------------------------------------------------------------------------

--Vista de la tabla Compra
CREATE VIEW Listado_Compra
AS
SELECT Compra.IDCompra, FechaCompra, CedulaP, IDCompraProducto, IDProducto, PrecioCompra, CantProductosComprados, TotalCompra
FROM Compra inner join CompraProducto
ON Compra.IDCompra=CompraProducto.IDCompra
GO

SELECT * FROM Listado_Compra
GO

------------------------------------------------------------------------------------------------------------------------

--Procedimientos almacenados de la tabla secundaria CompraProducto
-----------------------------------------------------------------------------------------------------------------------
--Procedimiento para insertar un nuevo registro en la tabla CompraProducto
CREATE PROCEDURE InsertarCompraProducto
  @IDProducto INT,
  @PrecioCompra DECIMAL(12,2),
  @CantProductosComprados INT,
  @TotalCompra DECIMAL (12,2)
AS
  BEGIN
  DECLARE @codcompra INT;
  SET @codcompra = (SELECT max(IDCompra) FROM Compra);
    INSERT INTO [CompraProducto] ([IDProducto], [IDCompra], [PrecioCompra], [CantProductosComprados], [TotalCompra])
    VALUES (@IDProducto, @codcompra, @PrecioCompra, @CantProductosComprados, @TotalCompra)
  END
  GO
-----------------------------------------------------------------------------------------------------------------------------------