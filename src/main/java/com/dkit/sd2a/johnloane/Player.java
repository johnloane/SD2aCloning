package com.dkit.sd2a.johnloane;

public class Player
{
    private int hitPoints;
    private int score;
    private String userName;

    public Player(int hitPoints, int score, String userName)
    {
        this.hitPoints = hitPoints;
        this.score = score;
        this.userName = userName;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public int getScore()
    {
        return score;
    }

    public String getUserName()
    {
        return userName;
    }

    @Override
    public String toString()
    {
        return "Player{" +
                "hitPoints=" + hitPoints +
                ", score=" + score +
                ", userName='" + userName + '\'' +
                '}';
    }
}
