package ex_25_enumration;

public enum ENV {
    dev("https://myapp.com"),
    qa("https://myapp.com"),
    my("https://myapp.com"),
    uat("https://myapp.com"),
    preqa("https://myapp.com");

    private String baseURL;

     ENV(String baseURL){
        this.baseURL=baseURL;
    }
    public String getbaseURL(){
        return  this.baseURL;
    }

}
