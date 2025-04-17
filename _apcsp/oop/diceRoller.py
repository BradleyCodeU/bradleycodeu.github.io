import random

def rollSixSidedDie():
    return random.randint(1,6)

def rollTwelveSidedDie():
    return random.randint(1,12)

# Ask the user how many dice they want to roll
num_dice = int(input("How many dice would you like to roll each time? "))

# Make sure it's a positive number
if num_dice <= 0:
    print("Please enter a positive number of dice.")
else:
    rolls = []
    
    # Create a dictionary to keep track of totals (like 2, 3, 4... up to 6 * num_dice)
    totals_count = {}
    for total in range(num_dice * 12 + 1):
        totals_count[total] = 0

    print("\nRolling "+ str(num_dice)+" dice 1000 times...")
    
    for i in range(1000):
        total = 0
        for j in range(num_dice):
            total = total + rollSixSidedDie()

        totals_count[total] += 1  # Count how many times this total happened
        
        print("Roll "+str(i+1)+": "+str(total))

    print("\nTotal sums across all rolls:")
    for total in range(num_dice * 12 + 1):
        print(str(total)+": "+str(totals_count[total])+" times")
    
    # Calculate average total
    # total_sum = 0
    # for total, count in totals_count.items():
    #     total_sum += total * count
    # average = total_sum / 100

    # print(f"\nAverage total: {average:.2f}")
