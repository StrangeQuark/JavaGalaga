package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;


public class Main extends Application
{
    private Pane root = new Pane();
    Sprite[] enemyArray = new Sprite[40];
    private Sprite player;
    private Sprite menu;
    private Sprite gameOver;
    private double time = 0;
    private double timeCounter = 0;
    private double timeCounter2 = 0;
    private int enemyCount;
    private int lifeCount;
    private int score;
    private double timeCount;
    private boolean mainMenuBool = true;
    private boolean gameOverBool = false;
    private AnimationTimer timer;
    private AnimationTimer t;
    private AnimationTimer at;
    private AnimationTimer animTime;
    private AudioClip introPlayer = new AudioClip(new Media(new File("src/sample/resources/galagatheme.wav").toURI().toString()).getSource());
    private AudioClip playerShootPlayer = new AudioClip(new Media(new File("src/sample/resources/galagaplayerbulletsound.wav").toURI().toString()).getSource());
    private AudioClip enemyOneDeathPlayer = new AudioClip(new Media(new File("src/sample/resources/galagaenemy1death.wav").toURI().toString()).getSource());
    private AudioClip enemyTwoDeathPlayer = new AudioClip(new Media(new File("src/sample/resources/galagaenemy2death.wav").toURI().toString()).getSource());

    private Parent createContent()
    {
        animTime = new AnimationTimer()
        {
            @Override
            public void handle(long l)
            {
                timeCounter2 += 0.016;
                if(timeCounter2 > 10.0)
                {
                    player.canShoot = true;
                    enemysCanShoot(true);
                    timeCounter2 = 0;
                    animTime.stop();
                }

                if(enemyArray[0].getTranslateX() < 324)
                    enemyArray[0].moveRight(1);
                if(enemyArray[1].getTranslateX() < 270)
                    enemyArray[1].moveRight(1);
                if(enemyArray[2].getTranslateX() < 216)
                    enemyArray[2].moveRight(1);
                if(enemyArray[3].getTranslateX() < 162)
                    enemyArray[3].moveRight(1);
                if(enemyArray[4].getTranslateX() < 108)
                    enemyArray[4].moveRight(1);

                if(enemyArray[5].getTranslateX() > 378)
                    enemyArray[5].moveLeft(1);
                if(enemyArray[6].getTranslateX() > 432)
                    enemyArray[6].moveLeft(1);
                if(enemyArray[7].getTranslateX() > 486)
                    enemyArray[7].moveLeft(1);
                if(enemyArray[8].getTranslateX() > 540)
                    enemyArray[8].moveLeft(1);
                if(enemyArray[9].getTranslateX() > 594)
                    enemyArray[9].moveLeft(1);

                if(enemyArray[10].getTranslateX() < 324)
                    enemyArray[10].moveRight(1);
                if(enemyArray[11].getTranslateX() < 270)
                    enemyArray[11].moveRight(1);
                if(enemyArray[12].getTranslateX() < 216)
                    enemyArray[12].moveRight(1);
                if(enemyArray[13].getTranslateX() < 162)
                    enemyArray[13].moveRight(1);
                if(enemyArray[14].getTranslateX() < 108)
                    enemyArray[14].moveRight(1);

                if(enemyArray[15].getTranslateX() > 378)
                    enemyArray[15].moveLeft(1);
                if(enemyArray[16].getTranslateX() > 432)
                    enemyArray[16].moveLeft(1);
                if(enemyArray[17].getTranslateX() > 486)
                    enemyArray[17].moveLeft(1);
                if(enemyArray[18].getTranslateX() > 540)
                    enemyArray[18].moveLeft(1);
                if(enemyArray[19].getTranslateX() > 594)
                    enemyArray[19].moveLeft(1);

                /////////////////////////////////////////

                if(enemyArray[20].getTranslateX() < 162)
                    enemyArray[20].moveNorthEast(1,1);
                if(enemyArray[21].getTranslateX() < 216)
                    enemyArray[21].moveNorthEast(1,1);
                if(enemyArray[22].getTranslateX() < 270)
                    enemyArray[22].moveNorthEast(1,1);
                if(enemyArray[23].getTranslateX() < 324)
                    enemyArray[23].moveNorthEast(1,1);

                if(enemyArray[24].getTranslateX() > 540)
                    enemyArray[24].moveNorthWest(1, 1);
                if(enemyArray[25].getTranslateX() > 486)
                    enemyArray[25].moveNorthWest(1, 1);
                if(enemyArray[26].getTranslateX() > 432)
                    enemyArray[26].moveNorthWest(1, 1);
                if(enemyArray[27].getTranslateX() > 378)
                    enemyArray[27].moveNorthWest(1, 1);

                if(enemyArray[28].getTranslateX() < 162)
                    enemyArray[28].moveNorthEast(1,1);
                if(enemyArray[29].getTranslateX() < 216)
                    enemyArray[29].moveNorthEast(1,1);
                if(enemyArray[30].getTranslateX() < 270)
                    enemyArray[30].moveNorthEast(1,1);
                if(enemyArray[31].getTranslateX() < 324)
                    enemyArray[31].moveNorthEast(1,1);

                if(enemyArray[32].getTranslateX() > 540)
                    enemyArray[32].moveNorthWest(1, 1);
                if(enemyArray[33].getTranslateX() > 486)
                    enemyArray[33].moveNorthWest(1, 1);
                if(enemyArray[34].getTranslateX() > 432)
                    enemyArray[34].moveNorthWest(1, 1);
                if(enemyArray[35].getTranslateX() > 378)
                    enemyArray[35].moveNorthWest(1, 1);

                /////////////////////////////////////////////

                if(enemyArray[36].getTranslateY() < 110)
                    enemyArray[36].moveDown(1);
                if(enemyArray[37].getTranslateY() < 110)
                    enemyArray[37].moveDown(1);
                if(enemyArray[38].getTranslateY() < 110)
                    enemyArray[38].moveDown(1);
                if(enemyArray[39].getTranslateY() < 110)
                    enemyArray[39].moveDown(1);
            }
        };

        root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

        root.setPrefSize(756, 972);

        menu = new Sprite( 40, 200, 690, 400, "menu", "resources/galagamenu.png");
        gameOver = new Sprite( 40, 200, 665, 400, "gameOver", "resources/galagagameover.png");

        root.getChildren().add(menu);

        timer = new AnimationTimer()
        {
            @Override
            public void handle(long l)
            {
                update();
            }
        };

        return root;
    }

    private void startGame()
    {
        score = 0;

        root.getChildren().remove(menu);

        player = new Sprite( 352, 860, 52, 54, "player", "resources/galagaplayership.png");

        root.getChildren().add(player);

        lifeCount = 3;

        timer.start();

        for(int i = 1; i <= lifeCount - 1; i++)
        {
            Sprite s = new Sprite((i-1) * 56, 918, 52, 54, "playerlife", "resources/galagaplayership.png");

            root.getChildren().add(s);
        }

        playIntro();
    }

    private void playIntro()
    {
        player.canShoot = false;

        introPlayer.play();
        timeCounter = 0;

        at = new AnimationTimer()
        {
            @Override
            public void handle(long l)
            {
                timeCounter += 0.016;
                if(timeCounter > 7.0)
                {
                    timeCounter = 0;
                    at.stop();
                    nextLevel();
                }
            }
        };
        at.start();
    }

    private void nextLevel()
    {
        enemyCount = 40;

        for (int i = 0; i < 5; i++)
        {
            enemyArray[i] = new Sprite(-36, 306, 36, 36, "enemy", "resources/galagaenemy1.png");
            root.getChildren().add(enemyArray[i]);
        }
        for (int i = 5; i < 10; i++)
        {
            enemyArray[i] = new Sprite(756, 306, 36, 36, "enemy", "resources/galagaenemy1.png");
            root.getChildren().add(enemyArray[i]);
        }
        for (int i = 10; i < 15; i++)
        {
            enemyArray[i] = new Sprite(-36, 262, 36, 36, "enemy", "resources/galagaenemy1.png");
            root.getChildren().add(enemyArray[i]);
        }
        for (int i = 15; i < 20; i++)
        {
            enemyArray[i] = new Sprite(756, 262, 36, 36, "enemy", "resources/galagaenemy1.png");
            root.getChildren().add(enemyArray[i]);
        }
        for (int i = 20; i < 24; i++)
        {
            enemyArray[i] = new Sprite(-36, 416 + ((i-20) * 54), 36, 36, "enemy", "resources/galagaenemy2.png");
            root.getChildren().add(enemyArray[i]);
        }
        for (int i = 24; i < 28; i++)
        {
            enemyArray[i] = new Sprite(738, 416 + ((i-24) * 54), 36, 36, "enemy", "resources/galagaenemy2.png");
            root.getChildren().add(enemyArray[i]);
        }
        for (int i = 28; i < 32; i++)
        {
            enemyArray[i] = new Sprite(-36, 372 + ((i-28) * 54), 36, 36, "enemy", "resources/galagaenemy2.png");
            root.getChildren().add(enemyArray[i]);
        }
        for (int i = 32; i < 36; i++)
        {
            enemyArray[i] = new Sprite(738, 372 + ((i-32) * 54), 36, 36, "enemy", "resources/galagaenemy2.png");
            root.getChildren().add(enemyArray[i]);
        }
        for(int i = 36; i < 40; i++)
        {
            enemyArray[i] = new Sprite(182 + 62 * (i - 35), -50, 50, 50, "enemy", "resources/galagaenemy3.png");
            root.getChildren().add(enemyArray[i]);
        }

        enemysCanShoot(false);

        animTime.start();
    }

    private List<Sprite> sprites()
    {
        return root.getChildren().stream().map(n -> (Sprite) n).collect(Collectors.toList());
    }

    private void update()
    {
        time += 0.016;

        sprites().forEach(s ->
        {
            switch(s.type)
            {
                case "enemybullet":
                    s.moveDown(4);
                    if(s.getBoundsInParent().intersects(player.getBoundsInParent()))
                    {
                        s.dead = true;
                        if(lifeCount == 1)
                        {
                            player.dead = true;
                            gameOverBool = true;
                            player.canShoot = false;
                            root.getChildren().add(gameOver);
                        }
                        lifeCount--;

                        updatePlayerLives();
                    }
                    if(s.getTranslateY() > 1000)
                        s.dead = true;
                    break;

                case "playerbullet":
                    s.moveUp(4);
                    sprites().stream().filter(e -> e.type.equals("enemy")).forEach(enemy ->
                    {
                        if(s.getBoundsInParent().intersects(enemy.getBoundsInParent()))
                        {
                            switch (enemy.enemyType)
                            {
                                case 1:
                                    enemyOneDeathPlayer.play();
                                    break;
                                case 2:
                                    enemyTwoDeathPlayer.play();
                                    break;
                                case 3:
                                    break;

                            }
                            enemy.dead = true;
                            s.dead = true;
                            enemyCount--;
                            score += 500;
                            System.out.println(score);
                            if(score == 20000 || (score >= 70000 && score % 70000 == 0))
                            {
                                lifeCount++;
                                updatePlayerLives();
                            }
                        }
                        if(enemyCount == 0)
                        {
                            enemyCount = 40;
                            player.canShoot = false;
                            timeCount = 0;
                            t = new AnimationTimer() {
                                @Override
                                public void handle(long l) {
                                    timeCount += 0.016;
                                    if(timeCount > 8.0)
                                    {
                                        t.stop();
                                        nextLevel();
                                    }
                                }
                            };
                            t.start();
                        }
                        if(s.getTranslateY() < 0)
                            s.dead = true;
                    });
                    break;

                case "enemy":
                    if(time > 2)
                    {
                        if(Math.random() < 0.05 && s.canShoot)
                            shoot(s);
                    }
                    break;

                case "player":
                    sprites().stream().filter(e -> e.type.equals("enemy")).forEach(enemy ->
                    {
                        if(s.getBoundsInParent().intersects(enemy.getBoundsInParent()))
                        {
                            enemy.dead = true;
                            player.dead = true;
                            s.dead = true;
                        }
                    });
                    if(s.movingRight == true && s.getTranslateX() < 684)
                    {
                        s.moveRight(2);
                    }
                    if(s.movingLeft == true && s.getTranslateX() > 20)
                    {
                        s.moveLeft(2);
                    }
                    break;
            }
        });

        if(time > 2)
            time = 0;

        root.getChildren().removeIf(n -> {
            Sprite s = (Sprite) n;
            return s.dead;
        });
    }

    private void updatePlayerLives()
    {
        sprites().stream().filter(e -> e.type.equals("playerlife")).forEach(playerlife ->
        {
            root.getChildren().remove(playerlife);
        });

        for(int i = 1; i <= lifeCount - 1; i++)
        {
            Sprite t = new Sprite((i-1) * 56, 918, 52, 54, "playerlife", "resources/galagaplayership.png");

            root.getChildren().add(t);
        }
    }

    private void shoot(Sprite shooter)
    {
        Sprite bullet;
        if(shooter.type == "player")
        {
            bullet = new Sprite((int) shooter.getTranslateX() + (int) shooter.getWidth() / 2 - 5, (int) shooter.getTranslateY(), 10, 34, shooter.type + "bullet", "resources/galagaplayerbullet.png");
            playerShootPlayer.play();
        }
        else
            bullet = new Sprite((int) shooter.getTranslateX() + (int) shooter.getWidth()/2 - 5, (int) shooter.getTranslateY(), 10, 34, shooter.type + "bullet", "resources/galagaenemybullet.png");

        root.getChildren().add(bullet);
    }

    private void enemysCanShoot(boolean b)
    {
        for(int i = 0; i < 40; i++)
            enemyArray[i].canShoot = b;
    }

    private static class Sprite extends Rectangle
    {
        boolean dead = false;
        boolean canShoot = true;
        boolean movingRight = false;
        boolean movingLeft = false;
        boolean movingUp = false;
        boolean movingDown = false;
        boolean movingNorthWest = false;
        boolean movingNorthEast = false;
        boolean movingSouthWest = false;
        boolean movingSouthEast = false;
        int enemyType = 0;
        final String type;

        Sprite(int x, int y, int w, int h, String type, String imageLocation)
        {
            super(w, h, Color.BLACK);
            Image image = new Image(getClass().getResource(imageLocation).toExternalForm());
            this.setFill(new ImagePattern(image));

            this.type = type;
            setTranslateX(x);
            setTranslateY(y);
        }

        void moveLeft(int x) { setTranslateX(getTranslateX() - x); }

        void moveRight(int x)
        {
            setTranslateX(getTranslateX() + x);
        }

        void moveUp(int y)
        {
            setTranslateY(getTranslateY() - y);
        }

        void moveDown(int y)
        {
            setTranslateY(getTranslateY() + y);
        }

        void moveNorthWest(int x, int y){ setTranslateX(getTranslateX() - x); setTranslateY(getTranslateY() - y);}

        void moveNorthEast(int x, int y){ setTranslateX(getTranslateX() + x); setTranslateY(getTranslateY() - y);}

        void moveSouthWest(int x, int y){ setTranslateX(getTranslateX() - x); setTranslateY(getTranslateY() + y);}

        void moveSouthEast(int x, int y){ setTranslateX(getTranslateX() + x); setTranslateY(getTranslateY() + y);}
    }

    private void restartGame()
    {
        gameOverBool = false;
        root.getChildren().removeAll(sprites());
        timer.stop();
        mainMenuBool = true;
        root.getChildren().remove(gameOver);
        root.getChildren().add(menu);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Scene scene = new Scene(createContent());
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Galaga");

        scene.setOnKeyPressed(e ->
        {
            switch(e.getCode())
            {
                case A:
                    player.movingLeft = true;
                    break;
                case D:
                    player.movingRight = true;
                    break;
                case SPACE:
                    if(player.canShoot)
                        shoot(player);
                    break;
                case ENTER:
                    if(mainMenuBool)
                    {
                        startGame();
                        mainMenuBool = false;
                    }
                    if(gameOverBool)
                    {
                        restartGame();
                    }
                    break;
            }
        });

        scene.setOnKeyReleased(e ->
        {
            switch (e.getCode())
            {
                case A:
                    player.movingLeft = false;
                    break;
                case D:
                    player.movingRight = false;
                    break;
            }
        });

        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
