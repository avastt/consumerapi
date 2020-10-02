package br.com.igor.consumerapi.response;

public class UsuarioResponse {

	private String login;
	private String url;
	private String followersUrl;
	private String followingUrl;
	private String reposUrl;
	private String email;
	private String name;
	private String location;
	private String bio;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFollowersUrl() {
		return followersUrl;
	}
	public void setFollowersUrl(String followersUrl) {
		this.followersUrl = followersUrl;
	}
	public String getFollowingUrl() {
		return followingUrl;
	}
	public void setFollowingUrl(String followingUrl) {
		this.followingUrl = followingUrl;
	}
	public String getReposUrl() {
		return reposUrl;
	}
	public void setReposUrl(String reposUrl) {
		this.reposUrl = reposUrl;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
}
