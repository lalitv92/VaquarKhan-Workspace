package sample.data.jpa.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value ="jdbc")
public class ConnectionSettings {
	private String driver="com.mysql.jdbc.Driver";//TODO removed it
	private String url="jdbc:mysql://localhost:3306/test";//TODO removed it
	private String username="root";//TODO removed it
	private String password="admin";//TODO removed it
	
	public ConnectionSettings() {}
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
