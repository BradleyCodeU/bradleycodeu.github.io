const xValues = [0];
const yValues = [0];

// Optional offset
const offset = 0;
const xShifted = xValues.map(v => v + offset);

// Normalize data
const xMean = tf.mean(xShifted);
const xStd = tf.moments(tf.tensor1d(xShifted)).variance.sqrt();
const yMean = tf.mean(yValues);
const yStd = tf.moments(tf.tensor1d(yValues)).variance.sqrt();

const xNorm = tf.tensor1d(xShifted).sub(xMean).div(xStd);
const yNorm = tf.tensor1d(yValues).sub(yMean).div(yStd);

// Trainable variables
const m = tf.variable(tf.scalar(Math.random() * 0.1));
const b = tf.variable(tf.scalar(0));

// Model and loss
const predict = x => m.mul(x).add(b);
const loss = (pred, labels) => pred.sub(labels).square().mean();

// Optimizer
const optimizer = tf.train.sgd(0.001);

async function trainModel() {
    document.getElementById("spinner").style.display = "block"; // Show spinner

    // TRAINING LOOP
    for (let i = 0; i < 1; i++) {
        optimizer.minimize(() => loss(predict(xNorm), yNorm));
        if (i % 100 === 0) {
            const l = loss(predict(xNorm), yNorm).dataSync()[0];
            console.log(`Epoch ${i}: loss = ${l.toFixed(6)}`);
            await tf.nextFrame(); // Yield to UI so spinner animates
        }
    }

    // Denormalize slope & intercept
    const mVal = m.dataSync()[0];
    const bVal = b.dataSync()[0];
    const slope = (mVal * (yStd.dataSync()[0] / xStd.dataSync()[0]));
    const intercept = (bVal * yStd.dataSync()[0]) + yMean.dataSync()[0] - slope * xMean.dataSync()[0];

    console.log(`Slope (m): ${slope.toFixed(4)}, Intercept (b): ${intercept.toFixed(4)}`);

    // Predictions (denormalized)
    const yPred = xShifted.map(x => slope * x + intercept);

    plotResults(xValues, yValues, yPred);

    document.getElementById("spinner").style.display = "none"; // Hide spinner when done
}

function plotResults(x, y, yPred) {
    const trace1 = { x, y, mode: "markers", type: "scatter", name: "Data" };
    const trace2 = { x, y: yPred, mode: "lines", name: "Model" };
    const layout = { title: "Linear Regression (TensorFlow.js)", xaxis: { title: "X" }, yaxis: { title: "Y" } };
    Plotly.newPlot("plot", [trace1, trace2], layout);
}

trainModel();