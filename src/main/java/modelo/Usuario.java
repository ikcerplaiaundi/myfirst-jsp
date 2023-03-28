package modelo;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Usuario {
private int id;
private String nombre;
private String dni;
private String codigo;

public String pattern = "yyyy-MM-dd";
public SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
public Date birthdate;

public Date getBirthdate() {
	return  birthdate;
}
public String getStringBirthDate() {
	return simpleDateFormat.format(this.birthdate);
}

public String getStringBirthDate(String patern) {
	this.setPattern(patern);
	return simpleDateFormat.format(this.birthdate);
}

public void setBirthdate(Date birthdatedate) {
	this.birthdate = birthdatedate;
}

public void setBirthdate(String birthdatedate) {
	try {
		this.birthdate = (Date) simpleDateFormat.parse(birthdatedate);
	} catch (ParseException e) {
		e.printStackTrace();
	}
}

public String getPattern() {
	return pattern;
	
}

public void setPattern(String pattern) {
	this.pattern = pattern;
	String auxdate = getStringBirthDate();
	this.simpleDateFormat=new SimpleDateFormat(pattern);
	this.setBirthdate(auxdate);
}


public SimpleDateFormat getSimpleDateFormat() {
	return simpleDateFormat;
}

public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
	this.simpleDateFormat = simpleDateFormat;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
@Override
public String toString() {
	return "Usuario [id=" + id + ", nombre=" + nombre + ", dni=" + dni + ", codigo=" + codigo + "]";
}



}
