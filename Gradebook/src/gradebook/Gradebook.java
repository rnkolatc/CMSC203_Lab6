// The purpose of this class is to model a gradebook
//romaric Nkola, 2/24/2013

package gradebook;
import java.util.ArrayList;

public class Gradebook{
private double[] scores;
private int scoresSize;

public Gradebook(int capacity){
scores = new double[capacity];
scoresSize = 0;
}
//Task1
//---------------------------------------------------
public int getScoreSize(){
return this.scoresSize;
}
@Override
public String toString(){
String scoreString = "";
for(int i=0;i<scoresSize;i++){
scoreString += Double.toString(scores[i]) + " ";
}
return scoreString;
}
//---------------------------------------------------

public boolean addScore(double score){
if(scoresSize<scores.length){
scores[scoresSize] = score;
scoresSize++;
return true;
}
else
return false;
}
public double sum(){
double total = 0;
for(int i=0;i<scoresSize;i++){
total = total + scores[i];
}
return total;
}
public double minimum(){
if(scoresSize==0)
return 0;
double smallest = scores[0];
for(int i=1;i<scoresSize;i++){
if(scores[i]<smallest){
smallest = scores[i];
}
}
return smallest;
}

public double finalScore(){
if(scoresSize==0)
return 0;
else if(scoresSize==1)
return scores[0];
else
return sum()-minimum();
}
}
