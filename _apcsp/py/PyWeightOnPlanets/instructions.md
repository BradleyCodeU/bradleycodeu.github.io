# Weight On Planets
---

On Earth, gravity has a value of **9.81** N/Kg (Newtons per kilogram). Because the Moon has about one-sixth of the gravity that Earth does, you would weigh less standing on it. On the Moon, gravity has a value of 1.622 N/Kg.

This is a simple cross-multiplication conversion in which earthWeight / earthGravity = moonWeight / moonGravity. We can use the following formula to calculate your weight on the Moon:
```
moonWeight = earthWeight * moonGravity / earthGravity
```


Calculate and output the weight of the end-user on any *THREE* of the following:

| Celestial Body | Gravity (in N/Kg) |
|----|----|
| Moon | 1.622 |
| Mercury | 	3.7 |
| Venus | 	8.87 |
| Mars | 	3.711 |
| Jupiter | 	24.79 |
| Saturn | 	10.44 |
| Uranus | 	8.69 |
| Neptune | 	11.15 |

Create a function called poundsToKilograms(pounds) and a function called kilogramsToPounds(kilograms)

1 Pound (lb) is equal to 0.45359237 kilogram (kg). To convert pounds to kg, multiply the pound value by 0.45359237 or divide by 2.2046226218. For example, to find out how many kilograms there are in 50 pounds, multiply 50 by 0.45359237, that makes 22.6796 kg in 50 pounds.

1 Kilogram (kg) is equal to 2.2046226218 pounds (lbs). To convert kilograms to pounds, multiply the kilogram value by 2.2046226218. For example, to convert 2 kg to pounds, multiply 2 by 2.2046226218, that makes 4.4092452436 pounds in 2 kg.

When the button is pressed:
- Collect the user's weight in pounds
- Validate the number
- Convert pounds to kilograms using your poundsToKilograms function
- Calculate their weight on other planet
- Convert kilograms to pounds using your kilogramsToPounds function
- Create a popup that tells the user "Your weight on *whatever planet* is ___ lbs"

