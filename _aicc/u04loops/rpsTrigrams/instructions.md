---
layout: project
category: u04loops
title: RPS Trigrams
---

Add pattern recognition to your Rock Paper Scissors bot. In this version, your bot will be able to learn. When finished, you will use the browser console to show that the botMemory is growing and that new trigrams are being added.

## Trigram Chart

REMEMBER: When finished, you will record a demo video showing Mr Riley both your chart AND your Rock Paper Scissors project.

### What is a trigram?

A trigram is a sequence of 3. It could be 3 words, 3 letters, 3 tic-tac-toe moves, 3 music notes, etc.

Trigram frequencies are the basis for n-gram language models, used in speech recognition, autocomplete, and spelling correction.

Wikipedia entry for trigrams: [https://en.wikipedia.org/wiki/Trigram](https://en.wikipedia.org/wiki/Trigram)

We will use letters as a example of how trigrams could be used. Let's analyze some text and look for letter patterns. 

`"the_quick_red_fox"`

That String contains the following 3-letter patterns, or trigrams:
```
the
he_
e_q
_qu
qui
uic
ick
ck_
k_r
_re
red
ed_
d_f
_fo
fox
```

What did we learn by analyzing this short sentence? *Almost nothing*. Let's analyze some LONGER text.

### Finding th- patterns

REMEMBER: When finished, you will record a demo video showing Mr Riley both your chart AND your Rock Paper Scissors project.

Step 1. Using paper / Notability / the notepad app, make the following chart...

<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
.tg .tg-0pky{border-color:inherit;text-align:left;vertical-align:top}
</style>
<table class="tg"><thead>
  <tr>
    <th class="tg-0pky">Trigram</th>
    <th class="tg-0pky">Predicted Amount</th>
    <th class="tg-0pky">Actual Amount</th>
  </tr></thead>
<tbody>
  <tr>
    <td class="tg-0pky">tha</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
  <tr>
    <td class="tg-0pky">the</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
  <tr>
    <td class="tg-0pky">thi</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
   <tr>
    <td class="tg-0pky">thl</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
<tr>
    <td class="tg-0pky">thm</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
  <tr>
    <td class="tg-0pky">thr</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
  <tr>
    <td class="tg-0pky">tho</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
  <tr>
    <td class="tg-0pky">thu</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
  <tr>
    <td class="tg-0pky">thy</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
</tbody>
</table>



Step 2. Pick a long Wikipedia article from this list: [https://en.wikipedia.org/wiki/Wikipedia:Good_articles/By_length](https://en.wikipedia.org/wiki/Wikipedia:Good_articles/By_length)

Step 3. Try to predict how many times each trigram will appear. <u>Your predictions will most likely be wrong, but take a guess.</u>

Step 4. After making all of your predictions, use the `CONTROL + F` shortcut (or from the menu click Edit > Find) and search for each trigram. Write down the actual amounts.

### What can we learn from this data? 

- English has strong statistical biases in letter combinations. Some trigrams (for example, thz, thq, thb) may appear rarely or never, because English doesn't naturally produce those sequences often.

- The limitations of the input determine the quality of the output. How would the frequency of "thm" differ if you had only analyzed [https://en.wikipedia.org/wiki/Algorithm](https://en.wikipedia.org/wiki/Algorithm)?

- Learning specific writing styles. Consider how the data would be different if we analyzed a Shakespearean play that would contain anachronistic words like "thee", "thine", "thy", and "thou"

## Rock Paper Scissors with Memory

Add the following global variables to the top of the project...
```
// botMemory is a String that stores every previous move of the user
let botMemory = "";

// botTrigrams is a JS Object that will store two-letter combos and an array of third letters that followed
let botTrigrams = {};
```

How will these be used?

Imagine that the user is using a certain strategy. They will play r, r, p, r, r s, and then repeat.

After the first 3 rounds the botMemory will show "rrp" and the botTrigrams will look like this:
```
{
    rr: ["p"]
}
```

After round 4 the botMemory will be "rrpr" and the botTrigrams will show:
```
{
    rp: ["r"],
    rr: ["p"]
}
```

Round 5 botMemory will be "rrprr" and botTrigrams will be:
```
{
    pr: ["r"],
    rp: ["r"],
    rr: ["p"]
}
```

After round 6 the bot will see a trigram with last two letters that it has seen previously, but with a new third letter. botMemory will be "rrprrs" and botTrigrams will be:
```
{
    pr: ["r"],
    rp: ["r"],
    rr: ["p", "s"]
}
```

At this point, there have been two trigrams that begin with rr- and those are rrp and rrs. In the future we can use this like predictive text. If the user previously played "rr" then their next move will likely either be "p" or "s".

### Update Trigrams based on User Current Move

```
function updateTrigrams(userCurrentMove){
  // only update the bot trigrams if the bot memory is longer than 1
  if(botMemory.??? ??? ???){ // TODO
    // use substring to get the last two moves
    let lastTwo = botMemory.???; // TODO
    // if that key in the object is undefined
    if(botTrigrams[lastTwo] == undefined){
      // add that key to botTrigrams, set the value to an empty array
      botTrigrams[lastTwo] = ???; // TODO
    } 
    // push the user's current move into the value array
    botTrigrams[lastTwo].???; // TODO
  }
  // concatenate the user's current move onto the bot's memory
  botMemory += ???; // TODO
}
```

Finally, add a function call for updateTrigrams and send in the user's current move. It's your choice where to add this function call.

Test it out by playing a few rounds against the random bot. Use the browser's console to make sure that the botMemory and the botTrigrams are saving the data.


Record a demo video showing:

1. your trigram chart

2. your Rock Paper Scissors project (using the browser's console to show how botMemory and botTrigrams are saving the data).


### Tests

[test_rpsTrigrams.js](../test_rpsTrigrams.js)


## CHALLENGE 

Predict the user's next move!

If the bot memory size is less than 3, then randomly select the bot's reply.

Else if the `botTrigrams[lastTwo]` is undefined, then randomly select the bot's reply.

Else predict the user's next move by getting a random array element from `botTrigrams[lastTwo]`

- If the predicted next move is "r" then the bot replies "p"
- If the predicted next move is "p" then the bot replies "s"
- If the predicted next move is "s" then the bot replies "r"
