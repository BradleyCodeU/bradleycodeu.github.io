---
layout: project
category: u05arraysOfArrays
title: Tensorflow Linear Regression App
---

NOTE: Use Google Docs, Notepad, or any other text editor to write down your answers. 

Let's use a Tensorflow Linear Regression algorithm to complete some Algebra 1 problems.

Here is the starting code:

[sketch.js](../sketch.js)

index.html:
```
<!DOCTYPE html>
<html lang="en">
  <head>
    <script src="https://cdn.jsdelivr.net/npm/@tensorflow/tfjs"></script>
    <script src="https://cdn.plot.ly/plotly-3.1.0.min.js" charset="utf-8"></script>
    <meta charset="utf-8" />
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body>
  <h2>Tensorflow Linear Regression App</h2>
    <div id="spinner"></div>
    <div id="plot"></div>
    <script src="sketch.js"></script>
  </body>
</html>
```

## Algebra Questions

## Question 1

According to the algorithm, what is the slope of the line that contains these points?

`(1, 5), (3, 5)`

*HINT: add the x values to the xValues array and add the y values to the yValues array*

The console should display something like this...

```
Epoch 0: loss = ???
Slope (m): ???, Intercept (b): ???
```

Copy or write down all 3 values.

Run the code again and again. Do any of the values change?

## Question 2

According to the algorithm, what is the slope of the line that contains these points?

`(7, 9), (13, 21), (3, 1)`

Copy or write down all 3 values in the console.

Run the code again and again. Do any of the values change? Is this algorithm deterministic or nondeterministic?

## Question 3

According to the algorithm, what is the slope of the line that contains these points?

`(-1, 10), (1, 2), (3, -6), (5, -14)`

Copy or write down all 3 values in the console.

Run the code again and again. Do any of the values change?

## Question 4

What is the slope of these points?

`(8, 9), (13, 11), (3, 1), (9, 13), (1, 4)`

Copy or write down all 3 values in the console.

Run the code again and again. Do any of the values change?

## Let's Grade The Algorithm's Homework!

#### Answer 1:

The points were `(1, 5), (3, 5)`

Use the slope formula: m = (y₂ − y₁) / (x₂ − x₁)

We only need two points to find a slope... `(1, 5)` and `(3, 5)` 

m = (5 − 5) / (3 − 1) = 0 / 2 = 0

The slope is 0

Was the algorithm correct? Write down either CORRECT or INCORRECT

![A chart showing points (1, 5), (3, 5) connected by a line](../linear01.png)

#### Answer 2:

Using points `(7, 9), (13, 21), (3, 1)`

This one is easy!

We only need two points to find a slope... `(7, 9)` and `(13, 21)` 

m = (21 − 9) / (13 − 7) = 12 / 6 = 2

The slope is 2

Was the algorithm correct? Write down either CORRECT or INCORRECT

![A chart showing points (7, 9), (13, 21), (3, 1) connected by a line](../linear02.png)

#### Answer 3:

Our points are `(-1, 10), (1, 2), (3, -6), (5, -14)`

We only need two points to find a slope... `(-1, 10), (1, 2)` 

m = (2 − 10) / (1 − -1) = -8 / 2 = -4

The slope is -4

Was the algorithm correct? Write down either CORRECT or INCORRECT

![A chart showing points (-1, 10), (1, 2), (3, -6), (5, -14) connected by a line](../linear03.png)

#### Answer 4:

These points `(8,9), (13,11), (3,1), (9,13), (1,4)` don't form a single line, so it's impossible... right? Is this a trick question???

![A chart showing points (-1, 10), (1, 2), (3, -6), (5, -14) connected by a line](../linear04.png)



## Fix the Algorithm

The algorithm is trying to solve the problems BUT it gives up too soon. It's giving up after it's first try.

Find the `// TRAINING LOOP` and notice that Mr. Riley set it to repeat 1 time. How many times should it repeat? That's the question we'll try to answer in the next questions.

## Epochs

[https://developers.google.com/machine-learning/crash-course/linear-regression/hyperparameters](https://developers.google.com/machine-learning/crash-course/linear-regression/hyperparameters)

Hyperparameters are variables that control different aspects of training. Three common hyperparameters are:

- Learning rate
- Batch size
- Epochs

In contrast, parameters are the variables, like the weights and bias, that are part of the model itself. In other words, hyperparameters are values that you control; parameters are values that the model calculates during training.

Training typically requires MANY epochs. That is, the system needs to process every example in the training set multiple times.

## Question 5

REMEMBER: For these last 3 questions, you should have the loop repeat 10 times, then try 100 times, then 1000, then 10000, and finally 100000

With these points `(7, 9), (13, 21), (3, 1)` we *expect* that the slope will be 2. 

5a. What is the minimum amount of repetitions needed to get the correct slope from the algorithm? In other words... how many epochs were needed for the loss to reach 0.000000?

5b. What happens to the `loss` every 100 repetitions?

## Question 6

REMEMBER: For these last 3 questions, you should have the loop repeat 10 times, then try 100 times, then 1000, then 10000, and finally 100000

With these points `(-1, 10), (1, 2), (3, -6), (5, -14)` we *expect* that the slope will be -4. 

Q6. What is the minimum amount of repetitions needed to get the correct slope from the algorithm?  In other words... how many epochs were needed for the loss to reach 0.000000?

## Question 7

REMEMBER: For these last 3 questions, you should have the loop repeat 10 times, then try 100 times, then 1000, then 10000, and finally 100000

With points `(8,9), (13,11), (3,1), (9,13), (1,4)` linear regression will find the "line of best fit" by minimizing the loss.

7a.  Will the loss ever reach 0.000000, yes or no? 

7b. What is the minimum amount of repetitions needed to get the least amount of loss?