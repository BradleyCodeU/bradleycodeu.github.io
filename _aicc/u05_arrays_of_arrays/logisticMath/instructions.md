---
layout: project
category: u05_arrays_of_arrays
title: Logistic Math
---

NOTE: Use Google Docs, Notepad, or any other text editor to write down your answers. 

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


![Math equation z = b + w_1 * x_1 + w_2 * x_2 + … + w_N * x_N](../zbw1x1w2x2wNxN.png)

where:

- z is the output of the linear equation, also called the log odds.
- b is the bias.
- The w values are the model's learned weights.
- The x values are the feature values for a particular example.


We have 3 x-values (x1 is age, x2 is years of work experience, x3 is number of hikes). 

The regression algorithm will randomly pick weights and bias, then carefully adjust those values in order to reduce loss. Mr. Riley has picked the following random weights and bais:


$$
\begin{align}b &= -1 \\w_1 &= 0.025 \\w_2 &= -0.015 \\w_3 &= 0.012\end{align}
$$


![Math variables, b = -1, w_1 = 0.025, w_2 = -0.015, w_3 = 0.012](../biasAndWeights.png)

In Javascript our equation looks like this using the first person in our training data.
```
let age = 25;
let experience = 7; 
let hikes = 10;
let bias = -1;
let weights = [0.025, -0.015, 0.012];
let z = bias + weights[0] * age + weights[1] * experience + weights[2] * hikes;
```

To obtain the logistic regression prediction, the z value is then passed to the sigmoid function, yielding a value (a probability) between 0 and 1:


$$
y' = \frac{1}{1 + e^{-z}}
$$


![Math equation, y = 1 / 1 - e^-z](../yfrac11ez.png)

where:

- y' is the output of the logistic regression model.
- e is Euler's number: a mathematical constant ≈ 2.71828.
- z is the linear output (as calculated in the preceding equation).

In Javascript the full equation looks like this when using the first person in our training data. Note that I've wrapped the final equation in Math.round()
```
let age = 25;
let experience = 7; 
let hikes = 10;
let bias = -1;
let weights = [0.025, -0.015, 0.012];
let z = bias + weights[0] * age + weights[1] * experience + weights[2] * hikes;
let y = Math.round(1 / (1 + Math.pow(Math.E, -z)));
console.log(y);
```

### Looping Thru A 2D Array

We COULD just copy/paste the above code 10 times and change all the x-values each time, but that would take a lot of work.

Instead, let's create a predict function and use a loop to iterate through the data.

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
    let bias = -1;
    let weights = [0.025, -0.015, 0.012];
    let z = bias + weights[0] * age + weights[1] * experience + weights[2] * hikes;
    let y = Math.round(1 / (1 + Math.pow(Math.E, -z)))
    return ???; // TODO what should be returned???
}

for(???){ // TODO write a loop
    let age = ???; // TODO get index 0
    let experience = ???; // TODO
    let hikes = ???; // TODO
    let actual = ??? // TODO get index 3
    let inputStr = age + "," + experience + "," + hikes;
    let y = predict(age, experience, hikes);
    console.log(inputStr + ", Actual: " + actual + ", Predicted: " + y);
}
```

## Question 1.

#### Confusion Matrix



Make a confusion matrix for Mr Riley's hiring algorithm.

Fill in the results
```
       | Actual 1 | Actual 0
----------------------------
Pred 1 |  ___ TP  |  ___ FP
----------------------------
Pred 0 |  ___ FN  |  ___ TN
```



## Question 2.

##### Recall, Accuracy, Precision, and Specificity

Calculate the following for Mr Riley's algorithm. SHOW YOUR WORK. The most important thing is that you are able to fill in the equations with the correct values from the data.

```
Recall: TP / total actual positives

Accuracy: (TP + TN) / total count

Precision: TP / total pred positives

Specificity: TN / total actual negatives
```

#### Do It Yourself

Make YOUR Hiring Prediction Algorithm

Using the previous Javascript code, pick random values for bias and the weights. You must follow these rules:

- All of your weights must be decimal values between -0.999 and 0.999
- Your bias can be a positive value, negative value, or zero.
- Your algorithm MUST predict to hire at least 1 person
- Your algorithm MUST predict to not hire at least 1 person
- Your algorithm must give different results than Mr Riley's algorithm

You will likely need to test out a few different values. 

## Question 3.

Write down your bias and weights:
```
bias = 
w1 = 
w2 =
w3 =
```

## Question 4.

Record the following for YOUR algorithm:
```
       | Actual 1 | Actual 0
----------------------------
Pred 1 |  ___ TP  |  ___ FP
----------------------------
Pred 0 |  ___ FN  |  ___ TN
```

## Question 5.

Calculate the following for YOUR algorithm. SHOW YOUR WORK. The most important thing is that you are able to fill in the equations with the correct values from the data.

```
Recall: TP / total actual positives

Accuracy: (TP + TN) / total count

Precision: TP / total pred positives

Specificity: TN / total actual negatives
```