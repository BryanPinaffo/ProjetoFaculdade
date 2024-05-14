import JogoDeTexto.Dominio.Player;

public class Save
{
    private Player savedPlayer;
    private int levelProgress;

    public Player getPlayer()
    {
        return savedPlayer;
    }

    public void setPlayer(Player player)
    {
        savedPlayer = player;
    }

    public int getLvelProgress()
    {
        return levelProgress;
    }

    public void setLevelProgress(int progress)
    {
        levelProgress = progress;
    }
}