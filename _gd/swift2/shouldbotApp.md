---
layout: project
category: swift2
title: ShouldBot App
---

_Complete [Chapter13 QuestionBot]() and SoloLrn Swift Control Flow & Collections first._

Re-open your QuestionBot project. We are going to turn it into a decision making program named ShouldBot.

Prompt the user to "Enter a this or that question."

Collect the userInput and convert it to lowercase.

If the text "should i" appears in the userInput, replace it with "you should" with Swift's [replacingOccurrences(of:with:) string method](https://developer.apple.com/documentation/foundation/nsstring/1412937-replacingoccurrences). You may also need to replace additional text before you split the string into an array.

Separate the two (OR MORE) options in the userInput with Swift's [split() string method](https://developer.apple.com/documentation/swift/string/2894564-split) which returns an array:
```
let line = "BLANCHE:   I don't want realism. I want magic!"
print(line.split(separator: " "))
// Prints ["BLANCHE:", "I", "don\'t", "want", "realism.", "I", "want", "magic!"]
```

Randomly select an option. Use Swift's [randomElement() array method](https://developer.apple.com/documentation/swift/array/2994747-randomelement)

For example...

- The user asks "pizza or hamburgers" and the bot might randomly reply "pizza"
- The user asks "hot dog or salad or sushi" and the bot might randomly reply "salad"
- The user asks "pizza, burgers, hot dogs or subs" and the bot might randomly reply "burgers"
- The user asks "chocolate, vanilla, or strawberry?" and the bot might randomly reply "strawberry"

*** NOTICE: Your program MUST be able to correctly handle [oxford commas](https:/www.grammarly.com/blog/what-is-the-oxford-comma-and-why-do-people-care-so-much-about-it/) ***

If the user inputs "A, B, or C" then the program must NEVER reply " or C" or " ". Given that user input, you do NOT want array values:
```
["A","B"," ","C"]
```
You should only have:
```
["A","B","C"]
```
