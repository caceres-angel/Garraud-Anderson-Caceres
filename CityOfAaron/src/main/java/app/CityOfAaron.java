package app;

import model.Game;

import view.StartProgramView;
import view.View;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CityOfAaron {

    public static Game currentGame = null;
    public static PrintWriter outFile =  null;
    public static BufferedReader  inFile =  null;
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CityOfAaron.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CityOfAaron.inFile = inFile;
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CityOfAaron.currentGame = currentGame;
    }

    /**
     * The starting point for our application.
     *
     * @param args Any parameters passed on the command line will be contained
     * in this array.
     */
    public static void main(String[] args) {
        
        try {
            
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile  = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");
            
            View startProgramView = new StartProgramView();
            startProgramView.displayView();
            
        } catch (Throwable err) {
            System.out.println(err.getMessage());
            err.printStackTrace(); // this prints out the calling chain
        } finally {
            try {
                if(CityOfAaron.inFile!=null){
                    CityOfAaron.inFile.close();                
                }
                if(CityOfAaron.outFile!=null){
                    CityOfAaron.outFile.close();                
                }
                if(CityOfAaron.logFile!=null){
                    CityOfAaron.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Your file is not closing.");
            }
            CityOfAaron.outFile.close();
        }
    }
    
}
