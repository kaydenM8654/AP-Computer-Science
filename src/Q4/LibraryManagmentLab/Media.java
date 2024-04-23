package Q4.LibraryManagmentLab;

public class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    public Media(String mytitle, String myisbn){
        title = mytitle;
        isbn = myisbn;
        isCheckedOut = false;
    }

    public String getTitle(){ return title; }
    public String getIsbn() { return isbn; }
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
