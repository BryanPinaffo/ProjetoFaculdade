import JogoDeTexto.Dominio.Player;

public class SavePoint
{
    private static Player savedPlayer;
    private static int levelProgress;

    public static Player getPlayer()
    {
        return savedPlayer;
    }

    public static void setPlayer(Player player)
    {
        savedPlayer = player;
    }

    public static int getLvelProgress()
    {
        return levelProgress;
    }

    public static void setLevelProgress(int progress)
    {
        levelProgress = progress;
    }
}