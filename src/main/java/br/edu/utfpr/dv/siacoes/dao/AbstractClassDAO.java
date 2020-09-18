package br.edu.utfpr.dv.siacoes.dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;

public abstract class AbstractClassDAO <T> {
	
	
	public abstract List<T> listAll(boolean on) throws SQLException;
	
	public abstract List<T> listAll() throws SQLException;
	
	public abstract T loadObject(ResultSet rs) throws SQLException;
	
	public abstract T fingById(int id) throws SQLException;
	
	public abstract int save(int id, T unity ) throws SQLException;
	
}
