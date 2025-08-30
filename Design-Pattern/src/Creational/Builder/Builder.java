package Creational.Builder;

public class Builder {
    public static void main(String []args){
        HttpRequest request = new HttpRequest.Builder("http://8080/getName")
                .setBody("Anil")
                .setMethod("GET")
                .build();
        System.out.println(request.toString());
    }
}
