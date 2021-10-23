# Plants-Vs-Zombies-Game
A GUI Game designed using Java in the advanced programming domain involving various concepts - OOPs, interface, error handling, multithreading, etc. The objective of the game is to defend the house from zombies using various plants as defence arsenal through different levels. If the zombies are able to reach the house, you fail the level and have to play the level again.

###############################################

Rules for the game play are mentioned below (play the game to know the rules in depth):
1) The game consists of different levels. In each level, there is a house with a lawn and
zombies have to cross the lawn to reach the house. Refer to the gameplay video link for
clearer understanding. The layout and background image of the game can be seen in the
video at 9:10 instant in the video.

2) The player has to put plants in the lawn to prevent the zombies from reaching the house.

3) Once the zombies reach a particular plant, they start eating it which decreases the plant’s
health. Note that the plants can still attack the zombie (based on the plant’s ability) while
it is being eaten.

4) The player has to collect sun tokens as in-game currency to buy plants. This currency
drops down on the lawn every 10 seconds (refer to the gameplay video link given above
for clarity on animation).

5) Every plant has a waiting time (t seconds). Once you buy the plant, you cannot purchase
the same plant before this waiting time (t) elapses. ‘t’ should be at least 5 seconds.

6) The house is defended by lawnmowers as a last resort in each row of the lawn. The
lawnmower activates and kills all the zombies in that row once they are able to cross the
lawn. The lawnmower can be used only once and is not under the player’s control. Once
the lawnmower is used, that row is defence-less if a zombie reaches the house.

7) The zombies differ in their defence and attack values. Some zombies have higher defence
(health) and attack points than others.

8) Each level has higher difficulty compared to the previous level. This can be achieved by
increasing the number of zombies and varying the defence and attack ability of the
zombies.

9) At the end of each level, a new plant is unlocked which can be used in subsequent levels.
10) The sun-tokens expire at the end of level. The tokens earned in a level cannot be taken
forward to the next level.

11) To save game progress, the game should store the following objects at the time of saving:
a) Level
b) Amount of sun tokens
c) Position and health of plants and lawnmowers
d) Position and health of zombies
When the user loads an existing game, it should restore the state of the game.

12) The game should allow saving and loading multiple states.
