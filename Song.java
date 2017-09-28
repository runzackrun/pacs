
public class Song
{

private String myTitle;
private String myArtist;
private double myCost ;

public Song()
{
myTitle = new String ( " Welcome to the Black Parade " );
myArtist = new String ( " My Chemical Romance " );
myCost = 4.20;
}


public Song(String title, String artist, double cost)
{

myTitle = title;
myArtist = artist ;
myCost = cost;
}

public String toString()
{
String output = " The Artist is: " + myArtist + " \n" +
" The cost is: " + myCost;

return output ;
}
}

