/*Procedures para la base de datos*/

/*Procedures para tabla usuarios*/

/*proceso al macenado para listar usuarios*/
CREATE PROCEDURE ListarUsuarios()
SELECT Id_Usuario, nombre, categoria, email
FROM usuario

 CALL ListarUsuarios()
/*Proceso almacenado para actualizar usuario*/
CREATE PROCEDURE UpdateUS(IN cod INT(1),IN nomb VARCHAR(45),IN PASS VARCHAR(100),IN Cat VARCHAR(45), IN mail VARCHAR(45), IN Cat_Id INT(1))
UPDATE usuario SET nombre = nomb, PASSWORD = PASS, Categoria = Cat, email = mail, Categoria_Us_Id_Categoria = Cat_Id WHERE Id_Usuario = cod

/*Proceso almacenado para eliminar usuario*/
CREATE PROCEDURE EliminarUs(IN codigo INT(1))
DELETE FROM usuario WHERE Id_Usuario = codigo

/*Proceso alamacenado para Insertar usuario*/
CREATE PROCEDURE InsertarUs(IN codigo INT(1),IN nombre VARCHAR(45),IN PASSWORD VARCHAR(100),IN Categoria VARCHAR(45), IN email VARCHAR(45), IN Categoria_Us_Id_Categoria INT(1))
INSERT INTO usuario VALUES(codigo, nombre, PASSWORD, Categoria, email,Categoria_Us_Id_Categoria)



/*proceso almacenado para buscar usuario*/
CREATE PROCEDURE BuscarUsuario(IN codigo INT)
SELECT Id_Usuario, nombre, PASSWORD, Categoria, Email FROM usuario WHERE id_usuario = codigo

/*Proceso almacenado para listar a todos los usuarios con Cat Alumos*/
CREATE PROCEDURE ListarAlumnos()
SELECT * FROM usuario WHERE categoria = 'Alumno' 

/*Proceso almacenado para generar el correlativo(me da el mayor id registrado)*/
CREATE PROCEDURE GetCorrelativo()
SELECT MAX(Id_Usuario) FROM usuario

CREATE PROCEDURE `transaccion`(IN nom VARCHAR(45))
SELECT Id_Usuario FROM usuario WHERE nombre = nom

CALL GetIdXNom('Pepe')
/*Procedure para el login*/
CREATE PROCEDURE VerificarCredenciales(
IN p_nombre VARCHAR(255),
IN p_password VARCHAR(255)
)
 SELECT nombre, PASSWORD
 FROM usuario  
 WHERE nombre = p_nombre AND PASSWORD = p_password

SELECT * FROM usuario

CREATE PROCEDURE GetUsuarioXNom(IN nom VARCHAR(45))
SELECT * FROM usuario 
WHERE nombre = nom

CALL GetUsuarioXNom('Pepe')
 
/*Tabla Categoria*/ 
 SELECT * FROM categoria_us
/*Proceso almacenado para listar las categorias */
CREATE PROCEDURE ListarCat()
SELECT Id_Categoria, CONCAT(Nombre_Categoria) AS Nombres
FROM categoria_us

/*Tabla Libros*/
SELECT * FROM libro

/*Proceso almacenado para listar los libros */
CREATE PROCEDURE ListarLi()
SELECT Id_Libro, CONCAT(Titulo) AS Nombre_Libro
FROM libro

/*Proceso almacenado para actualizar Libros*/
CREATE PROCEDURE UpdateLibros(IN cod INT(1),IN titu VARCHAR(45),IN auto VARCHAR(45),IN gen VARCHAR(45), IN num_co INT(9), IN Gen_Id INT(1))
UPDATE libro SET Titulo = titu, Autor = auto, Genero = gen, Num_Copias = num_co, Generos_Id_Generos = Gen_Id WHERE Id_Libro = cod

/*proceso al macenado para listar libros*/
CREATE PROCEDURE ListarLibros()
SELECT Id_Libro, Titulo, Autor, Genero,Num_Copias
FROM libro

/*llamar el procedure*/
CALL ListarLibros()

/*Proceso alamacenado para Insertar Libros*/
CREATE PROCEDURE IngresarLibros(IN codigo INT(1),IN titulo VARCHAR(45),IN autor VARCHAR(45),IN genero VARCHAR(45), IN num_copias INT(9), IN genero_id_genero INT(1))
INSERT INTO libro VALUES(codigo, titulo, autor, genero, num_copias,genero_id_genero)

/*Proceso almacenado para eliminar Libros*/
CREATE PROCEDURE EliminarLibros(IN codigo INT(1))
DELETE FROM libro WHERE Id_Libro = codigo

/*proceso almacenado para buscar libros*/
CREATE PROCEDURE BuscarLibros(IN codigo INT)
SELECT Id_Libro, Titulo, Autor, Genero, Num_Copias FROM libro WHERE id_libro = codigo

CALL BuscarLibros(2)

/*proceso almacenado para stockporlibro*/
CREATE PROCEDURE NumLibrosxNom(IN nomLi VARCHAR(45))
SELECT Titulo, Num_Copias
FROM libro WHERE Titulo = nomLi

CALL NumLibros(3)
CALL NumLibrosxNom('Principito')
/*Proceso almacenado para generar el correlativo(me da el mayor id registrado)*/
CREATE PROCEDURE GetCorrelativoLi()
SELECT MAX(Id_Libro) FROM libro


CREATE PROCEDURE ListarAutor()
SELECT Id_libro, CONCAT(Autor) AS Autores
FROM libro

CALL ListarAutor()

CREATE PROCEDURE ListarNomLibro()
SELECT Id_libro, CONCAT(Titulo) AS Nombre_Libro
FROM libro

CALL ListarNomLibro()

CREATE PROCEDURE ListarCatLibro()
SELECT Id_libro, CONCAT(Genero) AS Cat_Libro
FROM libro

CALL ListarCatLibro()

SELECT * FROM libro 
/*Tabla Generos*/
SELECT * FROM generos

/*Proceso almacenado para listar los Generos*/
CREATE PROCEDURE ListarGen()
SELECT Id_Generos, CONCAT(Nombre_Gen) AS Generos
FROM generos

/*proceso al macenado para listar generos*/
CREATE PROCEDURE ListarGeneros()
SELECT Id_Generos, Nombre_Gen, Des_Gen
FROM generos

/*Proceso alamacenado para Insertar generos*/
CREATE PROCEDURE IngresarGeneros(IN codigo INT(1),IN nomGen VARCHAR(45),IN des VARCHAR(45))
INSERT INTO generos VALUES(codigo, nomGen, des)

/*Proceso almacenado para eliminar generos*/
CREATE PROCEDURE EliminarGeneros(IN codigo INT(1))
DELETE FROM generos WHERE Id_Generos = codigo

/*Proceso almacenado para actualizar generos*/
CREATE PROCEDURE UpdateGeneros(IN cod INT(1),IN nomGen VARCHAR(45),IN des VARCHAR(45))
UPDATE generos SET Nombre_Gen = nomGen, Des_Gen = des WHERE Id_Generos = cod

/*proceso almacenado para buscar genero*/
CREATE PROCEDURE BuscarGeneros(IN codigo INT)
SELECT Id_Generos, Nombre_Gen, Des_Gen FROM generos WHERE id_generos = codigo

/*Proceso almacenado para generar el correlativo(me da el mayor id registrado)*/
CREATE PROCEDURE GetCorrelativoGen()
SELECT MAX(Id_Generos) FROM generos

/*Tabla Transaccion*/
SELECT * FROM transaccion

/*proceso almacenado para generar el correlativo(me de vuelve el id mayor registrado)*/
CREATE PROCEDURE GetCorrelativoTrans()
SELECT MAX(Id_Transaccion) FROM transaccion

CREATE PROCEDURE GetlistarXPorMultas(IN multa DECIMAL,IN multa2 DECIMAL)
`transaccion`

CALL GetlistarXPorMultas(0,0)

CREATE PROCEDURE AddTransaccionReserva(IN cod INT(5), IN fechaDev VARCHAR(100), IN fechaRe VARCHAR(200), IN fechaPre VARCHAR(100), 
IN est VARCHAR(45), IN mult DECIMAL, IN idLibro INT(5), IN idUsu INT(5), IN idEst INT(5),IN NumCop INT(9))
INSERT INTO transaccion VALUES(cod,fechaDev,fechaRe,fechaPre,est,mult,idLibro,idUsu,idEst,NumCop)

CREATE PROCEDURE UPTransaccionReserva(IN cod INT(5), IN fechaDev VARCHAR(100), IN fechaRe VARCHAR(200), IN fechaPre VARCHAR(100), 
IN est VARCHAR(45), IN mult DECIMAL, IN idLibro INT(5), IN idUsu INT(5), IN idEst INT(5),IN NumCop INT(9))
UPDATE transaccion SET Fecha_Devolucion=fechaDev,Fecha_Reserva=fechaRe,Fecha_Prestamo=fechaPre,Estado=est,Multa=mult,
                        Libro_Id_Libro=idLibro,Usuario_Id_Usuario=idUsu,Estados_Id_estados=idEst,Num_Copias=NumCop WHERE Id_Transaccion = cod


SELECT * FROM estados
`transaccion``estados``transaccion``usuario``categoria_us``generos``transaccion`
INSERT INTO estados (Id_estados, Nombre_estados, Des_estados)
VALUES(3, 'Devuelto', 'ya disponible para ser prestado')

UPDATE estados SET Nombre_estados = 'Prestado', Des_estados = 'No disponible un alumno ya lo tiene' WHERE Id_estados = 2


/*proceso al macenado para listar Categoria*/
CREATE PROCEDURE ListarCategoria()
SELECT Id_Categoria, Nombre_Categoria, Des_Categoria
FROM categoria_us

	

/*Proceso alamacenado para Insertar Categoria*/
CREATE PROCEDURE IngresarCategoria(IN codigo INT(1),IN nomGen VARCHAR(45),IN des VARCHAR(45))
INSERT INTO categoria_us VALUES(codigo, nomGen, des)

/*Proceso almacenado para eliminar Categoria*/
CREATE PROCEDURE EliminarCategoria(IN codigo INT(1))
DELETE FROM categoria_us WHERE Id_Categoria = codigo

/*Proceso almacenado para actualizar Categoria*/
CREATE PROCEDURE UpdateCategoria(IN cod INT(1),IN nomGen VARCHAR(45),IN des VARCHAR(45))
UPDATE categoria_us SET Nombre_Categoria = nomGen, Des_Categoria = des WHERE Id_Categoria = cod

/*proceso almacenado para buscar Categoria*/
CREATE PROCEDURE BuscarCategoria(IN codigo INT)
SELECT Id_Categoria, Nombre_Categoria, Des_Categoria FROM categoria_us WHERE id_Categoria = codigo

/*Proceso almacenado para generar el correlativo(me da el mayor id registrado)*/
CREATE PROCEDURE GetCorrelativoCat()
SELECT MAX(Id_Categoria) FROM categoria_us

/*proceso al macenado para listar estados*/
CREATE PROCEDURE ListarEstados()
SELECT Id_estados, Nombre_estados, Des_estados
FROM estados

/*Proceso alamacenado para Insertar gestadosos*/
CREATE PROCEDURE IngresarEstados(IN codigo INT(1),IN nomEstado VARCHAR(45),IN des VARCHAR(45))
INSERT INTO estados VALUES(codigo, nomGen, des)

/*Proceso almacenado para eliminar estadosos*/
CREATE PROCEDURE EliminarEstados(IN codigo INT(1))
DELETE FROM estados WHERE Id_estados = codigo

/*Proceso almacenado para actualizar generos*/
CREATE PROCEDURE UpdateEstados(IN cod INT(1),IN nomGen VARCHAR(45),IN des VARCHAR(45))
UPDATE estados SET Nombre_estados = nomEstado, Des_estados = des WHERE Id_estados = cod

/*proceso almacenado para buscar genero*/
CREATE PROCEDURE BuscarEstados(IN codigo INT)
SELECT Id_estados, Nombre_estados, Des_estados FROM estados WHERE id_estados = codigo

/*Proceso almacenado para generar el correlativo(me da el mayor id registrado)*/
CREATE PROCEDURE GetCorrelativoEstados()
SELECT MAX(Id_estados) FROM estados

CALL GetCorrelativoEstados


CREATE PROCEDURE ObtenerFechaTransaccion(IN nombre_alu VARCHAR(45))
DECLARE Id_alu INT
DECLARE fecha VARCHAR
SELECT Id_Usuario INTO Id_alu FROM usuario WHERE nombre = nombre_alu
SELECT Fecha_Prestamo INTO fecha FROM transaccion WHERE  Usuario_Id_Usuario = Id_alu
SELECT Fecha_Prestamo AS Fecha_Transaccion

DELIMITER //

CREATE PROCEDURE ObtenerFechaTransaccion(IN nombre_usuario VARCHAR(100))
BEGIN
  DECLARE id_usuario INT
  DECLARE fecha_transaccion VARCHAR

  /*Obtener el ID del usuario basado en el nombre*/
  SELECT Id_Usuario INTO id_usuario FROM usuario WHERE nombre = nombre_usuario

  /*Obtener la fecha de transacción para el usuario*/
  SELECT Fecha_Prestamo INTO fecha_transaccion FROM transaccion WHERE Usuario_Id_Usuario = id_usuario

  /*Devolver la fecha de transacción como resultado*/
  SELECT fecha_transaccion AS Fecha_Transaccion
END 

CALL ObtenerFechaTransaccion('daniel')

CALL ObtenerFechaTransaccion('mafer')

CREATE PROCEDURE ObtenerFechaTransaccion(IN nombre_usuario VARCHAR(100))
 SELECT Fecha_Prestamo FROM transaccion WHERE nombre = nombre_usuario
 
CREATE PROCEDURE ListarPorFecha(IN fecha_dev VARCHAR(200))
SELECT * FROM  transaccion WHERE  Fecha_Devolucion = fecha_dev


	

