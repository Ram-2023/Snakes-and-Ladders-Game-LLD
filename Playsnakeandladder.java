package snakesandladders;

import java.util.*;

public class Playsnakeandladder {
    public static void main(String args[]) {
        Dice dice = new Dice(1);
        Player p1 = new Player("Ram");
        Player p2 = new Player("Subba Rao");
        Player p3 = new Player("Sesha sai");
        Player p4 = new Player("Revanth");
        Queue<Player> nextPlayer = new LinkedList<>();
        nextPlayer.offer(p1);
        nextPlayer.offer(p2);
        nextPlayer.offer(p3);
        nextPlayer.offer(p4);
        Jumper j1 = new Jumper(20, 2);
        Jumper j2 = new Jumper(56, 7);
        Jumper j3 = new Jumper(99, 15);
        List<Jumper> snakes = new ArrayList<>();
        snakes.add(j1);
        snakes.add(j2);
        snakes.add(j3);
        Jumper l1 = new Jumper(5, 60);
        Jumper l2 = new Jumper(28, 74);
        Jumper l3 = new Jumper(44, 97);
        List<Jumper> ladders = new ArrayList<>();
        ladders.add(l1);
        ladders.add(l2);
        ladders.add(l3);
        Map<String, Integer> playerCurrentPosition = new HashMap<>();
        playerCurrentPosition.put("Ram", 0);
        playerCurrentPosition.put("Subba Rao", 0);
        playerCurrentPosition.put("Sesha sai", 0);
        playerCurrentPosition.put("Revanth", 0);
        DesignofGameBoard gb = new DesignofGameBoard(dice, nextPlayer, snakes, ladders, playerCurrentPosition, 100);
        gb.startGame();

    }
}

// OUTPUT//
"""Ram is at position 2

Subba Rao
is at position 4
Sesha sai
is at position 1
Revanth is
at position 1
Ram is
at position 7
Subba Rao
is at position 7
Sesha sai
is at position 4
Revanth is
at position 6
Ram is
at position 10
Subba Rao
is at position 12
Sesha sai
is at position 6
Revanth is
at position 11
Ram is
at position 15
Subba Rao
is at position 15
Sesha sai
is at position 8
Revanth is
at position 12
Ram Bitten
by a
snake present at 20
Ram is
at position 2
Subba Rao
Bitten by
a snake
present at 20
Subba Rao
is at position 2
Sesha sai
is at position 12
Revanth is
at position 14
Ram is
at position 7
Subba Rao
is at position 6
Sesha sai
is at position 14
Revanth is
at position 16
Ram is
at position 8
Subba Rao
is at position 11
Sesha sai
is at position 16
Revanth is
at position 17
Ram is
at position 11
Subba Rao
is at position 16
Sesha sai
Bitten by
a snake
present at 20
Sesha sai
is at position 2
Revanth is
at position 22
Ram is
at position 12
Subba Rao
is at position 21
Sesha sai
is at position 3
Revanth is
at position 23
Ram is
at position 14
Subba Rao
is at position 22
Sesha sai
is at position 7
Revanth is
at position 24
Ram is
at position 19
Subba Rao
is at position 26
Sesha sai
is at position 12
Revanth is
at position 29
Ram is
at position 22
Subba Rao
is at position 30
Sesha sai
is at position 14
Revanth is
at position 30
Ram is
at position 27
Subba Rao
is at position 31
Sesha sai
is at position 19
Revanth is
at position 33
Ram Got
ladder present at 28
Ram is
at position 74
Subba Rao
is at position 36
Sesha sai
is at position 22
Revanth is
at position 36
Ram is
at position 76
Subba Rao
is at position 38
Sesha sai
is at position 26
Revanth is
at position 40
Ram is
at position 79
Subba Rao
is at position 43
Sesha sai
is at position 30
Revanth Got
ladder present at 44
Revanth is
at position 97
Ram is
at position 81
Subba Rao
is at position 47
Sesha sai
is at position 32
Revanth Bitten
by a
snake present at 99
Revanth is
at position 15
Ram is
at position 86
Subba Rao
is at position 49
Sesha sai
is at position 33
Revanth is
at position 18
Ram is
at position 87
Subba Rao
is at position 50
Sesha sai
is at position 34
Revanth is
at position 19
Ram is
at position 88
Subba Rao
is at position 51
Sesha sai
is at position 36
Revanth is
at position 22
Ram is
at position 93
Subba Rao
is at position 53
Sesha sai
is at position 39
Revanth is
at position 24
Ram is
at position 97
Subba Rao
is at position 57
Sesha sai
is at position 40
Revanth is
at position 29
Ram is
at position 98
Subba Rao
is at position 60
Sesha sai
is at position 41
Revanth is
at position 33
Ram won
the game
Subba Rao
is at position 63
Sesha sai
is at position 46
Revanth is
at position 34
Subba Rao
is at position 67
Sesha sai
is at position 47
Revanth is
at position 35
Subba Rao
is at position 72
Sesha sai
is at position 52
Revanth is
at position 40
Subba Rao
is at position 73
Sesha sai
is at position 55
Revanth is
at position 41
Subba Rao
is at position 74
Sesha sai
is at position 59
Revanth is
at position 43
Subba Rao
is at position 75
Sesha sai
is at position 63
Revanth is
at position 48
Subba Rao
is at position 78
Sesha sai
is at position 68
Revanth is
at position 49
Subba Rao
is at position 80
Sesha sai
is at position 71
Revanth is
at position 51
Subba Rao
is at position 81
Sesha sai
is at position 73
Revanth is
at position 53
Subba Rao
is at position 82
Sesha sai
is at position 77
Revanth Bitten
by a
snake present at 56
Revanth is
at position 7
Subba Rao
is at position 84
Sesha sai
is at position 78
Revanth is
at position 8
Subba Rao
is at position 85
Sesha sai
is at position 81
Revanth is
at position 10
Subba Rao
is at position 86
Sesha sai
is at position 84
Revanth is
at position 12
Subba Rao
is at position 89
Sesha sai
is at position 85
Revanth is
at position 16
Subba Rao
is at position 93
Sesha sai
is at position 87
Revanth is
at position 21
Subba Rao
is at position 95
Sesha sai
is at position 91
Revanth is
at position 25
Subba Rao
is at position 98
Sesha sai
is at position 93
Revanth is
at position 30
Sesha sai
is at position 96
Revanth is
at position 31
Sesha sai
is at position 98
Revanth is
at position 36
Subba Rao
Bitten by
a snake
present at 99
Subba Rao
is at position 15
Revanth is
at position 37
Subba Rao
is at position 16
Revanth is
at position 41
Subba Rao
Bitten by
a snake
present at 20
Subba Rao
is at position 2
Revanth is
at position 46
Subba Rao
is at position 7
Revanth is
at position 47
Subba Rao
is at position 8
Sesha sai
won the
game Revanth
is at position 52
Subba Rao
is at position 11
Revanth is
at position 55
Subba Rao
is at position 14
Revanth is
at position 58
Subba Rao
is at position 15
Revanth is
at position 62
Subba Rao
is at position 18
Revanth is
at position 64
Subba Rao
is at position 21
Revanth is
at position 66
Subba Rao
is at position 23
Revanth is
at position 68
Subba Rao
is at position 26
Revanth is
at position 72
Subba Rao
Got ladder
present at 28
Subba Rao
is at position 74
Revanth is
at position 75
Subba Rao
is at position 78
Revanth is
at position 78
Subba Rao
is at position 83
Revanth is
at position 80
Subba Rao
is at position 85
Revanth is
at position 82
Subba Rao
is at position 89
Revanth is
at position 83
Subba Rao
is at position 93
Revanth is
at position 88
Subba Rao
is at position 97
Revanth is
at position 90
Subba Rao
is at position 98
Revanth is
at position 95
Subba Rao
won the game""
"