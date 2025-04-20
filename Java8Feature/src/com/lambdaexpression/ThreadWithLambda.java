package com.lambdaexpression;

import java.util.Random;

class RandomPlayer {
    public void playGame(String gameName) throws InterruptedException{
        System.out.println(gameName+" game started");
        Thread.sleep(500);
        System.out.println(gameName+" game ended");
    }
    public void playMusic(String trackName) throws InterruptedException{
        System.out.println(trackName+" track started");
        Thread.sleep(500);
        System.out.println(trackName+" track ended");
    }
}
public class ThreadWithLambda {
    static String[] games={"COD","Prince Of Persia","GTA-V5","Valorant","FIFA 22","Fortnite"};
    static String[] tracks={"Believer","Cradles","Taki Taki","Sorry","Let Me Love You"};

    public static void main(String[] args) {
        Runnable myThread=()->{
            Thread.currentThread().setName("NewThread");
            System.out.println(Thread.currentThread().getName());
        };
        Thread run=new Thread(myThread);
        run.start();


        Runnable basic=()->{
            String threadName=Thread.currentThread().getName();
            System.out.println("Running common task by "+threadName);
        };
        Thread thread1 = new Thread(basic);
        Thread thread2 = new Thread(basic);
        thread1.start();
        thread2.start();

        RandomPlayer player=new RandomPlayer();
        Random random=new Random();
        Runnable gameRunner=()->{
            try {
                player.playGame(games[random.nextInt(games.length)]);
            }
            catch (InterruptedException e) {
                e.getMessage();
            }
        };
        Runnable musicPlayer=()->{
            try {
                player.playMusic(tracks[random.nextInt(tracks.length)]);
            }
            catch (InterruptedException e) {
                e.getMessage();
            }
        };
        Thread game = new Thread(gameRunner);
        Thread music = new Thread(musicPlayer);
        game.start();
        music.start();
    }
}
