package Lab6_E1;

public class Episode {
    private int number;
    private String title;
    private String storySynopsis;

    public Episode(int number, String title, String storySynopsis){
        this.number = number;
        this.title = title;
        this.storySynopsis = storySynopsis;
    }
    public int getNumberName(){
        return number;
    }
    public String getTitleName(){
        return title;
    }
    public String getStorySynopsisName(){
        return storySynopsis;
    }
}
