package in.studytrack.studytrack;

public class Study {
    private String name;
    private int numOfSongs;
    private int thumbnail;

    public Study() {
    }

    public Study(String name,  int thumbnail) {
        this.name = name;

        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
