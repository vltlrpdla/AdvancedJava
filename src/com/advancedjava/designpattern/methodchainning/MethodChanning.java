package com.advancedjava.designpattern.methodchainning;

class DBConnector {  
    private String host;
    private Integer port;
    private String user;
    private String password;

    public DBConnector host(String host){
        this.host = host;
        return this;
    }

    public DBConnector port(Integer port){
        this.port = port;
        return this;
    }

    public DBConnector user(String user){
        this.user = user;
        return this;
    }

    public DBConnector password(String password){
        this.password = password;
        return this;
    }

    public DBConnector connect(){
        System.out.println("host : " + this.host);
        System.out.println("port : " + this.port);
        System.out.println("user : " + this.user);
        System.out.println("password : " + this.password);
        return this;
    }
}


public class MethodChanning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBConnector dbconn = new DBConnector();
		
        dbconn.host("localhost").port(80).user("saltfactory").password("password").connect();


	}

}
