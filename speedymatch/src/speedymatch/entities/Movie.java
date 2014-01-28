package speedymatch.entities;

public class Movie {
	
	
	private String movieId;
	private String movieUrl;
	
	
	public Movie(String movieId, String movieUrl){
		
		super();
		this.movieId = movieId;
		this.movieUrl = movieUrl;
		
	}
	
	public String getMovieId(){
		return movieId;
	}
	
	public void setMovieId(String movieId){
		this.movieId = movieId;
	}
	
	public String getMovieUrl(){
		return movieUrl;
	}
	
	public void setMovieUrl(String movieUrl){
		this.movieUrl = movieUrl;
	}

}
