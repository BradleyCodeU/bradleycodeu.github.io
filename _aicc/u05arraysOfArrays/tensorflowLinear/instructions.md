---
layout: project
category: u05arraysOfArrays
title: Tensorflow Linear
---

NOTE: Use Google Docs, Notepad, or any other text editor to write down your answers. 

Let's use a Tensorflow Linear Regression algorithm to complete some Algebra 1 problems.

Copy/paste the following into a new p5js sketch:

```
const xValues = [0];
const yValues = [0];

// Optional offset (like this.offset)
const offset = 0;
const xShifted = xValues.map(v => v + offset);

// Normalize data for stability
const xMean = tf.mean(xShifted);
const xStd = tf.moments(tf.tensor1d(xShifted)).variance.sqrt();
const yMean = tf.mean(yValues);
const yStd = tf.moments(tf.tensor1d(yValues)).variance.sqrt();

const xNorm = tf.tensor1d(xShifted).sub(xMean).div(xStd);
const yNorm = tf.tensor1d(yValues).sub(yMean).div(yStd);

// Trainable variables (slope m and intercept b)
const m = tf.variable(tf.scalar(Math.random() * 0.1));
const b = tf.variable(tf.scalar(0));

// Linear regression model: y = m*x + b
const predict = x => m.mul(x).add(b);

// Loss function: mean squared error
const loss = (pred, labels) => pred.sub(labels).square().mean();

// Optimizer with smaller learning rate
const optimizer = tf.train.sgd(0.001);

async function trainModel() {
    // TRAINING LOOP
    for (let i = 0; i < 1; i++) {
        optimizer.minimize(() => loss(predict(xNorm), yNorm));
        if (i % 100 === 0) {
            const l = loss(predict(xNorm), yNorm).dataSync()[0];
            console.log(`Epoch ${i}: loss = ${l.toFixed(6)}`);
        }
    }

    // Denormalize the slope & intercept
    const mVal = m.dataSync()[0];
    const bVal = b.dataSync()[0];

    const slope = (mVal * (yStd.dataSync()[0] / xStd.dataSync()[0]));
    const intercept = (bVal * yStd.dataSync()[0]) + yMean.dataSync()[0] - slope * xMean.dataSync()[0];

    console.log(`Slope (m): ${slope.toFixed(4)}, Intercept (b): ${intercept.toFixed(4)}`);

    // Predictions (denormalized)
    const yPred = xShifted.map(x => slope * x + intercept);

    plotResults(xValues, yValues, yPred);
}

function plotResults(x, y, yPred) {
    const trace1 = { x, y, mode: "markers", type: "scatter", name: "Data" };
    const trace2 = { x, y: yPred, mode: "lines", name: "Model" };
    const layout = { title: "Linear Regression (TensorFlow.js)", xaxis: { title: "X" }, yaxis: { title: "Y" } };
    Plotly.newPlot("plot", [trace1, trace2], layout);
}

trainModel();
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

What is the minimum amount of repetitions needed to get the correct slope from the algorithm?

What happens to the `loss` every 100 repetitions?

## Question 6

REMEMBER: For these last 3 questions, you should have the loop repeat 10 times, then try 100 times, then 1000, then 10000, and finally 100000

With these points `(-1, 10), (1, 2), (3, -6), (5, -14)` we *expect* that the slope will be -4. 

What is the minimum amount of repetitions needed to get the correct slope from the algorithm?

## Question 7

REMEMBER: For these last 3 questions, you should have the loop repeat 10 times, then try 100 times, then 1000, then 10000, and finally 100000

With points `(8,9), (13,11), (3,1), (9,13), (1,4)` linear regression will find the "line of best fit" by minimizing the loss.

What is the minimum amount of repetitions needed to get the least amount of loss?