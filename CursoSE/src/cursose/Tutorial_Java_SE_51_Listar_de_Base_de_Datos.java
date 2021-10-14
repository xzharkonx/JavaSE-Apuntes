
package cursose;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Tutorial_Java_SE_51_Listar_de_Base_de_Datos {

    public String solicitarValores(){
    System.out.println("Ingresa tu nombre: ");
    Scanner sc = new Scanner(System.in);
    String nombre = sc.next();
    return nombre;
}
    public void registrarBD(String nombre){
        final String JDBC_DRIVER = "org.postgresql.Driver";
        final String DB_URL = "jdbc:postgresql://localhost:5432/ejemplojava";
        final String USER = "estudiante";
        final String PASS = "zelda1234";
        
        try(Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS)){
            PreparedStatement st = conexion.prepareStatement("INSERT INTO persona(nombre) values (?)");
            st.setString(1, nombre);
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            System.out.println("El error es: "+e.getMessage());
        }
        
    }
      public List<PersonaDB> listar(){
        // Creamos una lista para ir almacenando los objetos.
        List<PersonaDB> lista = null;
        final String JDBC_DRIVER = "org.postgresql.Driver";
        final String DB_URL = "jdbc:postgresql://localhost:5432/ejemplojava";
        final String USER = "estudiante";
        final String PASS = "zelda1234";
        
        try(Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS)){
            // Traera una lista de esos objetos, es decir, un algo así como un
            // Array y en cada celda un objeto.
            PreparedStatement st = conexion.prepareStatement("SELECT * FROM persona");
            // Aplica para un solo dato igual.
            // PreparedStatement st = conexion.prepareStatement("SELECT * FROM persona WHERE id='3'");
            
            ResultSet rs = st.executeQuery();
            lista = new ArrayList();
            while(rs.next()){
                // Creamos un objeto
                PersonaDB per = new PersonaDB();
                // Extraemos los datos a ese objeto con su tipo
                per.setId(rs.getInt("id"));
                per.setNombre(rs.getString("nombre"));
                // Una ves llenado ese objeto lo agregamos a la lista.
                lista.add(per);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            System.out.println("El error es: "+e.getMessage());
        }
        return lista;
        
    }
    public static void main(String[] args) {
        Tutorial_Java_SE_51_Listar_de_Base_de_Datos curso = new Tutorial_Java_SE_51_Listar_de_Base_de_Datos();
           String nombre = curso.solicitarValores();
           if(nombre != null){
               curso.registrarBD(nombre);
           }
           System.out.println("");  
           System.out.println("----------------------------");
           System.out.println("id|nombre");
           System.out.println("----------------------------");
           // Se ejecutará el metodo listar() que nos devolvera una lista de
           // objetos que podemos recorrer.
           for(PersonaDB per : curso.listar()){
                   System.out.println("|"+per.getId()+"|"+per.getNombre()+"|");
           }
           System.out.println("----------------------------");

    }
    
}
