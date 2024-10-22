package Exo25;

public class Sports {
    public void play() {
        System.out.println("Playing a sport...");
    }
}

class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football...");
    }
}

class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball...");
    }
}

class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby...");
    }
}

class TestSports {
    public static void main(String[] args) {
        Sports sport = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sport.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}