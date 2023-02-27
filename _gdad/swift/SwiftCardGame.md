---
layout: project
category: swift
title: Swift Card Game
---

Create a card game app with a single button that simulates a random 2-player game.

Choose either EASY or DIFFICULT:

- EASY = War
- DIFFICULT = Rock Paper Scissors

War demo:

![warCardGameDemo.gif](/gdad/swift/img/warCardGameDemo.gif)

Rock Paper Scissors demo:

![rpsCardGameDemo.gif](/gdad/swift/img/rpsCardGameDemo.gif)

## Directions

### Add Assets

- Download 10 different number cards or use these UNO-style cards: redNumberCards.zip Download redNumberCards.zip 
- <i>(If you are making a Rock Paper Scissors game)</i> Download images for rock, paper, and scissors
- One at a time, add the images to your Assets

### Set up the Main storyboard

- Add a Vertical Stack View. Set the distribution to Fill Equally.
- Add some Horizontal Stack Views (these will be rows)
- The top row contains 2 Image Views. Set the distribution to Fill Equally.
- <i>(If you are making a Rock Paper Scissors game)</i> Add a middle row that contains a label to display text messages like "Left player's PAPER wins"
- Add a middle row that contains 4 Labels. Set the distribution to Fill Equally.
    - Left
    - 0
    - Right
    - 0
- The bottom row contains a GO Button.

### Add code to the ViewController.swift file

Set up a split-screen view with Main.storyboard and ViewController.swift

Inside of the ViewController class, create some variables...

- Create an imageArray = ["red0card", "red1card", "red2card"] and include the names of all of the cards
- Create a variable for leftPoints = 0 and another for rightPoints
Create @IBOutlets for the storyboard's Labels and Image Views. While holding the Control key, drag from an Image View on your canvas to the code display in the editor. Do the same for the Labels that will display player scores. Create outlets for...

- leftPicDisplay
- rightPicDisplay
- leftScoreDisplay
- rightScoreDisplay
- <i>(If you are making a Rock Paper Scissors game)</i> textMessageDisplay
Create a buttonPressed action

![CreatingTheButtonPressedAction.gif](/gdad/swift/img/CreatingTheButtonPressedAction.gif)

While holding the Control key, drag from the button on your storyboard to the code editor.

Change the connection from Outlet to Action. Name it buttonPressed. Click Connect.

Inside of the buttonPressed function...

Create variables for leftNumber and rightNumber. Set them to be random numbers from 0 to 9.

let leftNumber = Int.random(in: 0...9)
Set the leftPicDisplay and the rightPicDisplay.
```
leftPicDisplay.image = UIImage(named: imageArray[leftNumber])
```
If the left number is greater than the right number, then add one to leftPoints
```
if(leftNumber > rightNumber){
    leftPoints = leftPoints + 1
}
```
<i>(If you are making a Rock Paper Scissors game)</i> You will need seven different if statements. If leftNumber == rightNumber then there is a tie. If leftNumber == 0 and rightNumber == 2 then left player's rock beats right player's scissors. NOTE: You will also update the textMessageDisplay.text inside of these if statements.

If the right number is greater than the left number, then add one to rightPoints.

Finally, update the score display labels for both players.
```
leftScoreDisplay.text = String(leftPoints)
 ```

Test your game and make sure that it runs properly.

When finished, record a short demo video and upload it to Canvas.