---
layout: project
category: u05arraysOfArrays
title: Logistic Hiring App
---

NOTE: Use Google Docs, Notepad, or any other text editor to write down your answers. 

The use of A.I. can make hiring faster and more efficient, but there are still ethical concerns. People worry about how transparent and fair these algorithms are, who is responsible when they make mistakes, and how to make sure they stay unbiased and fair over time.

[https://en.wikipedia.org/wiki/Artificial_intelligence_in_hiring](https://en.wikipedia.org/wiki/Artificial_intelligence_in_hiring)

## Hiring Summer Camp Counselors

Camp Anawanna is hiring new Summer Camp Counselors. There are 3 hiring factors: age, years of work experience, number of hikes.

Let's use TensorFlow to make a Logistic Regression Hiring App.

Starter code is provided:

[sketch.js](../sketch.js)

[style.css](../style.css)

index.html:
```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Logistic Regression Hiring</title>
    <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@tensorflow/tfjs@4.16.0/dist/tf.min.js"></script>
    <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
    <h2>Logistic Regression Hiring</h2>
    <p>
        Camp Anawanna is hiring new Summer Camp Counselors. There are 3 hiring
        factors: age, years of work experience, number of hikes.
    </p>
    <div>
        <h3>Input Sliders</h3>
        <label>Age: <output id="ageVal">30</output>
            <input type="range" id="age" min="0" max="70" value="30" step="1" />
        </label>
        <label>Years of Experience: <output id="expVal">8</output>
            <input type="range" id="experience" min="0" max="20" value="8" step="1" />
        </label>
        <label>Number of Hikes: <output id="hikeVal">20</output>
            <input type="range" id="hikes" min="0" max="50" value="20" step="1" />
        </label>
        <button id="predictBtn" disabled>Predict</button>
    </div>
    <h3>Output Results</h3>
    <div id="spinner" class="spinner"></div>
    <pre id="output">Training model...</pre>
    <h3>Training Data Confusion Matrix</h3>
    <canvas id="confusion" width="500px" height="300px"></canvas>
    <h3>Training Data 3D Scatterplot</h3>
    <div id="plot3d" style="width: 700px; height: 500px"></div>
    <script src="sketch.js"></script>
</body>
</html>
```

### Training Data

In the last few years, ten people have applied to be a camp counselors. Our training data will be the data from these people with the output being whether they were hired (1) or not hired (0).

At the top of sketch.js you will find the 2D array of training data

```
// age, experience, hikes, 0=not hired / 1=hired
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

When the project loads, you should see "Output Results: Model trained! 🚀"

The model has randomly created an equation (with weights and bias) that will solve the problem. 

Adjust the Input Sliders and press predict. The Output Results will tell you if you should hire this new person. 

### Training Data Confusion Matrix

Once the model is trained, the training data is fed back into the model and a confusion matrix is automatically drawn for us.

### Training Data 3D Scatterplot

The training data is visualized using Plotly.js, an open-source Javascript graphing library that has over 40 chart types.

The 3 axis of the chart are age, experience, and hikes. The color shows the actual hiring data in which 0 = red / not hired and 1 = green / hired.

## Question 1:

Record the following:

```
Question 1:

       | Actual 1 | Actual 0
----------------------------
Pred 1 |  ___ TP  |  ___ FP
----------------------------
Pred 0 |  ___ FN  |  ___ TN
```

## Question 2:

Calculate the following. SHOW YOUR WORK. The most important thing is that you are able to fill in the equations with the correct values from the data.

```
Question 2:

Recall: TP / total actual positives

Accuracy: (TP + TN) / total count

Precision: TP / total pred positives

Specificity: TN / total pred negatives
```

## Question 3:

Adjust the sliders to 25, 7, 10. Press the Predict button. 

```
3a. What does the model predict? 
3b. Does this match the training data?
``````

## Question 4:

Adjust the sliders to 35, 9, 20. Press the Predict button.

```
4a. What does the model predict? 
4b. Does this match the training data?
``````

## Question 5:

Test the following slider settings, press Predict, then record the model's prediction.
```
5a. Slider inputs 0, 9, 20. Prediction ___
5b. Slider inputs 35, 0, 20. Prediction ___
5c. Slider inputs 35, 9, 0. Prediction ___
```

## Epochs

[https://developers.google.com/machine-learning/crash-course/linear-regression/hyperparameters](https://developers.google.com/machine-learning/crash-course/linear-regression/hyperparameters)

Hyperparameters are variables that control different aspects of training. Three common hyperparameters are:

- Learning rate
- Batch size
- Epochs

In contrast, parameters are the variables, like the weights and bias, that are part of the model itself. In other words, hyperparameters are values that you control; parameters are values that the model calculates during training.

Training typically requires many epochs. That is, the system needs to process every example in the training set multiple times.

The number of epochs is a hyperparameter you set before the model begins training. 

```
const NUMBER_OF_EPOCHS = 100;
```

Update the number of epochs from 1 to 100. Let's see if the model has improved.

## Question 6:

Record the following:
```
Question 6:

       | Actual 1 | Actual 0
----------------------------
Pred 1 |  ___ TP  |  ___ FP
----------------------------
Pred 0 |  ___ FN  |  ___ TN
```

## Question 7:

Calculate the following. SHOW YOUR WORK. The most important thing is that you are able to fill in the equations with the correct values from the data.

```
Question7:

Recall: TP / total actual positives

Accuracy: (TP + TN) / total count

Precision: TP / total pred positives

Specificity: TN / total pred negatives
```

## Question 8:

Test the following slider settings, press Predict, then record the model's prediction.
```
8a. Slider inputs 0, 9, 20. Prediction ___
8b. Slider inputs 35, 0, 20. Prediction ___
8c. Slider inputs 35, 9, 0. Prediction ___
```

## More Epochs?

```
const NUMBER_OF_EPOCHS = 400;
```

Update the number of epochs from 100 to 400. Has the model improved?

Mr Riley found that his confusion matrix looks good. No false positives and no false negatives, but still get weird results for some new inputs...
```
Age: 0, Years of Experience: 8, Number of Hikes: 20
Hire This Applicant?: 1 ✅ (confidence 98.2%)

Age: 35, Years of Experience: 0, Number of Hikes: 20
Hire This Applicant?: 1 ✅ (confidence 100.0%)
```

## Question 9:

The model needs more true negatives. Let's give examples of whom NOT to hire.

TOO YOUNG: Add data for 2 people that are too young but have good experience and a good number of hikes. Label them as 0.

TOO INEXPERIENCED: Add data for 2 people that have not enough experience but are a good age and good hikes. Label them 0.

NOT ENOUGH HIKES: Add data for 2 people that have too few hikes but are good for age and experience. Label them 0.

```
Question 9:
copy/paste your 6 new training data entries here
```

With new training data, Mr Riley is seeing better results...
```
Age: 5, Years of Experience: 10, Number of Hikes: 30
Hire This Applicant?: 0 ❌ (confidence 0.0%)

Age: 40, Years of Experience: 0, Number of Hikes: 30
Hire This Applicant?: 0 ❌ (confidence 0.0%)

Age: 40, Years of Experience: 12, Number of Hikes: 0
Hire This Applicant?: 0 ❌ (confidence 0.0%)
```

## Human Resources

Mr Riley is confident that the Hiring Prediction App is working well and meets with David, the executive director of human resources for Camp Anawanna.

David wants to change two actual entries in the training data from 1 (hired) to 0 (not hired)
```
  [60, 15, 40, 1] -> [60, 15, 40, 0]
  [55, 13, 30, 1] -> [55, 13, 30, 0]
```

David also wants to add a few more fictional entries to the training data
```
  [26, 8, 20, 1],
  [27, 8, 20, 1],
  [28, 9, 25, 1],
  [29, 9, 25, 1],
  [30, 10, 30, 1],
  [31, 10, 30, 1],
  [32, 11, 35, 1],
  [50, 16, 40, 0],
  [52, 17, 40, 0],
```

These new entries and the changed entries seem suspicious.

Sometimes companies prefer to hire people with less experience because they can offer them a lower salary. That is legal.

In the United States, it’s illegal for employers to discriminate based on age, race, gender, sex (including pregnancy, sexual orientation, or gender identity), religion, national origin, or disability.

[https://en.wikipedia.org/wiki/Employment_discrimination](https://en.wikipedia.org/wiki/Employment_discrimination)

## Question 10:



```
10a. Do you make these changes to the data? What do you do and why? 

10b. Are the changes to the training data ethical? Why?
```

Explain your thinking. Don't just answer "yes" or "no".
