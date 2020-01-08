package com.pe.oltursa.demo.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pe.oltursa.demo.domain.Persona;


@Repository
public class PersonaRepositoryImpl implements PersonaRepository {

	private JdbcTemplate jdbcTemplate;

	public PersonaRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Persona> listar() {
		final String sql="select CPERSONA,NOMBRE,PATERNO,MATERNO,ACTIVO from persona";
		List<Persona> lista=new ArrayList<>();
		try(Connection con=jdbcTemplate.getDataSource().getConnection();
			CallableStatement cs=con.prepareCall(sql)){
			
			ResultSet rs=cs.executeQuery();
			Persona persona=null;
			while (rs.next()) {
				persona=new Persona();
				persona.setPaterno(rs.getString("PATERNO"));
				persona.setNombre(rs.getString("NOMBRE"));
				persona.setMaterno(rs.getString("MATERNO"));
				persona.setCpersona(rs.getInt("CPERSONA"));
				persona.setActivo(rs.getBoolean("ACTIVO"));
				lista.add(persona);
			}
			
			return lista;
			
		}
		catch(Exception e) {
			
			return lista;
		}
	}

	@Override
	public void guardar(Persona persona) {
		final String sql="insert into persona(NOMBRE,PATERNO,MATERNO) values(?,?,?)";
		try(Connection con=jdbcTemplate.getDataSource().getConnection();
			CallableStatement cs=con.prepareCall(sql)){
			cs.setString(1, persona.getNombre());
			cs.setString(2, persona.getPaterno());
			cs.setString(3, persona.getMaterno());
			cs.execute();
		}
		catch(Exception e) {
			
		}		
	}
	
}
