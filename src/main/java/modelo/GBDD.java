package modelo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
public class GBDD extends Conexion{
	public void eliminarUsusario(int id )  {

		String EliminarUsusario = "DELETE FROM usuarios WHERE id= ?";

		try {

			PreparedStatement stDeleteUsusario = super.cn.prepareStatement(EliminarUsusario);
			stDeleteUsusario.setInt(1, id);

			stDeleteUsusario.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void insertarUsusario(Usuario usuario) {

		String insertarUsusario = "INSERT INTO usuarios (nombre, dni, codigo) VALUES(?,?,?)";

		try {

			PreparedStatement PSUsuario = super.cn.prepareStatement(insertarUsusario);

			
			PSUsuario.setString(1, usuario.getNombre());
			PSUsuario.setString(2, usuario.getDni());
			PSUsuario.setString(3, usuario.getCodigo());
			
			PSUsuario.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public ArrayList<Usuario> mostrarArrayUsuario() {

		String selectUsuarios = "SELECT * FROM usuarios";

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		try {

			PreparedStatement mostrarUsuarios = super.cn.prepareStatement(selectUsuarios);
			ResultSet resultSet = mostrarUsuarios.executeQuery(selectUsuarios);

			while (resultSet.next()) {

				Usuario usuario = new Usuario();

				usuario.setId(resultSet.getInt("id"));
				usuario.setNombre(resultSet.getString("nombre"));
				usuario.setDni(resultSet.getString("dni"));
				usuario.setCodigo(resultSet.getString("codigo"));
				
				
			

				usuarios.add(usuario);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuarios;
	}
	public Usuario mostrarUsuario(int id) {

		String selectUsuarios = "SELECT * FROM usuarios WHERE id= ?";

		Usuario usuario = new Usuario();

		try {

			PreparedStatement mostrarUsuarios = super.cn.prepareStatement(selectUsuarios);
			mostrarUsuarios.setInt(1, id);
			ResultSet resultSet = mostrarUsuarios.executeQuery();
			resultSet.next();
			
				usuario.setId(resultSet.getInt("id"));
				usuario.setNombre(resultSet.getString("nombre"));
				usuario.setDni(resultSet.getString("dni"));
				usuario.setCodigo(resultSet.getString("codigo"));
				
				
				return usuario;	
				
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	public void modificarUsuario(Usuario usuario) {

		String modificarusuario = "UPDATE usuarios SET  nombre = ? , dni = ? , codigo = ? WHERE id= ?";
		
		try {

			PreparedStatement PST = super.cn.prepareStatement(modificarusuario);
			
			
			PST.setString(1, usuario.getNombre());
			PST.setString(2, usuario.getDni());
			PST.setString(3, usuario.getCodigo());
			PST.setInt(4, usuario.getId());
			
			PST.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
