// age, experience, hikes, 0=not hired / 1=hired
const trainingData = [
  // Age, Experience, Hikes, Hired (0=no, 1=yes)
  [40, 15, 5, 0],
  [23, 0, 49, 0],
  [43, 15, 9, 0],
  [58, 40, 47, 1],
  [21, 2, 31, 0],
  [52, 27, 12, 0],
  [51, 27, 10, 0],
  [36, 13, 53, 1],
  [38, 13, 14, 1],
  [65, 48, 4, 0],
  [28, 3, 55, 1],
  [41, 25, 45, 1],
  [33, 12, 45, 1],
  [48, 28, 42, 1],
  [37, 12, 23, 1],
  [62, 24, 18, 0],
  [54, 30, 52, 1],
  [24, 1, 36, 0],
  [47, 29, 44, 1],
  [50, 29, 16, 1],
  [39, 19, 24, 0],
  [46, 22, 47, 0],
  [26, 1, 23, 0],
  [35, 14, 43, 0],
  [21, 9, 50, 1],
  [42, 16, 9, 0],
  [36, 11, 27, 0],
  [30, 5, 9, 0],
  [20, 9, 8, 1],
  [51, 23, 53, 1],
  [28, 7, 4, 0],
  [47, 27, 22, 1],
  [60, 44, 3, 0],
  [26, 3, 6, 0],
  [46, 14, 20, 0],
  [24, 5, 2, 0],
  [37, 20, 15, 0],
  [48, 30, 17, 1],
  [52, 25, 3, 0],
  [57, 34, 24, 0],
  [39, 4, 31, 0],
  [54, 30, 23, 1],
  [40, 19, 24, 1],
  [51, 22, 7, 0],
  [32, 30, 46, 1],
  [22, 3, 48, 0],
  [20, 5, 47, 0],
  [57, 29, 26, 1],
  [45, 21, 34, 1],
  [20, 2, 21, 0]
];
const NUMBER_OF_EPOCHS = 1;
const inputs2dArray = trainingData.map((r) => r.slice(0, 3));
const outputs2dArray = trainingData.map((r) => [r[3]]);

// Normalization

const minVals = [
  Math.min(...inputs2dArray.map((r) => r[0])),
  Math.min(...inputs2dArray.map((r) => r[1])),
  Math.min(...inputs2dArray.map((r) => r[2])),
];
const maxVals = [
  Math.max(...inputs2dArray.map((r) => r[0])),
  Math.max(...inputs2dArray.map((r) => r[1])),
  Math.max(...inputs2dArray.map((r) => r[2])),
];

function normalizeData(data) {
  return data.map((row) =>
    row.map((v, i) => (v - minVals[i]) / (maxVals[i] - minVals[i]))
  );
}

const normalizedInputs = normalizeData(inputs2dArray);
const xs = tf.tensor2d(normalizedInputs);
const ys = tf.tensor2d(outputs2dArray);

// Model (multi-layer relu and sigmoid output)

const model = tf.sequential();
model.add(
  tf.layers.dense({
    inputShape: [3],
    units: 6,
    activation: "relu",
    kernelConstraint: tf.constraints.nonNeg(),
  })
);
model.add(
  tf.layers.dense({
    units: 3,
    activation: "relu",
    kernelConstraint: tf.constraints.nonNeg(),
  })
);
model.add(
  tf.layers.dense({
    units: 1,
    activation: "sigmoid",
    kernelConstraint: tf.constraints.nonNeg(),
  })
);

model.compile({
  optimizer: tf.train.adam(0.01),
  loss: "binaryCrossentropy",
  metrics: ["accuracy"],
});

// Training and confusion matrix

const spinner = document.getElementById("spinner");
const outputEl = document.getElementById("output");
const predictBtn = document.getElementById("predictBtn");
const canvas = document.getElementById("confusion");
const ctx = canvas.getContext("2d");

async function trainModel() {
  spinner.style.display = "block"; // show spinner
  outputEl.textContent = "🚂 Training model...";
  await model.fit(xs, ys, {
    epochs: NUMBER_OF_EPOCHS,
    shuffle: true,
    verbose: 0,
  });
  outputEl.textContent = "Model trained! 🚀 Adjust sliders and click Predict.";
  spinner.style.display = "none"; // hide spinner
  predictBtn.disabled = false;
  await drawConfusionMatrix();
}

async function drawConfusionMatrix() {
  const predictions = await model.predict(xs).data();
  let TP = 0, TN = 0, FP = 0, FN = 0;
  for (let i = 0; i < predictions.length; i++) {
    const pred = predictions[i] > 0.5 ? 1 : 0;
    const actual = outputs2dArray[i][0];
    if (pred === 1 && actual === 1) TP++;
    else if (pred === 0 && actual === 0) TN++;
    else if (pred === 1 && actual === 0) FP++;
    else if (pred === 0 && actual === 1) FN++;
  }

  ctx.clearRect(0, 0, canvas.width, canvas.height);
  const size = 120;
  ctx.strokeStyle = 'black';
  ctx.lineWidth = 2;
  ctx.strokeRect(150, 50, size, size);
  ctx.strokeRect(150 + size, 50, size, size);
  ctx.strokeRect(150, 50 + size, size, size);
  ctx.strokeRect(150 + size, 50 + size, size, size);

  ctx.font = '16px sans-serif';
  ctx.textAlign = 'center';
  ctx.textBaseline = 'middle';
  ctx.fillText(`TP: ${TP}`, 150 + size / 2, 50 + size / 2);
  ctx.fillText(`FP: ${FP}`, 150 + size + size / 2, 50 + size / 2);
  ctx.fillText(`FN: ${FN}`, 150 + size / 2, 50 + size + size / 2);
  ctx.fillText(`TN: ${TN}`, 150 + size + size / 2, 50 + size + size / 2);
  ctx.fillText('Actual 1', 150 + size*0.5, 40);
  ctx.fillText('Actual 0', 150 + size*0.5 + size, 40);
  ctx.fillText('Pred 1', 120, 50 + size*0.5);
  ctx.fillText('Pred 0', 120, 50 + size*0.5 + size);
}


// Prediction

function getNormalizedInput() {
  const age = parseFloat(document.getElementById("age").value);
  const exp = parseFloat(document.getElementById("experience").value);
  const hikes = parseFloat(document.getElementById("hikes").value);
  return [
    (age - minVals[0]) / (maxVals[0] - minVals[0]),
    (exp - minVals[1]) / (maxVals[1] - minVals[1]),
    (hikes - minVals[2]) / (maxVals[2] - minVals[2]),
  ];
}

function weightsStr() {
  const weights = model.getWeights()[0].dataSync();
  const bias = model.getWeights()[1].dataSync();
  return `[${Array.from(weights)
    .map((w) => w.toFixed(2))
    .join(", ")}] + bias [${Array.from(bias)
    .map((b) => b.toFixed(2))
    .join(", ")}]`;
}

function predict() {
  const inputNorm = getNormalizedInput();
  const newX = tf.tensor2d([inputNorm]);
  model
    .predict(newX)
    .data()
    .then((probArray) => {
      const prob = probArray[0];
      const result = prob > 0.5 ? 1 : 0;
      outputEl.textContent = `Age: ${
        document.getElementById("age").value
      }, Years of Experience: ${
        document.getElementById("experience").value
      }, Number of Hikes: ${
        document.getElementById("hikes").value
      }\nHire This Applicant?: ${result} ${
        result == 1 ? "✅" : "❌"
      } (confidence ${(prob * 100).toFixed(1)}%)`;
      newX.dispose();
    });
}

// UI handlers

predictBtn.addEventListener("click", predict);
document
  .getElementById("age")
  .addEventListener(
    "input",
    (e) => (document.getElementById("ageVal").textContent = e.target.value)
  );
document
  .getElementById("experience")
  .addEventListener(
    "input",
    (e) => (document.getElementById("expVal").textContent = e.target.value)
  );
document
  .getElementById("hikes")
  .addEventListener(
    "input",
    (e) => (document.getElementById("hikeVal").textContent = e.target.value)
  );

trainModel();

// Make 3D scatterplot

const reds = trainingData.filter((p) => p[3] === 0);
const greens = trainingData.filter((p) => p[3] === 1);

// Format hover text for each group
const redHoverText = reds.map(
  (p) => `age: ${p[0]}<br>experience: ${p[1]}<br>hikes: ${p[2]}<br>hired: 0`
);
const greenHoverText = greens.map(
  (p) => `age: ${p[0]}<br>experience: ${p[1]}<br>hikes: ${p[2]}<br>hired: 1`
);

const redTrace = {
  x: reds.map((p) => p[0]), // age
  y: reds.map((p) => p[1]), // experience
  z: reds.map((p) => p[2]), // hikes
  mode: "markers",
  type: "scatter3d",
  name: "0 = Not Hired",
  text: redHoverText,
  hoverinfo: "text",
  marker: { size: 6, color: "red" },
};

const greenTrace = {
  x: greens.map((p) => p[0]),
  y: greens.map((p) => p[1]),
  z: greens.map((p) => p[2]),
  mode: "markers",
  type: "scatter3d",
  name: "1 = Hired",
  text: greenHoverText,
  hoverinfo: "text",
  marker: { size: 6, color: "green" },
};

const layout = {
  scene: {
    xaxis: { title: "Age" },
    yaxis: { title: "Experience (Years)" },
    zaxis: { title: "Number of Hikes" },
  },
  margin: { l: 0, r: 0, b: 0, t: 30 },
  legend: { x: 0.8, y: 0.9 },
};

Plotly.newPlot("plot3d", [redTrace, greenTrace], layout);
