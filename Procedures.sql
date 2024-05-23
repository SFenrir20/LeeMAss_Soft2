/*Proceso almacenado para lisrt usuarios*/
CREATE PROCEDURE ListarUsers()
SELECT idUser, DniUser, NomUser, ApeUser, TelefonoUser, TypeUser, email, Estado
FROM USER

CALL ListarUsers()

/*Proceso almacenado para actualizar usuario*/

CREATE PROCEDURE UpdateUser(IN IdUser INT(1),IN dni VARCHAR(8), IN nomb VARCHAR(45), 
			    IN ape VARCHAR(45),IN telefono VARCHAR(45),IN tipo VARCHAR(45), 
			    IN mail VARCHAR(45),IN Id_Tipo INT(1),IN stado TINYINT)
UPDATE USER SET DniUser = dni, NomUser = nomb, ApeUser = ape, TelefonoUser = telefono, TypeUser = tipo, Email= mail, Id_TypeUser = Id_Tipo WHERE idUSer = IdUser

/*Proceso almacenado para eliminar usuario*/
CREATE PROCEDURE DeleteUser(IN IdUser INT(1))
DELETE FROM USER WHERE idUser = IDUser 

CALL DeleteUser(1)
/*Proceso almacenado para insertar usuario*/
CREATE PROCEDURE InsertUser(IN IdUser INT(1),IN dni VARCHAR(8), IN nomb VARCHAR(45), 
			    IN ape VARCHAR(45),IN telefono VARCHAR(45),IN tipo VARCHAR(45), 
			    IN mail VARCHAR(45),IN Id_Tipo INT(1),IN stado TINYINT)
INSERT INTO USER VALUES (IdUser,dni, nomb, ape, telefono,tipo,mail,Id_Tipo,stado)
INSERT INTO USER VALUES (1,'70690057','Santiago','Salazar','993307302','123456','Administrador','sani.blass@leemass.pe',1,1)

/*Proceso almacenado para buscar usuario*/
CREATE PROCEDURE SearchUser(IN IdUser INT)
SELECT * FROM USER WHERE idUser = IdUser

/*Proceso almacenado para lisar todos los usuarios tipo admin */
CREATE PROCEDURE ListarAdmin()
SELECT * FROM USER WHERE typeUser = 'Administrador' 

CALL ListarAdmin()
/*Proceso almacenado para lisar todos los usuarios tipo vendedor */
CREATE PROCEDURE ListarVendedores()
SELECT * FROM USER WHERE TYPEUser = 'Vendedor' 


/*Proceso almacenado para listar un tipo de usuario*/

CREATE PROCEDURE LstarTypeUser()
SELECT idTypeUser, NomTypeUser, DesTypeUser
FROM TypeUser


/*Proceso almacenado para insertar tipo de usuario*/
CREATE PROCEDURE InsertTypeUser(IN IdTypeUser INT(1),IN nom VARCHAR(45), IN des VARCHAR(250))
INSERT INTO TypeUser VALUES (IdTypeUser, nom, des)

CREATE PROCEDURE DeleeTypeUser(IN IdType INT(1))
DELETE FROM TypeUser WHERE idTypeUser = IdType


CALL InsertTypeUser (1,'Administrador','El Administrador de una tienda de libros supervisa las operaciones diarias, gestiona el inventario, organiza libros, realiza pedidos y atiende a los clientes.')
CALL  LstarTypeUser()
CALL DeleeTypeUser(1)



/*Procedure pra login*/
CREATE PROCEDURE GetUser_Dni(IN dni VARCHAR(45))
SELECT * FROM USER
WHERE DniUser = dni


CALL GetUser_Dni('70690057')















