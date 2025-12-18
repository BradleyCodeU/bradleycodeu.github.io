def main():
    # fruit salad recipe

    print("How many people are you serving?")

    servingSize = input()
    # turn str into int   
    servingSize = int(servingSize)

    # banana
    banana = servingSize / 2

    # apple
    apple = servingSize * 0.75

    # pineapple
    pineapple = servingSize * 0.1

    # cherry
    cherry = servingSize * 2.5

    # watermelon
    watermelon = pineapple / 2

    # grapes
    grapes = cherry

    # convert to string  
    banana = str(banana)
    cherry = str(cherry)

    print("You will need " + banana + " bananas")
    print("You will need " + cherry + " cherries")