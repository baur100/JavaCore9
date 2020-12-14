package HomeWork9;

public class Table {
    private String style;
    private String color;
    private String finish;

    public Table(String style, String color, String finish){
        this.style = style;
        this.color = color;
        this.finish = finish;
    }
    public Table (){}

    public Table (String style)
    {
        this.style = style;
    }
    public void setColor(String style){
    this.style = style;
}
    public String getColor(){
            return this.color;
    }
    public void setStyle (String style){
    this.style = style;}
    public String getStyle(){
        return this.style;
    }

    public void setFinish(String finish){
        this.finish = finish;
    }
    public String getFinish (){
        return this.finish;
    }
}