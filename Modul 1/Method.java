public class Method {
    private String username;
    private String password;
    private String nim;

    //setter------------------------------------

    public void setName(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setNIM(String nim){
        this.nim = nim;
    }
    //setter------------------------------------

    public String getName(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getNIM(){
        return nim;
    }
}
