package speedymatch.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import speedymatch.entities.Member;
import speedymatch.entities.MemberSecurity;
import speedymatch.entities.Movie;

public class MovieDAO {
	
	private static DBController db = new DBController();
	
	
	public static ArrayList<Movie> retrieveMovies() {
		Connection currentCon = db.getConnection();
		ArrayList<Movie>movies = new ArrayList<Movie>();
		Movie m = null;
		ResultSet rs = null;

		try {
			String query = "select * from Movies";
			PreparedStatement pstmt = currentCon.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String movieId = rs.getString("movieId");
				String movieUrl = rs.getString("movieUrl");
				m = new Movie(movieId,movieUrl);
				movies.add(m);
			}


		} catch (Exception ex) {
			ex.printStackTrace();
			m = null;
		} finally {

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return movies;
	}
	
	public static void main(String args[]){
		
		ArrayList<Movie> movies = MovieDAO.retrieveMovies();
		
		for(int i=0; i < movies.size(); i++){
			System.out.println(movies.get(i).getMovieId()+movies.get(i).getMovieUrl());
		}
	}

}
