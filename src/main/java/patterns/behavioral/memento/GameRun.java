package patterns.behavioral.memento;

public class GameRun {
    public static void main(String[] args) {
        Game game = new Game();
        game.create("1.0");
        System.out.println(game);

        DataBase dataBase = new DataBase();
        dataBase.setSave(game.save());

        game.create("2.0");
        System.out.println(game);

        System.out.println("downloading...");
        game.load(dataBase.getSave());
        System.out.println(game);
    }
}
