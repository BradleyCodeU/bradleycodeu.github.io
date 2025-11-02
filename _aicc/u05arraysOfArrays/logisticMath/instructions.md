---
layout: project
category: u05arraysOfArrays
title: Logistic Math
---

Camp Anawanna is hiring new Summer Camp Counselors. There are 3 hiring factors: age, years of work experience, number of hikes.

### How can we create an equation to automate the hiring process?

In the last few years, ten people have applied to be a camp counselors. Here is their data...
| Age | Experience | Hikes | 0=Not Hired, 1=Hired |
|-----|---------------------|--------|-----------------------------|
| 25  | 7                   | 10     | 0                           |
| 35  | 9                   | 20     | 1                           |
| 45  | 12                  | 30     | 1                           |
| 22  | 5                   | 10     | 0                           |
| 32  | 8                   | 20     | 1                           |
| 48  | 11                  | 30     | 1                           |
| 60  | 15                  | 40     | 1                           |
| 55  | 13                  | 30     | 1                           |
| 38  | 10                  | 20     | 0                           |
| 27  | 6                   | 10     | 0                           |

Here is that same data as a Javascript 2D array
```
const trainingData = [
  [25, 7, 10, 0],
  [35, 9, 20, 1],
  [45, 12, 30, 1],
  [22, 5, 10, 0],
  [32, 8, 20, 1],
  [48, 11, 30, 1],
  [60, 15, 40, 1],
  [55, 13, 30, 1],
  [38, 10, 20, 0],
  [27, 6, 10, 0],
];
```

### Calculating a probability with the sigmoid function

SOURCE: [https://developers.google.com/machine-learning/crash-course/logistic-regression/sigmoid-function](https://developers.google.com/machine-learning/crash-course/logistic-regression/sigmoid-function)

First, let's use a linear function. Notice that the format is similar to y=mx+b

$$
z = b + w_1 * x_1 + w_2 * x_2 + … + w_N * x_N
$$

where:

- z is the output of the linear equation, also called the log odds.
- b is the bias.
- The w values are the model's learned weights.
- The x values are the feature values for a particular example.


We have 3 x-values (x1 is age, x2 is years of work experience, x3 is number of hikes). 

The regression algorithm will randomly pick weights and bias, then carefully adjust those values in order to reduce loss. Mr. Riley has picked the following random weights and bais:

$$
\begin{align}
  b &= -200 \\
  w_1 &= 5 \\
  w_2 &= 2 \\
  w_3 &= 1
\end{align}
$$

In Javascript our equation looks like this using the first person in our training data.
```
let age = 25;
let experience = 7; 
let hikes = 10;
let bias = -200;
let weights = [5, 2, 1];
let z = bias + weights[0] * age + weights[1] * experience + weights[2] * hikes;
```

To obtain the logistic regression prediction, the z value is then passed to the sigmoid function, yielding a value (a probability) between 0 and 1:

$$
y' = \frac{1}{1 + e^{-z}}
$$

where:

- y' is the output of the logistic regression model.
- e is Euler's number: a mathematical constant ≈ 2.71828.
- z is the linear output (as calculated in the preceding equation).

In Javascript the full equation looks like this when using the first person in our training data. Note that I've wrapped the final equation in Math.round()
```
let age = 25;
let experience = 7; 
let hikes = 10;
let bias = -200;
let weights = [5, 2, 1];
let z = bias + weights[0] * age + weights[1] * experience + weights[2] * hikes;
let y = Math.round(1 / (1 + Math.pow(Math.E, -z)));
console.log(y);
```

### Looping Thru A 2D Array

We COULD just copy/paste the above code 10 times and change all the x-values each time, but instead let's just write a loop.

Copy/paste the code below into code editor. Fill in the blanks.

```
const trainingData = [
  [25, 7, 10, 0],
  [35, 9, 20, 1],
  [45, 12, 30, 1],
  [22, 5, 10, 0],
  [32, 8, 20, 1],
  [48, 11, 30, 1],
  [60, 15, 40, 1],
  [55, 13, 30, 1],
  [38, 10, 20, 0],
  [27, 6, 10, 0],
];

// predict function
// takes three parameters: age, experience, hikes
// returns a y value of either 0 or 1

function predict(age, experience, hikes){
    let bias = -200;
    let weights = [5, 2, 1];
    let z = bias + weights[0] * age + weights[1] * experience + weights[2] * hikes;
    let y = Math.round(1 / (1 + Math.pow(Math.E, -z)))
    return ???; // TODO what should be returned???
}

for(???){ // TODO write a loop
    let age = ???; // TODO get index 0
    let exp = ???; // TODO
    let hikes = ???; // TODO
    let actual = ??? // TODO get index 3
    let inputStr = age + "," + exp + "," + hikes;
    let y = predict(age, exp, hikes);
    console.log(inputStr + ", Actual: " + expected + ", Predicted: " + y);
}
```

### Confusion Matrix

Make a confusion matrix for Mr Riley's hiring algorithm

<table style="border-collapse: collapse; width: 100%; text-align: center;" border="1" cellpadding="10">
    <caption><strong>Confusion Matrix: Hiring Example</strong></caption>
    <tbody>
        <tr>
            <th></th>
            <th>Actual Hired</th>
            <th>Actual Not Hired</th>
            <th> </th>
        </tr>
        <tr>
            <th>Predicted Hired</th>
            <td>___ True Positives</td>
            <td>___ False Positives</td>
            <td><small>total pred positives<br>___</small></td>
        </tr>
        <tr>
            <th>Pred Not Hired</th>
            <td>___ False Negatives</td>
            <td>___ True Negatives</td>
            <td><small>total pred negatives<br>___</small></td>
        </tr>
        <tr>
            <th> </th>
            <td><small>total actual positives<br>___</small></td>
            <td><small>total actual negative<br>___</small></td>
            <td><small>total count<br>___  </small></td>
        </tr>
    </tbody>
</table>

Write down the results

Finally, calculate the following
```
Recall: TP / total actual positives

Accuracy: (TP + TN) / total count

Precision: TP / total pred positives

Specificity: TN / total pred negatives
```
