public class dinimum {
    String name;
    int ReleaseDate;
    String Auth;

    public dinimum(String name,int ReleaseDate, String Auth){
        this.name = name;
        this.ReleaseDate = ReleaseDate;
        this.Auth = Auth;
    }
    public void dinimumhetkeivalue (){
        System.out.println("name: " + name + " ReleaseDate: " + ReleaseDate + " Author: " + Auth);
    }

}
