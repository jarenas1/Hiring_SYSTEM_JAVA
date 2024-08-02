package riwi.filtro.persistence.connectiondb;

import java.sql.DriverManager;

public class ConnectionDB {

    public static java.sql.Connection connection = null;

    //ABRIR CONECCION CON LA DATABASE

    public static java.sql.Connection conectar(){
        //CREAMOS LAS VARIABLES NECESARIAS PARA LA CONECCION  "jdbc:mysql://host:port/nombre";

        String URL = "jdbc:mysql://bqzopksigbf7zurahdxn-mysql.services.clever-cloud.com:3306/bqzopksigbf7zurahdxn";
        String user = "uuozgvysd6q9hjd4";
        String password = "SF1JIz23wakFkkUf09s3";


        //NOS CONECTAMOS USANDO EL DIRVER MANAGER Y LA GUARDAMOS EN LA VARIABLE NULA
        try {
            connection = DriverManager.getConnection(URL,user,password);

        }catch (Exception e){
            System.out.println("No se pudo establecer la conexion con la db "+e.getMessage());
        }

        return connection;
    }

    //CERRAR CONECCION

    public static void cerrar(){

        if (connection != null){

            //INTENTAMOS CERRAR LA CONECCION
            try {
                connection.close();
            }catch (Exception e){
                System.out.println("La coneccion con la base de datos no se pudo cerrar "+e.getMessage());
            }
        }
    }
}
