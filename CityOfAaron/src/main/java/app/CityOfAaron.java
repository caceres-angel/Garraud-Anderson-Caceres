

package app;

import model.Game;

import view.StartProgramView;


/*import model.Tool;*/
public class CityOfAaron {
    
    public static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CityOfAaron.currentGame = currentGame;
    }
  
    

    /**
     * The starting point for our application.
     * @param args Any parameters passed on the command line will be contained
     * in this array.
     */
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayView();
        
    }
}
