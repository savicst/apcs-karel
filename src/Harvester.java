import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class Harvester implements Directions {

    public static void main (String[] args)
    {
        World.readWorld("worlds/fig3-2.kwld");
        World.setVisible(true);
        World.setDelay(20);
        //World.showSpeedControl(true);

        int row = 2;
        int col = 2;
        UrRobot bot = new UrRobot(row, col,
                East, 1);

        //1st row
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        //2nd row
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        //3rd row
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        //4th row
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        //5th row
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        //6th row
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
        bot.move();
        bot.pickBeeper();
    }
}
