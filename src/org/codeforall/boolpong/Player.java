package org.codeforall.boolpong;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private Picture ballPicture;

    public Player(){
        ballPicture = new Picture(0, 0, ""); //still need to pass the ball picture as argument
        ballPicture.draw();
    }
}
