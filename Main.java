public class Main {
    public static void main(String[] args) {
        Team[] members = {
                new Human(2, 5, "Игорь"),
                new Human(1, 2, "Аркадий"),
                new Cat(3, 4, "Мурзик"),
                new Cat(1, 1, "Барсик"),
                new Robot(0, 10, 10),
                new Robot(4,7,12)
        };

        Obstacle[] obstacles = {
                new RunningTrack(1),
                new RunningTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (Team member : members) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Obstacle obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И у него получается!");
                } else {
                    winner = false;
                    System.out.println("И у него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}